package com.gome.controller;

import com.gome.constant.GomeConstant;
import com.gome.pojo.*;
import com.gome.service.*;
import com.gome.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.text.DecimalFormat;
import java.util.*;

import static com.gome.constant.GomeConstant.*;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/18 13:28
 * @Modified By:
 */
@Controller
public class ScoreController {

    @Autowired
    private GomeUserService gomeUserService;
    @Autowired
    private QaScoresRecordService qaScoresRecordService;
    @Autowired
    private FinalScoreService finalScoreService;
    @Autowired
    private JudgesScoresService judgesScoresService;
    @Autowired
    private FinalToScoreService finalToScoreService;
    /**
     * 跳转到得分界面
     *
     * @return
     */

    @GetMapping("/score")
    public String to_Wait(@RequestParam String thisLinks, int userSortnum, HttpServletRequest request, Model model) {

        System.out.println("==============:" + thisLinks);

        HttpSession session = request.getSession();


        GomeUser gomeUser = gomeUserService.selectAll(userSortnum);
        //查询当前环节总排名
        List<FinalScore> finalScoreListSort = finalScoreService.findBySortList(thisLinks);
        if (thisLinks.equals("2")) {
            //如果是第二环节，进行一个排序
            Collections.sort(finalScoreListSort, new Comparator<FinalScore>() {
                @Override
                public int compare(FinalScore o1, FinalScore o2) {
                    return o2.getFinalScore().compareTo(o1.getFinalScore());
                }
            });
        }

        //如果为第四环节，则不必要使用用户，为空即可
        if(thisLinks.equals("4")){
            gomeUser = new GomeUser();
        }

        System.out.println("排序后：");
        for (FinalScore finalSore : finalScoreListSort
        ) {
            System.out.println(finalSore.toString());
        }
        Double final_Score = finalScoreService.getScore(thisLinks, userSortnum);
        model.addAttribute("finalScoreListSort", finalScoreListSort);
        model.addAttribute("thisLinks", thisLinks);
        model.addAttribute("userSortnum", userSortnum);
        model.addAttribute("finalScores", final_Score);
        model.addAttribute("user", gomeUser);
        return "score";
    }


    /**
     * 计算得分
     *
     * @param thisLinks
     */
    public void count_Score(String thisLinks, GomeUser gomeUser) {
        List<JudgesScores> judgesScoresList = null;
        FinalScore finalScore = null;
        Double scores = 0.00;
        String judges_name = "";
        //评委人数
        int count = 1;
        //得分
        //当前环节评委得分
        judgesScoresList = judgesScoresService.findAllByPlayerId(gomeUser.getUserId(), thisLinks);
        //遍历第三环节得分
        if (judgesScoresList.size() > 0) {
            judges_name = judgesScoresList.get(0).getJudgesName();
            for (JudgesScores judgesScores : judgesScoresList) {
                scores += (Double) judgesScores.getScore();

                if (judges_name.equals(judgesScores.getJudgesName())) {
                    continue;
                } else {
                    judges_name = judgesScores.getJudgesName();
                    count++;
                }

            }


            System.out.println("score:" + scores);
            System.out.println("count:" + count);
            System.out.println("thisLinks:"+thisLinks);
            scores = (Double) (scores / count);
            if(thisLinks.equals("1")){
                scores = scores*0.1;
            }
            if(thisLinks.equals("3")){
                scores = scores*0.3;
                System.out.println("第三环节乘以权重："+scores);
            }
            if(thisLinks.equals("5")){
                scores = scores*0.3;
            }
            System.out.println("=====================finalScores:" + scores);
            finalScore = new FinalScore();
            finalScore.setThisLinks(thisLinks);
            finalScore.setUserName(gomeUser.getUserName());
            finalScore.setCompetitionOrder(gomeUser.getCompetitionOrder().toString());
            finalScore.setUserPersonsName(gomeUser.getUserPersonsName());
            finalScore.setFinalScore(scores);
            if (finalScoreService.saveScore(finalScore)) {
                System.out.println("添加成功");
            }
        } else {
            finalScore = new FinalScore();
            finalScore.setThisLinks(thisLinks);
            finalScore.setUserName(gomeUser.getUserName());
            finalScore.setCompetitionOrder(gomeUser.getCompetitionOrder().toString());
            finalScore.setUserPersonsName(gomeUser.getUserPersonsName());
            finalScore.setFinalScore(0.0);
            if (finalScoreService.saveScore(finalScore)) {
                System.out.println("添加成功");
            }
        }


    }

