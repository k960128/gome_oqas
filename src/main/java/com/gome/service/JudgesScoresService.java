package com.gome.service;

import com.gome.pojo.JudgesScores;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/19 4:00
 * @Modified By:
 */
public interface JudgesScoresService {

    List<JudgesScores> findAllByPlayerId(int player_id,String thisLinks);
}
