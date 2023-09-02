package com.JNR.dao;

import com.JNR.entity.BasicInfOfElderly;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BasicInfOfElderlyDao {

    @Select("${sql}")
    public List<BasicInfOfElderly> getListBySql(String sql);
}
