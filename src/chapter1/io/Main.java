package chapter1.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //출력
        //println 사용
        System.out.println("Helllo");
        System.out.println("Java");

        //print 사용
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자 포함 출력
        System.out.print("\nHello\nWorld!\n");

        //입력(Scanner)
        Scanner scanner = new Scanner(System.in);

        //문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요 : ");
        String string = scanner.nextLine();
        System.out.println("문장 = " + string);

        //정수형 입력 받기
        System.out.print("정수를 입력 하세요 : ");
        int intBox = scanner.nextInt();
        System.out.println("정수 = " +  intBox);

        System.out.print("소수점을 입력하세요 : ");
        float floatBox = scanner.nextFloat();
        System.out.println("소수점 = " +  floatBox);
    }
}
