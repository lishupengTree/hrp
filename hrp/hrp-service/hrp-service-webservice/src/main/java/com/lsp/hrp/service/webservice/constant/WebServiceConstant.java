package com.lsp.hrp.service.webservice.constant;

/**
 * webService调用常量
 * @author bjyuan
 *
 */
public interface WebServiceConstant {
	public String EQUAL = "=";  	//op的选项，相等
	public String LIKE = "like";	//op的选项，like

	//测试handle
	public String TEST_VISIT_CARD_NO = "VISIT_CARD_NO";
	public String TEST_PAT_NAME = "PAT_NAME";
	public String TEST_ID_NUMBER = "ID_NUMBER";

	//就诊卡handle
	public String CARD_VISIT_CARD_NO = "VISIT_CARD_NO";       //就诊卡号
	public String CARD_VISIT_CARD_TYPE = "VISIT_CARD_TYPE";   //就诊卡类型
	public String CARD_PAT_NAME = "PAT_NAME";                 //患者姓名

	public String CARD_VISIT_CARD_NO_OP = "VISIT_CARD_NO_OP";
	public String CARD_VISIT_CARD_TYPE_OP = "VISIT_CARD_TYPE_OP";
	public String CARD_PAT_NAME_OP = "PAT_NAME_OP";


	//三个字典handle
	public String DICT_DICT = "DIC";

	//患者基本信息handle
	public String PATINFO_PAT_INDEX_NO = "PAT_INDEX_NO";        //患者索引号
	public String PATINFO_PAT_INDEX_NO_OP = "PAT_INDEX_NO_OP";  //患者索引号条件选择 =或者like
	public String PATINFO_PAT_NAME = "PAT_NAME";                //患者名称
	public String PATINFO_PAT_NAME_OP = "PAT_NAME_OP";
	public String PATINFO_PAT_ID_NUMBER = "ID_NUMBER";          //身份证号
	public String PATINFO_PAT_ID_NUMBER_OP = "PAT_ID_NUMBER_OP";
	public String PATINFO_PAT_MOBILE_NO = "MOBILE_NO";          //手机号
	public String PATINFO_PAT_MOBILE_NO_OP = "PAT_MOBILE_NO_OP";

	//就诊信息
	public String VISITINFO_MOBILE_NO = "MOBILE_NO";    		//手机号
	public String VISITINFO_DIAG_NAME = "DIAG_NAME";    		//疾病诊断
	public String VISITINFO_RECEPT_TREAT_DR_NAME = "RECEPT_TREAT_DR_NAME";    		//就诊医生
	public String VISITINFO_VISIT_DEPT_NAME = "VISIT_DEPT_NAME";    		//科室
	public String VISITINFO_VISIT_CARD_NO = "VISIT_CARD_NO";    		//就诊卡号
	public String VISITINFO_OUTHOSP_NO = "OUTHOSP_NO";    					//门诊号
	public String VISITINFO_ID_NUMBER = "ID_NUMBER";    					//身份证
	public String VISITINFO_PAT_NAME = "PAT_NAME";    					//患者姓名
	public String VISITINFO_START_DATE = "START_DATE";    		        //开始时间
	public String VISITINFO_END_DATE = "END_DATE";    		            //结束时间
	public String VISITINFO_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";    //门诊流水号
	public String VISITINFO_INDEX_NO_TYPE = "INDEX_NO_TYPE";            //门诊卡类别
	public String VISITINFO_DIAG_FLAG = "DIAG_FLAG";                    //类别，1 只有主诊断 2 所有，包括次诊断
	public String VISITINFO_FLAG_PAGE = "flag_PAGE";                //分页标识
	public String VISITINFO_NUM_PAGE = "num_PAGE";                  //当前页数
	public String VISITINFO_SIZE_PAGE = "size_PAGE";                //每页显示的条数
	public String VISITINFO_VISIT_DEPT_CODE = "VISIT_DEPT_CODE";    		//科室代码串 分隔符","
	public String VISITINFO_MULTI_VALUE = "MULTI_VALUE";    		     //查询条件

	//挂号信息
	public String REGISTINFO_PAT_INDEX_NO = "PAT_INDEX_NO";        		//患者索引号
	public String REGISTINFO_PAT_INDEX_OP = "PAT_INDEX_NO_OP";
	public String REGISTINFO_OUTHOSP_NO = "OUTHOSP_NO";            		//门诊号
	public String REGISTINFO_OUTHOSP_NO_OP = "OUTHOSP_NO_OP";
	public String REGISTINFO_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";   //门诊流水号
	public String REGISTINFO_START_DATE = "START_DATE";
	public String REGISTINFO_END_DATE = "END_DATE";

