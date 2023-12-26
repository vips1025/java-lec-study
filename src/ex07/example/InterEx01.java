package ex07.example;

interface Remocon {
    void on();
    void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}

class LGRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("LG 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("LG 리모컨 off");
    }
}

/**
 * 작성자 : 홍길동
 * 날짜 : 2023. 12. 26.
 * 구현체 : SamsungRemocon, LGRemocon
 */
class CommonRemocon {
    private Remocon remocon;

    public CommonRemocon(Remocon remocon) {
        this.remocon = remocon;
    }

    public void on() {
        remocon.on();
    }

    public void off() {
        remocon.off();
    }
}

class JoohoRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("주호 리모콘 on");
    }

    @Override
    public void off() {
        System.out.println("주호 리모콘 off");
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        CommonRemocon remocon = new CommonRemocon(new SamsungRemocon());
        remocon.on();
        remocon.off();
    }
}
