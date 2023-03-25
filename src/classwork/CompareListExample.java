package classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareListExample {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList();
        studentList.add(new Student("Poxos", "Poxosyan", 18));
        studentList.add(new Student("Arzuman", "Poxosyan", 13));
        studentList.add(new Student("Arzuman", "Martirosyan", 4));
        studentList.add(new Student("Asqanaz", "Petrosyan", 6));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(studentList);
    }
}