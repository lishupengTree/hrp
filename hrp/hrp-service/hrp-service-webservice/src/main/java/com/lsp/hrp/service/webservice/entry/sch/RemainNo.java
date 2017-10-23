package com.lsp.hrp.service.webservice.entry.sch;

public class RemainNo {
	private String organCode;					  
	private String schedulingNo;                  //排班编号
	private String amount;                        //可预约数量
	private String state;                         //状态
	private String remainingAmount;				  //余号
	
	//排班
	public RemainNo(String organCode, String schedulingNo,
			String amount, String state,String remainingAmount) {
		super();
		this.organCode = organCode;
		this.schedulingNo = schedulingNo;
		this.amount = amount;
		this.state = state;
		this.remainingAmount = remainingAmount;
	}
	
	public String getOrganCode() {
		return organCode;
	}

	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}

	public String getSchedulingNo() {
		return schedulingNo;
	}
	public void setSchedulingNo(String schedulingNo) {
		this.schedulingNo = schedulingNo;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRemainingAmount() {
		return remainingAmount;
	}
	public void setRemainingAmount(String remainingAmount) {
		this.remainingAmount = remainingAmount;
	}
}
