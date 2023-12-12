package ex01;

public class VarEx01 {

    // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        int n1 = 1; // 약 21억까지 (4Byte)
        double d1 = 1.5; // 약 21억까지 (8Byte)
        long big1 = 20000000000L; // 경까지 (8Byte)
        boolean b1 = false; // true, false
        char c1 = '가'; // 문자 하나 저장
        String s1 = "가나다"; // 문자열 저장

        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(s1);
    } // java 프로그램 종료
    // 자바 프로그램 생명주기
}
