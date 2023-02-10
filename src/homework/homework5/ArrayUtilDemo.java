package homework.homework5;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] array = {5, 6, 3, 1, 9};
        int a = au.maxOfArray(array);
        System.out.println("Max: " + a);
        System.out.println("Max * 2 : " + a * 2);
        System.out.println(a % 2 == 0 ? "even" : "odd");
    }
}
