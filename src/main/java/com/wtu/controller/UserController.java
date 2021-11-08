package com.wtu.controller;

import com.wtu.entity.User;
import com.wtu.entity.VerifyCode;
import com.wtu.service.MomentService;
import com.wtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MomentService momentService;

    //验证码
    @RequestMapping("/vccode")
    public void getCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        VerifyCode vc = new VerifyCode();
        BufferedImage image = vc.createImage();
        String codeimg = vc.getText();
        HttpSession session = request.getSession();
        session.setAttribute("code01", codeimg);
        ServletOutputStream stream = response.getOutputStream();
        vc.output(image, stream);
    }

    //注册
    @RequestMapping("/insertUser")
    public String insertUser(User user,HttpServletRequest request){
        HttpSession session = request.getSession();
        String code01 = (String)session.getAttribute("code01");
//        System.out.println("code01 = " + code01);
        String inputcode = request.getParameter("inputcode");
//        System.out.println("inputcode = " + inputcode);
        if(inputcode.equalsIgnoreCase(code01)) {
            userService.insertUser(user);
            return "homepage";
        }else{
            return "register";
        }
    }

    //登录
    @RequestMapping("/userLogin")
    public String userLogin(User user, HttpServletRequest request){
        User user1 = userService.userLogin(user);
        if(user1 != null){
            HttpSession session = request.getSession();
            session.setAttribute("user1",user1);
            return "redirect:/allmoments";
        }else{
            return "login";
        }
    }

    //跳转登录
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    //跳转注册
    @RequestMapping("/toReg")
    public String toReg(){
        return "register";
    }
    //退出登录
    @RequestMapping("/outLogin")
    public String logout(HttpSession session){
        //退出登录，清除session信息
        session.removeAttribute("user1");
        return "login";
    }


}
