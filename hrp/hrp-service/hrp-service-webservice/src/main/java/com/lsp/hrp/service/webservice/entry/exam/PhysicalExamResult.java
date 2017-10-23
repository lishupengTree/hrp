package com.lsp.hrp.service.webservice.entry.exam;

import java.util.List;

/**
 * 体检结果
 * @author bjyuan
 *
 */
public class PhysicalExamResult {
	private String hospCode;                         //组织机构代码
	private String reportNO;                         //体检报告号
	private String examDate;                         //检查日期
	private String deptCode;                         //科室代码
	private String deptName;                         //科室名称
	private String drCode;                           //检查医生工号
	private String drName;                           //检查医生姓名
	private String groupItemCode;                    //组合项目编号
	private String groupItemName;                    //组合项目名称
	private String groupItemTypeCode;                //组合项目类型代码
	private String groupItemTypeName;                //组合项目类型名称
	private String itemName;                         //项目明细名称
	private String itemResult;                       //项目明细结果
	private String normalFlag;                       //正常标志
	private String unit;                             //单位
	private String referenceRanges;                  //参考范围
	private String referenceUpdperLimit;             //参考上限
	private String referenceLowerLimit;              //参考下限
	private List<ItemResult> itemResults;
	public PhysicalExamResult(){
		
	}
	public String getHospCode() {
		return hospCode;
	}
	public void setHospCode(String hospCode) {
		this.hospCode = hospCode;
	}
	public String getReportNO() {
		return reportNO;
	}
	public void setReportNO(String reportNO) {
		this.reportNO = reportNO;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
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
	public String getGroupItemCode() {
		return groupItemCode;
	}
	public void setGroupItemCode(String groupItemCode) {
		this.groupItemCode = groupItemCode;
	}
	public String getGroupItemName() {
		return groupItemName;
	}
	public void setGroupItemName(String groupItemName) {
		this.groupItemName = groupItemName;
	}
	public String getGroupItemTypeCode() {
		return groupItemTypeCode;
	}
	public void setGroupItemTypeCode(String groupItemTypeCode) {
		this.groupItemTypeCode = groupItemTypeCode;
	}
	public String getGroupItemTypeName() {
		return groupItemTypeName;
	}
	public void setGroupItemTypeName(String groupItemTypeName) {
		this.groupItemTypeName = groupItemTypeName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemResult() {
		return itemResult;
	}
	public void setItemResult(String itemResult) {
		this.itemResult = itemResult;
	}
	public String getNormalFlag() {
		return normalFlag;
	}
	public void setNormalFlag(String normalFlag) {
		this.normalFlag = normalFlag;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getReferenceRanges() {
		return referenceRanges;
	}
	public void setReferenceRanges(String referenceRanges) {
		this.referenceRanges = referenceRanges;
	}
	public String getReferenceUpdperLimit() {
		return referenceUpdperLimit;
	}
	public void setReferenceUpdperLimit(String referenceUpdperLimit) {
		this.referenceUpdperLimit = referenceUpdperLimit;
	}
	public String getReferenceLowerLimit() {
		return referenceLowerLimit;
	}
	public void setReferenceLowerLimit(String referenceLowerLimit) {
		this.referenceLowerLimit = referenceLowerLimit;
	}

	public PhysicalExamResult(String hospCode, String reportNO,
			String examDate, String deptCode, String deptName, String drCode,
			String drName, String groupItemCode, String groupItemName,
			String groupItemTypeCode, String groupItemTypeName,
			String itemName, String itemResult, String normalFlag, String unit,
			String referenceRanges, String referenceUpdperLimit,
			String referenceLowerLimit) {
		super();
		this.hospCode = hospCode;
		this.reportNO = reportNO;
		this.examDate = examDate;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.drCode = drCode;
		this.drName = drName;
		this.groupItemCode = groupItemCode;
		this.groupItemName = groupItemName;
		this.groupItemTypeCode = groupItemTypeCode;
		this.groupItemTypeName = groupItemTypeName;
		this.itemName = itemName;
		this.itemResult = itemResult;
		this.normalFlag = normalFlag;
		this.unit = unit;
		this.referenceRanges = referenceRanges;
		this.referenceUpdperLimit = referenceUpdperLimit;
		this.referenceLowerLimit = referenceLowerLimit;
		
	}
	public List<ItemResult> getItemResults() {
		return itemResults;
	}
	public void setItemResults(List<ItemResult> itemResults) {
		this.itemResults = itemResults;
	}
	
	
}
