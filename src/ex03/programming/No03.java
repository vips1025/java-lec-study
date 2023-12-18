package ex03.programming;

public class No03 {
    public static void main(String[] args) {
        int[] number = new int[50];

        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
            boolean flag = number[i] % 10 == 3 || number[i] % 10 == 6 || number[i] % 10 == 9;
            if (flag) {
                System.out.print("짝 ");
            }
            if (number[i] / 10 == 3) {
                System.out.print("짝 ");
            }else if (!flag){
                System.out.print(number[i] + " ");
            }
        }
    }
}
