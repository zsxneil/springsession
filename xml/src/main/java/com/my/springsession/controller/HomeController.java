package com.my.springsession.controller;

import com.my.springsession.model.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * Created by Administrator on 2017/11/21.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String home(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        if ("username".equals(username) && "password".equals(password)) {
            Random random = new Random();
            UserInfo userInfo = new UserInfo(random.nextInt(100),username,password);
            session.setAttribute("userinfo",userInfo.toString());
            return "redirect:welcome";
        }
        return "redirect:login?error";
    }

    @RequestMapping(value = "/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:login?logout";
    }
}
