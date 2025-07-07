package chapter1.oeprator;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 문자열을 입력하세요 : ");
        String a = input.nextLine();
        System.out.print("두 번째 문자열을 입력하세요 : ");
        String b = input.nextLine();
        boolean result = a.equals(b);

        System.out.println("두 문자열이 같은가요? : " + result);
    }
}
