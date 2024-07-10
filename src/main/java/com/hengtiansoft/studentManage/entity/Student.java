package com.hengtiansoft.studentManage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/10 18:46
 * @Description:
 */
@Data
@TableName("student")
public class Student {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
//    @TableField("pwd")
    private String pwd;
}
