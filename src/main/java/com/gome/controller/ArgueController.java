package com.gome.controller;

import com.gome.pojo.GomeQaRule;
import com.gome.pojo.GomeUser;
import com.gome.pojo.JudgesVote;
import com.gome.pojo.QaQuestionList;
import com.gome.service.GomeUserService;
import com.gome.service.JudgesVoteService;
import com.gome.service.QaQuestionListService;
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
    QaQuestionListService qaQuestionListService;

    @Autowired
    private GomeUserService gomeUserService;

    @Autowired
    private JudgesVoteService judgesVoteService;

    @GetMapping("/argue")
    public String toArgue(Model model) {
        // 1.查询所有的参赛选手
        //2.查询投票数最高的题目
        JudgesVote judgesVote = judgesVoteService.findOrder();
        QaQuestionList qaQuestionList = qaQuestionListService.getQuestion(judgesVote.getQuestionId());

        //正方标题
        String title1 = qaQuestionList.getQuestionTitle().split("VS")[0];
        //反方标题
        String title2 = qaQuestionList.getQuestionTitle().split("VS")[1];
        //QaQuestionList qaQuestionList
        List<GomeUser> gomeUserList = gomeUserService.selectAll();
        System.out.println(gomeUserList.toString());
        model.addAttribute("gomeUserList",gomeUserList);
        model.addAttribute("title1",title1);
        model.addAttribute("title2",title2);
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
