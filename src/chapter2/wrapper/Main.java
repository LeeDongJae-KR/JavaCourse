package chapter2.wrapper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //기본형 변수
        int a = 1;

        //참조형 변수

        Person personA = new Person();
        System.out.println(personA);

        int[] arr = {1,2,3,4,5};
        System.out.println(arr);

        //래퍼 클래스(기본형 변수를 감싸고 있는 클래스)
        Integer num = 100;
        System.out.println(num);

        String numStr = num.toString();

        // 직접 만든 래퍼 클래스
        CustomInteger customInteger = new CustomInteger(10);
        String myStrInterger = customInteger.toString();

        // 오토 박싱
        Integer num3 = 10;
//        Integer num3 = Integer.valueOf(10);

        // 오토 언박싱
        int num4 = num3;
//        int num4 = num3.intValue();
    }
}
