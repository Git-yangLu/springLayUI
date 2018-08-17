package com.springLayUI.controller.login;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @Author: luyang
 * @description:登陆控制器
 * @Date: 14:18 2018/8/13
 * @Modified By:
 */
@Controller
@RequestMapping("/main")
public class LoginController {
    @Autowired
    private Producer captchaProducer = null;
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

    /**
     * 验证码
     * @param request
     * @param response
     */
    @RequestMapping("/vCode")
    public void vCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String text = captchaProducer.createText();
        BufferedImage image = captchaProducer.createImage(text);
        ImageIO.write(image,"JPEG",response.getOutputStream());
    }

}
