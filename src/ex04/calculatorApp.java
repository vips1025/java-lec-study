package ex04;

public class calculatorApp {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int result = cal.add(50, 80);
        System.out.println("add : " + result);
        int result2 = cal.sub(50, 80);
        System.out.println("sub : " + result2);
        int result3 = cal.mul(50, 80);
        System.out.println("mul : " + result3);
        int result4 = cal.div(50, 80);
        System.out.println("div : " + result4);
    }
}