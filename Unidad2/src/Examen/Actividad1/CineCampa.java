package Examen.Actividad1;

import java.util.Scanner;

public class CineCampa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Declaración de variables
        double personas;
        double entradas;
        double total;
        double descuento;
        double pagar;
        String dia;
        boolean tarjeta;
        //Muestra el titulo del programa
        System.out.println("Venta de entradas CineCampa");
        // Solicita y lee la cantidad de entradas (personas)
        System.out.println("Numero de entradas:");
        personas = sc.nextDouble();
        sc.nextLine();
        //Solicita y lee el dia de la semana
        System.out.println("Dia de la semana:");
        dia = sc.nextLine();
        //Solicita y lee si el cliente posee la tarjeta (true o false)
        System.out.println("Tiene tarjeta CineCampa? (true/false)");
        tarjeta = sc.nextBoolean();

        System.out.println("Entradas individuales: "+ personas);

        System.out.println("Precio por entrada individual 8€");

        // Calculo del precio base segin el dia de la semana
        if (dia.equals("miercoles")) {
            // Dia del espectador: cada entrada cuesta 5 €
            entradas = personas;
            total = personas * 5;

        } else if (dia.equals("jueves")) {
            //Dia de la pareja: se agrupan de 2 en 2 y cada pareja cuesta 11 €
            entradas = personas / 2;
            total = entradas * 11;

        } else {
            // Resto de dias (tarifa normal): cada entrada cuesta 8 €
            entradas = personas;
            total = personas * 8;
        }
        descuento = 0;

        if (tarjeta == true) {    
        // Si el usuario tiene tarjeta CineCampa, se aplica un 10% de descuento sobre el total
            descuento = total * 0.10;
        }
        pagar = total - descuento;

        System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
        // Muestra si es grupal (jueves) o individual
        if (dia.equals("jueves")) {
            System.out.println("Entradas grupales: " + entradas);
        } else {
            System.out.println("Entradas individuales: " + personas);
        }
        // Muestra los importes finales formateados con el símbolo del euro
        System.out.println("Total: " + total + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("A pagar: " + pagar + " €");

    }
}