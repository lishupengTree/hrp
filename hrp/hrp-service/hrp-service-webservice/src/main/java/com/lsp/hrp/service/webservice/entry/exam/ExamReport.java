package com.lsp.hrp.service.webservice.entry.exam;
/**
 * 检查报告
 * @author bjyuan
 *
 */
public class ExamReport {
	private String hospCode;                    //医院编码
	private String patIndexNo;                  //患者索引号
	private String outHospNo;                   //门诊号
	private String outHospSerialNo;             //门诊流水号
	private String inHospNo;                    //住院号
	private String inHospNum;                   //住院次数
	private String inHospSerialNo;              //住院流水号
	private String requisitionNo;               //申请单编号
	private String reportNo;                    //报告单编号
	private String reportName;                  //报告名称
	private String requipmentCode;              //设备代码
	private String requipmentName;              //设备名称
	private String operPartCode;                //操作部位代码
	private String operPartName;                //操作部位名称
	private String examCategCode;               //检查类别代码
	private String examCategName;               //检查类别名称
	private String examItemCode;                //检查项目代码
	private String examItemName;                //检查项目名称
	private String applyDate;                   //申请日期
	private String applyDeptCode;               //申请科室代码
	private String applyDeptName;               //申请科室名称
	private String applyDrCode;                 //申请医生工号
	private String applyDrName;                 //申请医生姓名
	private String executeDate;                 //执行日期
	private String picture;                     //图片（jpg）
	private String pictureWeb;                     //图片（jpg）
	private String examResult;                  //检查结果（客观所见）
	private String examDesc;                    //检查描述（主观提示）
	private String reportDate;                  //报告日期
	private String note;                        //备注
	
	
	public String getRequisitionNo() {
		return requisitionNo;
	}
	public void setRequisitionNo(String requisitionNo) {
		this.requisitionNo = requisitionNo;
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
	public String getOutHospNo() {
		return outHospNo;
	}
	public void setOutHospNo(String outHospNo) {
		this.outHospNo = outHospNo;
	}
	public String getOutHospSerialNo() {
		return outHospSerialNo;
	}
	public void setOutHospSerialNo(String outHospSerialNo) {
		this.outHospSerialNo = outHospSerialNo;
	}
	public String getInHospNo() {
		return inHospNo;
	}
	public void setInHospNo(String inHospNo) {
		this.inHospNo = inHospNo;
	}
	public String getInHospNum() {
		return inHospNum;
	}
	public void setInHospNum(String inHospNum) {
		this.inHospNum = inHospNum;
	}
	public String getInHospSerialNo() {
		return inHospSerialNo;
	}
	public void setInHospSerialNo(String inHospSerialNo) {
		this.inHospSerialNo = inHospSerialNo;
	}
	public String getReportNo() {
		return reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getRequipmentCode() {
		return requipmentCode;
	}
	public void setRequipmentCode(String requipmentCode) {
		this.requipmentCode = requipmentCode;
	}
	public String getRequipmentName() {
		return requipmentName;
	}
	public void setRequipmentName(String requipmentName) {
		this.requipmentName = requipmentName;
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
	public String getExamCategCode() {
		return examCategCode;
	}
	public void setExamCategCode(String examCategCode) {
		this.examCategCode = examCategCode;
	}
	public String getExamCategName() {
		return examCategName;
	}
	public void setExamCategName(String examCategName) {
		this.examCategName = examCategName;
	}
	public String getExamItemCode() {
		return examItemCode;
	}
	public void setExamItemCode(String examItemCode) {
		this.examItemCode = examItemCode;
	}
	public String getExamItemName() {
		return examItemName;
	}
	public void setExamItemName(String examItemName) {
		this.examItemName = examItemName;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getApplyDeptCode() {
		return applyDeptCode;
	}
	public void setApplyDeptCode(String applyDeptCode) {
		this.applyDeptCode = applyDeptCode;
	}
	public String getApplyDeptName() {
		return applyDeptName;
	}
	public void setApplyDeptName(String applyDeptName) {
		this.applyDeptName = applyDeptName;
	}
	public String getApplyDrCode() {
		return applyDrCode;
	}
	public void setApplyDrCode(String applyDrCode) {
		this.applyDrCode = applyDrCode;
	}
	public String getApplyDrName() {
		return applyDrName;
	}
	public void setApplyDrName(String applyDrName) {
		this.applyDrName = applyDrName;
	}
	public String getExecuteDate() {
		return executeDate;
	}
	public void setExecuteDate(String executeDate) {
		this.executeDate = executeDate;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getExamResult() {
		return examResult;
	}
	public void setExamResult(String examResult) {
		this.examResult = examResult;
	}
	public String getExamDesc() {
		return examDesc;
	}
	public void setExamDesc(String examDesc) {
		this.examDesc = examDesc;
	}
	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	public String getPictureWeb() {
		return pictureWeb;
	}

	public void setPictureWeb(String pictureWeb) {
		this.pictureWeb = pictureWeb;
	}
}
