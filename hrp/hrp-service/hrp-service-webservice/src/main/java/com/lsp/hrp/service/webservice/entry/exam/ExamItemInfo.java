package com.lsp.hrp.service.webservice.entry.exam;

public class ExamItemInfo {
	private String organCode;			//组织机构代码
	private String packageNo;			//套餐编号
	private String itemCode;			//项目代码
	private String itemName;			//项目名称
	private String itemType;			//项目类型
	private String itemContent;			//项目内容
	private String itemMeaning;			//项目意义
	
	public ExamItemInfo(String organCode, String packageNo, String itemCode,
			String itemName, String itemType, String itemContent,
			String itemMeaning) {
		super();
		this.organCode = organCode;
		this.packageNo = packageNo;
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemContent = itemContent;
		this.itemMeaning = itemMeaning;
	}
	public String getOrganCode() {
		return organCode;
	}
	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}
	public String getPackageNo() {
		return packageNo;
	}
	public void setPackageNo(String packageNo) {
		this.packageNo = packageNo;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemContent() {
		return itemContent;
	}
	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
	}
	public String getItemMeaning() {
		return itemMeaning;
	}
	public void setItemMeaning(String itemMeaning) {
		this.itemMeaning = itemMeaning;
	}
	
	
}