	//门诊诊断信息
	public String DIAGINFO_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";     //门诊流水号
	public String DIAGINFO_OUTHOSP_SERIAL_NO_OP = "OUTHOSP_SERIAL_NO_OP";

	//住院诊断信息
	public String INHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";                //住院流水号
	public String INHOSP_SERIAL_NO_OP = "INHOSP_SERIAL_NO_OP";

	//处方信息
	public String ORDERINFO_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";

	//处方明细
	public String ORDERDETAILINFO_PRES_NO = "PRES_NO";                      //处方号
	public String ORDERDETAILINFO_PRES_NO_OP = "PRES_NO_OP";


	//检查信息
	public String EXAMREPORT_PAT_INDEX_NO = "PAT_INDEX_NO";        		//患者索引号
	public String EXAMREPORT_PAT_INDEX_OP = "PAT_INDEX_NO_OP";
	public String EXAMREPORT_OUTHOSP_NO = "OUTHOSP_NO";            		//门诊号
	public String EXAMREPORT_OUTHOSP_NO_OP = "OUTHOSP_NO_OP";
	public String EXAMREPORT_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";   //门诊流水号
	public String EXAMREPORT_OUTHOSP_SERIAL_NO_OP = "OUTHOSP_SERIAL_NO";
	public String EXAMREPORT_START_DATE = "START_DATE";
	public String EXAMREPORT_END_DATE = "END_DATE";
	public String EXAMREPORT_INTHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";     //门诊流水号
	public String EXAMREPORT_INHOSP_SERIAL_NO_OP = "INHOSP_SERIAL_NO_OP";
	public String EXAMREPORT_INHOSP_NO = "INHOSP_NO";
	public String EXAMREPORT_INHOSP_NO_OP = "INHOSP_NO_OP";
	public String EXAMREPORT_REQUISITION_NO = "REQUISITION_NO";
	public String EXAMREPORT_REPORT_NO = "REPORT_NO";

	//检验信息
	public String TESTEPORT_PAT_INDEX_NO = "PAT_INDEX_NO";        		//患者索引号
	public String TESTEPORT_PAT_INDEX_OP = "PAT_INDEX_NO_OP";
	public String TESTEPORT_OUTHOSP_NO = "OUTHOSP_NO";            		//门诊号
	public String TESTEPORT_OUTHOSP_NO_OP = "OUTHOSP_NO_OP";
	public String TESTEPORT_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";   //门诊流水号
	public String TESTEPORT_OUTHOSP_SERIAL_NO_OP = "OUTHOSP_SERIAL_NO_OP";
	public String TESTEPORT_START_DATE = "START_DATE";
	public String TESTEPORT_END_DATE = "END_DATE";
	public String TESTEPORT_INTHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";     //门诊流水号
	public String TESTEPORT_INHOSP_SERIAL_NO_OP = "INHOSP_SERIAL_NO_OP";
	public String TESTEPORT_INHOSP_NO = "INHOSP_NO";
	public String TESTEPORT_INHOSP_NO_OP = "INHOSP_NO_OP";
	public String TESTEPORT_REQUISITION_NO = "REQUISITION_NO";          //申请单编号
	public String TESTREPORT_REPORT_NO = "REPORT_NO";
	public String TESTEPORT_BARCODE_NO = "BARCODE_NO";

	//检验结果
	public String TESTRESULT_REPORT_NO = "REPORT_NO";                   //检查报告
	public String TESTRESULT_REPORT_NO_OP = "REPORT_NO_OP";
	public String TESTRESULT_BARCODE_NO = "BARCODE_NO";

	//微生物检验结果
	public String MICROBETESTRESULT_REPORT_NO = "REPORT_NO";            //微生物检验报告
	public String MICROBETESTRESULT_BARCODE_NO = "BARCODE_NO";

	//门诊费用
	public String OUTHOSPFEE_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";  //门诊流水号

