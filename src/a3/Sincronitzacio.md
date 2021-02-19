#Sincronització

Tipus de processos:

Independent: no necessita ajuda ni cooperació d’altres processos.
Cooperant: dissenyats per treballar conjuntament amb altres processos.
El procés de sincronització permet que els processos que s’executen de 
forma simultània es coordinin, aturant l’execució d’aquells que vagin més avançats 
fins que es compleixin les condicions òptimes per estar segurs que els resultats 
finals seran correctes.

###Mètodes de sincronització

- Sincronisme condicional: Un procés o fil es troba en estat d’execució i passa a estat de 
bloqueig tot esperant que una certa condició es compleixi per continuar la seva execució.

- Exclusió mútua: es produeix quan dos o més processos o fils volen accedir a un recurs compartit.
S’han d’establir protocols d’execució perquè no accedeixin de forma concurrent al recurs.

- Comunicació per missatges: ls processos s’intercanvien missatges per comunicar-se i sincronitzar-se.
És la comunicació típica en sistemes distribuïts i és utiltzada també en sistemes no distribuïts.

De cara a evitar errors de sincronització existeixen:
[semafors](src/a3/Semàfors.md) o [monitors](src/a3/Monitors.md)
