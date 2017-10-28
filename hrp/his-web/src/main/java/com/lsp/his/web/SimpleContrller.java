package com.lsp.his.web;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by lishupeng
 */
@Controller
public class SimpleContrller {

    private static final Logger logger = Logger.getLogger(SimpleContrller.class);


    /**
     * 页面跳转
     * @param module
     * @param page
     * @return
     */
    @RequestMapping(value = "/jump/{module}/{page}", method = RequestMethod.GET)
    public String jump(@PathVariable("module") String module,
                       @PathVariable("page") String page, @RequestParam Map map, Model model) {
        if (map != null) {
            model.addAllAttributes(map);
        }
        return module + "/" + page;
    }

}
