package chapter3.thread.multi;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ::: main 쓰레드 시작");

        MyThread myThread0 = new MyThread();
        MyThread myThread1 = new MyThread();

        // Thread 0시작
        System.out.println("thread0 시작 : ");
        myThread0.start();
        // Thread 1시작
        System.out.println("thread1 시작 : ");
        myThread1.start();

        System.out.println("::: main 쓰레드 종료");

    }
}
