package com.gome.service;

import com.gome.pojo.GomeUser;
import com.gome.util.ResultUtil;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/3 19:53
 * @Modified By:
 */
public interface GomeUserService {
    // 找回密码
    ResultUtil updateUser(GomeUser gomeUser);
    // 登录
    GomeUser login(String username, String password);
    // 通过选手号，查询用户
    GomeUser selectAll(Integer competitionOrder);

    // 查询用户 根据用户类型
    List<GomeUser> select(String userStatu);

    // 查询所有用户(只包含参赛选手)
    List<GomeUser> selectAll();
}
