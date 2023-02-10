package homework.homework1;

public class IfForExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }
        if (a < b) {
            a = 8;
            b = 15;
            for (int i = a; i <= b; i++) {
                System.out.print(i + ",");
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.println(i + ",");
            }
        }

        char c = (char) a;
        char c1 = (char) b;
        {
            System.out.println(c);
            System.out.println(c1);
        }
        int x = 6;
        int y = 6;
        if (x == y) {
            System.out.println("x == y");
        } else {
            System.out.println("x != y");
        }
    }
}