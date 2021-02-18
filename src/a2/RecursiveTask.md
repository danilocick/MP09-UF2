#Recursivitat 
##Algoritmes recursius 
##Algoritmes iteratius 
Es poden resoldre realitzant diverses vegades una mateixa operació però usant valors diferents.

Cada execució s’encarrega de realitzar un càlcul parcial fent servir les dades d’una o més 
execucions anteriors de la mateixa operació.

Per tal que el càlcul recursiu sigui factible és necessari que existeixi un 
solució trivial per algun dels valors a operar.
>L’algoritme que calcula el valor factorial d’un número és recursiu perquè podem dir que 
>el valor factorial d’un enter positiu és: n! = n* (n-1)! excepte quan n val 1 
>(el cas trivial) ja que sabem que 1! = 1.

```
long factoria(long n){
    if(n==1){
        return n;
    }else{
        return n*factorial(n-1);
    }
}
```

**Problema**: els algoritmes recursius consumeixen 
molta memòria i que en un processament seqüencial, 
poden resultar poc eficients si el seu càlcul requereix moltes crides recursives.

**Solució**: Per donar l’entitat idònia als càlculs i agilitzar l’eficiència, es combina 
el càlcul iteratiu amb el recursiu. És a dir, es defineix un llindar o condició a partir
de la qual seria preferible resoldre el problema iterativament.