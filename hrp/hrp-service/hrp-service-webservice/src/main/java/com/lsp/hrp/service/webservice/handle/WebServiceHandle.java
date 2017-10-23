package com.lsp.hrp.service.webservice.handle;


import cn.joinhealth.pub_manager.exception.HugException;
import cn.joinhealth.pub_manager.utils.StringUtil;
import com.lsp.hrp.service.webservice.common.BasicPairParam;
import com.lsp.hrp.service.webservice.common.WebServiceUtil;
import com.lsp.hrp.service.webservice.common.XmlUtil;
import com.lsp.hrp.service.webservice.constant.JHwebServiceType;
import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.Collection;

/**
 * webServiceHandle处理基类
 * @author bjyuan
 *
 */
public abstract class WebServiceHandle {

	private static final Logger logger = Logger.getLogger(WebServiceHandle.class);
	/**
	 * webservice远程调用实现类
	 * @param hospCode
	 * @param params
	 * @return
	 */
	public  Object dealHandle(JHwebServiceType type, String hospCode, Collection<BasicPairParam> params) throws HugException {
		String xml = buildXml(type,hospCode,params);
		logger.debug("http请求："+xml);
		OMElement omElement = null;
		try {
			omElement = WebServiceUtil.callService(type,xml);
		} catch (AxisFault e) { //异常返回null
			e.printStackTrace();
			return null;
		}
		
		Document document = XmlUtil.chenageToDocument(omElement.getFirstElement().getText());
		logger.debug("返回xml："+document.asXML());
		return omElement==null?null:parseDocument(document);
	}
	
	
	/**
	 * 组装xml,作为input参数值
	 * @param params
	 * @return
	 */
	public String buildXml(JHwebServiceType type,String hospCode,Collection<BasicPairParam> params){
		Document document = getDocument(type,hospCode);
		if(params!=null){
			for(BasicPairParam pair:params){
				if(StringUtil.isEmpty(pair.getValue())) {
                    continue;
                }
				fixParam(document,pair);
			}
		}
		//System.out.println(document.asXML());
/*		System.out.println("######################################################");
		System.out.println(document.asXML());*/
		return document.asXML();
	}
	
	/**
	 * 解析document
	 * @param document
	 * @return
	 */
	public abstract Object parseDocument(Document document) throws HugException;
	
	/**
	 * 设置参数,可重写
	 * @param document
	 * @param pair
	 */
	protected void fixParam(Document document,BasicPairParam pair){
		Element root = document.getRootElement();
		Element param = root.element("param");
		Element page = root.element("page");
		String pair_param = pair.getParam();
		if(pair_param.endsWith("_PAGE")){ //分页条件
			String new_pair_parm = pair_param.substring(0,pair_param.length()-5);
			page.element(new_pair_parm).setText(pair.getValue());
		}
		
		else if(pair_param.endsWith("_OP")){     //属性选项
			String new_pair_parm = pair_param.substring(0,pair_param.length()-3);
			param.element(new_pair_parm).attribute("op").setText(pair.getValue());
		}else{
			param.element(pair.getParam()).setText(pair.getValue());
		}
	}
	
	/**
	 * 文档
	 * @return
	 */
	protected Document getDocument(JHwebServiceType type,String hospCode){
		String xml = template(type,hospCode);
		return XmlUtil.chenageToDocument(xml);
	}
	
	/**
	 * 提供模板
	 * @return
	 */
	protected abstract String template(JHwebServiceType type,String hospCode);
}
