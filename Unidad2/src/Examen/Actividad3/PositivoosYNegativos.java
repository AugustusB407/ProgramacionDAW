package Examen.Actividad3;

import java.util.Scanner;

public class PositivoosYNegativos {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    // Variables
    int contador = 0;
    int impares = 0;
    int ParPositivo = 0; 
    int negativo = 0;    

    System.out.print("Introduce un numero (0 para terminar): ");
    int num = sc.nextInt();

    while (num != 0) {

    // Si es impar positivo o negativo
    if (num % 2 != 0) {
        impares = impares + num;
    }

    // Si es par y ademas es positivo
    if (num % 2 == 0 && num > 0) {
    // Si es el primero o es mas grande que el guardado
    if (ParPositivo == 0 || num > ParPositivo) {
        ParPositivo = num;
    }
    }

    // Si es negativo
    if (num < 0) {
    // Si es el primero o es más pequeno que el guardado
    if (negativo == 0 || num < negativo) {
        negativo = num;
    }
    }

    // Contamos todos los numeros
    contador++; 

    System.out.print("Introduce otro numero (0 para terminar): ");
        num = sc.nextInt(); 
    }

    // Mostramos los resultados
    System.out.println("Numeros introducidos: " + contador);
    System.out.println("Suma de impares: " + impares);
    System.out.println("Mayor par positivo: " + ParPositivo);
    System.out.println("Menor negativo: " + negativo);

    }
}


