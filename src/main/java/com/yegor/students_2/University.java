package com.yegor.students_2;

import java.util.LinkedList;
import java.util.List;

/**
 * This class represents an university.
 * Created by YegorKost on 01.02.2017.
 */
public class University {
    private static University university;
    private List<Student> students = new LinkedList<>();

    private University(){}

    /**
     * Method returns a university object.
     * @return university object
     */
    public static University getUniversity(){
        return university == null ? university = new University(): university;
    }

    /**
     * Method adds student to university.
     * @param student a student that will be added to university
     * @return true if student is added, otherwise false
     */
    public boolean addStudent(Student student) {
        return students.add(student);
    }

    /**
     * Method removes student from university.
     * @param student a student that will be removed from university
     * @return true if student is removed, otherwise false
     */
    public boolean removeStudent(Student student){
        return students.remove(student);
    }

    /**
     * This method returns a list of students
     * @return list of students
     */
    public List<Student> getStudents() {
        return students;
    }
}
