package kg.itacademy.test2.service;

import kg.itacademy.test2.dto.StudentDto;
import kg.itacademy.test2.entity.Student;
import kg.itacademy.test2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private CourseService courseService;

    @Override
    public Student create(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setCourse(courseService.getById(studentDto.getCourse_id()));
        student.setIsActive(1);
        student.setTotalCost(studentDto.getTotalCost());
        return studentRepo.save(student);
    }

    /** Решил заменить метод DELETE на Update потому что
     *  удалять данные нецелесообразно, если неактивен,
     *  значит удален :)  **/
    @Override
    public Student makeInactive(Long id) {
        Student student = studentRepo.getOne(id);
        if(student != null && student.getIsActive() != 0) {
            student.setIsActive(0);
            return studentRepo.save(student);
        }
        return null;
    }

    @Override
    public List<Student> showAll() {
        return studentRepo.findAll();
    }

    @Override
    public List<Student> showAllByName(String name) {
        List<Student> list = studentRepo.getAllByNameContains(name);
        return list;
    }
}
