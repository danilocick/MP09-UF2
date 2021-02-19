package a3.Filosofs;

public class Cobert {
    private boolean lliure;
    private String nom;

    public Cobert(String nom) {
        lliure = true;
        this.nom = nom;
    }
    public synchronized void Agafa() {
        try {
            while(!lliure) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lliure = false;
        notifyAll();
    }

    public synchronized void Deixa() {
        lliure = true;
        notifyAll();
    }

    public synchronized String getNom() {
        return nom;
    }
}
