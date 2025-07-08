package chapter2.polymorphism;

public class Main {

    public static void main(String[] args) {
        //다형성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal2.exist();

        animal1.makeSound();
        animal2.makeSound();

        //업캐스팅시 자식의 고유 메서드를 사용하지 못한다.
//        animal1.scratch();
//        animal2.wag();

        //다운 캐스팅
        Cat cat = (Cat) animal1;
        cat.scratch();

        Dog dog = (Dog) animal2;
        dog.wag();

        // 다운캐스팅시 instanceof 사용방법
        if(animal2 instanceof Cat){
            Cat cat2 = (Cat) animal2;
            cat2.scratch();
        }else{
            System.out.println("객체가 고양이가 아닙니다.");
        }

        Animal[] animals = {new Cat() , new Dog()};
        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}
