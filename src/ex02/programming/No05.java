package ex02.programming;

import java.util.Scanner;

public class No05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간간격을 입력하시오(단위: 초): ");
        int n = sc.nextInt();
        int x = 340;

        System.out.println("번개가 발생한 곳까지의 거리: " + (n * x) + "m");
    }
}
