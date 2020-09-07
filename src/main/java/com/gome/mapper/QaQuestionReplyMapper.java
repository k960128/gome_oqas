package com.gome.mapper;

import com.gome.pojo.QaQuestionReply;
import com.gome.pojo.QaQuestionReplyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QaQuestionReplyMapper {
    long countByExample(QaQuestionReplyExample example);

    int deleteByExample(QaQuestionReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QaQuestionReply record);

    int insertSelective(QaQuestionReply record);

    List<QaQuestionReply> selectByExample(QaQuestionReplyExample example);

    QaQuestionReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QaQuestionReply record, @Param("example") QaQuestionReplyExample example);

    int updateByExample(@Param("record") QaQuestionReply record, @Param("example") QaQuestionReplyExample example);

    int updateByPrimaryKeySelective(QaQuestionReply record);

    int updateByPrimaryKey(QaQuestionReply record);
}