package ex03;

public class BubbleEx01 {

    static void Bubble(int[] arr){
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
            // 출력하는 코드
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        Bubble(arr);

        int[] arr2 = {65, 28, 42, 34, 13, 45, 23, 12, 34, 56};
        Bubble(arr2);
    }
}