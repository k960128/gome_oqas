package com.gome.service.impl;


import com.gome.mapper.JudgesVoteMapper;
import com.gome.pojo.JudgesVote;
import com.gome.pojo.JudgesVoteExample;
import com.gome.service.JudgesVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JudgesVoteServiceImpl implements JudgesVoteService {

    @Autowired
    private JudgesVoteMapper judgesVoteMapper;


    @Override
    public JudgesVote findOrder() {

        JudgesVote judgesVote =null;

        JudgesVoteExample example = new JudgesVoteExample();
        example.setOrderByClause("COUNT DESC");
        JudgesVoteExample.Criteria criteria = example.createCriteria();
        if(judgesVoteMapper.selectByExample(example).size()>0){
            return judgesVoteMapper.selectByExample(example).get(0);
        }else{
            judgesVote = new JudgesVote();
            judgesVote.setQuestionId(119);
            judgesVote.setThisLinks("4");
        }
        return judgesVote;
    }
}
