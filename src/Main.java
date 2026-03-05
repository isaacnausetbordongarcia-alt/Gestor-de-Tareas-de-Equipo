import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir tarea");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    boolean finalizado = Boolean.parseBoolean(scanner.nextLine());
                    gestor.anadirTarea(descripcion, finalizado);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
