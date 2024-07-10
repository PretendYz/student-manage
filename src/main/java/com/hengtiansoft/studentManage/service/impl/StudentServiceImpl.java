package com.hengtiansoft.studentManage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hengtiansoft.studentManage.Mapper.StudentMapper;
import com.hengtiansoft.studentManage.entity.Student;
import com.hengtiansoft.studentManage.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/10 22:34
 * @Description:
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
