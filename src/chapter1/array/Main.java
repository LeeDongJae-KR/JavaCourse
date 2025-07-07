package chapter1.array;

public class Main {
    public static void main(String[] args) {

        //모험가 명단을 관리하는 법
        String name1 = "gygim";
        String name2 = "Steve";

        String[] adventureList = {"gygim", "Steve"};

        //1. 배열 선언
        int[] arr;

        //2. 배열 길이 할당
        arr = new int[5];

        //3. 배열 선언과 길이 동시에 할당
        int[] arr1 = new int[5];

        //4. 배열 선언과 동시에 배열의 요소 할당
        int[] arr2 = {10, 20, 30, 40, 50};

        //5. 배열의 길이
        int arrLength = arr.length;
        System.out.println("arrLength: " + arrLength);

        //문자열 배열 선언
        String[] strArr = new String[5];

        //논리형 배열 선언
        boolean[] boolArr = new boolean[5];

        //배열의 요소에 접근: 인덱스 활용 방법

        int[] arr3 = {10, 20, 30, 40, 50};

        for (int i = 0; i < 5; i++) {
            System.out.println("배열의 " + (i + 1) + " 번째 요소 접근 : " + arr3[i]);
        }

        arr3[0] = 100;
        arr3[1] = 200;
        arr3[2] = 300;
        arr3[3] = 400;
        arr3[4] = 500;

        for (int i = 0; i < 5; i++) {
            System.out.println("배열의 " + (i + 1) + " 번째 요소 접근 : " + arr3[i]);
        }

        // 배열 탐색

        for (int i = 0; i < arr.length; i++) {
            System.out.println("인덱스" + i + ",값 : " + arr3[i]);
        }

        // 향상된 for 문

        for (int a : arr3) {
            System.out.println("배열의 각 요소 = " + a);
        }

        // 2차원 배열

        boolean[][] board = {
                {true, false},
                {false, true}
        };
        System.out.println(board[0][0]);
        System.out.println(board[0][1]);
    }
}
