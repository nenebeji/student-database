package com.team6.studentdatabase.service;

import com.team6.studentdatabase.entity.Course;
import com.team6.studentdatabase.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    public Course getCourseById(long id) { return courseRepository.findById(id).get(); }

    public void saveOrUpdate(Course course) {
        courseRepository.save(course);
    }

    public void delete(long id) {
        courseRepository.deleteById(id);
    }
}
