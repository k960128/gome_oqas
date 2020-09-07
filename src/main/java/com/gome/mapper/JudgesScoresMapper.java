package com.gome.mapper;

import com.gome.pojo.JudgesScores;
import com.gome.pojo.JudgesScoresExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JudgesScoresMapper {
    long countByExample(JudgesScoresExample example);

    int deleteByExample(JudgesScoresExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JudgesScores record);

    int insertSelective(JudgesScores record);

    List<JudgesScores> selectByExample(JudgesScoresExample example);

    JudgesScores selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JudgesScores record, @Param("example") JudgesScoresExample example);

    int updateByExample(@Param("record") JudgesScores record, @Param("example") JudgesScoresExample example);

    int updateByPrimaryKeySelective(JudgesScores record);

    int updateByPrimaryKey(JudgesScores record);
}