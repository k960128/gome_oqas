package com.gome.mapper;

import com.gome.pojo.FinalToscore;
import com.gome.pojo.FinalToscoreExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FinalToscoreMapper {
    long countByExample(FinalToscoreExample example);

    int deleteByExample(FinalToscoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FinalToscore record);

    int insertSelective(FinalToscore record);

    List<FinalToscore> selectByExample(FinalToscoreExample example);

    FinalToscore selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FinalToscore record, @Param("example") FinalToscoreExample example);

    int updateByExample(@Param("record") FinalToscore record, @Param("example") FinalToscoreExample example);

    int updateByPrimaryKeySelective(FinalToscore record);

    int updateByPrimaryKey(FinalToscore record);
}