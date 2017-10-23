package com.lsp.hrp.service.webservice.entry.sch;
/**
 * 排班
 * @author bjyuan
 *
 */
public class Scheduling {
	private String hospCode;                      //组织机构代码
	private String schedulingNo;                  //排班编号
	private String superDeptCode;                 //上级科室代码
	private String superDeptName;                 //上级科室名称
	private String deptCode;                      //科室代码
	private String deptName;                      //科室名称
	private String descr;                         //科室描述
	private String drCode;                        //医生工号
	private String drName;                        //医生名称
	private String title;                         //医生职称
	private String goodDescr;                     //擅长诊治
	private String type;                          //挂号类型
	private String date;                          //日期
	private String ap;                            //班次
	private String fee;                           //挂号费
	private String amount;                        //可预约数量
	private String registerAmount;                //可挂号数量
	private String status;                         //状态
	private String startTime;                     //开始时间
	private String endTime;                       //结束时间
	
	
	//排班
	public Scheduling(String hospCode, String schedulingNo,
			String superDeptCode, String superDeptName, String deptCode,
			String deptName, String descr, String drCode, String drName,
			String title, String goodDescr, String type, String date,
			String ap, String fee, String amount, String registerAmount,
			String status,String startTime,String endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.hospCode = hospCode;
		this.schedulingNo = schedulingNo;
		this.superDeptCode = superDeptCode;
		this.superDeptName = superDeptName;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.descr = descr;
		this.drCode = drCode;
		this.drName = drName;
		this.title = title;
		this.goodDescr = goodDescr;
		this.type = type;
		this.date = date;
		this.ap = ap;
		this.fee = fee;
		this.amount = amount;
		this.registerAmount = registerAmount;
		this.status = status;
	}
	public String getHospCode() {
		return hospCode;
	}
	public void setHospCode(String hospCode) {
		this.hospCode = hospCode;
	}
	public String getSchedulingNo() {
		return schedulingNo;
	}
	public void setSchedulingNo(String schedulingNo) {
		this.schedulingNo = schedulingNo;
	}
	public String getSuperDeptCode() {
		return superDeptCode;
	}
	public void setSuperDeptCode(String superDeptCode) {
		this.superDeptCode = superDeptCode;
	}
	public String getSuperDeptName() {
		return superDeptName;
	}
	public void setSuperDeptName(String superDeptName) {
		this.superDeptName = superDeptName;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getDrCode() {
		return drCode;
	}
	public void setDrCode(String drCode) {
		this.drCode = drCode;
	}
	public String getDrName() {
		return drName;
	}
	public void setDrName(String drName) {
		this.drName = drName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGoodDescr() {
		return goodDescr;
	}
	public void setGoodDescr(String goodDescr) {
		this.goodDescr = goodDescr;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRegisterAmount() {
		return registerAmount;
	}
	public void setRegisterAmount(String registerAmount) {
		this.registerAmount = registerAmount;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
}