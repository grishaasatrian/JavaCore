package chapter4;

public class IfExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 600;
        int c = 8;
        // (true && true) > true
        // (false && false) > false
        // (false && true) > false
        // (true || ) > true
        // ( false || true ) > true
        // (false || false) > false
        // (true | true, false) > true

        if (a > b || a > c) {
            System.out.println("ա-ն մեծ է բ-ից կամ ց-ից");
        }
    }
}
