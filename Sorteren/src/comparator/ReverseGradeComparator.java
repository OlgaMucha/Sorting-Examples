package comparator;

import launcher.Student;

import java.util.Comparator;

public class ReverseGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int comparing = Double.compare(o2.getMark(), o1.getMark());
        if (comparing == 0){ //for this same mark
            return o1.compareTo(o2);//the compare on natural way - by id
        }
        return comparing;
    }
}
