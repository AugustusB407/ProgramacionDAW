package Unidad3.src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class fichero {
    public static void main(String[] args) {
        // System.out.println("Director actual "+ new File(".").getAbsolutePath());

        try{
        
            Scanner leer = new Scanner("C:\\Users\\usuario\\Desktop\\ProgramacionDAW\\Ficheroejemplo.txt");
            String linea;
            while (leer.hasNextLine()) {
                linea = nextLine;
                Scanner lectura = new Scanner(linea);
                int numero1 = lectura.nextInt();
                int numero2 = lectura.nextInt();
                int numero3 = lectura.nextInt();
                System.out.println(numero1+ "-" +numero2+ "-" +numero3);
            }
            leer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }




        // try {
        //     BufferedReader leer = new BufferedReader(new FileReader("C:\\Users\\usuario\\Desktop\\ProgramacionDAW\\Ficheroejemplo.txt"));
        //     String linea;
        //     while ( (linea = leer.readLine()) !=null) {
        //         System.out.println(linea);
                
        //     }
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        //         }
        //     }
        






    //     File fichero = new File("C:\\Users\\usuario\\Desktop\\ProgramacionDAW\\Ficheroejemplo.txt");

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
