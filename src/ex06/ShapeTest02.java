package ex06;

class Shape02 {
    public void draw() {
        System.out.println("Shape 중의 하나를 그릴 예정입니다.");
    }
}

class Circle02 extends Shape02 {
    public void draw() {
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}

public class ShapeTest02 {
    public static void main(String[] args) {
        Circle02 s = new Circle02();
        s.draw();
    }
}
