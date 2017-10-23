package com.lsp.hrp.service.webservice.entry.exam;
/**
 * 体检报告
 * @author bjyuan
 *
 */
public class PhysicalExamReport {
	private String hospCode;             //机构代码
	private String patIndexNo;           //患者索引号
	private String visitCardNo;          //就诊卡号
	private String reportNO;             //体检报告号
	private String patName;              //患者姓名
	private String idNumber;             //身份证号码
	private String birthDate;            //出生日期
	private String sexCode;              //性别代码
	private String sexName;              //性别名称
	private String maritalStatusCode;    //婚姻状态代码
	private String maritalStatusName;    //婚姻状态名称
	private String company;              //工作单位
	private String familyAddr;           //家庭地址
	private String mobileNo;             //联系电话
	private String examDate;             //体检日期
	private String examResult;           //总检结果
	private String examAdvice;           //总检建议
	private String reportDr;             //报告医生
	private String reportDate;           //报告日期
	private String checkDr;              //审核医生
	private String checkDate; 			 //审核时间
	private String hospName;             //医院名称
	public PhysicalExamReport() {
		// TODO Auto-generated constructor stub
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
	public String getVisitCardNo() {
		return visitCardNo;
	}
	public void setVisitCardNo(String visitCardNo) {
		this.visitCardNo = visitCardNo;
	}
	public String getReportNO() {
		return reportNO;
	}
	public void setReportNO(String reportNO) {
		this.reportNO = reportNO;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getSexCode() {
		return sexCode;
	}
	public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
	}
	public String getSexName() {
		return sexName;
	}
	public void setSexName(String sexName) {
		this.sexName = sexName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFamilyAddr() {
		return familyAddr;
	}
	public void setFamilyAddr(String familyAddr) {
		this.familyAddr = familyAddr;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public String getExamResult() {
		return examResult;
	}
	public void setExamResult(String examResult) {
		this.examResult = examResult;
	}
	public String getExamAdvice() {
		return examAdvice;
	}
	public void setExamAdvice(String examAdvice) {
		this.examAdvice = examAdvice;
	}
	public String getReportDr() {
		return reportDr;
	}
	public void setReportDr(String reportDr) {
		this.reportDr = reportDr;
	}
	public String getReportDate() {
		return reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}
	public String getCheckDr() {
		return checkDr;
	}
	public void setCheckDr(String checkDr) {
		this.checkDr = checkDr;
	}
	public String getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}
	public PhysicalExamReport(String hospCode, String patIndexNo,
			String visitCardNo, String reportNO, String patName,
			String idNumber, String birthDate, String sexCode, String sexName,
			String maritalStatusCode,String maritalStatusName,
			String company, String familyAddr, String mobileNo,
			String examDate, String examResult, String examAdvice,
			String reportDr, String reportDate, String checkDr, String checkDate) {
		super();
		this.hospCode = hospCode;
		this.patIndexNo = patIndexNo;
		this.visitCardNo = visitCardNo;
		this.reportNO = reportNO;
		this.patName = patName;
		this.idNumber = idNumber;
		this.birthDate = birthDate;
		this.sexCode = sexCode;
		this.sexName = sexName;
		this.maritalStatusCode = maritalStatusCode;
		this.maritalStatusName = maritalStatusName;
		this.company = company;
		this.familyAddr = familyAddr;
		this.mobileNo = mobileNo;
		this.examDate = examDate;
		this.examResult = examResult;
		this.examAdvice = examAdvice;
		this.reportDr = reportDr;
		this.reportDate = reportDate;
		this.checkDr = checkDr;
		this.checkDate = checkDate;
	}
	public PhysicalExamReport(String hospCode, String patIndexNo,
			String visitCardNo, String reportNO, String patName,
			String idNumber, String birthDate, String sexCode, String sexName,
			String company, String familyAddr, String mobileNo,
			String examDate, String examResult, String examAdvice,
			String reportDr, String reportDate, String checkDr, String checkDate) {
		super();
		this.hospCode = hospCode;
		this.patIndexNo = patIndexNo;
		this.visitCardNo = visitCardNo;
		this.reportNO = reportNO;
		this.patName = patName;
		this.idNumber = idNumber;
		this.birthDate = birthDate;
		this.sexCode = sexCode;
		this.sexName = sexName;
		this.company = company;
		this.familyAddr = familyAddr;
		this.mobileNo = mobileNo;
		this.examDate = examDate;
		this.examResult = examResult;
		this.examAdvice = examAdvice;
		this.reportDr = reportDr;
		this.reportDate = reportDate;
		this.checkDr = checkDr;
		this.checkDate = checkDate;
	}
	public String getHospName() {
		return hospName;
	}
	public void setHospName(String hospName) {
		this.hospName = hospName;
	}
	public String getMaritalStatusCode() {
		return maritalStatusCode;
	}
	public void setMaritalStatusCode(String maritalStatusCode) {
		this.maritalStatusCode = maritalStatusCode;
	}
	public String getMaritalStatusName() {
		return maritalStatusName;
	}
	public void setMaritalStatusName(String maritalStatusName) {
		this.maritalStatusName = maritalStatusName;
	}
}
