package a3.Filosofs;

public class MainFilosofs {
    public static void main(String[] args) {
        Cobert c0 = new Cobert("0");
        Cobert c1 = new Cobert("1");
        Cobert c2 = new Cobert("2");
        Cobert c3 = new Cobert("3");

        Filosof f0 = new Filosof("Arisotil", c3, c0);
        Filosof f1 = new Filosof("René", c0, c1);
        Filosof f2 = new Filosof("Plató", c1, c2);
        Filosof f3 = new Filosof("Kant", c2, c3);

        f0.start();
        f1.start();
        f2.start();
        f3.start();
    }
}
