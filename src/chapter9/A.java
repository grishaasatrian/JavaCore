package chapter9;

public class A {
    // this is a nested interface
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// B implements the nested interface.
class B implements A.NestedIF {

    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}