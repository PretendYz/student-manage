package com.hengtiansoft.studentManage.controller;

import com.hengtiansoft.studentManage.R.R;
import com.hengtiansoft.studentManage.entity.Student;
import com.hengtiansoft.studentManage.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Logan
 * @CreateTime: 2024/7/10 22:31
 * @Description:
 */

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("{id}")
    @ApiOperation("根据id查询某一学生信息")
    public R getStudent(@PathVariable int id) {
        return R.ok().data("data", studentService.getById(id));
    }

    @PostMapping
    @ApiOperation("新增学生")
    public R addStudent(@RequestBody Student student) {
        if (studentService.save(student)) {
            return R.ok();
        }
        return R.error().message("新增学生失败");
    }
}
