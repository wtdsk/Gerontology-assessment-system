package com.JNR.service.impl;

import com.JNR.dao.BasicInfOfElderlyDao;
import com.JNR.entity.BasicInfOfElderly;
import com.JNR.service.BasicInfOfElderlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicInfOfElderlyServiceImpl implements BasicInfOfElderlyService {

    @Autowired
    BasicInfOfElderlyDao basicInfOfElderlyDao;

    @Override
    public List<BasicInfOfElderly> getAllBySql(String sql) {
        return basicInfOfElderlyDao.getListBySql(sql);
    }
}
