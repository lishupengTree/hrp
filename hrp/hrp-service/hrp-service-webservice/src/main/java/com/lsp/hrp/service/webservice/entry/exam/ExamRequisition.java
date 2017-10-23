package com.lsp.hrp.service.webservice.entry.exam;
/**
 * 检查申请单
 * @author bjyuan
 *
 */
public class ExamRequisition {
	private String hospCode;               //组织机构代码
	private String patIndexNo;             //患者索引号
	private String outhospNo;              //门诊号
	private String outhospSerialNo;        //门诊流水号
	private String inhospNo;               //住院号
	private String inhospNum;              //住院次数
	private String inhospSerialNo;         //住院流水号
	private String requisitionNo;          //申请单编号
	private String applyDate;              //申请日期
	private String examApplyItemCode;      //检查申请项目代码
	private String examApplyItemName;      //检查申请项目名称
	private String finishDate;             //完成日期
	private String operPartCode;           //操作部位代码
	private String operPartName;           //操作部位名称
	private String requisitionStatus;      //申请单状态
	private String note;                   //备注
	private String requisitionNoItem;       //申请单分项目序号

	public ExamRequisition(String hospCode,String patIndexNo,
			String outhospNo, String outhospSerialNo, String inhospNo,
			String inhospNum, String inhospSerialNo, String requisitionNo,
			String applyDate, String examApplyItemCode,
			String examApplyItemName, String finishDate, String operPartCode,
			String operPartName, String requisitionStatus, String note,String requisitionNoItem) {
		super();
		this.hospCode = hospCode;
		this.patIndexNo = patIndexNo;
		this.outhospNo = outhospNo;
		this.outhospSerialNo = outhospSerialNo;
		this.inhospNo = inhospNo;
		this.inhospNum = inhospNum;
		this.inhospSerialNo = inhospSerialNo;
		this.requisitionNo = requisitionNo;
		this.applyDate = applyDate;
		this.examApplyItemCode = examApplyItemCode;
		this.examApplyItemName = examApplyItemName;
		this.finishDate = finishDate;
		this.operPartCode = operPartCode;
		this.operPartName = operPartName;
		this.requisitionStatus = requisitionStatus;
		this.note = note;
		this.requisitionNoItem = requisitionNoItem;
	}
	public String getHospCode() {
		return hospCode;
	}
	public void setHospCode(String hospCode) {
		this.hospCode = hospCode;
	}
	public String getPatIndexNo() {
		return patIndexNo;
	}
	public void setPatIndexNo(String patIndexNo) {
		this.patIndexNo = patIndexNo;
	}
	public String getOuthospNo() {
		return outhospNo;
	}
	public void setOuthospNo(String outhospNo) {
		this.outhospNo = outhospNo;
	}
	public String getOuthospSerialNo() {
		return outhospSerialNo;
	}
	public void setOuthospSerialNo(String outhospSerialNo) {
		this.outhospSerialNo = outhospSerialNo;
	}
	public String getInhospNo() {
		return inhospNo;
	}
	public void setInhospNo(String inhospNo) {
		this.inhospNo = inhospNo;
	}
	public String getInhospNum() {
		return inhospNum;
	}
	public void setInhospNum(String inhospNum) {
		this.inhospNum = inhospNum;
	}
	public String getInhospSerialNo() {
		return inhospSerialNo;
	}
	public void setInhospSerialNo(String inhospSerialNo) {
		this.inhospSerialNo = inhospSerialNo;
	}
	public String getRequisitionNo() {
		return requisitionNo;
	}
	public void setRequisitionNo(String requisitionNo) {
		this.requisitionNo = requisitionNo;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getExamApplyItemCode() {
		return examApplyItemCode;
	}
	public void setExamApplyItemCode(String examApplyItemCode) {
		this.examApplyItemCode = examApplyItemCode;
	}
	public String getExamApplyItemName() {
		return examApplyItemName;
	}
	public void setExamApplyItemName(String examApplyItemName) {
		this.examApplyItemName = examApplyItemName;
	}
	public String getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}
	public String getOperPartCode() {
		return operPartCode;
	}
	public void setOperPartCode(String operPartCode) {
		this.operPartCode = operPartCode;
	}
	public String getOperPartName() {
		return operPartName;
	}
	public void setOperPartName(String operPartName) {
		this.operPartName = operPartName;
	}
	public String getRequisitionStatus() {
		return requisitionStatus;
	}
	public void setRequisitionStatus(String requisitionStatus) {
		this.requisitionStatus = requisitionStatus;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getRequisitionNoItem() {
		return requisitionNoItem;
	}
	public void setRequisitionNoItem(String requisitionNoItem) {
		this.requisitionNoItem = requisitionNoItem;
	}
	
	
	
}
