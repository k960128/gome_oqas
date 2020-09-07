package com.gome.service.impl;

import com.gome.mapper.GomeQaRuleMapper;
import com.gome.pojo.GomeQaRule;
import com.gome.pojo.GomeQaRuleExample;
import com.gome.service.GomeQaRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GomeQaRuleServiceImpl implements GomeQaRuleService {

    @Autowired(required = false)
    private GomeQaRuleMapper gomeQaRuleMapper;

    @Override
    public GomeQaRule findGomeQaRuleByLinks(int this_Links) {
        GomeQaRule gomeQaRule = new GomeQaRule();
        GomeQaRuleExample gomeQaRuleExample = new GomeQaRuleExample();
        GomeQaRuleExample.Criteria criteria = gomeQaRuleExample.createCriteria();
        criteria.andThisLinksEqualTo(this_Links);

        List<GomeQaRule> list =  gomeQaRuleMapper.selectByExample(gomeQaRuleExample);
        if(list.size()>0){
            gomeQaRule = list.get(0);
        }else{
            gomeQaRule.setTitle("暂无当前环节！");
        }

        return gomeQaRule;
    }
}
