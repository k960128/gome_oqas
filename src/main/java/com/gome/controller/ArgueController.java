package com.gome.controller;

import com.gome.pojo.*;
import com.gome.service.DebateUserSerivce;
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
    @Autowired
    private DebateUserSerivce debateUserSerivce;

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
        //正方用户数据
        List<DebateUser> list1 = debateUserSerivce.findAllByStatu(0);
        System.out.println(list1.toString());
        //反方用户数据
        List<DebateUser> list2 = debateUserSerivce.findAllByStatu(1);
        System.out.println(list2.toString());

        model.addAttribute("list1",list1);
        model.addAttribute("list2",list2);
        model.addAttribute("title1", title1);
        model.addAttribute("title2", title2);
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
