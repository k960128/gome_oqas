package com.gome.dto;

import com.gome.pojo.QaQuestionItems;
import com.gome.pojo.QaQuestionList;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/5 20:25
 * @Modified By:
 */
public class QuestionDTO extends QaQuestionList {
    private List<QaQuestionItems> item;

    public List<QaQuestionItems> getItem() {
        return item;
    }

    public void setItem(List<QaQuestionItems> item) {
        this.item = item;
    }
}
