package model;

import comparator.GradeComparator;
import launcher.Student;

import java.util.Arrays;
import java.util.Collections;

import static launcher.Student.printArray;

public class StudentLauncher {

    public static void main(String[] args) {

        Student[] arrayOfStudents = Student.generateStudents( 10 );

        //sorting on student id
        Arrays.sort(arrayOfStudents);
        printArray(arrayOfStudents);

        //sorting on grade
        Arrays.sort(arrayOfStudents, new GradeComparator());
        printArray(arrayOfStudents);

        //sorting on grade
        Arrays.sort(arrayOfStudents, new GradeComparator());
        printArray(arrayOfStudents);

        //sorting descending on id
        Arrays.sort(arrayOfStudents, Collections.reverseOrder());
        printArray(arrayOfStudents);

        //sorting descending on grade
        Arrays.sort(arrayOfStudents, Collections.reverseOrder(new GradeComparator()));
        printArray(arrayOfStudents);
    }

}
