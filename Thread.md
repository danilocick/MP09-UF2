#Thread
##implements Runnable
[Class Thread](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Thread.html)

Un *thread* es un fil d'una execució en un programa.
Cada thread consta d'una prioritat i així gestionar
diferents fils per a l'optimització del temps.

Existeixen dues maneres un nou fil (thread),
la primera crear una subclasse del thread, 
que menciiona el mètode *run* the la classe thread.

```
class PrimeThread extends Thread {
         long minPrime;
         PrimeThread(long minPrime) {
             this.minPrime = minPrime;
         }

         public void run() {
             // compute primes larger than minPrime
              . . .
         }
     }
```
Posar-ho en marxa:
```
 PrimeThread p = new PrimeThread(143);
 p.start();
```
L'altre manera de crear un fil (thread) es declarar 
una classe que implementa la interficie *Runnable*,
passant com a "arg" quan creem un nou fil:
```
class PrimeRun implements Runnable {
     long minPrime;
     PrimeRun(long minPrime) {
         this.minPrime = minPrime;
     }

     public void run() {
         // compute primes larger than minPrime
          . . .
     }
 }
```
Posar-ho en marxa:
```
PrimeRun p = new PrimeRun(143);
new Thread(p).start();
```
