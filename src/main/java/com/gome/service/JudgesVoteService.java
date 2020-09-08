package com.gome.service;

import com.gome.pojo.JudgesVote;

public interface JudgesVoteService {


    /**
     * 获取投票数最多的辩论题目
     */
    JudgesVote findOrder();
}
