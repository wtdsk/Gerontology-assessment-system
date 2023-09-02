package com.JNR.controller;


import com.JNR.entity.BasicInfOfElderly;
import com.JNR.entity.SearchIndex;
import com.JNR.service.BasicInfOfElderlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/basicInfOfElderly")
public class BasicInfOfElderlyController {

    @Autowired
    BasicInfOfElderlyService basicInfOfElderlyService;


    @PostMapping
    public List<BasicInfOfElderly> getAllBySql(@RequestBody SearchIndex searchIndex){
//        System.out.println(searchIndex.getSql());
        String sql = searchIndex.getSql();
        return basicInfOfElderlyService.getAllBySql(sql);
    }

}
