package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random rand = new Random();

        int num;


            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    num = rand.nextInt(3) + 1;
                    arr[i] = num;
                } else {
                    while (true) {
                        num = rand.nextInt(3) + 1;
                        if (arr[i - 1] != num) {
                            arr[i] = num;
                            break;
                        }
                    }

                }
            }


        System.out.println(Arrays.toString(arr));
    }
}
