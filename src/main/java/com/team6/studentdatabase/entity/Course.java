package com.team6.studentdatabase.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String courseName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private List<Student> students;

//    Getters


    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }
}
