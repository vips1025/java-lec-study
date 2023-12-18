package ex03;

public class TheaterSeats {
    public static void main(String[] args) {
        // 배열은 구조 변경 불가능
        int[][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 0, 1, 1, 1, 0}
        };

        int sum = 0;
        int count = 0;
        for (int row = 0; row < seats.length; row++) {
            count = 0;
            for (int i = 0; i < seats[row].length; i++) {
                count = count + seats[row][i];
            }
            System.out.println(row + "번째 행의 관객 수는 " + count);
            sum = sum + count;
        }
        System.out.println("현재 관객 수는 " + count + "명 입니다.");

//        int count = 0;
//        for (int i = 0; i < seats.length; i++) {
//            for (int j = 0; j < seats[i].length; j++) {
//                count += seats[i][j];
//            }
//        }
//        System.out.println("현재 관객 수는 " + count + "명 입니다.");
    }
}

