package chapter2.interfaceexample;

public class SpeedCar implements Car {
    @Override
    public void drive() {
        System.out.println("빠르게 이동합니다.");
    }

    @Override
    public void stop() {
        System.out.println("빠르게 멈춤니다.");
    }

    void autoParking(){
        System.out.println("자동 주차 합니다.");
    }
}
