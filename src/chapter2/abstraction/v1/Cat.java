package chapter2.abstraction.v1;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("고양이가 존재 합니다");
    }

    @Override
    public void exist() {
        System.out.println("야옹");
    }

    public void scratch(){
        System.out.println("스크래치");
    }
}
