package launcher;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Student implements Comparable<Student>{

    private static int nextStudentID = 500800001;
    private static Random randomizer = new SecureRandom();
    private int studentID;
    private double mark;

    public Student() {
        studentID = nextStudentID++;
        mark = (10 + randomizer.nextInt(91)) / 10.0;
    }

    public static Student[] generateStudents(int numberOfStudents) {
        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
        }
        return students;
    }

    public double getMark() {
        return mark;
    }

    public int getStudentID() {
        return studentID;
    }


    public String toString() {
        return String.format("%9d, %.1f", studentID, mark);
    }

    @Override
    public int compareTo(Student o) {
        return this.studentID - o.studentID;
    }

    public static void printArray(Student[] students) {
        System.out.println( Arrays.asList( students ));
    }

}
