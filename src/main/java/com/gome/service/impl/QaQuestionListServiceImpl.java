package com.gome.service.impl;

import com.gome.mapper.QaQuestionListMapper;
import com.gome.pojo.QaQuestionList;
import com.gome.pojo.QaQuestionListExample;
import com.gome.pojo.QaQuestionReply;
import com.gome.service.QaQuestionListService;
import com.gome.util.ArrayUtil;
import com.gome.util.DoubleUtil;
import com.gome.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/5 18:10
 * @Modified By:
 */
@Service
public class QaQuestionListServiceImpl implements QaQuestionListService {
    @Autowired
    private QaQuestionListMapper questionListMapper;

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public List<QaQuestionList> getQuestionList(Integer thisNumber, String questionType) {
        // 1.查询n套题的所有题目
        QaQuestionListExample example = new QaQuestionListExample();
        QaQuestionListExample.Criteria criteria = example.createCriteria();
        criteria.andThisNumberEqualTo(thisNumber);
        // 判断是什么类型的题
        if (questionType.equals("2")) {
            criteria.andQuestionTypeBetween("1", "2");
        }
        if (questionType.equals("3")) {
            criteria.andQuestionTypeEqualTo("3");
        }
        if (questionType.equals("4")) {
            criteria.andQuestionTypeEqualTo("4");
        }
        if (questionType.equals("5")) {
            criteria.andQuestionTypeEqualTo("5");
        }
        List<QaQuestionList> qaQuestionLists = questionListMapper.selectByExample(example);
        return qaQuestionLists;
    }

    /**
     * 判断是否是复选框
     *
     * @param id
     * @return
     */
    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public boolean ifCheckbox(Integer id) {
        QaQuestionList qaQuestionList = questionListMapper.selectByPrimaryKey(id);
        if (qaQuestionList.getQuestionType().equals("2")) {
            return true;
        }
        return false;
    }

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Error.class})
    public ResultUtil calculateScore(List<QaQuestionReply> list) {
        double d = 0.00;
        for (QaQuestionReply questionReply : list) {
            QaQuestionList questionList = questionListMapper.selectByPrimaryKey(questionReply.getQuestionId());
            if (questionList.getQuestionType().equals("1")) {
                // 如果是单选题
                if (questionList.getAnswer().equals(questionReply.getAnswer())) {
                    d = DoubleUtil.sum(d, questionList.getScore());
                }
            } else if (questionList.getQuestionType().equals("2")) {
                // 如果是多选题
                //获取正确答案
                String[] strArrs1 = questionList.getAnswer().split(";");
                //将选择的答案拆分成数组
                String[] strArrs2 = questionReply.getAnswer().split(";");
                //进行答案比较，计算得分
                if (ArrayUtil.strayEqual(strArrs1, strArrs2)) {
                    d = DoubleUtil.sum(d, questionList.getScore());
                } else {
                    d = DoubleUtil.sum(d, 0);
                }
            }
        }
        return ResultUtil.ok(d);
    }


}
