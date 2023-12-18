package ex03;

import java.util.Scanner;

public class TheGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.println(number);

        int guess = 0;
        int count = 0;
        while (guess!= number) {
            System.out.print("정답을 추측하여 보시오: ");
            guess = sc.nextInt();
            if (guess < number) {
                System.out.println("제시한 정수가 낮습니다.");
            } else if (guess > number) {
                System.out.println("제시한 정수가 높습니다.");
            }
            count++;
        }
        System.out.println("축하합니다. 시도횟수=" + count);
    }
}
