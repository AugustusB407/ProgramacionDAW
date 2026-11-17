import java.time.LocalDateTime;
import java.util.Scanner;

public class Unidad2Fundamentosdelaprogramación {

    public void Ejercicio1(){ 
         //Ejercicio 1

        /**1. Escribe un programa que imprima buenos días, buenas tardes y buenas noches según la hora actual.
         *  Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. (usa LocalDateTime) */
        
         // Obtenemos la hora actual del ordenador        
        LocalDateTime data = LocalDateTime.now();
        int hora = data.getHour();

         // Comprobamos si son las horas de la mañana

        if (hora >= 6 && hora <= 13) {
            System.out.println("Buenos dias");

        // Comprobamos si son las horas de la tarde

        } else if (hora >= 13 && hora <= 21) {
            System.out.println("Buenas tardes");

         // Si no es mañana ni tarde, es de noche

        } else {
            System.out.println("Buenas noches");
        }

    }
    public void Ejercicio2(){
        //Ejercicio 2
        /**2. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
         *  A partir de la hora 41, se pagan a 16 euros la hora.
         * Ejemplos de salida: Por favor, introduzca el número de horas trabajadas durante la semana: 36 El sueldo semanal que le corresponde es de 432 euros Por favor,
         *  introduzca el número de horas trabajadas durante la semana: 55 El sueldo semanal que le corresponde es de 720 euros */

        //Creamos la programa usando Scanner para introducir la hoara de trabajador
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del trabajador: ");
        int hora= sc.nextInt();

        //tenemos que saber el total
        int total = 0;

         // Las primeras 40 horas se pagan a 12 euros

        if(hora <= 40){
            total = hora * 12;
        // Las horas que superan las 40 se pagan a 16 euros

        }
        else if (hora >= 41){
            total = (40 * 12) + ((hora - 40) * 16);
        }

        // Mostramos el sueldo calculado
        
        System.out.println("El salario semanal ddel trabajador es: "+total);

    }
    public void Ejercicio3(){

        //Ejercicio 3
   /**3. Escribe un programa que nos diga el signo del zodiaco a partir del día y el mes de nacimiento. 
    * Ejemplo: día:15 mes: 8 → LEO */
        
    // Creamos el teclado para leer los datos
    Scanner sc = new Scanner(System.in);
    // Pedimos el dia 
   System.out.println("Introduce el dia: ");
   int dia = sc.nextInt();
   // Pedimos el mes de nacimiento
   System.out.println("Introduce el mes: ");
   int mes = sc.nextInt();

   // Elegimos el signo segun el mes
   if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)){
    System.out.println("Aries");
   }
   else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)){
    System.out.println("Tauro");
   }
    else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)){
    System.out.println("Géminis");
   }
    else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)){
    System.out.println("Cáncer");
   }
    else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)){
    System.out.println("Leo");
   }
    else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)){
    System.out.println("Virgo");
   }
   else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)){
    System.out.println("Libra");
   }
   else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)){
    System.out.println("Escorpio");
   }
   else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)){
    System.out.println("Sagitario");
   }
   else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)){
    System.out.println("Capricornio");
   }
   else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)){
    System.out.println("Acuario");
   }
   else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)){
    System.out.println("Piscis");
   }

   //Si los datos introducidos esten mal, se acaba la programa.
   else {
    System.out.println("Fecha no válida");
    }
    }
    public void Ejercicio4(){
         //Ejercicio 4

    /**4. Calcula la nota de un trimestre de la asignatura Programación. 
     * El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles. 
     * Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. 
     * En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). 
     * Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior. */

         // Pedimos las notas de los dos controles
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primers nota1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Introduce la primers nota2: ");
        double nota2 = sc.nextDouble();

        // Calculamos la media de las dos notas
        double media = (nota1 + nota2) / 2;

        // Si la media es 5 o mas, el alumno aprueba
        if (media >= 5.0){
            System.out.println("Aprobado");
            System.out.println("Su nota media es: "+media);
        }
        else {

             // Si suspende, preguntamos por la recuperacion
            System.out.print("Recuperacion (1 = apto, 2 = no apto): ");
            int recuperacion = sc.nextInt();

            // Si la recuperacion es apta, la nota pasa a ser 5
            if (recuperacion == 1) {
                media = 5.0;
                System.out.println("Recuperacion apta");

            // Si no es apta, mantenemos la nota anterior
            } else if (recuperacion == 2) {
                System.out.println("Recuperacion no apta");

            } else {
                // Avisamos si la opcion no es valida
                System.out.println("Opcion incorrecta");
            }

            // Mostramos la nota final
            System.out.println("Nota final: " + media);

        }
    }
    public void Ejercicio5(){
         //Ejercicio 5

   //5. Escribe un programa que muestre tu horario de clase. 
   // Si le pides un día de la semana (1 a 5) te indicará las materias de ese día, 
   // si le indicas 6 devolverá el horario completo (hazle formato) y con 7 se cerrará el programa.


   //Empezamos con Scanner para poder leer el numero del dia
   Scanner sc = new Scanner(System.in);
   // Pedimos el dia de la semana
   System.out.println("Introduce el dia de la semana: ");
   int dia = sc.nextInt();

    // Elegimos que horario mostrar
   switch (dia) {
    case 1:
        System.out.println("LUNES: ENTORNO DE DESARROLLO, LENUAJE DE MARCAS, BASE DE DATOS, SISTEMAS INFORMATICOS, SISTEMAS INFORMATICOS, PROGRAMACION");
        
        break;
    case 2:
        System.out.println("MARTES: SISTEMAS INFORMATICOS, DIGITALIZACION, IPPE, SOSTENIBILIDAD, PROGRAMACION, PROGRAMACION");
        
        break;

    case 3:
        System.out.println("MIERCOLES: PROGRAMACION, PROGRAMACION, IPPE, BASE DE DATOS, BASE DE DATOS, PROGRAMACION");
        
        break;

    case 4:
        System.out.println("JUEVES: LENUAJE DE MARCAS, LENUAJE DE MARCAS, BASE DE DATOS, BASE DE DATOS, PROGRAMACION, PROGRAMACION");
        
        break;

    case 5:
        System.out.println("VIERNES: SISTEMAS INFORMATICOS, SISTEMAS INFORMATICOS, BASE DE DATOS, PROGRAMACION, PROGRAMACION, IPPE");
        
        break;
     // Mostramos el horario completo de lunes a viernes
    case 6:
        System.out.println("LUNES: ENTORNO DE DESARROLLO, LENUAJE DE MARCAS, BASE DE DATOS, SISTEMAS INFORMATICOS, SISTEMAS INFORMATICOS, PROGRAMACION");
        System.out.println("MARTES: SISTEMAS INFORMATICOS, DIGITALIZACION, IPPE, SOSTENIBILIDAD, PROGRAMACION, PROGRAMACION");
        System.out.println("MIERCOLES: PROGRAMACION, PROGRAMACION, IPPE, BASE DE DATOS, BASE DE DATOS, PROGRAMACION");
        System.out.println("JUEVES: LENUAJE DE MARCAS, LENUAJE DE MARCAS, BASE DE DATOS, BASE DE DATOS, PROGRAMACION, PROGRAMACION");
        System.out.println("VIERNES: SISTEMAS INFORMATICOS, SISTEMAS INFORMATICOS, BASE DE DATOS, PROGRAMACION, PROGRAMACION, IPPE");

        break;
     // Indicamos que el programa se cierra
    case 7:
        System.out.println("Programa cerrado");
        
        break;
    

    default:
        // Si el numero no es valido
        System.out.println("Dia incorrecto");
        break;
   }
    }
    public void Ejercicio6(){
        //Ejercicio 6

    /**6. Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones: 
     *• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto), los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado). 
     • El sueldo base según el cargo es de 950€, 1200€ y 1600€  respectivamente. 
     • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. 
     Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar casado. */


        // Mostramos los empleados disponibles
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el empleado  (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto): ");
        int empleado = sc. nextInt();

        // Pedimos el cargo del empleado
        int cargo;
        
        if (empleado == 1){
            cargo = 950;
        }
        else if (empleado == 2){
            cargo = 1200;
        }
        else if (empleado == 3){
            cargo = 1600;
        }
        else {
            System.out.print("Empleado incorrecto");
            return;
        }
        //Los dias que ha estado de viaje visitando clientes durante el mes 
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?: ");
        int viaje = sc.nextInt();

        //Dietas
        double dietas = viaje * 30;

        //Sueldo bruto
        double bruto = cargo + dietas;

        //Su estado civil
        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        double estado = sc.nextDouble();

        //Retencion IRPF
        if (estado == 1){
            estado = 0.25;
        }
         else if (estado == 2) {
            estado = 0.20;
        } 
        else {
            System.out.println("Estado civil incorrecto"); 
        }
        //Estado de IRPF
        double IRPF = bruto  * estado;
        
        //Sueldo neto
        double neto = bruto - (bruto * estado);

        //La nómina
        System.out.println("Sueldo base: " + cargo);
        System.out.println("Dietas: " + dietas);
        System.out.println("Sueldo bruto: " + bruto);
        System.out.println("Retencion IRPF: " +IRPF);
        System.out.println("Sueldo neto: " + neto);
        
    }
    public void Ejercicio7(){
        //Ejercicio 7

        /*7. Realiza un programa que introduzca números enteros hasta poner 0 y te diga cuántos positivos y negativos has introducido, 
        la media y cuántas veces se ha repetido el número 7 o -7. */

        Scanner sc = new Scanner(System.in);

        // Declaramos las variables
        int positivos = 0; 
        int negativos = 0; 
        int suma = 0; 
        int contador = 0;
        int veces= 0;

        // Pedimos el primer numero
        System.out.print("Introduce un numero (0 para terminar): ");
        int num = sc.nextInt();


        // Repetimos mientras el número no sea 0
        while (num != 0) {

            // Contamos los números positivos
            if (num > 0) {
                positivos++;
            } else {
                // Contamos los números negativos
                negativos++;
            }

            // Contamos las veces que aparece el 7 o el -7
            if (num == 7 || num == -7) {
                veces++;
            }

            // Sumamos el número introducido
            suma = suma + num;

            // Contamos cuántos números hemos introducido
            contador++;

            // Pedimos otro número
            System.out.print("Introduce otro numero (0 para terminar): ");
            num = sc.nextInt();
        }

        // Mostramos los números positivos y negativos
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        // Mostramos cuántas veces aparece el 7 o el -7
        System.out.println("Veces que aparece 7 o -7: " + veces);

        // Calculamos y mostramos la media
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("Media: " + media);
        } else {
            // Si no se introducen números, no se puede calcular la media
            System.out.println("No hay numeros para calcular la media");
        } 

    }
    public void Ejercicio8(){
        //Ejercicio 8

       /*8. Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
       El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 
       El número n>=1 se debe introducir por teclado. Es decir, para n=1 tenemos la secuencia 0,1, para n=2 tenemos 0,1,1(1+0), para n=3 tenemos 0,1,1,2(1+1),... */


        Scanner sc = new Scanner(System.in);

         // Declaramos las variables
        int a = 0;
        int b = 1; 
        int suma;  

        // Preguntamos cuantos terminos queremos mostrar
        System.out.print("Cuantos terminos quieres: ");
        int n = sc.nextInt();

         // Repetimos n veces
        for (int i = 1; i <= n; i++){

            //Mostramos el a
            System.out.print(a + " ");
            
            // Calculamos el numero
            suma = a + b;

             //Los numeros siguen en serie
            a = b;
            b = suma;
        }
    }
    public void Ejercicio9(){
        //     //Ejercicio 9

    //     /**9. A partir del siguiente pseudocódigo, genera la función Java y el programa que muestra los números primos entre 1 y 100. */

        // Recorremos los numeros desde el 2 hasta el 100
       for (int i=2; i<=100; i++){
        // Suponemos que el numero es primo
        boolean primo = true;

        // Probamos si tiene algun divisor
        for (int j = 2; j < i; j++){
            if (i % j == 0){

                 // El numero no es primo
                primo = false;
            }
        }

          // Si sigue siendo primo, lo mostramos
        if (primo) {
            System.out.print(i + " ");

        }
       }
    }
    public void Ejercicio10(){
        
      //Ejercicio 10

      /*10. Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un número indicado por teclado. 
      Genera dos funciones, una para que devuelva el número de pares y otra para el número de impares. 
      Ejemplo de salida: El 406783 contiene 4 dígitos pares y 2 dígitos impares.  */

        Scanner sc = new Scanner(System.in);

        //Pedimos el numero
        System.out.print("Introduce un numero: ");

        // Declaramos las variables
        int n = sc.nextInt();
        int pares = 0;
        int impares = 0;

        // Usamos el % 10 para ver el ultimo digito y el 2 para ver si es primo o no
        while (n > 0) {
            int digito = n % 10;

            if (digito % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            // Se usa para quitar el ultimo digito y coger el siguente
            n = n / 10;
        }

        //El resultado de si es par o impar
        System.out.println("Digitos pares: " + pares);
        System.out.println("Digitos impares: " + impares);
    }


    public static void main(String[] args) {
    System.out.println("¿Es veradero o falso?: ");
    boolean valor;
    if (valor = true) {
        // Tablero de 4 en raya
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("|   |   |   |   |   |   |   |");
        System.out.println("|   |   |   | X |   |   |   |");
        System.out.println("|   |   | O | X |   |   |   |");
        System.out.println("|   | X | O | O |   |   |   |");
        System.out.println("| X | O | X | O | X |   |   |");
        System.out.println("-----------------------------");
        System.out.println("  0   1   2   3   4   5   6  ");
    } else {
        valor = false;
        // Tablero de 3 en raya
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
