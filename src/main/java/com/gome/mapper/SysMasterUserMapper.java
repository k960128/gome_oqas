package com.gome.mapper;

import com.gome.pojo.SysMasterUser;
import com.gome.pojo.SysMasterUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMasterUserMapper {
    long countByExample(SysMasterUserExample example);

    int deleteByExample(SysMasterUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMasterUser record);

    int insertSelective(SysMasterUser record);

    List<SysMasterUser> selectByExample(SysMasterUserExample example);

    SysMasterUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMasterUser record, @Param("example") SysMasterUserExample example);

    int updateByExample(@Param("record") SysMasterUser record, @Param("example") SysMasterUserExample example);

    int updateByPrimaryKeySelective(SysMasterUser record);

    int updateByPrimaryKey(SysMasterUser record);
}