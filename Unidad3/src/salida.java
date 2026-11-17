package Unidad3.src;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class salida {
    public static void main(String[] args) {

        // String contenido = "Este es un ejemplo de uso de BufferedWriter en Java.";
        // try {
        //     FileWriter archivo = new FileWriter("ejemplo.txt");
        //     BufferedWriter escritor = new BufferedWriter(archivo);
        //     escritor.write(contenido); // Escribimos la cadena en el archivo
        //     escritor.newLine(); // Añadimos una nueva línea
        //     escritor.close(); // Cerramos el BufferedWriter
        //     System.out.println("¡Archivo escrito con éxito!");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }


        
        // //Escribir por pantalla
        // System.out.println("Hola mundo");

        //Hacer lo mismo pero con PrintWriter
        String contenido = "Este es un ejemplo de uso de PrintWriter en Java.";
        try {
            PrintWriter escritor = new PrintWriter("ejemplo.txt");
            escritor.println(contenido); // Escribimos la cadena y añadimos un salto de línea
            escritor.close(); // Cerramos el PrintWriter
            System.out.println("¡Archivo escrito con éxito!");
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }





        }
        }