    /**
     * 计算得分，并返回一个信息，发送报文
     */
    @GetMapping("/currentCountScore")
    @ResponseBody
    public ResultUtil current_SumScore(@RequestParam String thisLinks, int userSortnum, HttpServletRequest request) {

        HttpSession session = request.getSession();
        GomeUser gomeUser = (GomeUser) session.getAttribute(GomeConstant.USER);
        Double find_score = 0.0;
        if (gomeUser.getCompetitionOrder() == userSortnum) {
            if (thisLinks.equals("2")) {
                System.out.println("当前第二环节");
                //1、先收集第一环节评委的打分
                count_Score("1", gomeUser);
                //2、获取当前用户第二环节得分,并将得分写入到得分明细表中
                List<QaScoresRecord> qaScoresRecordList = qaScoresRecordService.findAllByUser(gomeUser.getUserName());
                QaScoresRecord qaScoresRecord = new QaScoresRecord();
                FinalScore finalScore = null;
                //如果有数据
                if (qaScoresRecordList.size() > 0) {
                    qaScoresRecord = qaScoresRecordList.get(0);
                } else {
                    //无数据
                    qaScoresRecord.setScore(0.0);
                }

                finalScore = new FinalScore();
                finalScore.setThisLinks(thisLinks);
                finalScore.setUserName(gomeUser.getUserName());
                finalScore.setCompetitionOrder(gomeUser.getCompetitionOrder().toString());
                finalScore.setUserPersonsName(gomeUser.getUserPersonsName());
                finalScore.setFinalScore(qaScoresRecord.getScore()*0.1);
                if (finalScoreService.saveScore(finalScore)) {
                    System.out.println("添加成功");
                }
                find_score = finalScoreService.getScore(thisLinks, userSortnum);
                System.out.println(find_score);
                find_score += finalScoreService.getScore("1", userSortnum);
                System.out.println(find_score);

            }
            if (thisLinks.equals("3")) {
                System.out.println("3");
                //1、先收集第三环节评委的打分
                count_Score(thisLinks, gomeUser);
                find_score = finalScoreService.getScore(thisLinks, userSortnum);
            }
            if (thisLinks.equals("5")) {
                System.out.println("5");
                //1、先收集第五环节评委的打分
                count_Score(thisLinks, gomeUser);
                find_score = finalScoreService.getScore(thisLinks, userSortnum);
            }
        }


        return ResultUtil.ok();
    }



    @GetMapping("/end")
    public String end(Model model){

        //查询优秀奖
        //查询铜奖
        //查询银奖
        //查询金奖

        List<FinalToscore> finalToscoreList = finalToScoreService.getAllFinalToscore();
        List<String> list1= new ArrayList<>();
        List<String> list2= new ArrayList<>();
        List<String> list3= new ArrayList<>();
        List<String> list4= new ArrayList<>();

        for(int i=0;i<finalToscoreList.size();i++){
            if(i==0){
                list1.add(finalToscoreList.get(i).getUserPersonsName());
            }
            if(i<=2&&i>0){
                list2.add(finalToscoreList.get(i).getUserPersonsName());
            }

            if(i<=5&&i>2){
                list3.add(finalToscoreList.get(i).getUserPersonsName());
            }
            if(i>5&&i<finalToscoreList.size()){
                list4.add(finalToscoreList.get(i).getUserPersonsName());
            }
            model.addAttribute("list1",list1);
            model.addAttribute("list2",list1);
            model.addAttribute("list3",list1);
            model.addAttribute("list4",list1);
        }
        return "end";
    }

}
