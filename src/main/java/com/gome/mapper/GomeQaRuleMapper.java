package com.gome.mapper;

import com.gome.pojo.GomeQaRule;
import com.gome.pojo.GomeQaRuleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GomeQaRuleMapper {
    long countByExample(GomeQaRuleExample example);

    int deleteByExample(GomeQaRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GomeQaRule record);

    int insertSelective(GomeQaRule record);

    List<GomeQaRule> selectByExample(GomeQaRuleExample example);

    GomeQaRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GomeQaRule record, @Param("example") GomeQaRuleExample example);

    int updateByExample(@Param("record") GomeQaRule record, @Param("example") GomeQaRuleExample example);

    int updateByPrimaryKeySelective(GomeQaRule record);

    int updateByPrimaryKey(GomeQaRule record);
}