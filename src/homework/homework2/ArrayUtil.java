package homework.homework2;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {4, 5, 9, 14, 55, 24, 33, 15, 71, 98,};
        {
            for (int x : array) {
                if (x % 2 == 0) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
            for (int x : array) {
                if (x % 2 != 0) {
                    System.out.print(x + " ");
                }
            }
            System.out.println();
            int evenCount = 0;
            for(int x: array) {
                if (x % 2 == 0) {
                    evenCount++;
                }
            }
            System.out.println("Զույգերի քանակը՝" + evenCount);

            int oddCount = 0;
            for (int x : array) {
                if (x % 2 != 0) {
                    oddCount++;
                }
            }
            System.out.println("Կենտերի քանակը՝" + oddCount);
            System.out.println();
            int sum = 0;
            for (int i : array) {
                sum += 1;
            }
            System.out.println("Էլեմենտների գումարը՝" + sum);
            System.out.println("Էլեմենտների միջինը՝" + sum / array.length);
            System.out.println(array[array.length / 2]);
            System.out.println();
            System.out.println("first element: " + array[0]);
            int lastIndex = array.length - 1;
            System.out.println("last element: " + array[lastIndex]);
            System.out.print("all elements: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i != array.length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("max: " + max);

            int min = array [0];
            for (int i = 1; i < array.length; i++) {
                if(array[i] < min) {
                    min = array [i];
                }
            }
            System.out.println("min: " + min);
        }
    }
}