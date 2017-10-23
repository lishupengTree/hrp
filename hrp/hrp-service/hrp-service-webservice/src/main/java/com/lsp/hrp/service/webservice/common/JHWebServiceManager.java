package com.lsp.hrp.service.webservice.common;

import cn.joinhealth.pub_manager.exception.HugException;
import com.lsp.hrp.service.webservice.constant.JHwebServiceType;
import com.lsp.hrp.service.webservice.handle.WebServiceHandle;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * webservice调用接口
 * @author bjyuan
 *
 */
public class JHWebServiceManager {
	/**
	 * webService管理类
	 */
	private static JHWebServiceManager jHWebServiceManager = new JHWebServiceManager();
	
	/**
	 * 所有的webService处理接口
	 */
	private Map<JHwebServiceType,WebServiceHandle> handles = new HashMap<JHwebServiceType,WebServiceHandle>();
	
	public static JHWebServiceManager getInstance(){
		return jHWebServiceManager;
	}
	
	private JHWebServiceManager(){
		registerWebServiceHandle();            //注册webServiceHandle处理类
	}
	
	/**
	 * 注册webservice
	 */
	private void registerWebServiceHandle(){
		//Document document = XmlUtil.loadXml("/webservice/webservice.xml");
		Document document = null;
		SAXReader reader = new SAXReader();
		try {
			InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("webservice/webservice.xml");
	      /*path = path + url;
	      FileInputStream stream = new FileInputStream(path);*/
			document = reader.read(stream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Element root = document.getRootElement();
		Iterator it = root.elementIterator("JHwebService");
		while(it.hasNext()){
			Element element = (Element)it.next();
			String code = element.elementText("code");
			String className = element.elementText("class");
			String ip = element.elementText("ip");
			String port = element.elementText("port");
			String url = element.elementText("url");
			String namespace = element.elementText("namespace");
			String input = element.elementText("input");
			String method = element.elementText("method");
			String timeout = element.elementText("timeout");
			
			JHwebServiceType enumType = JHwebServiceType.getTypeByCode(code);
			if(enumType==null) {
                continue;
            }
			
			enumType.initUrl(ip, port, url,namespace,method,input,timeout);
			try {
				Class handleClass = Class.forName(className);
				WebServiceHandle handle = (WebServiceHandle)handleClass.newInstance();
				handles.put(enumType, handle);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	/**
	 * 调用webService接口
	 * @param type
	 * @param hospCode
	 * @param params 参数
	 * @return
	 */
	public Object doWebService(JHwebServiceType type,String hospCode,Collection<BasicPairParam> params) throws HugException {
		WebServiceHandle handle = this.handles.get(type);
		if(handle==null) {
            return null;
        }
		return handle.dealHandle(type, hospCode, params);
	}
	
	/**
	 * 调用webService接口
	 * @param type
	 * @param hospCode
	 * @return
	 */
	public Object doWebService(JHwebServiceType type,String hospCode) throws HugException {
		WebServiceHandle handle = this.handles.get(type);
		if(handle==null) {
            return null;
        }
		return handle.dealHandle(type, hospCode, null);
	}
}
