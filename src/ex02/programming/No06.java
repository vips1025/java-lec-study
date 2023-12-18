package ex02.programming;

import java.util.Scanner;

public class No06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("드라이브 이름: ");
        String s1 = sc.nextLine();
        System.out.print("디렉터리 이름: ");
        String s2 = sc.nextLine();
        System.out.print("파일 이름: ");
        String s3 = sc.nextLine();
        System.out.print("확장자: ");
        String s4 = sc.nextLine();
        System.out.println(s1 + ":" + s2 + s3 + "." + s4);
    }
}
