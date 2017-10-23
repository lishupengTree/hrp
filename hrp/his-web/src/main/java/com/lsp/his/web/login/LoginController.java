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


    @RequestMapping("/login")
    public String show(){
        return "login/login";
    }

}
