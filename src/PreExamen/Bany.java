package PreExamen;

public class Bany {
    private char genere;
    private int capacitat;

    public Bany() {
        capacitat = 0;
    }

    public synchronized void entra(char sexe) {
        if (getCapacitat() == 0){
            setGenere(sexe);
        }

        try {
            while(sexe != getGenere() && getCapacitat() !=0) wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        capacitat++;
        notifyAll();
    }

    public synchronized void surt() {
        capacitat--;
        System.out.println(getCapacitat());
        notifyAll();
    }

    public synchronized void setGenere(char genere) {
        this.genere = genere;
    }
    public synchronized char getGenere() {
        return genere;
    }

    public synchronized int getCapacitat() {
        return capacitat;
    }

    public synchronized void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }
}
