package chapter1.oeprator;

import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        //기본 사칙 연산
        int sum = a + b;
        System.out.println("sum = " + sum);

        int sub = a -b;
        System.out.println("sub = " + sub);

        int mul = a * b;
        System.out.println("mul = " + mul);

        //나눗셈
        int div = a / b;
        System.out.println("div = " + div);
        //소수점과 연산을 시켜야 소수점 값을 반환
        double div1 = a / 3.0;
        System.out.println("div1 = " + div1);

        //모듈러 연산자(나머지 연산자) -%
        int mod = 10 % 3;
        System.out.println("mod = " + mod);

        int mod2 = 15 % 4;
        System.out.println("mod2 = " + mod2);

        int mod3 = 20 % 7;
        System.out.println("mod3 = " + mod3);

        //시간 연산
        int mod4 = (10 + 5) % 12;
        System.out.println("mod4 = " + mod4);

        //짝수 홀수 연산
        int mod5 = 6 % 2;
        System.out.println("mod5 = " + mod5);

        int mod6 = 7 % 2;
        System.out.println("mod6 = " + mod6);

        //대입 연산자
        int num = 5;

        //복합 대입 연산자
        num += 3; // num = num + 3;
        System.out.println("num = " + num);

        num -=2;  // num = num - 2;
        System.out.println("num = " + num);

        num *= 2; // num = num * 2;
        System.out.println("num = " + num);

        num /= 2; // num = num / 2;
        System.out.println("num = " + num);

        num %= 2; // num = num % 2;
        System.out.println("num = " + num);

        // 증감 연산자

        num = 2;
        num++; // +1
        System.out.println("num = " + num);
        num--; // -1
        System.out.println("num = " + num);

        // 전위 연산(++i) - 연산 후 값이 활용 됩니다.
        int intBox = 5;
        System.out.println("++intBox = " + ++intBox);

        // 후위 연산(i++)
        System.out.println("intBox++ = " + intBox++);
        System.out.println("intBox++ = " + intBox);

        //비교 연산자
        //같음 연산자 (=) 같으면 true, 다르면 false
        System.out.println("10 == 10 = " + (10 == 10)) ;

        //다름 연산자(!=) 다르면 true, 같으면 false
        System.out.println("10 == 10 = " + (10 != 5)) ;

        //크기 비교 연산자
        System.out.println("10 < 5 = " + (10 < 5)) ;
        System.out.println("10 >= 5 = " + (10 >= 5)) ;
        System.out.println("10 <= 5 = " + (10 <= 5)) ;

        //논라 연산자
        //AND 연산(&&) - 두 조건이 모두 참일때 ture 반환
        System.out.println("ture && true : " + (true && true));
        int age = 20;
        boolean isStudent = true;

        System.out.println(" ::: " + ((age > 18) && isStudent));

        //OR 연산(||) - 두 조건중 하나라도 참이면 true를 반환합니다.
        System.out.println("false || true : " + (false && true));

        //NOT 연산자(!) - true -> false , false -> true
        System.out.println("!true : " + (!true));

        boolean flag = 10 + 5 > 12 && true;
        System.out.println(flag);

        // 실행 순서 :  (10 + 5) > 12 && true : 산술
        // -> 15 > 12 && true : 비교
        // -> true && true : 논리
        // -> flag = true 대입

        //논리 연산자 우선순위(! -> && -> ||)
        boolean result = true || (false && false);
        System.out.println(result);

        boolean result2 = true || (false && (!false));
        System.out.println(result2);

        //문자열 비교
        String text = "hello";
        String text2 = "hello";

        boolean isEquals = text.equals("hello");
        System.out.println(isEquals);
    }
}
