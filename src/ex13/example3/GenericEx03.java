package ex13.example3;

class Dog {
    String name;
    int age;

    public void speak() {
        System.out.println("멍멍");
    }
}

class Cat {
    String name;
    int age;

    public void speak() {
        System.out.println("야옹");
    }
}

public class GenericEx03 {
    public static void main(String[] args) {
        Object[] arr = new Object[2];
        arr[0] = new Dog();
        arr[1] = new Cat();
    }
}
