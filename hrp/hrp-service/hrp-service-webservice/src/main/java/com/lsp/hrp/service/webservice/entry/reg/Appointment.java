package com.lsp.hrp.service.webservice.entry.reg;
/**
 * 预约挂号
 * @author bjyuan
 *
 */
public class Appointment {
	private String hospCode; 	//组织机构代码
	private String resultCode; 	//结果代码
	private String resultDesc;  //结果描述
	private String password;    //密码
	private String seqNo;		//序号
	private String registerRecordNo;//his预约主键
	
	/**
	 * 构造函数
	 * @param hospCode
	 * @param resultCode
	 * @param resultDesc
	 * @param password
	 */
	public Appointment(String hospCode, String resultCode, String resultDesc,
			String password,String seqNo,String registerRecordNo) {
		super();
		this.hospCode = hospCode;
		this.resultCode = resultCode;
		this.resultDesc = resultDesc;
		this.password = password;
		this.seqNo = seqNo;
		this.registerRecordNo = registerRecordNo;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getRegisterRecordNo() {
		return registerRecordNo;
	}
	public void setRegisterRecordNo(String registerRecordNo) {
		this.registerRecordNo = registerRecordNo;
	}
	
	
}
