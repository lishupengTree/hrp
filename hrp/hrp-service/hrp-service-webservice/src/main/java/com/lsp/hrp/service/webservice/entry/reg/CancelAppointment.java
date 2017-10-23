package com.lsp.hrp.service.webservice.entry.reg;
/**
 * 取消预约
 * @author bjyuan
 *
 */
public class CancelAppointment {
	private String hospCode; 	//组织机构代码
	private String resultCode; 	//结果代码
	private String resultDesc;  //结果描述
	
	/**
	 * 构造函数
	 * @param hospCode
	 * @param resultCode
	 * @param resultDesc
	 */
	public CancelAppointment(String hospCode,String resultCode, String resultDesc) {
		super();
		this.hospCode = hospCode;
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
	}
	public String getHospCode() {
		return hospCode;
	}
	public void setHospCode(String hospCode) {
		this.hospCode = hospCode;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultDesc() {
		return resultDesc;
	}
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	
}
