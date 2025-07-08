package chapter2.interitance;

public class Child extends Parents {

    public String familyName = "스파르타2";

    public Child() {
        super();
        System.out.println("자식 생성자");
    }

    public void superTest(){
        System.out.println(super.familyName);
    }

    public void showSocialMedia(){
        System.out.println("SNS 에서 우리 가족을 소개합니다.");
    }

    @Override
    public void introduce() {
        System.out.println("오버라이드");
    }
}
