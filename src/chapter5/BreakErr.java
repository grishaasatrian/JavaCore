package chapter5;

public class BreakErr {
    public static void main(String[] args) {

        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
        }
    }
}