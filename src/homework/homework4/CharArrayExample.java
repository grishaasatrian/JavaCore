package homework.homework4;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {' ', 'j', ' ', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (char aChar : chars) {
            if (aChar == c) {
                count++;
            }
        }
        System.out.println("count of o : " + count);

        System.out.print(chars[chars.length / 2]);
        System.out.print(" ");
        System.out.print(chars[chars.length / 2 + 1]);

        System.out.println();

        if (chars[chars.length - 2] == 'l' && chars[chars.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        for (char aChar : chars) {
            if (aChar != ' ') {
                System.out.print(aChar);
            }
        }
    }
}