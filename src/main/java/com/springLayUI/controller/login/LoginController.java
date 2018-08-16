package com.springLayUI.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: luyang
 * @description:登陆控制器
 * @Date: 14:18 2018/8/13
 * @Modified By:
 */
@Controller
@RequestMapping("/main")
public class LoginController {
    /**
     * 主页
     * @return
     */
    @RequestMapping("/index")
    public String main(){return "/main/index";}

    /**
     * 登陆页
     * @return
     */
    @RequestMapping("/login")
    public String login(){return "/main/login";}

}
