package com.lsp.hrp.service.webservice.entry.sch;

import java.io.Serializable;

/**
 * 号源信息
 * @author bjyuan
 *
 */
public class NumSourse implements Serializable{
	private static final long serialVersionUID = 3718118745176621388L;
	private String hospCode;                     //组织机构代码
	private String schedulingNo;                 //排班编号
	private String ap;                           //班次
	private String seqNo;                        //号源序号
	private String visitDate;                    //就诊日期
	private String status;                       //号源状态
	private String visitTime;					//就诊时间
	
	
	/**
	 * 号源
	 * @param hospCode
	 * @param schedulingNo
	 * @param ap
	 * @param seqNo
	 * @param visitDate
	 * @param status
	 */
	public NumSourse(String hospCode, String schedulingNo, String ap,
			String seqNo, String visitDate, String status,String visitTime) {
		super();
		this.hospCode = hospCode;
		this.schedulingNo = schedulingNo;
		this.ap = ap;
		this.seqNo = seqNo;
		this.visitDate = visitDate;
		this.status = status;
		this.visitTime = visitTime;
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
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}
	
}
