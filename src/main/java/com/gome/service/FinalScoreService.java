package com.gome.service;

import com.gome.pojo.FinalScore;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/31 2:03
 * @Modified By:
 */
public interface FinalScoreService {

    Boolean saveScore(FinalScore finalScore);

    List<FinalScore> findByAll();

    Double getScore(String thisLinks,int userSortnum);

    List<FinalScore> findBySortList(String thisLinks);


}
