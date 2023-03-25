package chapter14.gen1;

public class Gen<T> {

    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen(T o) {
        ob = o;
    }

    // return ob.
    T getob() {
        return ob;
    }
}