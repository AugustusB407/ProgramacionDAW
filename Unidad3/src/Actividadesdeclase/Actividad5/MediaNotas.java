package Unidad3.src.Actividadesdeclase.Actividad5;

import java.io.File;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(new File("C:\\Users\\MSI\\Desktop\\ProgramacionDAW-main\\Unidad3\\src\\Actividadesdeclase\\Actividad5\\FicheroEjemplo.txt"));
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                Scanner sc = new Scanner(linea);

                int suma = 0;
                int contador = 0;

                while (sc.hasNextInt()) {
                    suma = suma + sc.nextInt();
                    contador++;
                }
                sc.close(); 

                System.out.println("Media: " + (double) suma / contador);
            }
            leer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
