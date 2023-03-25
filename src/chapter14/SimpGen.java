package chapter14;

public class SimpGen {
    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(88, "Generics");

        // Shw the types.
        tgObj.showTypes();

        // Obtain and show values.
        int v = tgObj.getob1();
        System.out.println("value: " + v);

        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}