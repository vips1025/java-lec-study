package ex02.test;

import java.util.Scanner;

public class FtoC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨(미국F)온도를 입력하시오 : ");

        // 1. 화씨 온도 받기
        double temp = sc.nextDouble();

        // 2. 화씨 -> 섭씨 온도 변환
        double result = 5.0 / 9.0 * (temp - 32);
        System.out.println(result);
    }
}
