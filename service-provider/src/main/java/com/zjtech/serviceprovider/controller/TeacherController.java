package com.zjtech.serviceprovider.controller;
import com.zjtech.serviceprovider.pojo.Teacher;
import com.zjtech.serviceprovider.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (t_teacher)表控制层
*
* @author xxxxx
*/
@RestController
public class TeacherController {

@Resource
private TeacherService tTeacherService;


@GetMapping("/t_teacher/selectOne")
public Teacher selectOne(Integer id) {
    return tTeacherService.selectByPrimaryKey(id);
}

}
