package com.JNR.service;

import com.JNR.entity.BasicInfOfElderly;

import java.util.List;

public interface BasicInfOfElderlyService {
    public List<BasicInfOfElderly> getAllBySql(String sql);
}
