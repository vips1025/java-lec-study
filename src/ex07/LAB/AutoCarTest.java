package ex07.LAB;

public class AutoCarTest {
    public static void main(String[] args) {
        OperateCar car = new AutoCar();
        car.start();
        car.setSpeed(30);
        car.turn(15);
        car.stop();
    }
}
