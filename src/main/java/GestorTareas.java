import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    static ArrayList<String> tareas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("\n--- GESTOR DE TAREAS ---");
            System.out.println("1. Registrar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    registrarTarea();
                    break;
                case 2:
                    listarTareas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    public static void registrarTarea() {
        System.out.println("Escribe la descripcion de la nueva tarea:");
        String descripcion = scanner.nextLine();

        tareas.add(descripcion + " - [Pendiente]");
        System.out.println("Tarea registrada correctamente.");
    }

    public static void listarTareas() {
        System.out.println("\n=== Lista de Tareas ===");
        if (tareas.isEmpty()) {
            System.out.println("Aún no hay tareas registradas.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Qué número de tarea terminaste?");
        int numeroTarea = scanner.nextInt();


        if (numeroTarea > 0 && numeroTarea <= GestorTareas.tareas.size()) {
            int indice = numeroTarea - 1;
            String tareaActual = GestorTareas.tareas.get(indice);
            String tareaActualizada = tareaActual.replace("[Pendiente]", "[Completada]");
            GestorTareas.tareas.set(indice, tareaActualizada);
            System.out.println("Tarea marcada como completada");
        } else {
            System.out.println("Ese número de tarea no existe.");
        }
    }

}