package com.gome.controller;

import com.gome.pojo.GomeQaRule;
import com.gome.pojo.GomeUser;
import com.gome.service.GomeUserService;
import com.gome.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArgueController {

    @Autowired
    private GomeUserService gomeUserService;

    @GetMapping("/argue")
    public String toArgue(Model model) {
        // 1.查询所有的参赛选手
        List<GomeUser> list = gomeUserService.selectAll();
        model.addAttribute("list", list);
        return "argue";
    }

    @PostMapping("/argue-id")
    @ResponseBody
    public ResultUtil argue(@RequestParam Integer id) {
        GomeUser gomeUser = gomeUserService.selectAll(id);
        if (gomeUser != null) {
            return ResultUtil.ok(gomeUser);
        }
        return ResultUtil.build(2, "查无此参赛者");
    }
}
