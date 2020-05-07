package kg.itacademy.test2.service;

import kg.itacademy.test2.dto.StudentDto;
import kg.itacademy.test2.entity.Student;

import java.util.List;

public interface StudentService {
    Student create(StudentDto studentDto);
    Student makeInactive(Long id);
    List<Student> showAll();
    List<Student> showAllByName(String name);
}
