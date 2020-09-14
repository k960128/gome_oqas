package com.gome.service.impl;

import com.gome.mapper.FinalToscoreMapper;
import com.gome.pojo.FinalToscore;
import com.gome.pojo.FinalToscoreExample;
import com.gome.service.FinalToScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinalToScoreServiceImpl implements FinalToScoreService {

    @Autowired
    FinalToscoreMapper finalToscoreMapper;

    @Override
    public int saveFinalToScore(FinalToscore finalToscore) {

        finalToscoreMapper.insert(finalToscore);
        return 0;
    }

    @Override
    public List<FinalToscore> getAllFinalToscore() {
        FinalToscoreExample example = new FinalToscoreExample();
        example.setOrderByClause("FINAL_SCORE ASC");
        FinalToscoreExample.Criteria criteria = example.createCriteria();
        return finalToscoreMapper.selectByExample(example);
    }
}
