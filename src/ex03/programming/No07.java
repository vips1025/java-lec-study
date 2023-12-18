package ex03.programming;

public class No07 {
    public static void main(String[] args) {
        int k = 100;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}