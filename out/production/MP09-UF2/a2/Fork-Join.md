#Fork-Join 
##Class ForkJoinPool 
Es una evolució als patrons de Executor. Processa les tasques amb l’algoritme per robatori (work-stealing).
 Això vol dir que el gestor del pool busca fils poc actius i hi intercanvia tasques en espera.

Les tasques poden crear noves tasques que s’incorporaran a la cua de tasques pendents per a ser
 executades. L’eficiència aconseguida és força alta, ja que s’aprofita al màxim el processament
  paral·lel. Per aquest motiu Fork_Join és una alternativa ideal per algoritmes que puguin 
  resoldre’s de forma recursiva ja que s’aconseguirà la màxima eficiència.

##Class ForkJoinTask

Aquesta classe està implementada per dues calsses:

RecursiveTask(): Ideal per a tasques que necessiten calcular i retornar un valor.
RecursiveAction(): Representa procediments que no necessiten un return.

Els mètodes que utilitza aquesta classe son:

- Fork(): situa la tasca invocada a la cua d’execucions en qualsevol moment per tal que sigui 
planificada. Això permet que a una tasca crear-ne de noves i deixar-les a punt per ser 
executades quan el gestor ho consideri.
- Join(): aturarà l’execució del fil invocador a l’espera que la tasca invocada finalitzi
 l’execució i retorni si fos el cas els resultats.

***Quan fem servir RecursiveAction resulta molt pràctic fer servir el mètode invokeAll, 
en comptes de cridar, per cada tasca generada els mètodes fork i join. Concretament 
el mètode invokeAll fa un invocació de fork per cada una de les tasques rebudes com 
a paràmetre i seguidament s’espera a la finalització de cada fil amb una crida al mètode
 join de les tasques engegades. invokeAll no retorna cap resultat, per tant no resulta gaire 
 útil d’utilitzar amb objectes de tipus RecursiveTask.***