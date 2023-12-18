package ex02.programming;

import java.util.Scanner;

public class No03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

        int maxValue = Math.max(x, y);
        int minValue = Math.min(x, y);

        System.out.println("두 수의 합: " + (x + y));
        System.out.println("두 수의 차: " + (x + y));
        System.out.println("두 수의 곱: " + (x + y));
        System.out.println("두 수의 평균: " + (x + y) / 2);
        System.out.println("큰 수: " + maxValue);
        System.out.println("작은 수: " + minValue);
    }
}
