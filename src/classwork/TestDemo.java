package classwork;

public class TestDemo {

    public static void main(String[] args) {
     /*   Test test = new Test(5);
        test.printA();

        Test test1 = new Test(7);
        test1.printA();
*/
        Test.b = 8;
        System.out.println(Test.b);

        Test.printABC();
    }
}