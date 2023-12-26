package ex06.example3;

public class StarApp {

    public static void gameStart(Zealot u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, Dark u2) {
        u1.attack();
        u2.attack();
    }



    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1");
        Zealot z2 = new Zealot("z2");
        Dragoon d1 = new Dragoon("d1");
        Dragoon d2 = new Dragoon("d2");
        River r1 = new River("r1");
        River r2 = new River("r2");
        Dark k1 = new Dark("k1");
        Dark k2 = new Dark("k2");

        gameStart(z1, z2);
        gameStart(z1, d1);
        gameStart(z1, r1);
        gameStart(z2, z1);
        gameStart(d1, z1);
        gameStart(d1, d2);
        gameStart(d1, r1);
        gameStart(d2, d1);
        gameStart(r1, z1);
        gameStart(r1, d1);
        gameStart(r1, r2);
        gameStart(r2, r1);
        gameStart(k1, z1);
        gameStart(k1, d1);
        gameStart(k1, r1);
        gameStart(k1, k2);
        gameStart(k2, k1);
    }
}
