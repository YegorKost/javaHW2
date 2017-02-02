package com.yegor.students_2;

/**
 * This class represents a student.
 * Created by YegorKost on 01.02.2017.
 */
public class Student {

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}
