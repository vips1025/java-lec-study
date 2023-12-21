package ex04;

class Cat{
    String name;

    Cat(){
//        this.name = "토비";
        this("토비"); // 나중에는 잘 안씀
    }

    Cat(String name){
        this.name = name;
    }
}

public class HeapEx01 {
    public static void main(String[] args) {

        Cat c = new Cat();
        System.out.println(c.name);
    }
}
