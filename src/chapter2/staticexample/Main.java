package chapter2.staticexample;

public class Main {
    public static void main(String[] args) {
        //클래스 멤버
        //static 변수, 메서드 활용
        System.out.println("static 변수 : "+ Person.population);
        Person.printPopulation();

        //인스턴스 멤버 활용

        Person personA = new Person();
        Person personB = new Person();

        //인스턴스 변수 활용
        personA.name = "박보검";
        personB.name= "카리나";

        personA.printName();
        personB.printName();

        Person.printPopulation();

    }
}
