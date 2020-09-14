package com.gome.service;


import com.gome.pojo.FinalToscore;

import java.util.List;

public interface FinalToScoreService {

    int saveFinalToScore(FinalToscore finalToscore);


    List<FinalToscore> getAllFinalToscore();

}
