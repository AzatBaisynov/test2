package kg.itacademy.test2.repo;

import kg.itacademy.test2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    List<Student> getAllByNameContains(String name);
}
