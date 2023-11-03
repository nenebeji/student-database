package com.team6.studentdatabase.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Campus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String campusName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "campus_id")
    private List<Student> students;

    public long getId() {
        return id;
    }

    public String getCampusName() {
        return campusName;
    }

    public List<Student> getStudents() {
        return students;
    }
}
