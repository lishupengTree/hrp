package com.lsp.hrp.service.webservice.hospital.exam;

import cn.joinhealth.pub_manager.exception.HugException;
import cn.joinhealth.pub_manager.utils.StringUtil;
import com.lsp.hrp.service.webservice.constant.JHwebServiceType;
import com.lsp.hrp.service.webservice.constant.WebserviceBackConstant;
import com.lsp.hrp.service.webservice.entry.exam.ExamItemInfo;
import com.lsp.hrp.service.webservice.entry.exam.ExamPackageInfo;
import com.lsp.hrp.service.webservice.handle.WebServiceHandle;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ExamPackageInfoHandle extends WebServiceHandle {

	@Override
	public Object parseDocument(Document document) throws HugException {
		if(document==null) {
            return null;
        }
		Element root = document.getRootElement();
		Element retFlag = root.element("retInfo");
		String code = retFlag.elementText("code"); //返回代码
		String desc = retFlag.elementText("name"); //返回代码说明
		
		if(!WebserviceBackConstant.HAS_DATA.equals(code)){
			throw new HugException(WebserviceBackConstant.ERROR_CODE, desc);
		}
		Element result = root.element("msg");
		List<ExamItemInfo> list = new ArrayList<ExamItemInfo>();
		List rwos = result.elements("row");
		for (Iterator it = rwos.iterator(); it.hasNext();) {
			Element row = (Element) it.next();
			ExamItemInfo examPackage = new ExamItemInfo(
					StringUtil.dealElementText(row.elementText("ORGAN_CODE")), StringUtil.dealElementText(row.elementText("PACKAGE_NO")),
					StringUtil.dealElementText(row.elementText("ITEM_CODE")), StringUtil.dealElementText(row.elementText("ITEM_NAME")),
					StringUtil.dealElementText(row.elementText("ITEM_TYPE")), StringUtil.dealElementText(row.elementText("ITEM_CONTENT")),
					StringUtil.dealElementText(row.elementText("ITEM_MEANING"))
		    );
			list.add(examPackage);
		}  
		List heads = result.elements("head");
		List<ExamPackageInfo> packageList = new ArrayList<ExamPackageInfo>();
		for (Iterator it = heads.iterator(); it.hasNext();) {
			Element row = (Element) it.next();
			ExamPackageInfo examPackage = new ExamPackageInfo(
					StringUtil.dealElementText(row.elementText("INVALID_FLAG")), StringUtil.dealElementText(row.elementText("PRICE")),
					StringUtil.dealElementText(row.elementText("INTRODUCE")), StringUtil.dealElementText(row.elementText("APPLICABLE_GENDER")),
					StringUtil.dealElementText(row.elementText("APPLICABLE_CROWD")), StringUtil.dealElementText(row.elementText("FEATURE"))
		    );
			packageList.add(examPackage);
		}
		ExamPackageInfo examPackageInfo = packageList.get(0);
		examPackageInfo.setItems(list);
		return examPackageInfo;
	}

	@Override
	protected String template(JHwebServiceType type, String hospCode) {
		return 	"<root>"
				+	"<organCode>" + hospCode + "</organCode>"
				+	"<interface>"
				+		"<code>" + type.getCode() + "</code>"
				+       "<method>" + type.getMethod() + "</method>"
				+	"</interface>"
				+	"<param>"
				+		"<PACKAGE_NO op=\"=\"></PACKAGE_NO>"
				+	"</param>" +
				"</root>";
	}

}
