package com.gome.service.impl;

import com.gome.mapper.DebateUserMapper;
import com.gome.pojo.DebateUser;
import com.gome.pojo.DebateUserExample;
import com.gome.service.DebateUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebateUserServiceImpl implements DebateUserSerivce {

    @Autowired
    DebateUserMapper debateUserMapper;
    /**
     * 根据条件查询正反方数据
     * @param statu
     * @return
     */
    @Override
    public List<DebateUser> findAllByStatu(int statu) {

        List<DebateUser> debateUserList = null;
        DebateUserExample example = new DebateUserExample();
        example.setOrderByClause("DEBATE_SORT ASC");
        DebateUserExample.Criteria criteria  = example.createCriteria();
        criteria.andDebateStatuEqualTo(statu);
        return debateUserMapper.selectByExample(example);
    }
}
