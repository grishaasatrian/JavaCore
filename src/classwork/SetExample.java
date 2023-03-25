package classwork;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
 /*       LinkedHashSet<String> nameSet = new LinkedHashSet<>();
        nameSet.add("Poxos");
        nameSet.add("Martiros");
        nameSet.add("Valod");
        nameSet.add("Arzuman");

        for (String s : nameSet) {
            System.out.println(s);
        } */

        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        students.add(new Student("Poxos", "Poxosyan", 20));
        students.add(new Student("Arzuman", "Martirosyan", 19));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}