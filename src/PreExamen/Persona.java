package PreExamen;

public class Persona extends Thread {
    private String nom;
    private char sexe;
    private Bany bany;

    public Persona(String dani, char h, Bany bany) {
        nom = dani;
        sexe = h;
        this.bany = bany;
    }

    @Override
    public void run() {
        for(;;) {
            //Entra al lavabo
            //Entra
            bany.entra(sexe);
            System.out.println(getNom() + ": està al lavabo");

            try {
                Thread.sleep((long) (Math.random() * 2000) + 200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //Sortir del lavabo
            bany.surt();
            try {
                System.out.println(getNom() + ": ja ha acabat");
                Thread.sleep((long) (Math.random() * 18000) + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized String getNom() {
        return nom;
    }

}
