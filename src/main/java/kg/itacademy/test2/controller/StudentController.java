package kg.itacademy.test2.controller;

import kg.itacademy.test2.dto.StudentDto;
import kg.itacademy.test2.entity.Student;
import kg.itacademy.test2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student create(@RequestBody StudentDto studentDto){
        return studentService.create(studentDto);
    }

    @PutMapping("/{id}")
    public Student makeInactive(@PathVariable Long id){
        return studentService.makeInactive(id);
    }

    @GetMapping("/get-all")
    public List<Student> getAll(){
        return studentService.showAll();
    }

    @GetMapping("/find")
    public List<Student> searchByName(@RequestParam(name = "fio") String fio){
        return studentService.showAllByName(fio);
    }

}
