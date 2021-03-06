package com.lsp.his.web.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lishupeng
 * @create 2017-10-23 下午 11:10
 **/
@Controller
@RequestMapping("/")
public class LoginController {

    /**
     * 跳转到登录页
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "login/login";
    }

    /**
     * 跳转到选择系统页
     * @return
     */
    @RequestMapping("/platform")
    public String platform(){
        return "login/platform";
    }

}
