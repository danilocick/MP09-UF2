package a3.SemaforsExemple;

public class Caixer {
//    Si per una banda estem traient diners del compte corrent i per una altra banda algú està fent un ingrés,
//    es podria crear una situació anòmala. Hi haurà dos processos concurrents, un traurà diners i l’altre n’ingressarà.
//    Si accedeixen al mateix temps a llegirSaldo() els dos agafen el mateix valor, imaginem 100€. El procés que vol
//    ingressar diners, ho vol fer amb la quantitat de 300€. I el que vol treure’n, en vol 30€.

//    Per evitar el problema podem utilitzar un semàfor. L’iniciarem a 1, indicant el número de processos que
//    podran entrar a la secció crítica. I tant en el procés de treure dines com en el d’ingressar-ne afegirem
//    un sendWait() a l’inici de les seccions crítiques i un sendSignal() al final.

     private float saldo;
     private boolean semafor;

     public static void main(String[] args) {

     }

     public void ingressar(float diners) {
        sendWait();
        float aux;
        aux=llegirSaldo();
        aux=aux+diners;
        saldo=aux;
        guardarSaldo(saldo);
        sendSignal();
     }

     public void treure(float diners) {
        sendWait();
        float aux;
        aux=llegirSaldo();
        aux=aux-diners;
        saldo=aux;
        guardarSaldo(saldo);
        sendSignal();
     }

     private void guardarSaldo(float saldo) {
        this.saldo=saldo;
     }

     private float llegirSaldo() {
        return saldo;

     }

     private void sendWait() {
     }
     private void sendSignal() {
     }

}