	//住院记录
	public String INHOSPRECORD_PAT_INDEX_NO = "PAT_INDEX_NO";          //患者索引号
	public String INHOSPRECORD_VISIT_CARD_NO = "VISIT_CARD_NO";        //就诊卡号
	public String INHOSPRECORD_INHOSP_NO = "INHOSP_NO";                //住院号
	public String INHOSPRECORD_PAT_NAME = "PAT_NAME";                  //患者姓名
	public String INHOSPRECORD_PAT_NAME_OP = "PAT_NAME_OP";            //患者姓名OP
	public String INHOSPRECORD_ID_NUMBER = "ID_NUMBER";                //身份证号码
	public String INHOSPRECORD_MOBILE_NO = "MOBILE_NO";                //手机号码
	public String INHOSPRECORD_DEPT_NAME = "DEPT_NAME";                //部门名称
	public String INHOSPRECORD_ATTEND_DR_NAME = "ATTEND_DR_NAME";      //主治医生
	public String INHOSPRECORD_START_DATE = "START_DATE";              //开始日期
	public String INHOSPRECORD_END_DATE = "END_DATE";                  //结束日期
	public String INHOSPRECORD_INHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";         //住院记录
	public String INHOSPRECORD_FLAG_PAGE = "flag_PAGE";                //分页标识
	public String INHOSPRECORD_NUM_PAGE = "num_PAGE";                  //当前页数
	public String INHOSPRECORD_SIZE_PAGE = "size_PAGE";                //每页显示的条数
	public String INHOSPRECORD_DISCHARGE_DIAG_NAME = "DISCHARGE_DIAG_NAME";         //出院诊断名称
	public String INHOSPRECORD_WARD_NAME = "WARD_NAME";         //病区
	public String INHOSPRECORD_DISCHARGE_DIAG_CODE = "DISCHARGE_DIAG_CODE";         //疾病代码串 分隔符","
	public String INHOSPRECORD_DIAG_FLAG = "DIAG_FLAG";         //2-所有诊断(含次诊断)
	public String INHOSPRECORD_INDEX_NO_TYPE = "INDEX_NO_TYPE";                     //
	public String INHOSPRECORD_DEPT_CODE = "DEPT_CODE";                //科室代码串 分隔符","
	public String INHOSPRECORD_WARD_CODE = "WARD_CODE";            //病区代码串 分隔符","
	public String INHOSPRECORD_DISCHARGE_STATUS = "DISCHARGE_STATUS"; //在院状态  (true:出院  false:在院)
	public String INHOSPRECORD_ADMIT_START_DATE = "ADMIT_START_DATE"; //在院 入院开始时间
	public String INHOSPRECORD_ADMIT_END_DATE = "ADMIT_END_DATE"; //在院 入院结束时间
	public String INHOSPRECORD_SICKROOM_NO = "SICKROOM_NO"; //病房号
	public String INHOSPRECORD_BED_NO = "BED_NO"; //病床号
	public String INHOSPRECORD_ADMIT_DIAG_CODE = "ADMIT_DIAG_CODE"; //入院诊断代码串 分隔符","
	public String INHOSPRECORD_ADMIT_DIAG_NAME = "ADMIT_DIAG_NAME"; //入院诊断名称
	public String INHOSPRECORD_STATISTICS = "STATISTICS"; //出院人次统计
	public String INHOSPRECORD_SYS_CODE = "SYS_CODE"; //系统编号 1 hug 2 随访
	public String INHOSPRECORD_SYS_NAME = "SYS_NAME"; //系统编号 1 hug 2 随访
	public String INHOSPRECORD_MULTI_VALUE = "MULTI_VALUE";                  //查询条件

	//住院费用
	public String INHOSPFEE_INHOSP_NO = "INHOSP_NO";                   //住院号
	public String INHOSPFEE_INHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";                   //住院号


	//住院医嘱
	public String INHOSPORDER_INHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";   //住院流水号
	public String INHOSPORDER_START_DATE = "START_DATE";               //开始日期
	public String INHOSPORDER_END_DATE = "END_DATE";          		   //结束日期

	public String INHOSPORDER_NUM_PAGE = "num_PAGE";                   //当前页数
	public String INHOSPORDER_SIZE_PAGE = "size_PAGE";                 //每页显示的条数

	//住院手术
	public String SURGERYRECORD_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";
	public String SURGERYRECORD_INHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";

	//卡号信息
	public String INDEXNO_START_DATE = "START_DATE";        //开始日期
	public String INDEXNO_END_DATE = "END_DATE";            //结束日期
	public String INDEXNO_ID_NUMBER = "ID_NUMBER";          //身份证号
	public String INDEXNO_PAT_NAME = "PAT_NAME";            //患者姓名
	public String INDEXNO_NO = "NO";                        //就诊卡号
	public String INDEXNO_PAT_INDEX_NO = "PAT_INDEX_NO";    //主索引号
	public String INDEXNO_SYS_CODE = "SYS_CODE";    		//系统代码
	public String INDEXNO_SYS_NAME = "SYS_NAME";    		//系统名称

