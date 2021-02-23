#Semàfors

Els semàfors són una tècnica de sincronització de 
memòria compartida que impedeix l’entrada del procés 
a la secció crítica tot bloquejant-lo.

Els semàfors, no només controlen l’accés a la 
secció crítica sinó que a més disposen d’informació 
complementària per poder decidir si cal o no bloquejar 
l’accés d’aquells processos que ho sol·licitin.

Es detingeixen 3 tipus de semàfors:
 - *Initial*: permet posar en marxa el semàfor. Es pot donar com a paràmeter si comença
   bloquejat(vermell) o alliberat(verd).
 - *sendSignal* **allibera**: Canvia el valor del semàfor a alliberat(Verd). Si hi ha 
   processos en espera els activa.
 - *sendWait* **bloqueja**: indica que el procès actual vol executar la secció critica. Si
el process es troba bloquejat, s'atura l'execució del procés. També pot indicar 
   que el semàfor s'ha de posar en vermell.