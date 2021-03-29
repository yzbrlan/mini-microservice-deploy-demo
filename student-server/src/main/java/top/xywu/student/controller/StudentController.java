package top.xywu.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xywu.student.entity.Student;
import top.xywu.student.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xywu
 * @date 2021/03/29
 */
@RestController
public class StudentController {
    @Resource
    StudentService studentService;

    @GetMapping(value = "/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
