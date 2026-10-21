import java.time.LocalDateTime;
import java.util.Scanner;

import Utilidades.Matematicas;

public class Prueba {
    public static void main(String[] arg) throws Exception {
        //  System.out.println((1+2+3+1)/2);
        //  System.out.println((1+2+3+1)/3.0);

        //   int a= ’A’;
        //   System.out.println(a);

        //    int[] b={4,0,-1};
        //    System.out.println(b);
        //    System.out.println(b(1));

        //    final int valor=3;
        //    valor=5;

        // // Clase 2
        // // Ejemplo xe introducir un valor por teclado

        // Scanner sc= new Scanner(System.in); //Iniciar la entrada de teclado
        // int numero;

        // System.out.println("Introduce un numero entre 5 y 25");
        // numero=Integer.parseInt(sc.nextLine());
        // System.out.println("Introduce el nombre");
        // System.out.println("Introduce tu apellido");
        // String nombre=sc.nextLine();
        // // System.out.println("Tu nombre es: "+ nombre);


        // LocalDateTime hoy = LocalDateTime.now();
        // System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
        // System.out.println("El día es: " + hoy.getDayOfMonth());
        // System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
        // System.out.println("El año es: " + hoy.getYear());
        // System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

        // System.out.println(Math.pow(2, 8));

        // int max=25;
        // int min=1;
        // int aleatorio=(int)(Math.random()*(max-min+1))+min;
        // System.out.println(aleatorio);

        // //Clase 3
        // // Utilizar las funciones sumar y multiplicar de la clase Matematias


        // // int numero1=3;
        // // int numero2=5;
        // // System.out.println("La suma es: "+Matematicas.sumar(numero1,numero2));
        
        // System.out.println("El resto de la divison vale );

        // //Condiciones IF-ELSE

        // int numero=3;
        // int numero2=5;
        // int resultado;


        // if (numero>numero2){
        //     //Si se cumple

        // System.out.println("numero > numero2");
        // resultado=numero+numero2;
        // }
        
        // else {

        //     //Si se no se cumple hara esto
        //     System.out.println("numero < numero2");
        //      resultado=numero-numero2;
        // }
        // //Usando el operador terneria
        // resultado=(numero>numero2) ? numero + numero2:numero-numero2;
        // System.out.println(numero+" "+numero2+" "+resultado);
        // System.out.println("POR AQUI VOY");   

        //IF-ELSE Encadenado

        // int dia=3;
        // if (dia==1)
        //     System.out.println("Lunes");
        // else if (dia==2){
        //     System.out.println("Martes");
        // }
        // else if (dia==3){
        //     System.out.println("Miercoles");
        // }
        // else if (dia==4){
        //     System.out.println("Jueves");
        // }
        // else if (dia==6){
        //      System.out.println("Viernes");
        // }


        // //Clase bucles
        // // //Estructuras
        // // for (int i=0;i<=5;i++){

        // // System.out.println(i);
        // // }

        // // //Esctructura while
        // int i=0;
        // while (i<0){
        //     System.out.println(i);
        //     i++;
        // }

        // //Esctructura DO-WHILE

        // i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<0);


        //Clase 5
        for (int i=1;i<=4;i++){
            if(i%2==0){
            for(int j=i;j<=4;j++){
            System.out.print("*");
            }

         System.out.println();
        }



    }
}
}

