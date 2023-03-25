package chapter9;

import homework.homework10.Stack;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        // these loops cause each stack to grow
        for (int i = 0; i < 12; i++) mystack1.push(i);
        Stack mystack2 = null;
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in myStack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}