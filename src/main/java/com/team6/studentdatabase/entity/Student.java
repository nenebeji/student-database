package com.team6.studentdatabase.entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int age;
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "campus_id")
    private Campus campus;

//    Constructors

//    public Student(int id, String name, int age, int email) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.email = email;
//    }

//    getters and setters

    public long getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
