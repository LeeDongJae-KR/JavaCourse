package chapter1.condition;

public class Main {

    public static void main(String[] args) {

        //조건문 if
//        String light = "초록불";
//
//        if(light.equals("초록불")) {
//            System.out.println("건너세요!");
//
//        } else if (light.equals("노란불")) {
//            System.out.println("주의 하세요 !");
//
//        } else{
//            System.out.println("멈추세요!");
//        }
//        System.out.println("...");

        //조건문 switch

        int number = 1;

        switch (number) {
            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
            default:
                System.out.println("1도 아니고 2도 아닙니다.");
                break;
        }
    }
}
