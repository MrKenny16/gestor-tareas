package org.example;

import java.util.Scanner;

public class completarTarea {

    public static void completarTarea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Qué número de tarea terminaste?");
        int numeroTarea = scanner.nextInt();

        // Validamos que el usuario escriba un número válido
        if (numeroTarea > 0 && numeroTarea <= GestorTareas.tareas.size()) {
            // Restamos 1 porque el usuario ve "1", pero en la lista es el índice "0"
            int indice = numeroTarea - 1;

            // Obtenemos el texto actual de la tarea
            String tareaActual = GestorTareas.tareas.get(indice);

            // Cambiamos la palabra Pendiente por Completada
            String tareaActualizada = tareaActual.replace("[Pendiente]", "[Completada]");

            // Guardamos la tarea actualizada en la misma posición
            GestorTareas.tareas.set(indice, tareaActualizada);

            System.out.println("Tarea marcada como completada");
        } else {
            System.out.println("Ese número de tarea no existe.");
        }
    }
}