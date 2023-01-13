package com.zjtech.serviceprovider.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjtech.serviceprovider.pojo.Teacher;
import com.zjtech.serviceprovider.dao.TeacherMapper;
/**
 * @Description
 * @Author ChenXi
 * @Date 2023/01/12/20:52
 */
 

@Service
public class TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return teacherMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Teacher record) {
        return teacherMapper.insert(record);
    }

    
    public int insertSelective(Teacher record) {
        return teacherMapper.insertSelective(record);
    }

    
    public Teacher selectByPrimaryKey(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(Teacher record) {
        return teacherMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Teacher record) {
        return teacherMapper.updateByPrimaryKey(record);
    }

}
