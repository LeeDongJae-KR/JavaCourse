package chapter2.clazz.Question;

public class Car {
    String name;
    String color;

    Car (String name, String color) {
        this.name = name;
        this.color = color;
    }

    void drive(){
        System.out.println(this.color +" "+ this.name + " " + "자율 주행 모드 시작");
    }

}
