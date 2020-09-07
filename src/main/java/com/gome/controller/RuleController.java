package com.gome.controller;

import com.gome.service.JudgesScoresService;
import com.gome.service.QaScoresRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.gome.constant.GomeConstant.RULE;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/19 4:24
 * @Modified By:
 */
@Controller
public class RuleController {
    @Autowired
    private QaScoresRecordService scoresRecordService;
    @Autowired
    private JudgesScoresService judgesScoresService;

    @GetMapping("/rule")
    public String toRule() {
        // 1.查询所有的分数
        return RULE;
    }
}
