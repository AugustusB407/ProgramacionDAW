package Examen.Actividad5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  contarNumeros{
public static void main(String[] args) {
    //Introducimos los valores
    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    boolean entradaValida = false; //usamos boolean
    do {
        System.out.println("Introduce un número entero: ");
        //Intenta el numero
    try {
        numero = scanner.nextInt();
        entradaValida = true;
    //Capta el error y me dice que he metido el numero incorrecto 
    } catch (InputMismatchException e) {
        System.out.println("¡Cuidado! Solo puedes introducir números enteros.");
        scanner.next(); // Limpiar la entrada inválida
    }
    //Mientras que es numero me muestra el numero
    } while (!entradaValida);
        System.out.println("Has introducido el número: " + numero);
}
}