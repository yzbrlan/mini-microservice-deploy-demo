package top.xywu.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import top.xywu.student.entity.Student;
import top.xywu.student.repository.StudentRepository;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

    @Bean
    public CommandLineRunner dataLoader(StudentRepository studentRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Student student = new Student();
                student.setUsername("admin");
                List<Student> studentList = studentRepository.findStudentByUsername(student.getUsername());
                if (studentList == null || studentList.isEmpty()) {
                    student.setPhone("11122223333");
                    studentRepository.save(student);
                }
            }
        };
    }
}
