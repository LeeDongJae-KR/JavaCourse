package chapter1.variable;

public class Main {
    public static void main(String[] args) {
        // [자료형] [변수 이름];

        //정수형
        int a;

        a = 1;
        a = 2; //재할당
        System.out.println("a = " + a);

        //논리형
        boolean booleanBox = true;
        System.out.println("booleanBox = " + booleanBox);

        //문자형
        char charBox = 'a';
        System.out.println("charBox = " + charBox);

        //큰 정수형 8
        long longBox = 1;
        System.out.println("longBox = " + longBox);

        //실수형
        float floatBox = 0.12345678f;
        System.out.println("floatBox = " + floatBox);

        double doubleBox = 0.1234567891d;
        System.out.println("doubleBox = " + doubleBox);

        //캐스팅(Casting)
        //다운 캐스팅 : 큰 데이터를 -> 작은 상자

        double bigBox = 10.123;
        int smallBox = (int) bigBox;
        System.out.println("smalllBox = " + smallBox);

        //업캐스팅 : 작은 데이터를 -> 큰 상자
        int smallBox2 = 10;
        double bigBox2 = smallBox;
        System.out.println("bigBox2 = " + bigBox2);

        //문자열 데이터
        String string = "안녕하세요";
        System.out.println("string = " + string);
    }
}
