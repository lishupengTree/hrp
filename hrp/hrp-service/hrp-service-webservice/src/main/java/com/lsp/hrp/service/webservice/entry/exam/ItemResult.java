package com.lsp.hrp.service.webservice.entry.exam;
/**
 * 体检结果
 * @author bjyuan
 *
 */
public class ItemResult {
	private String itemName;                         //项目明细名称
	private String itemResult;                       //项目明细结果
	private String normalFlag;                       //正常标志
	private String unit;                             //单位
	private String referenceRanges;                  //参考范围
	private String referenceUpdperLimit;             //参考上限
	private String referenceLowerLimit;               //参考下限
	public ItemResult() {
	}
	public ItemResult(String itemName, String itemResult, String normalFlag,
			String unit, String referenceRanges, String referenceUpdperLimit,
			String referenceLowerLimit) {
		super();
		this.itemName = itemName;
		this.itemResult = itemResult;
		this.normalFlag = normalFlag;
		this.unit = unit;
		this.referenceRanges = referenceRanges;
		this.referenceUpdperLimit = referenceUpdperLimit;
		this.referenceLowerLimit = referenceLowerLimit;
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
	
	
}
