package com.gome.service;

import com.gome.pojo.QaQuestionItems;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/5 18:54
 * @Modified By:
 */
public interface QaQuestionItemsService {
    // 查询所有的abcd(选项卡)
    List<QaQuestionItems> getQuestionItemsList(Integer questionId);

}
