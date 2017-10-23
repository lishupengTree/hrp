package com.lsp.hrp.service.webservice.entry.exam;

import java.util.List;

public class ExamPackageInfo {
	private String organCode;			//组织机构代码
	private String packageNo;			//套餐编号
	private String packageName;			//套餐名称
	private String packageType;			//套餐类别	
	private String invalidFlag;			//作废标志
	
	private String price;				//价格
	private String introduce;			//介绍
	private String applicableGender;	//适用性别
	private String applicableCrowd;		//适用人群
	private String feature;				//特点
	
	private List<ExamItemInfo> items;
	
	public ExamPackageInfo(String organCode, String packageNo, String packageName,
			String packageType) {
		super();
		this.organCode = organCode;
		this.packageNo = packageNo;
		this.packageName = packageName;
		this.packageType = packageType;
	}
	
	
	public ExamPackageInfo(String invalidFlag, String price, String introduce,
			String applicableGender, String applicableCrowd, String feature) {
		super();
		this.invalidFlag = invalidFlag;
		this.price = price;
		this.introduce = introduce;
		this.applicableGender = applicableGender;
		this.applicableCrowd = applicableCrowd;
		this.feature = feature;
	}


	public List<ExamItemInfo> getItems() {
		return items;
	}


	public void setItems(List<ExamItemInfo> items) {
		this.items = items;
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
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public String getInvalidFlag() {
		return invalidFlag;
	}
	public void setInvalidFlag(String invalidFlag) {
		this.invalidFlag = invalidFlag;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getIntroduce() {
		return introduce;
	}


	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}


	public String getApplicableGender() {
		return applicableGender;
	}


	public void setApplicableGender(String applicableGender) {
		this.applicableGender = applicableGender;
	}


	public String getApplicableCrowd() {
		return applicableCrowd;
	}


	public void setApplicableCrowd(String applicableCrowd) {
		this.applicableCrowd = applicableCrowd;
	}


	public String getFeature() {
		return feature;
	}


	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	
}
