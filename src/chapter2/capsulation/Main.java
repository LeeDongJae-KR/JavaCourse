package chapter2.capsulation;

public class Main {

    public static void main(String[] args) {

        //생성자 호출
        Person person = new Person("박보검");

        //게터
        String name = person.getName();
        System.out.println("name = " + name);

        //세터
        person.setName("카리나");
        System.out.println("name = " + person.getName());

    }
}
