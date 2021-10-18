package top.xywu.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.xywu.student.entity.Student;
import top.xywu.student.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xywu
 * @date 2021/03/29
 */
@RestController
//@CrossOrigin(origins = "*",maxAge = 3600)
public class StudentController {
    @Resource
    StudentService studentService;

    @PostMapping(value = "/students")
    public Student addNew(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping(value = "/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
