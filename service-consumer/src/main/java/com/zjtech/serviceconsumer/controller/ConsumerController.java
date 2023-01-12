package com.zjtech.serviceconsumer.controller;

import com.zjtech.serviceconsumer.feign.TTeacherApi;
import com.zjtech.serviceconsumer.vo.TTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RefreshScope //Nacos实时动态刷新配置
public class ConsumerController {

    @Resource
    TTeacherApi teacherApi;

    @RequestMapping("consumer/get/user")
    public TTeacher selectOne(Integer id){
        return teacherApi.selectOne(id);
    }

}
