package chapter2.clazz;

public class Person {

    //1. 속성 - 변수 선언으로 표현할 수 있습니다.

    String name;
    int age;
    String address;

    //2. 생성자 - 조립 설명서
    //2.1. 클래스와 이름이 같습니다
    //2.2. 반환 타입이 존재 하지 않습니다.
    //2.3. 여러개가 존재할 수 있습니다.
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    };

    //3. 기능(메서드)

    int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    //Getter
    String getName() {
        return this.name;
    }
    //Setter
    void setAddress(String address) {
        this.address = address;
    }
}
