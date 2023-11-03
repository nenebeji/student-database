package com.team6.studentdatabase.repository;

import com.team6.studentdatabase.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
