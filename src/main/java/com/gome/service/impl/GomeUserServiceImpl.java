package com.gome.service.impl;

import com.gome.mapper.GomeUserMapper;
import com.gome.pojo.GomeUser;
import com.gome.pojo.GomeUserExample;
import com.gome.service.GomeUserService;
import com.gome.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.gome.enums.ResultEnums.*;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/3 19:56
 * @Modified By:
 */
@Service
public class GomeUserServiceImpl implements GomeUserService {
    @Autowired
    private GomeUserMapper gomeUserMapper;

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public ResultUtil updateUser(GomeUser gomeUser) {
        GomeUserExample example = new GomeUserExample();
        GomeUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(gomeUser.getUserName());
        List<GomeUser> list1 = gomeUserMapper.selectByExample(example);
        if (list1.size() == 0) {
            return ResultUtil.build(UPDATE_USER_ERROR.getStatus(), UPDATE_USER_ERROR.getMsg());
        }
        criteria.andUserPersonsNameEqualTo(gomeUser.getUserPersonsName());
        List<GomeUser> list = gomeUserMapper.selectByExample(example);
        if (list.size() != 0) {
            for (GomeUser user : list) {
                user.setUserPass(gomeUser.getUserPass());
                gomeUserMapper.updateByPrimaryKey(user);
                return ResultUtil.ok();
            }
        }
        return ResultUtil.build(UPDATE_PASS_ERROR.getStatus(), UPDATE_PASS_ERROR.getMsg());
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public GomeUser login(String username, String password) {
        GomeUserExample example = new GomeUserExample();
        GomeUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(username);
        criteria.andUserPassEqualTo(password);
        List<GomeUser> list = gomeUserMapper.selectByExample(example);
        if (list.size() != 0) {
            for (GomeUser gomeUser : list) {
                return gomeUser;
            }
        }
        return null;
    }

    /**
     * 通过选手号查询用户
     *
     * @param competitionOrder
     * @return
     */
    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public GomeUser selectAll(Integer competitionOrder) {
        GomeUserExample example = new GomeUserExample();
        GomeUserExample.Criteria criteria = example.createCriteria();
        criteria.andCompetitionOrderEqualTo(competitionOrder);
        List<GomeUser> list = gomeUserMapper.selectByExample(example);
        if (list.size() != 0) {
            for (GomeUser gomeUser : list) {
                return gomeUser;
            }
        }
        return null;
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public List<GomeUser> select(String userStatu) {
        GomeUserExample example = new GomeUserExample();
        GomeUserExample.Criteria criteria = example.createCriteria();
        criteria.andUserStatuEqualTo(userStatu);
        List<GomeUser> list = gomeUserMapper.selectByExample(example);
        if (list.size() != 0) {
            return list;
        }
        return null;
    }

    @Override
    public List<GomeUser> selectAll() {
        GomeUserExample example = new GomeUserExample();
        GomeUserExample.Criteria criteria = example.createCriteria();
        criteria.andCompetitionOrderNotEqualTo(0);
        return gomeUserMapper.selectByExample(example);
    }
}
