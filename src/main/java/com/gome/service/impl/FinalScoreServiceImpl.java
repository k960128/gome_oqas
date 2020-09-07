package com.gome.service.impl;

import com.gome.mapper.FinalScoreMapper;
import com.gome.pojo.FinalScore;
import com.gome.pojo.FinalScoreExample;
import com.gome.service.FinalScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/31 2:03
 * @Modified By:
 */
@Service
public class FinalScoreServiceImpl implements FinalScoreService {
    @Autowired(required = false)
    private FinalScoreMapper finalScoreMapper;

    @Override
    public Boolean saveScore(FinalScore finalScore) {
        if(finalScoreMapper.insertSelective(finalScore)>0){
            return true;
        }
        return false;
    }

    @Override
    public List<FinalScore> findByAll() {

        FinalScoreExample example = new FinalScoreExample();
        FinalScoreExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("COMPETITION_ORDER ASC");

        return finalScoreMapper.selectByExample(example);
    }

    @Override
    public Double getScore(String thisLinks, int userSortnum) {
        Double score = 0.0;
        FinalScoreExample example = new FinalScoreExample();
        FinalScoreExample.Criteria criteria = example.createCriteria();
        criteria.andThisLinksEqualTo(thisLinks);
        criteria.andCompetitionOrderEqualTo(userSortnum+"");
        if(finalScoreMapper.selectByExample(example).size()>0){
            score = finalScoreMapper.selectByExample(example).get(0).getFinalScore();
        }

        return score;
    }

    @Override
    public List<FinalScore> findBySortList(String thisLinks) {

        List<FinalScore> finalScoreList = new ArrayList<FinalScore>();
        if(thisLinks.equals("2")){

            //第二环节特殊处理
            //1、先查出第一环节得分集合
            FinalScoreExample example1 = new FinalScoreExample();
            FinalScoreExample.Criteria criteria1 = example1.createCriteria();
            example1.setOrderByClause(" COMPETITION_ORDER ASC");
            criteria1.andThisLinksEqualTo("1");
            List<FinalScore> list1 = finalScoreMapper.selectByExample(example1);
            //2、查出第二环节得分集合
            FinalScoreExample example2 = new FinalScoreExample();
            example2.setOrderByClause(" COMPETITION_ORDER ASC");
            FinalScoreExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andThisLinksEqualTo("2");
            List<FinalScore> list2 = finalScoreMapper.selectByExample(example2);
            //3、将第一环节的得分追加到第二环节
            for (int i = 0; i < list1.size() ; i++) {
                Double score = 0.0;
                score = list2.get(i).getFinalScore();
                list2.get(i).setFinalScore(score+list1.get(i).getFinalScore());
            }
            finalScoreList = list2;

        }else{
            FinalScoreExample example = new FinalScoreExample();
            example.setOrderByClause("FINAL_SCORE DESC");
            FinalScoreExample.Criteria criteria = example.createCriteria();
            criteria.andThisLinksEqualTo(thisLinks);
            finalScoreList = finalScoreMapper.selectByExample(example);
        }

        return finalScoreList;
    }
}
