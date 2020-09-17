package com.calc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calc.util.CookieUtil;

@Controller
public class TopController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showTopPage(HttpServletRequest request,Model model) {
        CookieUtil cookieUtil = new CookieUtil();
        String userName = cookieUtil.getUserName(request);
        model.addAttribute("userName", userName);
        return "index";
    }
}
