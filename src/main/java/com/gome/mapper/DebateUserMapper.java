package com.gome.mapper;

import com.gome.pojo.DebateUser;
import com.gome.pojo.DebateUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DebateUserMapper {
    long countByExample(DebateUserExample example);

    int deleteByExample(DebateUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DebateUser record);

    int insertSelective(DebateUser record);

    List<DebateUser> selectByExample(DebateUserExample example);

    DebateUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DebateUser record, @Param("example") DebateUserExample example);

    int updateByExample(@Param("record") DebateUser record, @Param("example") DebateUserExample example);

    int updateByPrimaryKeySelective(DebateUser record);

    int updateByPrimaryKey(DebateUser record);
}