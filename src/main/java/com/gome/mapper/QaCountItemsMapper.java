package com.gome.mapper;

import com.gome.pojo.QaCountItems;
import com.gome.pojo.QaCountItemsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QaCountItemsMapper {
    long countByExample(QaCountItemsExample example);

    int deleteByExample(QaCountItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QaCountItems record);

    int insertSelective(QaCountItems record);

    List<QaCountItems> selectByExample(QaCountItemsExample example);

    QaCountItems selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QaCountItems record, @Param("example") QaCountItemsExample example);

    int updateByExample(@Param("record") QaCountItems record, @Param("example") QaCountItemsExample example);

    int updateByPrimaryKeySelective(QaCountItems record);

    int updateByPrimaryKey(QaCountItems record);
}