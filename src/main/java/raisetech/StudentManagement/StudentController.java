package raisetech.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentsCourses;
import raisetech.StudentManagement.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/studentsIn30s")
    public List<Student> getStudentsIn30s() {
        return service.searchStudentsIn30s();
    }
    
    @GetMapping("/javaCourses")
    public List<StudentsCourses> getJavaCourseList() {
        return service.searchJavaCourseList();
    }
}