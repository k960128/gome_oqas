package com.gome.controller;

import com.gome.pojo.GomeQaRule;
import com.gome.service.GomeQaRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GomeQaRuleController {

    @Autowired(required = false)
    private GomeQaRuleService gomeQaRuleService;
    /**
     * 跳转至宣读流程界面
     */
    @GetMapping("/process")
    public String toProcess(@RequestParam  int this_Links, Model model){
        System.out.println(this_Links);
        GomeQaRule gomeQaRule = new GomeQaRule();
        gomeQaRule = gomeQaRuleService.findGomeQaRuleByLinks(this_Links);
        model.addAttribute("gomeQaRule",gomeQaRule);
        return "process";
    }
}
