#Fork-Join
##ForkJoinPool
El marc Fork-Join és una evolució dels patrons Executor. 
De fet aquí trobem també un gestor de fils (la classe
ForkJoinPool), però una mica més sofisticat. Processa
les tasques amb l’algoritme per robatori
(work-stealing). Això vol dir que el gestor del pool
busca fils poc actius i hi intercanvia tasques en espera.
A més les tasques poden crear noves tasques que 
s’incorporaran a la cua de tasques pendents per a
Programació de serveis i processos 30 Processos i 
fils ser executades.

*Ideal per a treballar amb recursivitat*

La classe *ForkJoinTask* és una classe abstracta per 
les tasques que s’executen a ForkJoinPool i 
conté els mètodes fork i join.

*fork()*: situa la tasca invocada a la cua d’execucions
en qualsevol moment per tal que sigui planificada.
Això permet que a una tasca crear-ne de noves i 
deixar-les a punt per ser executades quan el gestor ho consideri.

*join()*: aturarà l’execució del fil invocador a 
l’espera que la tasca invocada finalitzi l’execució i
retorni si fos el cas els resultats. El bloqueig del 
fil posarà en alerta el gestor ForkJoinPool que podrà 
intercanviar la tasca aturada per una altra 
que resti en espera.

- FORKJOIN CLASS:
  - RecursiveTask: s'utilitza per tasques que necessiten calcular i retornar un valor
  - RecursiveAction: s'utilitza per representar procediments o accions sense un retorn de resultat.



