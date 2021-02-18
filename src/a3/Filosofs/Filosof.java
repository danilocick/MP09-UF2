package a3.Filosofs;

public class Filosof extends Thread {
    Cobert cobert1;
    Cobert cobert2;

    public Filosof(String nom, Cobert cobert1, Cobert cobert2) {
        super(nom);
        this.cobert1 = cobert1;
        this.cobert2 = cobert2;
    }

    @Override
    public void run() {
        for(;;) {
            //Agafa el comandament
            cobert1.Agafa();
            cobert2.Agafa();
            System.out.println("tinc els coberts: "+cobert1+" i "+cobert2);

            //Menja
            try {
                Thread.sleep((long) (Math.random()*800)+200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Deixa el comandament
            cobert1.Deixa();
            cobert2.Deixa();
            //Descansa de tanta tele
            try {
                System.out.println("Ja he acabat");
                Thread.sleep((long) (Math.random()*1000)+500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
