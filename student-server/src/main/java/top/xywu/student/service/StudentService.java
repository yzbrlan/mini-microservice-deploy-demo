package top.xywu.student.service;

import top.xywu.student.entity.Student;

import java.util.List;

/**
 * @author xywu
 * @date 2021/03/29
 */
public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
}
