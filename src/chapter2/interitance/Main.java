package chapter2.interitance;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("가문 이름 " + child.familyName);
        System.out.println("명예: " + child.honor);

        child.introduce();
        child.superTest();
        child.showSocialMedia();
    }
}
