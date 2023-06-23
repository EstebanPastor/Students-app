package studentssystem.Students.system.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentssystem.Students.system.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
