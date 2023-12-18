package ex03.programming;

import java.util.Scanner;

public class No02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자를 입력하세요: ");
        char s = sc.next().charAt(0);
        System.out.print("피연산자 2개를 입력하세요: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (s == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        }else if (s == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (s == '*') {
            System.out.println(x + " * " + y + " = " + (x * y));
        } else if (s == '/') {
            if (y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            }else {
                System.out.println(x + " / " + y + " = " + (x / y));
            }
        }
    }
}
