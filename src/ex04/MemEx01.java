package ex04;

/**
 * [static]
 * JVM 이 시작할때 static 공간을 따로 만들고 static 부터 찾고 각 해당공간(class)에 담는다.
 * 메인이 실행되기 전에 메모리 공간에 뜬다.
 * 생명주기가 가장 길다.
 * 정적할당이다.
 *
 * 정적과 동적을 나눈 이유는 메모리를 효율적으로 관리하기 위함이다.
 */
class Person1{
    static int age = 20;
    static char gender = '여';
}

public class MemEx01 {
    public static void main(String[] args) {
        System.out.println(Person1.age);
        System.out.println(Person1.gender);
    }
}
