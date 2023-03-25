package chapter9;

public class AnotherClient implements Callback {
    // Implement Callback's interface
    @Override
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}