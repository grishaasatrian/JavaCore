package classwork;

public class ThreadExample {

    public static void main(String[] args) {
        Thread myNewThread = new Thread(new MyThread(), "MyThread");
        myNewThread.start();

  /*      Thread thread = Thread.currentThread();
        thread.setName("Java Thread");
        System.out.println(thread); */

        for (int i = 1; i < 6; i++) {
            System.out.println("MainThread" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}