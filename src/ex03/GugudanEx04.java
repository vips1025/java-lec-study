package ex03;

class GugudanUtil{
    static void gugudan(int x){
        for (int i = 1; i <= 9; i++)
            System.out.println(x + " * " + i + " = " + (x * i));
        System.out.println();
    }
}

public class GugudanEx04 {
    //1~9단까지 출력되는 프로그램을 만드세요
    // 스캐너를 이용하여 입락받은 단만 출력하시오.
    public static void main(String[] args) {
        GugudanUtil.gugudan(10);
    }
}
