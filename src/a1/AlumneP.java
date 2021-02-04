package a1;

import java.util.concurrent.Callable;

public class AlumneP implements Callable<Integer> {
    // implements callable:
    // En la mayor parte de las ocasiones necesitamos
    // que se ejecute una tarea en paralelo y luego en el
    // futuro nos devuelva un resultado. ¿Cómo podemos hacer esto?
    // Java provee para estas situaciones  del interface Callable
    //
    //  Este interface dispone del método call que es capaz de
    //  devolvernos un resultado algo que el método run no permite.
    //          public void run();
    //
    //          public T  call();

    // El interface Runnable solamente declara una función miembro denominada run, que han de definir las clases que implementen este interface.
    //
    // public interface Runnable {
    //    public abstract void run();
    // }


    private String Nom;

    public AlumneP(String nom) {
        Nom = nom;
    }

    public int Examinar() {
        //Temps que triga a fer l'examen
        try {
            Thread.sleep((long) (Math.random()*2000)+1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Nota de l'examen
        int nota = (int) (Math.random()*10);
        return nota;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    @Override
    public Integer call() throws Exception {
        return Examinar();
    }

}
