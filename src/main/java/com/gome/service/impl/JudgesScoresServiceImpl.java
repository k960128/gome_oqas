package com.gome.service.impl;

import com.gome.mapper.JudgesScoresMapper;
import com.gome.pojo.JudgesScores;
import com.gome.pojo.JudgesScoresExample;
import com.gome.service.JudgesScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/19 4:00
 * @Modified By:
 */
@Service
public class JudgesScoresServiceImpl implements JudgesScoresService {
    @Autowired
    private JudgesScoresMapper judgesScoresMapper;

    @Override
    public List<JudgesScores> findAllByPlayerId(int player_id,String thisLinks) {
        JudgesScoresExample example = new JudgesScoresExample();

        example.setOrderByClause("PLAYER_ID,JUDGES_ID ASC");
        JudgesScoresExample.Criteria criteria = example.createCriteria();
        criteria.andPlayerIdEqualTo(player_id);
        criteria.andThisLinksEqualTo(thisLinks);
        criteria.andEvaluationIdNotEqualTo(7);
        List<JudgesScores> judgesScores = judgesScoresMapper.selectByExample(example);
        return judgesScores;
    }

    @Override
    public int getCountJudges(String thisLinks) {

        JudgesScoresExample example = new JudgesScoresExample();
        example.setDistinct(false);
        JudgesScoresExample.Criteria criteria = example.createCriteria();
        criteria.andThisLinksEqualTo(thisLinks);
        return (int)judgesScoresMapper.countByExample(example);
    }
}
