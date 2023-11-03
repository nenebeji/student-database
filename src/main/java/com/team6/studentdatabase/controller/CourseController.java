package com.team6.studentdatabase.controller;

import com.team6.studentdatabase.entity.Course;
import com.team6.studentdatabase.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    private List<Course> getAllCourses() {
        return courseService.findAll();
    }

    @GetMapping("/courses/{id}")
    private Course getCourse(@PathVariable("id") long id) {
        return courseService.getCourseById(id);
    }

    @DeleteMapping("/courses/{id}")
    private Course deleteCourse(@PathVariable("id") long id) {
        courseService.delete(id);
        return null;
    }
    @PostMapping("/courses")
    private long saveCourse(@RequestBody Course course) {
        courseService.saveOrUpdate(course);
        return course.getId();
    }

}
