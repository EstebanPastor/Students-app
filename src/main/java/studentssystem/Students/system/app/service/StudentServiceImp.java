package studentssystem.Students.system.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentssystem.Students.system.app.model.Student;
import studentssystem.Students.system.app.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
