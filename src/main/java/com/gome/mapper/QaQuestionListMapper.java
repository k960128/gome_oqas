package com.gome.mapper;

import com.gome.pojo.QaQuestionList;
import com.gome.pojo.QaQuestionListExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QaQuestionListMapper {
    long countByExample(QaQuestionListExample example);

    int deleteByExample(QaQuestionListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QaQuestionList record);

    int insertSelective(QaQuestionList record);

    List<QaQuestionList> selectByExample(QaQuestionListExample example);

    QaQuestionList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QaQuestionList record, @Param("example") QaQuestionListExample example);

    int updateByExample(@Param("record") QaQuestionList record, @Param("example") QaQuestionListExample example);

    int updateByPrimaryKeySelective(QaQuestionList record);

    int updateByPrimaryKey(QaQuestionList record);
}