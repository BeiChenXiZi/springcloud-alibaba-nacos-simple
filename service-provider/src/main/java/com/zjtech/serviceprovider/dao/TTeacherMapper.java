package com.zjtech.serviceprovider.dao;

import com.zjtech.serviceprovider.pojo.TTeacher;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author ChenXi
 * @Date 2023/01/12/20:52
 */
 

@Mapper
public interface TTeacherMapper {
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
    int insert(TTeacher record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TTeacher record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TTeacher selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TTeacher record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TTeacher record);
}