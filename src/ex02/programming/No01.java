package ex02.programming;

import java.util.Scanner;

public class No01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("오렌지의 개수를 입력하시오: ");
        int orange = sc.nextInt();

        int n1 = orange / 10;
        int n2 = orange % 10;

        System.out.println(n1 + "박스가 필요하고 " + n2 + "개가 남았습니다.");
    }
}
