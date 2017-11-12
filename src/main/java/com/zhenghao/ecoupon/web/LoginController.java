package com.zhenghao.ecoupon.web;

import com.zhenghao.ecoupon.dto.LoginResult;
import com.zhenghao.ecoupon.enums.LoginStateEnum;
import com.zhenghao.ecoupon.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    public String loginCheck(Model model, long account, String password, HttpSession session) {
        LoginResult loginResult = loginService.loginCheck(account, password);
        if (loginResult.getLoginStateEnum() == LoginStateEnum.CONSUMERLOGIN){
            session.setAttribute("consumer", loginResult.getData());
            session.setAttribute("role", "consumer");
            return "redirect:/consumer/activity_list";
        }

        return "login";
    }
}
