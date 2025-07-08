package chapter2.capsulation;

public class Person {

    private String name;
    private String secret;
    public Person(String name) {
        this.name = name;
    }

    public void methodA() {}
    public  void methodB() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
