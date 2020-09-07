package com.gome.service.impl;

import com.gome.mapper.QaQuestionItemsMapper;
import com.gome.pojo.QaQuestionItems;
import com.gome.pojo.QaQuestionItemsExample;
import com.gome.service.QaQuestionItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/5 18:56
 * @Modified By:
 */
@Service
public class QaQuestionItemsServiceImpl implements QaQuestionItemsService {
    @Autowired
    private QaQuestionItemsMapper questionItemsMapper;

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public List<QaQuestionItems> getQuestionItemsList(Integer questionId) {
        QaQuestionItemsExample example = new QaQuestionItemsExample();
        QaQuestionItemsExample.Criteria criteria = example.createCriteria();
        criteria.andQuestionIdEqualTo(questionId);
        return questionItemsMapper.selectByExample(example);
    }
}
