package chapter1.loop;

public class GugudanAll {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            System.out.println("==="+ i + "단 ===");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
        }
    }
}
