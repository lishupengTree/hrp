package com.lsp.hrp.service.webservice.common;

import com.lsp.hrp.service.webservice.constant.JHwebServiceType;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;


/**
 * webservice直接调用接口
 * @author bjyuan
 *
 */
public class WebServiceUtil {

	/**
	 * webservice测试
	 * @param type
	 * @param xml
	 * @return
	 * @throws AxisFault
     */
	public static OMElement callService(JHwebServiceType type, String xml) throws AxisFault {
		ServiceClient serviceClient = new ServiceClient();
		Options opts = new Options();
		opts.setTimeOutInMilliSeconds(type.getTimeout()*1000);
		//确定目标服务地址
		opts.setTo(new EndpointReference(type.getFullUrl()));
		//指定方法 
		opts.setAction(type.getNamespaceAndMethod()); 
		OMFactory fac = OMAbstractFactory.getOMFactory();
		//指定命名空间   
	    OMNamespace omNs = fac.createOMNamespace(type.getNamespace(), ""); 
	    //指定方法   
	    OMElement method = fac.createOMElement(type.getMethod(),omNs);   
	    OMElement value = fac.createOMElement(type.getInput(),null);    
	    value.setText(xml); 
	    method.addChild(value);    
	    serviceClient.setOptions(opts);
	    OMElement res = serviceClient.sendReceive(method);
		return res;
	}
	
	public static void main(String[] args){
		test();
	}
	
	public static void test(){
		try {
			// String url =
			// "http://localhost:8080/axis2ServerDemo/services/StockQuoteService";
			String url = "http://192.168.10.70:9080//axis2/services/HospitalDAO?wsdl";
//			String url = "http://192.168.10.70:8080/axis2/services/AllWebservice.AllWebserviceHttpSoap11Endpoint/";
			
			Options options = new Options();
			// 指定调用WebService的URL
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			// options.setAction("urn:getPrice");

			ServiceClient sender = new ServiceClient();
			sender.setOptions(options);

			OMFactory fac = OMAbstractFactory.getOMFactory();
			String tns = "http://dao.config.esb.joinhealth.com";
			// 命名空间，有时命名空间不增加没事，不过最好加上，因为有时有事，你懂的
			OMNamespace omNs = fac.createOMNamespace(tns, "");

			OMElement method = fac.createOMElement("getHospitalList", omNs);
			OMElement symbol = fac.createOMElement("req", null);
			// symbol.setText("1");
			symbol.addChild(fac
					.createOMText(
							symbol,
							"{}"));
			method.addChild(symbol);
			method.build();

			OMElement result = sender.sendReceive(method);

		} catch (AxisFault axisFault) {
			axisFault.printStackTrace();
		}
	}
}
