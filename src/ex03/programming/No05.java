package ex03.programming;

public class No05 {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2;

        for (int i = 0; i < 6; i++) {
            dice1++;
            dice2 = 0;
            for (int j = 0; j < 6; j++) {
                dice2++;
                if( dice1 + dice2 == 6){
                    System.out.print("(" + dice1 + ", " + dice2 + ")");
                }
            }
//            System.out.print(" ");
        }
    }
}
