package com.zjtech.serviceconsumer.controller;

import com.zjtech.serviceconsumer.entity.Teacher;
import com.zjtech.serviceconsumer.feign.FeignTeacherApi;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RefreshScope //Nacos实时动态刷新配置
public class ConsumerController {

    @Resource
    FeignTeacherApi teacherApi;

    @RequestMapping("consumer/get/user")
    public Teacher selectOne(Integer id){
        return teacherApi.selectOne(id);
    }

}
