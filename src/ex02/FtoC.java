package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("==============================");
        System.out.println();
        System.out.print("번호를 선택하시오: ");
        int n1 = sc.nextInt();
        System.out.print(n1 == 2 ? "섭씨(C)온도를 입력하시오: " : "화씨(F)온도를 입력하시오: ");
        double n2 = sc.nextDouble();

        double c_temp = (double) 5 / 9 * (n2 - 32);
        double f_temp = ((double) 9 / 5) * n2 + 32;

        System.out.println(n1 == 2 ? "화씨(F)온도는 " + f_temp : "섭씨(C)온도는 " + c_temp);
    }
}
