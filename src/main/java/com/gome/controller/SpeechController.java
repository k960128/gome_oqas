package com.gome.controller;

import com.gome.pojo.GomeUser;
import com.gome.service.GomeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.gome.constant.GomeConstant.*;

/**
 * @Description: 演讲页面
 * @Author: WangJinYue
 * @Date: 2020/8/17 2:22
 * @Modified By:
 */
@Controller
public class SpeechController {
    @Autowired
    private GomeUserService gomeUserService;

    @GetMapping("/speech")
    public String toSpeech(@RequestParam Integer userSortnum, @RequestParam Integer thisLinks, Model model) {
        System.out.println("第" + thisLinks + "环节，第" + userSortnum + "号选手演讲");
        // 通过号，查询他的全部信息
        GomeUser gomeUser = gomeUserService.selectAll(userSortnum);
        // 拆分 branch
        String branch = gomeUser.getBranch();
        if (branch != null && !branch.equals("")) {
            String[] split = branch.split("-");
            System.out.println(split.toString());
            model.addAttribute("branch0", split[0]);
            model.addAttribute("branch1", split[1]);
            model.addAttribute("branch2", split[2]);
        }
        model.addAttribute("gomeUser", gomeUser);
        model.addAttribute("thisLinks", thisLinks);
        return SPEECH;
    }
}
