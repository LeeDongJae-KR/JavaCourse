package chapter3.generic;

public class Main {

    public static void main(String[] args) {
        // 재사용 불가

        Box box1 = new Box(10);
//        new Box("ABC");
//        new Box(0.1);

        //낮은 타입 안정성
        ObjectBox intBox2 = new ObjectBox(10);
        ObjectBox strBox3 = new ObjectBox("aaa");

        //item을 활용하기 위해서는 down casting 필요
        String item = (String) strBox3.getItem();
        int item2 = (Integer) intBox2.getItem();
//        String item3 = (String) intBox2.getItem();

        System.out.println(item);
        System.out.println(item2);

        //제너릭 활용
        //1. 재사용성 보장 (타입 소거 : T -> Object)
        GenericBox<String> stringGenericBox = new GenericBox<>("aaa");
        GenericBox<Integer> integerGenericBox = new GenericBox<>(10);
        GenericBox<Double>  doubleGenericBox = new GenericBox<>(10.0);

        //2.타입 안정성 보장 (타입 소거 : 자동으로 down casting)
        String strGenericItem = (String) stringGenericBox.getItem();
        System.out.println(strGenericItem);

        Integer integerGenericItem = (Integer) integerGenericBox.getItem();
        System.out.println(integerGenericItem);

        Double doubleGenericItem = (Double) doubleGenericBox.getItem();
        System.out.println(doubleGenericItem);

        //일반 메서드 (String 기준으로 타입소거 발생)
        stringGenericBox.printItem("ABC");
//        stringGenericBox.printItem(100);
//        stringGenericBox.printItem(0.1);

        //제네릭 메서드 (클래스의 타입과는 별개로 독립적인 타입 매개변수를 갖는다)
        stringGenericBox.printBoxItem("ABC");
        stringGenericBox.printBoxItem(100);
        stringGenericBox.printBoxItem(0.1);
    }
}
