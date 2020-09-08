package com.gome.mapper;

import com.gome.pojo.JudgesVote;
import com.gome.pojo.JudgesVoteExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface JudgesVoteMapper {
    long countByExample(JudgesVoteExample example);

    int deleteByExample(JudgesVoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JudgesVote record);

    int insertSelective(JudgesVote record);

    List<JudgesVote> selectByExample(JudgesVoteExample example);

    JudgesVote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JudgesVote record, @Param("example") JudgesVoteExample example);

    int updateByExample(@Param("record") JudgesVote record, @Param("example") JudgesVoteExample example);

    int updateByPrimaryKeySelective(JudgesVote record);

    int updateByPrimaryKey(JudgesVote record);
}