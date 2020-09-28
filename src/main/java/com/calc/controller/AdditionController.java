package com.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calc.define.ModelKeyDefine;
import com.calc.model.AdditionModel;
import com.calc.service.AdditionService;

@Controller
public class AdditionController {
    @RequestMapping(value = "/tashizan", method = RequestMethod.GET)
    public String tashizan(AdditionModel additionModel,Model model) {
//        model.addAttribute("type", "addition");
    	model.addAttribute("NORMAL",ModelKeyDefine.GAME_MODE_NORMAL);
    	model.addAttribute("HARD",ModelKeyDefine.GAME_MODE_HARD);
    	model.addAttribute("TIMEATTACK",ModelKeyDefine.GAME_MODE_TIMEATTACK);
    	return "/tashizan/addition";
    }

	@RequestMapping(value = "/addition/result", method = RequestMethod.POST)
    public String showResult(AdditionModel additionModel,Model model) {
      AdditionService service = new AdditionService();
      service.result(additionModel);
      model.addAttribute("key",new ModelKeyDefine());
      model.addAttribute("type", additionModel.getType());
      model.addAttribute("mode", additionModel.getMode());
      model.addAttribute("resultMessage", additionModel.getResultMessage());
      model.addAttribute("result", additionModel.getResult());
      model.addAttribute("time", additionModel.getTime());

      return "/result/index";
    }
}
