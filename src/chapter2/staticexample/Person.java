package chapter2.staticexample;

public class Person {
    //인스턴스 변수
    String name;
    //인스턴스 메서드
    void printName(){
        System.out.println("나의 이름은 " + this.name + " 입니다.");
    }
    //static 변수
    static int population = 0 ;
    //static 메서드
    static void printPopulation(){
        System.out.println("현재 인구 수 : " + population);
    }

    Person(){
        population++;
    }

}
