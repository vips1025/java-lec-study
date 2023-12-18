package ex02.programming;

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("물체의 무게를 입력하시오(킬로그램): ");
        int weight = sc.nextInt();
        System.out.print("물체의 속도를 입력하시오(미터/초): ");
        int speed = sc.nextInt();

        double energy = 0.5 * weight * speed * speed;
        System.out.println("물체는 " + energy + "(줄)의 에너지를 가지고 있다.");
    }
}
