package com.zjtech.serviceprovider.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zjtech.serviceprovider.pojo.TTeacher;
import com.zjtech.serviceprovider.dao.TTeacherMapper;
/**
 * @Description
 * @Author ChenXi
 * @Date 2023/01/12/20:52
 */
 

@Service
public class TTeacherService{

    @Resource
    private TTeacherMapper tTeacherMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return tTeacherMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TTeacher record) {
        return tTeacherMapper.insert(record);
    }

    
    public int insertSelective(TTeacher record) {
        return tTeacherMapper.insertSelective(record);
    }

    
    public TTeacher selectByPrimaryKey(Integer id) {
        return tTeacherMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TTeacher record) {
        return tTeacherMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TTeacher record) {
        return tTeacherMapper.updateByPrimaryKey(record);
    }

}
