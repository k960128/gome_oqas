package com.gome.mapper;

import com.gome.pojo.FinalScore;
import com.gome.pojo.FinalScoreExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FinalScoreMapper {
    long countByExample(FinalScoreExample example);

    int deleteByExample(FinalScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FinalScore record);

    int insertSelective(FinalScore record);

    List<FinalScore> selectByExample(FinalScoreExample example);

    FinalScore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FinalScore record, @Param("example") FinalScoreExample example);

    int updateByExample(@Param("record") FinalScore record, @Param("example") FinalScoreExample example);

    int updateByPrimaryKeySelective(FinalScore record);

    int updateByPrimaryKey(FinalScore record);
}