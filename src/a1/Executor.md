#programació paral·lela
La idea és dividir un problema en problemes més petits i cadascun d’aquests subproblemes
enviar-los a executar per separat. Per tant, d’una tasca complicada en tenim
diverses de més simples. 
Per poder executar en paral·lel totes aquestes subtasques
i així augmentar el rendiment, es creen diferents subprocessos o fils, però aquesta
creació és totalment transparent pel programador, és la màquina virtual de Java
l’encarregada de gestionar la creació de fils per executar en paral·lel les subtasques.

***Executor*** és una millora sobre la creació de fils, ja que s’abstreu de la creació i la
gestió dels subprocessos, De fet només cal indicar la tasca o tasques a realitzar de
forma paral·lela (instant objectes de tipus ***Runnable*** o ***Callable***), escollir el gestor
adequat i deixar que aquest s’encarregui de tot.

Existeixen tres tipus de gestors, un de genèric (***ThreadPoolExecutor***), 
un capaç de seguir pautes temporals d’execució (***ScheduledThreadPoolExecutor***) i una darrer que per la seva especificitat i 
complexitat l’estudiarem a banda. És l’anomenat marc Fork-Join.

Callable: implementat amb ***ThreadPoolExecutor***
Runnable: implementat amb ***ScheduledThreadPoolExecutor***

Imaginem que volem saber la suma d’una
llista gran de nombres. Podem optar per sumar seqüencialment la llista o bé per
dividir-la en dos o tres trossos i sumar cada tros per separat.
Al final només
caldrà afegir el valor de cada tros al resultat. La suma de cada tros és totalment
independent i per tant pot realitzar-se amb independència de la resta.




