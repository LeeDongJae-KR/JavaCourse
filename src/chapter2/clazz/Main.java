package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        // 객체 생성

        Person personA = new Person("박보검",30);
        Person personB = new Person("카리나",22);

        // 속성에 직접 접근
//        personA.name = "이동재";
//        personB.name = "카리나";
//
//        System.out.println(personA.name);
//        System.out.println(personB.name);

        //기능 활용
        int result1 = personA.sum(1,2);
        int result2 = personB.sum(2,3);

        System.out.println(result1);
        System.out.println(result2);

        //Getter 활용
        String nameA = personA.getName();
        System.out.println(nameA);

        //Setter 활용

        personA.setAddress("서울");
        System.out.println(personA.address);
    }
}
