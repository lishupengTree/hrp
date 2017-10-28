package com.lsp.his.web.maintenance;

import com.lsp.his.db.DBOperator;
import com.lsp.his.table.Bas_system_menu;
import com.lsp.his.web.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lishupeng
 * @Description
 * @Date 2017/10/28 17:11
 */

@Controller
@RequestMapping("/maintenance")
public class SystemMenuController extends AbstractController {

    @RequestMapping("/system_menu")
    public String show(){
        return "maintenance/system_menu";
    }

    @RequestMapping("/system_menu_info")
    public ModelAndView showInfo(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) throws Exception {
        String name ="";
        if(null != request.getParameter("name")){
            name = URLDecoder.decode(request.getParameter("name"),"utf-8");
        }
        String menu_type="";
        if(null != request.getParameter("menu_type")){
            menu_type = URLDecoder.decode(request.getParameter("menu_type"),"utf-8");
        }

        Map<String,String> map = new HashMap<String,String>();
        map.put("menu_type", menu_type);
        map.put("name", name);

        int showtype = Integer.parseInt(request.getParameter("showtype").toString());

        String id="";
        if(showtype == 0){
            id = request.getParameter("id");
        }else if(showtype == 1){
            id = CreateTheChildId(request.getParameter("pid"));
        }
        map.put("id", id);
        return new ModelAndView("maintenance/system_menu_windows/info",map);
    }

    String CreateTheChildId(String pid) throws Exception  {
        String cId = "";
        String tPid = pid;
        String sql = "select t.id from bas_system_menu t where t.pid = ? order by t.id DESC";

        List<Bas_system_menu> bsms = new ArrayList<Bas_system_menu>();
        DBOperator db = new DBOperator();
        try{
            bsms = db.find(sql,new Object[]{pid},Bas_system_menu.class);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            db.freeCon();
        }

        if("root".equals(pid))
            tPid = "";
        if(bsms.size()>0){
            cId = bsms.get(0).getId();
            cId = cId.substring(tPid.length(),cId.length());
            int cIdInt = Integer.parseInt(cId) + 1;
            if(cIdInt < 10){
                cId = tPid + "0" + cIdInt;
            }else{
                cId = tPid + cIdInt;
            }
        }else{
            cId = tPid + "01";
        }
        return cId;
    }
}
