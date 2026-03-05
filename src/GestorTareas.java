import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> tareas;

    /**
     * Este el el método definitivo para leer ArrayList de Listas de Tareas, cuya misión principal es leer el contenido de la lista de tareas.
     */

    void mostrarTareas() {
        for (Tarea p : tareas) {
            System.out.println("Nombre de la Tarea: " + p.getNombre() + ", estado " + p.isCompletada());
        }
    }
    /**
     * Este el el método definitivo para crear ArraysList.
     */
    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    /**
     * Este el el método definitivo para añadir a la ArrayList de Listas de Tareas, cuya misión principal es añadir el contenido de la lista de tareas.
     */


    public void anadirTarea(String descripcion, boolean finalizado) {
        Tarea nuevaTarea = new Tarea(descripcion, finalizado);
        tareas.add(nuevaTarea);
        System.out.println("Tarea añadida correctamente.");
    }
}