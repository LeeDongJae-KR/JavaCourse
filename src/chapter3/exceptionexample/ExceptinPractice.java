package chapter3.exceptionexample;

public class ExceptinPractice {

    //언체크 예외 호출
    public void callUnchekcedException() {

        if (true) {
            System.out.println("언체크 예외 발생");
            throw new RuntimeException();
        }

//        try {
//            if (true) {
//                System.out.println("언체크 예외 발생");
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e) {
//            System.out.println("언체크 예외 처리");
//        } catch (Exception e) {
//            System.out.println("언체크 예외 처리 2");
//        }
    }

    public void callChekcedException() throws Exception{
        if (true) {
            System.out.println("체크 예외 발생");
            throw new Exception();
        }

//        try {
//            if (true) {
//                System.out.println("체크 예외 발생");
//                throw new Exception();
//            }
//        }catch (Exception e){
//            System.out.println("체크 예외 처리");
//        }
    }
}
