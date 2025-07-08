package chapter3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(List.of(1,2,3,4,5));

        //for 문
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer num:arrayList){
            Integer multipliedNum = num*10;
            result.add(multipliedNum);
        }
        System.out.println("result = " + result);

        // stream 문
        List<Integer> result2 = arrayList.stream() //데이터 준비
                .map(num-> num*10) //중간 연산 등록
                .collect(Collectors.toList()); //최종 연산 단계
        System.out.println("result = " + result2);

        //익명 클래스를 직접 만들어서 변수에 담아 매개변수로 전달


        Function<Integer,Integer> function = new Function<Integer,Integer>(){
            @Override
            public Integer apply(Integer num) {
                return num*10;
            }
        };
        List<Integer> result3 = arrayList.stream() //데이터 준비
                .map(function) //중간 연산 등록
                .collect(Collectors.toList()); //최종 연산 단계
        System.out.println("result = " + result3);

        // 람다식을 만들어서 변수에 담아 매개변수로 전달
        Function<Integer,Integer> functionLambda = (num -> num*10);
        List<Integer> result4 = arrayList.stream() //데이터 준비
                .map(functionLambda) //중간 연산 등록
                .collect(Collectors.toList()); //최종 연산 단계
        System.out.println("result = " + result4);

        //람다식을 직접 매개변수에 전달
        List<Integer> result5 = arrayList.stream()
                .map(num -> num*10)
                .collect(Collectors.toList());
        System.out.println("result = " + result5);

        //중간 연산을 함께 사용하는 방법 (filter() + map())
        //요구사항 : 리스트에서 짝수를 찾아서 * 10
        List<Integer> result6 = arrayList.stream()
                .filter(num -> num % 2 == 0) // 중간 연산 등록 짝수 찾기
                .map(num -> num*10) // 중간 연산 등록 * 10
                .collect(Collectors.toList());
        System.out.println("result = " + result6);

    }
}
