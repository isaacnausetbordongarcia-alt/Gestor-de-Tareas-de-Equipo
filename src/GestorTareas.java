import java.util.ArrayList;

public class GestorTareas {

    ArrayList<Tarea> listaTareas = new ArrayList<>();

    /**
     * Este el el método definitivo para leer ArrayList de Listas de Tareas, cuya misión principal es leer el contenido de la lista de tareas.
     */

    void mostrarTareas(){
        for (Tarea p : listaTareas) {
            System.out.println("Nombre de la Tarea: " + p.getNombre() + ", estado " + p.isCompletada());
        }
    }

}
