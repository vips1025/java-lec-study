package ex06;

class Animal01 {
    public static void A(){
        System.out.println("static method in Animal01");
    }
}

public class Dog01 extends Animal01 {
    public static void A(){
        System.out.println("static method in Dog01");
    }

    public static void main(String[] args) {
        Dog01 d01 = new Dog01();
        Animal01 a = d01;
        a.A();
        d01.A();
    }
}
