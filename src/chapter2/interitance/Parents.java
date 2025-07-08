package chapter2.interitance;

public class Parents {

    public String familyName = "스파르타";
    public int honor = 10;

    public Parents(){
        System.out.println("부모 생성자");
    }
    public void introduce() {
        System.out.println("우리 가족 이름은 " + this.familyName + " 입니다");
    }


}
