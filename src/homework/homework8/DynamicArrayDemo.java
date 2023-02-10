package homework.homework8;

public class DynamicArrayDemo {

    public static void main(String[] args) {
    DynamicArray dy = new DynamicArray();

        for (int i = 0; i < 10; i++) {
            dy.add(i + 1);
        }

        dy.print();
        dy.set(3,88);
        dy.add(3, 88);
        System.out.println(dy.exists(5));
        System.out.println(dy.getIndexByValue(4));
        dy.deleteByIndex(9);
        dy.print();
    }
}