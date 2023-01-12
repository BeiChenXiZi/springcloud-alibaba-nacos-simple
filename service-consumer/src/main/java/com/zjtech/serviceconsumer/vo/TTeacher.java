package com.zjtech.serviceconsumer.vo;

import lombok.Data;

/**
 * @Description
 * @Author ChenXi
 * @Date 2023/01/12/20:52
 */
 

@Data
public class TTeacher {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 真实姓名
    */
    private String nickname;

    /**
    * 备注
    */
    private String remark;

    /**
    * 图片
    */
    private String imagename;

    private Integer userId;
}