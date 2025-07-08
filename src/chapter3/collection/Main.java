package chapter3.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //배열의 한계(정적)
        //선언과 동사에 길이 설정 필요

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //배열의 정적인 특징의 한계
//        numbers[3] = 4;


        //컬렉션 (동적)
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        //ArrayList 활용
        ArrayList<String> arrayList2 = new ArrayList<>();

        //데이터 추가
        arrayList2.add("aaa");
        arrayList2.add("bbb");
        arrayList2.add("ccc");
        //순서 보장
        System.out.println(arrayList);

        //중복 데이터 허용
        arrayList2.add("aaa");
        System.out.println(arrayList2);

        //데이터 단건 조화
        String str1 = arrayList2.get(0);
        System.out.println(str1);

        //데이터 삭제
        arrayList2.remove(0);
        System.out.println(arrayList2);

        //Hashset 사용 방법
        HashSet<String> hashSet = new HashSet<>();

        //데이터 추가
        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add("ccc");
        //순서 보장 안함
        System.out.println(hashSet);

        //get()활용 불가
//        hashSet.get();
        //중복 데이터 불가
        hashSet.add("aaa");
        System.out.println(hashSet);
        //데이터 제거
        hashSet.remove("bbb");
        System.out.println(hashSet);

        //HashMap 사용법
        //<키, 값> -> 저장
        HashMap<String,Integer> map = new HashMap<>();

        //데이터 추가
        map.put("aaa",1);
        map.put("bbb",2);
        map.put("ccc",3);

        //순서 보장 안됨
        System.out.println(map);

        //키 중복 불가(기존 키 값에 덮어 씌움)
        map.put("aaa",5);
        System.out.println(map);

        //단건 조회
        Integer mapNum = map.get("aaa");
        System.out.println("aaa = " + mapNum);

        //삭제
        map.remove("aaa");
        System.out.println(map);

        //키 확인
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        //값 확인
        Collection<Integer> values = map.values();
        System.out.println(values);
    }
}
