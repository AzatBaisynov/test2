package kg.itacademy.test2.service;

import kg.itacademy.test2.entity.Course;

public interface CourseService {
    Course create(Course course);
    Course getById(Long id);
}
