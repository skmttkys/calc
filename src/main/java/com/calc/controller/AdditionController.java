package com.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calc.model.AdditionModel;
import com.calc.service.AdditionService;

@Controller
public class AdditionController {
    @RequestMapping(value = "/tashizan", method = RequestMethod.GET)
    public String tashizan(AdditionModel additionModel,Model model) {
        return "/tashizan/addition";
    }

	@RequestMapping(value = "/result", method = RequestMethod.POST)
    public String showResult(AdditionModel additionModel,Model model) {
      AdditionService service = new AdditionService();
      service.result(additionModel);
      model.addAttribute("resultMessage", additionModel.getResultMessage());
      System.out.println(additionModel);

      return "/result/index";
    }
}
