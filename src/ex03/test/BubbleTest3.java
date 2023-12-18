package ex03.test;

public class BubbleTest3 {
    public static void main(String[] args) {
        int[] arr = {4, 3};
        final int N = arr.length;

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
