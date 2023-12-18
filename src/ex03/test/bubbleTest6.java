package ex03.test;

public class bubbleTest6 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;

        for (int i = 0; i < N - 1; i++) {
            System.out.print(i + 1 + "번째: ");
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
