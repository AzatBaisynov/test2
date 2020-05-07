package kg.itacademy.test2.service;

import kg.itacademy.test2.entity.Course;
import kg.itacademy.test2.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public Course create(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course getById(Long id) {
        return courseRepo.getOne(id);
    }
}
