import java.lang.runtime.SwitchBootstraps;
import java.security.PublicKey;
import java.text.ListFormat.Style;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Actividades {
    public static void main(String[] args) {
    

    //   //Generae dos numeros de manera aleatorio
    //   int min=1, max=10;
    //   int aleatorio1=(int)(Math.random()*(max-min+1))+min;
    //   int aleatorio2=(int)(Math.random()*(max-min+1))+min;

    //   Double division=(aleatorio1/aleatorio2);
    //   Double media=(aleatorio1+aleatorio2)/2.0;

    //   //Realizar las operaciones 

    //   System.out.println("Los numeros generados son: "+aleatorio1+" t "+ aleatorio2);
    //   System.out.println("La division es: "+division);
    //   System.out.println("La media es; "+media);
    //   System.out.println("La potencia vale: "+Math.pow(aleatorio1,aleatorio2));
    //   System.out.println("Las raices cuadrados son: "+Math.pow(aleatorio1)+;

    // /*¿Cómo sabemos si un número es
    // divisible por 2 y por 3?
    // */
    // int num=5;
    // // if (num%2==0 && num%3==0){
    // // System.out.println("Es divisibble por dos y tres");
    // // } 
    // // else {
    // //     System.out.println("No es divisibble por dos y tres");
    // // }
    // if (num%2==0 && !(num%3==0)){
    //     System.out.println("Es divisibble por dos y no es divisible por tres");
    // }

    // else if (!(num%2==0) && num%3==0){
    // //     System.out.println("Es divisibble por tres y no es divisible por dos");
    // // }

    // // else{
    // //     System.out.println("No es divisibble por dos y tres");
    // // }

    // //Haz el programa JAVA del siguiente diagrama de flujo
    // //Definir las variables a,b,c
    // int a;
    // int b;
    // int c;
    // double x1,x2;
    // //Definir la lectura de la variable
    // Scanner sc= new Scanner(System.in);

    // a=Integer.parseInt(sc.nextLine());
    // b=Integer.parseInt(sc.nextLine());
    // c=Integer.parseInt(sc.nextLine());

    // int variable= b*b-4*a*c;

    // if(variable<0){
    //     System.out.println("No hay solucion");
    // }

    // else if(variable==0){
    //     x1=b/(2.0*a);
    //     System.out.println("La unica solucion es: "+x1);
    // }

    // else{
    //     x1=(-b + Math.sqrt(variable)/(2.0*a));
    //     x2=(-b + Math.sqrt(variable)/(2.0*a));
    //     System.out.println("La primera solucion es: "+x1);
    //     System.out.println("La segunda solucion es: "+x2);

    // }

    // /*Haz un programa que nos pide una nota y nos indica la calificación
    // (sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta). 
    // Haz el programa con ifelse y luego con switch
    // */
    // //Definir el numero
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Introduce el numero");
    // double numero= Double.parseDouble(sc.nextLine());
    // //Comprobar la califacion

    // if(numero<5){
    //     System.out.println("Suspenso");
    // }

    // else if(numero==5 && numero<6){
    //     System.out.println("Aprobado");
    // }

    // else if(numero<7 && numero==8){
    //     System.out.println("Bien");
    // }

    // else {
    //     System.out.println("Sobresaliente");
    // }

    // Scanner sc = new Scanner(System.in);
    // int dia, mes, ano;
    // System.out.println("Dime la dia, mes, ano");
    // dia= sc.nextInt();
    // mes= sc.nextInt();
    // ano= sc.nextInt(); sc.nextLine();

    //  if((dia>0 && dia <=31) && (mes>0 && mes<=12)){
    //     if (dia==29 && mes==2) //Comprobar que esl ano es bisiesto
    //         if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
    //     System.out.println("El dia es correcto");
    //     }

    //     else{
    //     System.out.println("La fecha es incorrecta");
    //     }


    // Actividad de byucle de multiplos de 2 y 3 entre 40 y 200

    // for(int i=50; i<=200;i++);
    //     if(i%2==0 && i%3==0){
    //         System.out.println("Si es divisible");
    //     }

    // //Factorial
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Introduce el numero mayor que 0");
    // int numero=sc.nextInt();
    // int producto= 1;

    // for(int i=1; i<=4;i++){
    //     producto=producto*i;
    // }

    // System.out.println("El factorial de "+numero+" es: "+producto);

    /**Desarrolla un programa que muestre la edad
    máxima y mínima de un grupo de alumnos que se
    introduzca hasta escribir -1. ¿Cómo guardo el
    primer caso? Usa un contador */

    // int numero = 0;
    // int maximo = 0;
    // int minimo = 0;
    // int contador = 0;
    // int contAdultos=0;
    // int suma=0;
    // int total=

    // numero=sc.nextInt(); sc.nextLine();

    // Scanner sc = new Scanner(System.in);
    // do{
    //     System.out.println("Escribe la edad: ");
    //     numero= sc.nextInt(); sc.nextLine();
    //     if (contador ==0){
    //         maximo=numero;
    //         minimo=numero;
    //         contador++;
    //    }
    //    if (numero>maximo){
    //     maximo=numero;
    //    }
    //    if(numero<minimo && numero!=-1){
    //     minimo=numero;
    //    }
    //    if (numero!=-1){
    //     suma=suma +numero;
    //     total++;
    //    }
    //     if (numero>=18){
    //         contAdultos++;
    //     }
    
    // }while(numero!=-1);
    // System.out.print("El maximo valor es: "+maximo);
    // System.out.print("El minimo valor es: "+minimo);
    // /**calcule la suma,
    // media, número de alumnos y cuántos son mayores de
    // edad. */
    // System.out.print("El numero de alumos introducidos son: "+total);
    // System.out.print("El maximo valor es: "+maximo);
    // System.out.print("El maximo valor es: "+maximo);


    /** Desarrolla un programa que trate de adivinar el número
    aleatorio entre 1 y 100, de manera que vaya indicando si
    has introducido un número mayor o menor al correcto y
    cuente el número de intentos.
    */

    // int  numero, aleatorio;
    // int intentos=0;
    // boolean encontrado=false;
    // aleatorio= (int) (Math.random()* 100)+ 1;

    // //Definir la entrada con teclado

    // Scanner sc= new Scanner(System.in);
    // do{
    // System.out.println("Dime el numero entre 1 y 100: ");
    // numero=sc.nextInt(); sc.nextLine();


    // }
    // else if

    /**Desarrolla un programa que simule una calculadora
    según la opción introducida a modo de menú: (sumar,
    restar, multiplicar, dividir o -1). Si no se introduce -1 pedirá
    los operandos, mostrará el resultado */

    // double num1;
    // double num2;
    // double suma;
    // double multiplicar;


    // if (numero !=-1){
    //     System.out.println("1. Sumar");
    //     System.out.println("2. Restar");
    //     System.out.println("3. multiplicar");
    //     System.out.println("3. Dividir");

    // }
    // else if(  )


//     //Algoritmo MCD
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Dime el a");
//     int a=sc.nextInt();
//     System.out.println("Dime el b");
//     int b=sc.nextInt();
//     int resto;
    

//     // Introducimos a y b como valores absolutos
//     a = Math.abs(a);
//     b = Math.abs(b);

//    // Calculamos 
//     while (b != 0){
//         resto= a%b;
// //         a=b;
// //         b=resto;

// //     }
//         System.out.println("El MCD es: "+a);

    //  //Algoritmo MCM
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Dime el a");
    // int a=sc.nextInt();
    // System.out.println("Dime el b");
    // int b=sc.nextInt();  
    // int mayor;
    // int mcm;

    // //Calculamos las frormulas
    // mayor=Math.max(a , b);
    // mcm=mayor;

    // while ((mcm % a !=0) || (mcm % b !=0)) {
    //     mcm = mcm + mayor;
    // }
//     // System.out.println("El mcm es: "+mcm);

//     //Creacion de la tabla de mulptiplicar

//    for (int i=1;i<=10;i++){
//             for(int j=1;j<=10;j++){
//             System.out.println(i + " x " + j + " = " + (i*j));
//             }
//         }


    imprimir("la suma de 3+5 es: ", sumar(3, 5));

    System.out.println(maximo(maximo(2,3))5);

    double radio=3;
    double altura=5;
calculareacilindro(radio, altura);

    
    }




    public static void imprimir(String cadena, int variable){
        System.out.println("Imprime la variable "+variable);
    }
    public static int sumar(int a, int b){
        return a+b;
    }

    public static int suma(int a, int b, int c){
        return a+b;
    }

    public static double suma(double a , double b){
        return a+b;
    }
    
    public static int maximo(int valor1, int valor2){
        int maximo;
        if (valor1>=valor2){

        }
        return maximo;
    }

    public static void calculareacilindro(double radio, double altura){
        double area=2*PI*(altura+radio);

        System.out.println("El area deñ cilindro es: "+area);
    }

    public static void calcularvolumenCilindro(double)


}


