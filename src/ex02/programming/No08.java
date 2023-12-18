package ex02.programming;

import java.util.Scanner;

public class No08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구의 반지름: ");
        double radius = sc.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("구의 부피: " + volume);
    }
}
