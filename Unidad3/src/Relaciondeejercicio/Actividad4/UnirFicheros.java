

import java.io.*;
import java.util.Scanner;


/**4. Crea una aplicación que pida la ruta de dos ficheros de texto y de una ruta de destino (solo la ruta
del directorio). Debes copiar el contenido de los dos ficheros en uno, además, este tendrá el nombre
de los dos ficheros separados por un guion bajo y se guardará en la ruta de destino que le hayamos
indicado.
Por ejemplo, si tengo un fichero A.txt con «ABC» como contenido, un fichero B.txt con «DEF» y
una ruta de destino D:\, el resultado sera un fichero llamado A_B.txt en la ruta D:\ con el contenido
«ABC
DEF». */

public class UnirFicheros {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Pedimos las tres rutas por teclado
        System.out.println("Ruta del primer fichero:");
        String ruta1 = teclado.nextLine();
        System.out.println("Ruta del segundo fichero:");
        String ruta2 = teclado.nextLine();
        System.out.println("Ruta del directorio de destino:");
        String destino = teclado.nextLine();
        teclado.close();

        // Sacamos el nombre de cada fichero sin la extensión (A.txt -> A)
        String nombre1 = new File(ruta1).getName().replace(".txt", "");
        String nombre2 = new File(ruta2).getName().replace(".txt", "");

        // Creamos el fichero nuevo en el destino con el nombre A_B.txt
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(destino, nombre1 + "_" + nombre2 + ".txt")));

        // Copiamos el primer fichero, línea a línea
        Scanner leer1 = new Scanner(new File(ruta1));
        while (leer1.hasNextLine()) {
            bw.write(leer1.nextLine());
            bw.newLine();
        }
        leer1.close();

        // Copiamos el segundo fichero a continuación, en el mismo fichero de salida
        Scanner leer2 = new Scanner(new File(ruta2));
        while (leer2.hasNextLine()) {
            bw.write(leer2.nextLine());
            bw.newLine();
        }
        leer2.close();

        // Cerramos el fichero de salida para que se guarde todo
        bw.close();
    }
}