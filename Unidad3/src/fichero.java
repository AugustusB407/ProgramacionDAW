package Unidad3.src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class fichero {

//     public class Prueba {
//  public static void main(String[] args) {
    // // Rutas de entrada y salida para convertir  
    // String rutaEntrada = "./imágenes/imagen1.jpg";
    // String rutaSalida = "./imágenes/salida.png";
    // try {
    //     // Leer la imagen JPEG
    //     BufferedImage imagen = ImageIO.read(new File(rutaEntrada));
    //     if (imagen == null) {
    //     System.out.println("No se pudo leer la imagen. Verifica el formato y la ruta.");
    //     return;
    // }
    //     // Guardar como PNG
    //     boolean resultado = ImageIO.write(imagen, "png", new File(rutaSalida));
    // if (resultado) {
    //     System.out.println("Conversión completada. Imagen guardada como " + rutaSalida);
    // } 
    // else {
    //     System.out.println("No fue posible escribir la imagen en formato PNG.");
    // }
    // } 
    // catch (IOException e) {
    //     System.err.println("Error al procesar la imagen: " + e.getMessage());
    // }
    // }
    // }
    





// String ruta = "C:\\Users\\usuario\\Desktop\\ProgramaciónDAW\\victoria.txt";
// class FileIO{
// public static void main(String [] args)
//     throws FileNotFoundException, IOException{
//         FileInputStream in = new FileInputStream("./images.jpg");
//         FileOutputStream out = new FileOutputStream("./salida.jpg");
//         int n=0,c;
//         System.out.print ("\nCopiando ...");
//     while( (c = in.read()) != -1){
//         out.write(c);
//         n++;
//     }
//         in.close();
//         out.close();
//         System.out.print ("\nSe han copiado "+n+" Bytes\n");
//     }}

// public void leerDatos(String ruta) {
// int partidasJugador1=0,partidasJugador2=0,partidasJugador3=0;
//         try {
//             Scanner sc = new Scanner(new File(ruta)); //Puedes encontrar esta línea entre paréntesis en try por ser crítica
//             while (sc.hasNextLine()) {
//                 String linea = sc.nextLine(); //Lectura de toda la línea
//                 Scanner scLinea = new Scanner(linea); //Sobre la línea leída vamos a ver qué partes la componen
//                 while(scLinea.hasNext()){
//                     scLinea.useDelimiter("[=\\s]+");
//                     String jugador = scLinea.next();
//                     int partidas = scLinea.nextInt();
//                     if(jugador.equals("jugador1")){
//                         partidasJugador1=partidas;
//                     }
//                     else if(jugador.equals("jugador2")){
//                         partidasJugador2=partidas;
//                     }
//                     else{
//                         partidasJugador3=partidas;
//                     }
//                 }
//                 scLinea.close();
//             }
//             System.out.println(partidasJugador1+"-"+partidasJugador2+"-"+partidasJugador3);
//             sc.close();

//         } catch (FileNotFoundException e) {
//             System.out.println("No se encuentra el fichero.");
//         }
//         }

    public static void main(String[] args) {
        // System.out.println("Director actual "+ new File(".").getAbsolutePath());
        
        








        // try{
        //     //tengo un archivo para leer
        //     Scanner ficheroLeer = new Scanner("./FicheroLeer.txt");

        //     //Tengo un archivo para escribir
        //     PrintWriter ficheroEscribir = new PrintWriter("./FicheroEscribir.txt");

        //     while (ficheroLeer.hasNextLine()){
        //         String linea = ficheroLeer.nextLine();
        //         ficheroEscribir.println(linea);
        //     }
        //     ficheroLeer.close();
        //     ficheroEscribir.close();

        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());
        // }
        
        // try{
        //     Scanner leer = new Scanner(new File("./FicheroEjemplo.txt"));
        //     String linea;

        //     while(leer.hasNextLine()){
        //         linea=leer.nextLine();
        //         System.out.println(linea);
        //         Scanner sc = new Scanner(linea);//Procesar la línea leída
        //         sc.useDelimiter("a-z[;,\\s]+");//filtro lo que quiero
        //         int numero1=sc.nextInt();
        //         int numero2=sc.nextInt();
        //         int numero3=sc.nextInt();
        //         System.out.println(numero1+"-"+numero2+"-"+numero3);
        //     }
        //     leer.close();
        // }catch(Exception e){
        //     System.out.println(e.getMessage());

        // }


// System.out.println("Leyendo el fichero con Scanner y procesando con Scanner");
        // try{
        //     //Leer el archivo
        //     Scanner leer = new Scanner(new File("./FicheroEjemplo.txt"));
        //     String linea;
        //     int suma = 0;
        //     double contador = 0;
        //     //Procesamos el archivo linea a linea
        //     while(leer.hasNextLine()){
        //         //Guardo la linea a leer y a procesarlo con Scanner
        //         linea = leer.nextLine();
        //         System.out.println("Linea a procesar: "+linea);
        //         Scanner sc = new Scanner(linea);
        //         suma = 0;
        //         contador = 0;
        //         while (sc.hasNextInt()) {//Dentro de la linea voy leyendo los números
        //         int numero1 = sc.nextInt();
        //         contador++;
        //         suma+= numero1;
        //         System.out.println(numero1+"-");
        //         }
        
        //     }
        //    System.out.println("la media es: " +suma/contador);
        //    leer.close();//Cerramos la lectura de esa linea (opcional)

        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        //     }
        
        
        
        
        
        
        
        
        // try{
        
        //     Scanner leer = new Scanner("C:\\Users\\usuario\\Desktop\\ProgramaciónDAW\\Ficheroejemplo.txt");
        //     String linea;
        //     while (leer.hasNextLine()) {
        //         linea = nextLine;
        //         Scanner lectura = new Scanner(linea);
        //         int numero1 = lectura.nextInt();
        //         int numero2 = lectura.nextInt();
        //         int numero3 = lectura.nextInt();
        //         System.out.println(numero1+ "-" +numero2+ "-" +numero3);
        //     }
        //     leer.close();
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }




        // try {
        //     BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\usuario\\Desktop\\ProgramaciónDAW\\Ficheroejemplo.txt"));
        //     String linea;
        //     while ( (linea = leer.readLine()) !=null) {
        //         System.out.println(linea);
                
        //     }
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        //         }
        //     }
        






    //     File fichero = new File("C:\\Users\\usuario\\Desktop\\ProgramaciónDAW\\Ficheroejemplo.txt");

    //     if (fichero.exists()) {
    //         System.out.println("Nombre del archivo "+ fichero.getName());
    //         System.out.println("Ruta "+ fichero.getPath());
    //         System.out.println("Ruta absoluta "+ fichero.getAbsolutePath());
    //         System.out.println("Se puede escribir "+ fichero.canWrite());
    //         System.out.println("Se puede leer "+ fichero.canRead());
    //         System.out.println("Tamaño "+ fichero.length());
          
    //     }
    }
}
