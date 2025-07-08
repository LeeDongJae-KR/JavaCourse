package chapter3.lambda;

public class Main {

    public static int calculate(int a, int b, Calculator calculator) {
        return calculator.sum(a, b);
    }

    public static void main(String[] args) {

        Calculator calculator1 = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int result = calculator1.sum(1, 2);
        System.out.println(result);

        //인터페이스를 활용한 람다식 만들기
        Calculator calculator2 = (a, b) -> a + b;
        int result2 = calculator2.sum(2, 2);
        System.out.println(result2);

        // 람다식을 매개변수로 전달하는 방법
        // 1. 익명 클래스를 변수에 담아 매개변수로 전달

        Calculator calculator3 = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int result3 = calculator3.sum(3, 3);
        System.out.println(result3);

        // 람다식을 변수에 담아 매개변수로 전달
        Calculator calculator4 = (a, b) -> a + b;
        int result4 = calculate(4,4,calculator4);
        System.out.println(result4);

        int result5 = calculate(5,5,(a,b) -> a + b);
        System.out.println(result5);
    }
}
