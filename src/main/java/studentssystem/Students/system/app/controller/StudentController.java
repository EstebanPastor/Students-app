package studentssystem.Students.system.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studentssystem.Students.system.app.model.Student;
import studentssystem.Students.system.app.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student has been added";
    }

    @GetMapping("/getall")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }



}
