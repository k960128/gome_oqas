package com.gome.mapper;

import com.gome.pojo.QaScoresRecord;
import com.gome.pojo.QaScoresRecordExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface QaScoresRecordMapper {
    long countByExample(QaScoresRecordExample example);

    int deleteByExample(QaScoresRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QaScoresRecord record);

    int insertSelective(QaScoresRecord record);

    List<QaScoresRecord> selectByExample(QaScoresRecordExample example);

    QaScoresRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QaScoresRecord record, @Param("example") QaScoresRecordExample example);

    int updateByExample(@Param("record") QaScoresRecord record, @Param("example") QaScoresRecordExample example);

    int updateByPrimaryKeySelective(QaScoresRecord record);

    int updateByPrimaryKey(QaScoresRecord record);
}