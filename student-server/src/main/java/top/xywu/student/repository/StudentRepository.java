package top.xywu.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.xywu.student.entity.Student;

import java.util.List;

/**
 * @author xywu
 * @date 2021/03/29
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findStudentByUsername(String username);
}
