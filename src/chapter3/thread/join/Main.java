package chapter3.thread.join;

import chapter3.thread.multi.MyThread;

public class Main {

    public static void main(String[] args) {
        System.out.println(" ::: main 쓰레드 시작");

        MyThread myThread0 = new MyThread();
        MyThread myThread1 = new MyThread();

        long startTime = System.currentTimeMillis();

        // Thread 0시작
        System.out.println("thread0 시작 : ");
        myThread0.start();
        // Thread 1시작
        System.out.println("thread1 시작 : ");
        myThread1.start();

        // main 쓰레드 대기 시키기

        try{
            myThread0.join();
            myThread1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("작업 소요 시간 : " + totalTime);
        System.out.println("::: main 쓰레드 종료");

    }
}