	//检查申请单
	public String TESTREQ_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";
	public String TESTREQ_INHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";
	public String TESTREQ_REQUISITION_NO = "REQUISITION_NO";
	public String TESTREQ_OUTHOSP_NO = "OUTHOSP_NO";
	public String TESTREQ_INHOSP_NO = "INHOSP_NO";

	//检验申请单
	public String EXAMREQ_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";
	public String EXAMREQ_OUTHOSP_NO = "OUTHOSP_NO";
	public String EXAMREQ_INHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";
	public String EXAMREQ_INHOSP_NO = "INHOSP_NO";
	public String EXAMREQ_REQUISITION_NO = "REQUISITION_NO";

	//门诊费用明细
	public String OUTHOSPFEEDETAIL_DEAL_NO = "DEAL_NO";

	//住院费用明细
	public String INHOSPFEEDETAIL_DEAL_NO = "DEAL_NO";

	//门诊结算费用
	public String OUTHOSPBANLANCE_DEAL_NO = "DEAL_NO";

	//住院结算费用
	public String INHOSPBANLANCE_DEAL_NO = "DEAL_NO";

	//送检清单
	public String TESTSAMPLE_OUTHOSP_SERIAL_NO = "OUTHOSP_SERIAL_NO";
	public String TESTSAMPLE_INHOSP_SERIAL_NO = "INHOSP_SERIAL_NO";
	public String TESTSAMPLE_OUTHOSP_NO = "OUTHOSP_NO";
	public String TESTSAMPLE_INHOSP_NO = "INHOSP_NO";
	public String TESTSAMPLE_REQUISITION_NO = "REQUISITION_NO";
	public String TESTSAMPLE_REQUISITION_NO_ITEM = "REQUISITION_NO_ITEM";
	public String TESTSAMPLE_START_DATE = "START_DATE";
	public String TESTSAMPLE_END_DATE = "END_DATE";

	//体检报告
	public String PHYSICALEXAMREPORT_REPORT_NO = "REPORT_NO";                 //体检报告
	public String PHYSICALEXAMREPORT_PAT_INDEX_NO = "PAT_INDEX_NO";           //
	public String PHYSICALEXAMREPORT_VISIT_CARD_NO = "VISIT_CARD_NO";
	public String PHYSICALEXAMREPORT_PAT_NAME = "PAT_NAME";
	public String PHYSICALEXAMREPORT_ID_NUMBER = "ID_NUMBER";
	public String PHYSICALEXAMREPORT_MOBILE_NO = "MOBILE_NO";
	public String PHYSICALEXAMREPORT_START_DATE = "START_DATE";
	public String PHYSICALEXAMREPORT_END_DATE = "END_DATE";
	public String PHYSICALEXAMREPORT_FLAG_PAGE = "flag_PAGE";                //分页标识
	public String PHYSICALEXAMREPORT_NUM_PAGE = "num_PAGE";                  //当前页数
	public String PHYSICALEXAMREPORT_SIZE_PAGE = "size_PAGE";
	//体检结果
	public String PHYSICALEXAMRESULT_REPORT_NO = "REPORT_NO";

	//体征信息
	public String SIGNSINFO_PAT_INDEX_NO = "PAT_INDEX_NO";
	public String SIGNSINFO_VISIT_CARD_NO = "VISIT_CARD_NO";
	public String SIGNSINFO_OUTHOSP_NO = "OUTHOSP_NO";
	public String SIGNSINFO_INHOSP_NO = "INHOSP_NO";
	public String SIGNSINFO_TYPE = "TYPE";
	public String SIGNSINFO_PAT_NAME = "PAT_NAME";
	public String SIGNSINFO_ID_NUMBER = "ID_NUMBER";             	//身份证号码
	public String SIGNSINFO_NORMAL_FLAG = "NORMAL_FLAG";            //正常标志
	public String SIGNSINFO_START_DATE = "START_DATE";              //开始日期
	public String SIGNSINFO_END_DATE = "END_DATE";                  //结束日期
	public String SIGNSINFO_FLAG_PAGE = "flag_PAGE";                //分页标识
	public String SIGNSINFO_NUM_PAGE = "num_PAGE";                  //当前页数
	public String SIGNSINFO_SIZE_PAGE = "size_PAGE";                //每页显示的条数

