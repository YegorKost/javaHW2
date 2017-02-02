package com.yegor.students_2;

import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * This class contains method that returns students which correspond to number of a course
 * Created by YegorKost on 01.02.2017.
 */
public class InfoUniversity {

    /**
     * This method prints to console students which correspond to number of a course
     * @param students the list of students
     * @param course the number of a course
     */
    public void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students of course " + course + ": ");

        Student student;
        while (iterator.hasNext()){
            student = iterator.next();
            if (student.getCourse() == course){
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        University university = University.getUniversity();
        university.addStudent(new Student("Rick", 1));
        university.addStudent(new Student("Ali", 2));
        university.addStudent(new Student("Dash", 1));
        university.addStudent(new Student("Mike", 3));
        university.addStudent(new Student("Richard", 2));
        university.addStudent(new Student("Dona", 5));
        university.addStudent(new Student("Mali", 5));
        university.addStudent(new Student("Dilan", 4));
        university.addStudent(new Student("Igor", 3));
        university.addStudent(new Student("Sara", 4));

        try (BufferedReader buff = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Enter number of course (1-5): ");
            String line;
            if ((line = buff.readLine()) != null){
                int course = Integer.parseInt(line.trim());
                if (course >= 1 && course <= 5) {
                    InfoUniversity infoUniversity = new InfoUniversity();
                    infoUniversity.printStudents(university.getStudents(), course);
                } else {
                    System.out.println("Incorrect number of course - " + course);
                }
            }

        } catch (IOException  e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("It is not a number: " + e.getMessage());
        }


    }

}
