import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {
    static ArrayList<String> tareas = new ArrayList<>();

    public static void main(String[] args) {
        registrarTarea();
    }

    public static void registrarTarea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la descripcion de la nueva tarea:");
        String descripcion = scanner.nextLine();

        tareas.add(descripcion + " - [Pendiente]");
        System.out.println("Tarea registrada correctamente");
    }
}
