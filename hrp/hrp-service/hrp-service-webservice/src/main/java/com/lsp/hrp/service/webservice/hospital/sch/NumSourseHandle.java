package com.lsp.hrp.service.webservice.hospital.sch;

import cn.joinhealth.pub_manager.exception.HugException;
import cn.joinhealth.pub_manager.utils.StringUtil;
import com.lsp.hrp.service.webservice.constant.JHwebServiceType;
import com.lsp.hrp.service.webservice.constant.WebserviceBackConstant;
import com.lsp.hrp.service.webservice.entry.sch.NumSourse;
import com.lsp.hrp.service.webservice.handle.WebServiceHandle;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 号源webservice
 * @author bjyuan
 *
 */
public class NumSourseHandle extends WebServiceHandle {

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
			throw new HugException(-1,desc);
		}
				
		Element result = root.element("msg");
		Iterator it = result.elementIterator();
		List<NumSourse> list = new ArrayList<NumSourse>();
		while(it.hasNext()){
			Element row = (Element)it.next();
			NumSourse numSourse = new NumSourse(
					StringUtil.dealElementText(row.elementText("ORGAN_CODE")), StringUtil.dealElementText(row.elementText("SCHEDULING_NO")),
					StringUtil.dealElementText(row.elementText("AP")), StringUtil.dealElementText(row.elementText("SEQ_NO")),
					StringUtil.dealElementText(row.elementText("VISIT_DATE")), StringUtil.dealElementText(row.elementText("STATUS")),
					StringUtil.dealElementText(row.elementText("VISIT_TIME"))
		    );
			list.add(numSourse);
		}

		return list;
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
				+		"<SCHEDULING_NO op=\"=\"></SCHEDULING_NO>"
				+	"</param>" +
				"</root>";
	}
}
