package com.zjtech.serviceprovider.controller;
import com.zjtech.serviceprovider.pojo.TTeacher;
import com.zjtech.serviceprovider.service.TTeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (t_teacher)表控制层
*
* @author xxxxx
*/
@RestController
public class TTeacherController {

@Resource
private TTeacherService tTeacherService;


@GetMapping("/t_teacher/selectOne")
public TTeacher selectOne(Integer id) {
return tTeacherService.selectByPrimaryKey(id);
}

}
