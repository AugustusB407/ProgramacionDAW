

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProcesarHeroes {

    // Procedimiento: recibe la ruta del fichero y la letra
    public static void mostrarHeroes(String ruta, String letra) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(ruta));
            JSONArray heroes = (JSONArray) obj;

            // Cabecera de la tabla
            System.out.printf("%-25s %-30s%n", "SUPERHEROE", "ALTER EGO");
            System.out.println("-------------------------------------------------");

            // Recorremos los héroes
            for (Object elemento : heroes) {
                JSONObject heroe = (JSONObject) elemento;
                String superhero = (String) heroe.get("superhero");
                String publisher = (String) heroe.get("publisher");
                String alterEgo = (String) heroe.get("alter_ego");

                // Solo DC y que el nombre empiece por la letra
                if ((publisher.equals("DC Comics") || publisher.equals("Marvel Comics")) && superhero.startsWith(letra)) {
                    System.out.printf("%-25s %-30s%n", superhero, alterEgo);
                }
            }

            System.out.println("-------------------------------------------------");

        } catch (IOException e) {
            System.out.println("Error en lectura JSON");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    mostrarHeroes("./HEROES.json", "H");
}
}
