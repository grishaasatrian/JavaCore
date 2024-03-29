package classwork;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
/*        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("poxos@mail.com", new Student("Poxos", "Poxosyan", 22));
        studentMap.put("petros@mail.com", new Student("Petros", "Poxosyan", 23));

        Student student = studentMap.get("");
        System.out.println(student); */

        Map<Company, Integer> companySizeMap = new TreeMap<>(new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        Person person = new Person("Poxos", "Poxosyan");
        Person petros = new Person("Petros", "Poxosyan");
        Company company = new Company(person, "001", "Company 1");
        Company company2 = new Company(petros, "002", "Company 2");
        Company company3 = new Company(petros, "003", "Company 3");

        companySizeMap.put(company3, 40);
        companySizeMap.put(company2, 4);
        companySizeMap.put(company, 20);

//        Set<Company> companies = companySizeMap.keySet();
//        Collection<Integer> values = companySizeMap.values();

        Set<Map.Entry<Company, Integer>> entries = companySizeMap.entrySet();

        for (Map.Entry<Company, Integer> entry : entries) {
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue());
        }
    }
}