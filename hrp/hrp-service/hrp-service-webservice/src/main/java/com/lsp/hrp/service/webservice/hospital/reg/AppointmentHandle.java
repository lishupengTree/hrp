package com.lsp.hrp.service.webservice.hospital.reg;

import cn.joinhealth.pub_manager.exception.HugException;
import cn.joinhealth.pub_manager.utils.StringUtil;
import com.lsp.hrp.service.webservice.constant.JHwebServiceType;
import com.lsp.hrp.service.webservice.constant.WebserviceBackConstant;
import com.lsp.hrp.service.webservice.entry.reg.Appointment;
import com.lsp.hrp.service.webservice.handle.WebServiceHandle;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 预约挂号webservice
 * @author bjyuan
 *
 */
public class AppointmentHandle extends WebServiceHandle {

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
		Iterator it = result.elementIterator();
		List<Appointment> list = new ArrayList<Appointment>();
		while(it.hasNext()){
			Element row = (Element)it.next();
			Appointment appointment = new Appointment(
					StringUtil.dealElementText(row.elementText("ORGAN_CODE")), StringUtil.dealElementText(row.elementText("RESULT_CODE")),
					StringUtil.dealElementText(row.elementText("RESULT_DESC")), StringUtil.dealElementText(row.elementText("PASSWORD")),
					StringUtil.dealElementText(row.elementText("SEQ_NO")), StringUtil.dealElementText(row.elementText("REGISTER_RECORD_NO"))
		    );
			list.add(appointment);
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
				+		"<AP op=\"=\"></AP>"
				+		"<SEQ_NO op=\"=\"></SEQ_NO>"
				+		"<PAT_NAME op=\"=\"></PAT_NAME>"
				+		"<ID_NUMBER op=\"=\"></ID_NUMBER>"
				+		"<MOBILE_NO op=\"=\"></MOBILE_NO>"
				+		"<VISIT_DATE op=\"=\"></VISIT_DATE>"
				+		"<START_TIME op=\"=\"></START_TIME>"
				+		"<END_TIME op=\"=\"></END_TIME>"
				+		"<SEX_CODE op=\"=\"></SEX_CODE>"
				+		"<SEX_NAME op=\"=\"></SEX_NAME>"
				+		"<VISIT_CARD_TYPE op=\"=\"></VISIT_CARD_TYPE>"
				+		"<VISIT_CARD_NO op=\"=\"></VISIT_CARD_NO>"
				+	"</param>" +
				"</root>";
	}
}
