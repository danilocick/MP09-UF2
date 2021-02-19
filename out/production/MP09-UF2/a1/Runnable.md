#ScheduledThreadPoolExecutor
##RUNNABLE
Executa una funció ***run()*** quan aquest es cridat per un thread pero NO retorna res.
```
public class Cargol implements Runnable {
    private String Nom;
    private int metres;

    public Cargol(String nom) {
        Nom = nom;
    }

    public void addMetres(int m) {
        metres += m;
    }

    public String getNom() {
        return Nom;
    }

    public int getMetres() {
        return metres;
    }

    @Override
    public void run() {
        int sprint = (int) Math.floor(Math.random()*50);
        addMetres(sprint);
        System.out.println(Nom + ": he fet " + sprint +" metres");


    }
}
```
Inicialitzador:

```
ScheduledExecutorService schExService = Executors.newScheduledThreadPool(3);
```
*newScheduledThreadPool(2)*: crea dos fils.

*scheduleWithFixedDelay*: per programar i executar 
l'inici de la tasca i programar les tasques 
succesives després de la primera tasca complerta.

Executador:
El cargol treubanya, comença als 2 segons i quan aquesta acabaho fa cada segon.
```
schExService.scheduleWithFixedDelay(treubanya, 2, 1, TimeUnit.SECONDS);
schExService.shutdownNow();
```