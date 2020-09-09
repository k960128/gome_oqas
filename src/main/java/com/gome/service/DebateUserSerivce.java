package com.gome.service;

import com.gome.pojo.DebateUser;

import java.util.List;

public interface DebateUserSerivce {

    List<DebateUser> findAllByStatu(int statu);
}
