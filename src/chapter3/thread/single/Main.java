package chapter3.thread.single;

public class Main {

    public static void main(String[] args) {
        System.out.println("::: mian 쓰레드 시작");
        String threadName = Thread.currentThread().getName();

        for(int i=0;i<10;i++){
            System.out.println("현재 쓰레드이름 : " + threadName + " - " + i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for(int j=0;j<10;j++){
            System.out.println("현재 쓰레드이름 : " + threadName + " - " + j);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
