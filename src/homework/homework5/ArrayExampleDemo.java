package homework.homework5;

public class ArrayExampleDemo {

    public static void main(String[] args) {
        ArrayExample ae = new ArrayExample();
        char[] charArray = {' ', 'h', 'e',' ','l','l','o', ' ',' '};
        ae.trim(charArray);
        System.out.println();

        int[] array = {5, 7, 2, 9, 1, 4, 0};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        ae.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}