package com.calc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SubtractionController {
    @RequestMapping(value = "/hikizan", method = RequestMethod.GET)
    public String top(Model model) {
        model.addAttribute("message", "Hello World!!");
        return "/hikizan/subtraction";
    }
}
