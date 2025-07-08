package chapter2.finalexample;

public class Main {
    public static void main(String[] args) {
        final int a = 1;
        System.out.println(a);

        //상수 활용 방법
        System.out.println("상수 활용 : " + Circle.PI);

        //불변 객체 활용
        final Circle circle = new Circle(2);
        System.out.println(circle);

        //불변 객체의 내부 상태가 변경이 필요한 경우
        Circle circle2 = new Circle(3);
        System.out.println(circle2);
    }
}
