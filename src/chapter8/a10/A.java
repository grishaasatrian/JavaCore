package chapter8.a10;

public class A {
    final void meth() {
        System.out.println(" This is a final method.");
    }
}
/*
 class B extends A {
    void meth(){ // ERROR! Can't override.
        System.out.println("Illegal!");

    }
 }*/

/* final cllass A {
//...
 } // The following class is illegal.
 class B extends A { // ERROR! Can't subclass A
 // ...
 }
 */