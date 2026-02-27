import java.util.ArrayList;

public class GestorTareas {

    private ArrayList<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public void anadirTarea(String descripcion, boolean finalizado) {
        Tarea nuevaTarea = new Tarea(descripcion,finalizado);
        tareas.add(nuevaTarea);
        System.out.println("Tarea añadida correctamente.");
    }
}
