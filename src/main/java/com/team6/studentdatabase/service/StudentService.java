package com.team6.studentdatabase.service;

import com.team6.studentdatabase.repository.StudentRepository;
import com.team6.studentdatabase.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> findAll() {

        return (List<Student>) studentRepository.findAll();
    }
    public Student getStudentById(long id) {
        return studentRepository.findById(id).get();
    }
    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

    public void delete(long id) {
        studentRepository.deleteById(id);
    }

}
