package Unidad3.src.Actividadesdeclase.Actividad6;

import java.io.File;
import java.util.Scanner;

public class Jugadores {
    public static void main(String[] args) {
        int partidas1 = 0;
        int partidas2 = 0;

        try {
            Scanner sc = new Scanner(new File("C:\\Users\\MSI\\Desktop\\ProgramacionDAW-main\\Unidad3\\src\\Actividadesdeclase\\Actividad6\\Datos.txt"));

            while (sc.hasNextLine()) {
                Scanner scLinea = new Scanner(sc.nextLine());
                scLinea.useDelimiter("[=,\\s]+");

                while (scLinea.hasNext()) {
                    String jugador = scLinea.next();
                    int partidas = scLinea.nextInt();

                    if (jugador.equalsIgnoreCase("jugador1")) {
                        partidas1 = partidas;
                    } else if (jugador.equalsIgnoreCase("jugador2")) {
                        partidas2 = partidas;
                    }
                }
                scLinea.close();
            }
            sc.close();

            System.out.println(partidas1 + "-" + partidas2);

        } catch (Exception e) {
            System.out.println("No se encuentra el fichero.");
        }
    }
}