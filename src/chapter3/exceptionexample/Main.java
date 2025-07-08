package chapter3.exceptionexample;

public class Main {
    public static void main(String[] args) {
        //의도 하지 않은 예외
//        int ret = 10 / 0;
//        System.out.println("ret = " + ret);
//        System.out.println("프로그램 종료");
        //의도적인 예외 - throw
//        int age = 10;
//        if(age < 18){
//            throw new IllegalArgumentException("미성년자는 접글할 수 없습니다.");
//        }
//
//        System.out.println("프로그램 종료");

        //언체크 예외 호출

        ExceptinPractice exceptinPractice = new ExceptinPractice();
//        exceptinPractice.callUnchekcedException();
//        System.out.println("프로그램 종료");

        try {
            exceptinPractice.callUnchekcedException();
        } catch (RuntimeException e) {
            System.out.println("언체크 예외 처리");
        }
        System.out.println("프로그램 종료");

        // 체크 예외 호출
//        exceptinPractice.callChekcedException();
        try {
            exceptinPractice.callUnchekcedException();
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }
        System.out.println("프로그램 종료");

    }

}
