package com.zjtech.serviceconsumer.feign;


import com.zjtech.serviceconsumer.entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author ChenXi
 * @Date 2023/01/12/21:18
 */

@FeignClient(value = "service-provider")
public interface FeignTeacherApi {

    @GetMapping("/t_teacher/selectOne")
    Teacher selectOne(@RequestParam("id") Integer id);

}
