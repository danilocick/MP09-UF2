package a3.Filosofs;

public class Cobert {
    private boolean lliure;

    public Cobert() {
        lliure = true;
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
}
