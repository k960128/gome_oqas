package com.gome.mapper;

import com.gome.pojo.QaQuestionItems;
import com.gome.pojo.QaQuestionItemsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QaQuestionItemsMapper {
    long countByExample(QaQuestionItemsExample example);

    int deleteByExample(QaQuestionItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QaQuestionItems record);

    int insertSelective(QaQuestionItems record);

    List<QaQuestionItems> selectByExample(QaQuestionItemsExample example);

    QaQuestionItems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QaQuestionItems record, @Param("example") QaQuestionItemsExample example);

    int updateByExample(@Param("record") QaQuestionItems record, @Param("example") QaQuestionItemsExample example);

    int updateByPrimaryKeySelective(QaQuestionItems record);

    int updateByPrimaryKey(QaQuestionItems record);
}