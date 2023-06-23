package studentssystem.Students.system.app.service;
import studentssystem.Students.system.app.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
