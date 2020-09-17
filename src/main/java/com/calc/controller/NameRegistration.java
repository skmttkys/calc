package com.calc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.calc.util.CookieUtil;

@Controller
public class NameRegistration {
    @RequestMapping(value = "/nameRegistration", method = RequestMethod.POST)
    public String registName(@RequestParam("name")String userName,HttpServletResponse httpServletResponse,Model model) {
    	CookieUtil cookieUtil = new CookieUtil();
    	cookieUtil.setCookieUserName(httpServletResponse,userName);
    	model.addAttribute("userName", userName);
        return "index";
    }
}
