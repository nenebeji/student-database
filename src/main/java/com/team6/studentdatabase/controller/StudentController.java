package com.team6.studentdatabase.controller;

import com.team6.studentdatabase.entity.Student;
import com.team6.studentdatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    private List<Student> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    private Student getStudent(@PathVariable("id") long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    private Student deleteStudent(@PathVariable("id") long id) {
        studentService.delete(id);
        return null;
    }
    @PostMapping("/students")
    private long saveStudent(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student.getId();
    }
}
