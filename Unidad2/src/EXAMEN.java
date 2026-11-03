import java.util.Scanner;

public class EXAMEN {
    

    public void Ejercicio1(){
         /*Ejercicio1*/
    //Empezamos con el scanner
    Scanner sc = new Scanner(System.in);
    //Hay que nombrar las cosas
    System.out.println("Venta de entradas CineCampa");
    // Las entradas de cada persona y si hay parejas
    System.out.println("Entradas individuales: ");
    int entrada_individual = sc.nextInt();
    int entrada_pareja;
    //Preguntamos el dia de a semana
    System.out.println("Día de la semana: ");
    int dia_de_semana = sc.nextInt();
    //Si tiene tarjeta
    System.out.println("¿Tiene tarjeta CineCampa?(t/f)");
    boolean tarjeta;
    int total;
    //
    if (dia_de_semana == 1){
        entrada_individual= entrada_individual * 5;
    }
    else if (dia_de_semana == 2) {
        entrada_pareja = entrada_individual / 2;
        entrada_individual = 11;
    }
    else{
    System.out.println("Datos mal introducidos");
    }

    if (tarjeta){
        tarjeta = true;
        entrada_individual = entrada_individual / 10;
    }else {
        tarjeta = false;
    }
    total = entrada_individual * tarjeta;
    //Queria calcular el total de todos
    }
    public void Ejercicio3(){
         //Actividad 3
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

    //Ejercicio 4
    public static void imprimeTablero(boolean valor) {
    if (valor) {
        // Salida para el juego 4 en raya (true)
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("|   |   | X |   |   |   |   |");
        System.out.println("|   |   | O | X |   |   |   |");
        System.out.println("|   | X | O | O |   |   |   |");
        System.out.println("| X | O | X | O | X |   |   |");
        System.out.println("-----------------------------");
        System.out.println("  0   1   2   3   4   5   6  ");
    } else {
        // Salida para el juego 3 en raya (false)
        System.out.println("| X | O | X |");
        System.out.println("-------------");
        System.out.println("|   | O |   |");
        System.out.println("-------------");
        System.out.println("|   | X |   |");
        System.out.println("-------------");
        System.out.println("  0   1   2  ");
    }
}


    public static void main(String[] args) {
    






    }
}

