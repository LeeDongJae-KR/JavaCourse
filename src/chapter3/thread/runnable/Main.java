package chapter3.thread.runnable;

public class Main {
    public static void main(String[] args) {
        Myrunnable myrunnable = new Myrunnable();

        Thread thread0 = new Thread(myrunnable);
        Thread thread1 = new Thread(myrunnable);

        thread0.start();
        thread1.start();

        // 기능을 확장해서 사용
        myrunnable.printMessage();

    }
}
