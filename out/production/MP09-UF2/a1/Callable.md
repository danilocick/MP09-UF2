#ThreadPoolExecutor
##CALLABLE
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
ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
```
Això significa que si hi ha més de 3 tasques per executar, únicament n’enviarà 3 a executar
i la resta es quedaran bloquejades fins que un fil acabi el seu processament.

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

*Ojectes Future*: es generen com a conseqüència d’executar el mètode call de
les instàncies Callable. Per cada Callable invocada es genera un objecte 
Future que romandrà bloquejat fins que la instància Callable associada finalitzi.
```
List <Future<Integer>> llistaResultats;
llistaResultats = executor.invokeAll(llistaTasques);
```
*shutdown*: impideix executar noves tasques però deixa que els fils(Thread)
en execució acabin.
