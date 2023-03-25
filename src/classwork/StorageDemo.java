package classwork;

public class StorageDemo {

    public static void main(String[] args) {
        Storage<Student> studentStorage = new Storage<>();
        Storage<Student> anotherStudents = new Storage<>();
        Storage<Book> bookStorage = new Storage<>();

        Storage<String> nameStorage = new Storage<>();
        Storage<Integer> numbers = new Storage<>();

        nameStorage.add("Poxos");
        nameStorage.add("Petros");
        numbers.add(5);

        Student student = new Student("Poxos", "Poxosyan", 33);

        Book book = new Book("girq 1", "description", 66);
        bookStorage.add(book);
        studentStorage.add(student);

        Student byIndex = studentStorage.getByIndex(0);
        System.out.println(byIndex.getName());
    }
}