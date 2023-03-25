package classwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Poxos");
        names.add("Petros");
        names.add("Martiros");

        for (String name : names) {
            System.out.println(name);
        }
        Object[] objects = names.toArray();
        for (Object object : objects) {

        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}