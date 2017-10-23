package com.lsp.hrp.service.webservice.common;
/**
 * webservice参数和值
 * @author bjyuan
 *
 */
public class BasicPairParam {
	protected String param;      //参数
	protected String value;      //参数值
	
	public BasicPairParam(String param,String value){
		this.param = param;
		this.value = value;
	}
	
	public String getParam() {
		return param;
	}



	public void setParam(String param) {
		this.param = param;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}

}
