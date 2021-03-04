package PreExamen;

public class Main {
    public static void main(String[] args) {

        Bany bany = new Bany();

        Persona p0 = new Persona(   "Dani", 'H', bany);
        Persona p1 = new Persona(   "Oscar", 'H', bany);
        Persona p2 = new Persona(   "Irene", 'M', bany);
        Persona p3 = new Persona(   "Maria", 'M', bany);
        Persona p4 = new Persona(   "Carlos", 'H', bany);
        Persona p5 = new Persona(   "Marcos", 'H', bany);
        Persona p6 = new Persona(   "Magdalena", 'M', bany);
        Persona p7 = new Persona(   "Antonia", 'M', bany);
        Persona p8 = new Persona(   "Didac", 'H', bany);
        Persona p9 = new Persona(   "Jorge", 'H', bany);
        Persona p10 = new Persona(   "Antonieta", 'M', bany);
        Persona p11 = new Persona(   "Jorgina", 'M', bany);


        p0.start();
        p10.start();
        p11.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
    }
}
