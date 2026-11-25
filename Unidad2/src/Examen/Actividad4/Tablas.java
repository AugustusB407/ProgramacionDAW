package Examen.Actividad4;

import java.util.Scanner;

public class Tablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedir al usuario que elija una opcion
        System.out.print("Elige una opcion (1=true o 2=false): ");
         // Guardamos el numero
        int opcion = sc.nextInt();
        //Llamar a la funcion segun lo que hayas elegido
        if (opcion == 1) {
            imprimeTablero(true);  // Muestra 4 en raya
        } else if (opcion == 2) {
            imprimeTablero(false); // Muestra 3 en raya
        } else {
            System.out.println("Opción no válida. Debes elegir 1 o 2.");
        }
    }

    public static void imprimeTablero(boolean valor) {

    if (valor) {
        // Salida para el juego 4 en raya(True)
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("|   |   | X |   |   |   |   |");
        System.out.println("|   |   | O | X |   |   |   |");
        System.out.println("|   | X | O | O |   |   |   |");
        System.out.println("| X | O | X | O | X |   |   |");
        System.out.println("-----------------------------");
        System.out.println("  0   1   2   3   4   5   6  ");
    } else {
        // Salida para el juego 3 en raya (False)
        System.out.println("| X | O | X |");
        System.out.println("-------------");
        System.out.println("|   | O |   |");
        System.out.println("-------------");
        System.out.println("|   | X |   |");
        System.out.println("-------------");
        System.out.println("  0   1   2  ");
    }


}
}
