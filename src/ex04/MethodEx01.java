package ex04;

public class MethodEx01 {
    static void m1() {
        System.out.println("m1");
    }

    static String m2() { // 실행시에 내부가 열린다.
        System.out.println("m2");
        return "m2"; // 메서드 종료
    }

    public static void main(String[] args) {
        m1();
        String result = m2(); // 실행이 끝나면 "m2"로 반환된다.
        System.out.println("result: " + result);
    }
}
