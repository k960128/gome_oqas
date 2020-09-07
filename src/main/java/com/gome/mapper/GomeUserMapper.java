package com.gome.mapper;

import com.gome.pojo.GomeUser;
import com.gome.pojo.GomeUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GomeUserMapper {
    long countByExample(GomeUserExample example);

    int deleteByExample(GomeUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(GomeUser record);

    int insertSelective(GomeUser record);

    List<GomeUser> selectByExample(GomeUserExample example);

    GomeUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") GomeUser record, @Param("example") GomeUserExample example);

    int updateByExample(@Param("record") GomeUser record, @Param("example") GomeUserExample example);

    int updateByPrimaryKeySelective(GomeUser record);

    int updateByPrimaryKey(GomeUser record);
}