package homework.homework5;

public class ArrayExample {

    void trim(char[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        char[] result = new char[(endIndex - startIndex) + 1];
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[j++] = array[i];
        }
        for (char c : result) {
            System.out.print(c);
        }
    }

    void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
    }
}