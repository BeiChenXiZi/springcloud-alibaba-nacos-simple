package com.zjtech.serviceconsumer.feign;

import com.zjtech.serviceconsumer.vo.TTeacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author ChenXi
 * @Date 2023/01/12/21:18
 */

@FeignClient(value = "service-provider")
public interface TTeacherApi {

    @GetMapping("/t_teacher/selectOne")
    TTeacher selectOne(@RequestParam("id") Integer id);

}
