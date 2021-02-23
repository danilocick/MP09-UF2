#Monitors

>és un algoritme que fa una abstracció de dades que ens permet 
representar de forma abstracta un recurs compartit mitjançant 
un conjunt de variables que defineixen el seu estat. L’accés 
a aquestes variables únicament és possible des d’uns mètodes del monitor.

Els monitor ha de poder incorporar un mecanisme de sincronització anomenades **variables de condició**:
 - **sendWait**: un procés que està esperant a un esdeveniment indicat per una variable de condició abandona 
 de forma temporal el monitor i es posa a la cua que correspon a la seva variable de condició.
 - **sendSignal**: desbloqueja un procés de la cua de processos bloquejats amb la variable de 
 condició indicada i es posa en estat preparat per entrar al monitor.
 
Un monitor consta de 4 elements:
 - **Variables o mètodes permanents o privats**: variables i mètodes interns al monitor que només són 
 accessibles des de dins del monitor. No es modifiquen entre dues crides consecutives al monitor.
 - **Codi d’inicialitzacio**: inicialitza les variables permanents, s’executa quan el monitor és creat.
 - **Mètodes externs o exportats**: són mètodes que són accessibles des de fora del monitor
 pels processos que volen entrar a fer-ne ús.
 - **Cua de processos**: és la cua de processos bloquejats a l’espera del 
 senyal que els alliberi per tornar a entrar al monitor.
 
un monitor és un objecte en el qual tots els seus mètodes estan implementats sota exclusió mútua(*synchronized*).
>wait, notify i notifyAll, són operacions que permeten sincronitzar el monitor.