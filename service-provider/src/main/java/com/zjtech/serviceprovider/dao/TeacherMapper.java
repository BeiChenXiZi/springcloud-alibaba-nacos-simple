package com.zjtech.serviceprovider.dao;

import com.zjtech.serviceprovider.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author ChenXi
 * @Date 2023/01/12/20:52
 */
 

@Mapper
public interface TeacherMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Teacher record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Teacher record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Teacher selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Teacher record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Teacher record);
}