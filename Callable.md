#CALLABLE
Retorna el valor de la funció ***call()*** quan aquest es cridat per un thread.
```
static class Multiplicacio implements Callable<Integer> {
    private int operador1;
    private int operador2;
    
    public Multiplicacio(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
    @Override
    public Integer call() throws Exception {
        return operador1 * operador2;
    }
}
```
Inicialitzador:
```
ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors

.newFixedThreadPool(3);
```
Executador:
```
List <Future<Integer>> llistaResultats;
llistaResultats = executor.invokeAll(llistaTasques);
executor.shutdown();
```

*invokeAll()*: Aquest rep una col·lecció de tasques de tipus Callable, 
les executa i en retorna el resultat dins d’un objecte Future.

*invokeAny(tasques)*: que rep una col·lecció d’instàncies de Callable
que anirà executant fins que una d’elles finalitzi sense error. 
En aquest moment retornarà el resultat obtingut per la tasca 
finalitzada en un objecte Future.

#RUNNABLE
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
Executador:
El cargol treubanya, avança 2 cops en un 1 segon.
```
schExService.scheduleWithFixedDelay(treubanya, 2, 1, TimeUnit.SECONDS);
schExService.shutdownNow();
```