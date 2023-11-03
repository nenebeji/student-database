package com.team6.studentdatabase.repository;

import com.team6.studentdatabase.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