	//签约病人
	public String SIGNED_PATIENT_INFO_PAT_INDEX_NO = "PAT_INDEX_NO"; //患者索引号
	public String SIGNED_PATIENT_INFO_PAT_VISIT_CARD_NO = "VISIT_CARD_NO"; //就诊卡号
	public String SIGNED_PATIENT_INFO_PAT_PAT_NAME = "PAT_NAME"; //患者姓名
	public String SIGNED_PATIENT_INFO_ID_NUMBER = "ID_NUMBER"; //患者身份证号码
	public String SIGNED_PATIENT_INFO_MOBILE_NO = "MOBILE_NO"; //患者手机号
	public String SIGNED_PATIENT_INFO_SIGNED_DR_NAME = "SIGNED_DR_NAME"; //签约医生姓名
	public String SIGNED_PATIENT_INFO_SIGNED_DR_CODE = "SIGNED_DR_CODE"; //签约医生工号
	public String IGNED_PATIENT_INFO_START_DATE = "START_DATE";              //开始日期
	public String IGNED_PATIENT_INFO_END_DATE = "END_DATE";                  //结束日期
	public String IGNED_PATIENT_INFO_FLAG_PAGE = "flag_PAGE";                //分页标识
	public String IGNED_PATIENT_INFO_NUM_PAGE = "num_PAGE";                  //当前页数
	public String IGNED_PATIENT_INFO_SIZE_PAGE = "size_PAGE";                //每页显示的条数
	public String SIGNED_PATIENT_INFO_AGE_START = "AGE_START";              //开始年龄
	public String SIGNED_PATIENT_INFO_AGE_END = "AGE_END";              //结束年龄
	public String SIGNED_PATIENT_INFO_DIAG_NAME = "DIAG_NAME";              //疾病诊断

	//排班信息
	public String SCHEDULING_START_DATE = "START_DATE";                      //开始日期
	public String SCHEDULING_END_DATE = "END_DATE";                          //结束日期

	//体检统计
	public String PHYSICAL_EXAM_STATISTICS_EXAM_TYPE = "EXAM_TYPE";	// 体检类别 1-个人、2-团体
	public String PHYSICAL_EXAM_STATISTICS_PAT_NAME = "PAT_NAME";	// 体检类别 1-个人、2-团体
	public String PHYSICAL_EXAM_STATISTICS_SEX_CODE = "SEX_CODE";	//性别代码
	public String PHYSICAL_EXAM_STATISTICS_AGE_START = "AGE_START";	//开始年龄
	public String PHYSICAL_EXAM_STATISTICS_AGE_END = "AGE_END";	//结束年龄
	public String PHYSICAL_EXAM_STATISTICS_COMPANY = "COMPANY";	//工作单位
	public String PHYSICAL_EXAM_STATISTICS_DEPT_CODE = "DEPT_CODE";	//科室代码
	public String PHYSICAL_EXAM_STATISTICS_ITEM_CODE = "ITEM_CODE";	//项目明细代码
	public String PHYSICAL_EXAM_STATISTICS_FLAG_PAGE = "flag_PAGE";   //分页标识
	public String PHYSICAL_EXAM_STATISTICS_NUM_PAGE = "num_PAGE";    //当前页数
	public String PHYSICAL_EXAM_STATISTICS_SIZE_PAGE = "size_PAGE";    //每页显示的条数
	public String PHYSICAL_EXAM_STATISTICS_START_DATE = "START_DATE";
	public String PHYSICAL_EXAM_STATISTICS_END_DATE = "END_DATE";

	//挂号相关
	public String SCHEDULING_SCHEDULING_NO = "SCHEDULING_NO";				//排班编号
	public String SCHEDULING_VISIT_DATE = "VISIT_DATE";				//排班日期
	public String SCHEDULING_SEQ_NO = "SEQ_NO";				//号源序号
	public String SCHEDULING_PAT_NAME = "PAT_NAME";				//姓名
	public String SCHEDULING_ID_NUMBER = "ID_NUMBER";				//身份证
	public String SCHEDULING_MOBILE_NO = "MOBILE_NO";				//手机号
	public String SCHEDULING_SEX_CODE = "SEX_CODE";				//性别代码
	public String SCHEDULING_SEX_NAME = "SEX_NAME";				//性别名称
	public String SCHEDULING_AP = "AP";				//上下午
	public String SCHEDULING_PASSWORD = "PASSWORD";				//取号密码
	public String SCHEDULING_REGISTER_RECORD_NO = "REGISTER_RECORD_NO";				//预约纪录号
	public String SCHEDULING_STIME = "START_TIME";									//开始时间
	public String SCHEDULING_ETIME = "END_TIME";									//结束时间

	public String SCHEDULING_VISIT_CARD_TYPE = "VISIT_CARD_TYPE";				//就诊卡类别
	public String SCHEDULING_VISIT_CARD_NO = "VISIT_CARD_NO";				//就诊卡号
	//体检预约
	public String SCHEDULING_PACKAGE_NO = "PACKAGE_NO";			//套餐编号
}
