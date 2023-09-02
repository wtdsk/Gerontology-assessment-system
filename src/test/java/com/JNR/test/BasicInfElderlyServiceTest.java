package com.JNR.test;

import com.JNR.config.SpringConfig;
import com.JNR.service.BasicInfOfElderlyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BasicInfElderlyServiceTest {
    @Autowired
    BasicInfOfElderlyService basicInfOfElderlyService;

    @Test
    public void getListTest(){
        System.out.println(basicInfOfElderlyService.getAllBySql("select * from basicinfofelderly").get(0).getSex());
    }
}
