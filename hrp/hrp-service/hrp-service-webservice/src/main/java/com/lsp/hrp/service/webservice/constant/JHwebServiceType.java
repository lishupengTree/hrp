package com.lsp.hrp.service.webservice.constant;


import com.lsp.hrp.service.webservice.common.TypeNotExsitException;

/**
 * WebService枚举类型
 * @author bjyuan
 *
 */
public enum JHwebServiceType {
	Dept("1001","科室字典"),
	Staff("1002","职工字典"),
	Diag("1003","疾病字典"),
	CardNoInfo("1004","就诊卡信息"),
	PatientInfo("1005","患者基本信息"),
	VisitInfo("1006","门诊诊断信息"),
	RegistInfo("1007","挂号信息接口"),
	OrderInfo("1008","处方信息"),
	OrderDetailInfo("1009","处方明细"),
	ExamReport("1010","检查信息"),
	TestReport("1011","检验报告"),
	TestResult("1012","检验结果"),
	MicrobeTestResult("1013","微生物检验结果"),
	OuthospFee("1014","门诊费用"),
	InhospRecord("1015","住院记录"),
	InhospFee("1016","住院费用"),
	InhospOrder("1017","住院医嘱"),
	SurgeryRecord("1018","手术记录"),
	ExamRequisition("1019","检查申请单"),
	TestRequisition("1020","检验申请单"),
	OuthospFeeDetail("1021","门诊费用明细"),
	InhospFeeDetail("1022","住院费用明细"),
	OuthospBalance("1023","门诊结算费用"),
	InhospBalance("1024","住院结算费用"),
	IndexNo("1025","索引号信息"),
	TestSample("1026","样本信息"),
	PhysicalExamReport("1029","体检报告"),
	PhysicalExamResult("1030","体检结果"),
	SignsInfo("1031","体征信息"),
	SignedPatientInfo("1032","签约病人信息"),
	CardAuthenticate("1034","卡号认证"),
	Scheduling("1035","医生排班信息"),
	NumSourse("1036","号源信息"),
	Appointment("1037","预约挂号"),
	CanselAppointment("1038","取消预约"),
	AppointmentHistory("1039","预约历史记录"),
	PhysicalExamStatistics("1042","体检统计"),
	ExamItem("1033","体检统计项目"),
	PhysicalExamReportPage("9001","体检报告患者列表"),
	SchRemainNo("1044","排班余号查询"),
	ExamPackageList("1040","体检套餐列表"),
	ExamPackageInfo("1041","体检套餐详情");
	
	
//	VisitInfo("1005","就诊记录"),
//	RegistInfo("1006","挂号信息接口"),
//	DiagInfoOuthosp("1007","门诊诊断信息"),
//	DiagInfoInhosp("1008","住院诊断信息"),
//	OrderInfo("1009","处方信息"),
//	OrderDetailInfo("1010","处方明细"),
//	ExamReport("1011","检查信息"),
//	TestReport("1012","检验报告"),
//	TestResult("1013","检验结果"),
//	MicrobeTestResult("1014","微生物检验结果"),
//	OuthospFee("1015","门诊费用"),
//	OuthospFeeDetail("1016","门诊费用明细"),
//	InhospRecord("1017","住院记录"),
//	InhospFee("1018","住院费用"),
//	InhospFeeDetail("1019","住院费用明细"),
//	InhospOrder("1020","住院医嘱"),
//	OrderExecuteRecord("1021","医嘱执行记录"),
//	AnesthesiaRecord("1022","麻醉记录"),
//	SurgeryRecord("1023","手术记录"),
//	SignsMeasure("1024","生命体征测量"),
//	AllergicRecord("1025","过敏记录"),
//	NursingRecord("1026","护理记录");
	
	private String code;
	private String desc;
	private String ip;
	private String port;
	private String url; 			//相对地址
	private String namespace;
	private String method;
	private String input;           //方法参数
	private long timeout;
	
	JHwebServiceType(String code,String desc){
		this.code = code;
		this.desc = desc;
	}
	
	/**
	 * 获取带namespace的方法
	 * @return
	 */
	public String getNamespaceAndMethod(){
		return namespace + "/" + method;
	}
	
	/**
	 * 整个调用地址
	 * @return
	 */
	public String getFullUrl(){
		StringBuilder bd = new StringBuilder();
		bd.append("http://").append(ip).append(":").append(port).append(url).append("?wsdl");
		return bd.toString();
	}
	
	/**
	 * 启动时调用
	 * @param ip
	 * @param port
	 * @param url
	 * @param namespace
	 * @param method
	 */
	public void initUrl(String ip,String port,String url,String namespace,String method,String input,String timeout){
		this.ip = ip;
		this.port = port;
		this.url = url;
		this.namespace = namespace;
		this.method = method;
		this.input = input;
		this.timeout = Long.parseLong(timeout);
	}

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}

    
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	

	public long getTimeout() {
		return timeout;
	}

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

	/**
	 * 根据code配置相关
	 * @param code
	 * @return
	 */
	public static JHwebServiceType getTypeByCode(String code){
		for(JHwebServiceType type:values()){
			if(code.equals(type.getCode())) {
                return type;
            }
		}
		
		try {
			throw new TypeNotExsitException("您配置的webservice编码不存相关枚举实例，请检查相关配置");
		} catch (TypeNotExsitException e) {
			e.printStackTrace();
			return null;
		}
	}
}
