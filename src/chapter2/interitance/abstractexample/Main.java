package chapter2.interitance.abstractexample;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //추상 클래스는 인스턴스화 불가능
//        Animal animal = new Animal();
        cat.name = "cat";
        // 자식에서 강제 구현된 메서드
        cat.eat();
        cat.sleep();
    }
}
