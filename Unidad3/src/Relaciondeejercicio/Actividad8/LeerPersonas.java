package Unidad3.src.Relaciondeejercicio.Actividad8;

import java.io.File;
import java.util.Scanner;

public class LeerPersonas {
    public static void main(String[] args) {

        // Una sola persona vacía, que se irá rellenando
        Persona p = new Persona();

        try {
            Scanner leer = new Scanner(new File("./personas.csv"));

            // Cada vuelta es una línea del fichero
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();

                // Troceamos la línea por ";" 
                String[] partes = linea.split(";");

                // Rellenamos la persona con los datos de la línea
                p.setNombre(partes[0]);
                p.setEdad(Integer.parseInt(partes[1])); 
                p.setTelefono(partes[2]);
                p.setPoblacion(partes[3]);

                // Mostramos la persona antes de pasar a la siguiente línea
                p.mostrar();
            }
            leer.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}