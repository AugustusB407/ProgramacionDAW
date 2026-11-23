package Unidad3.src.Relaciondeejercicio.Actividad7;

import java.util.Random;

public class Lucha {
    public static void main(String[] args) {
        Heroe heroe = new Heroe("Arturo", 100, 10);
        Monstruo monstruo = new Monstruo("Dragon", 120, 15);

        // Empieza uno al azar: true = el héroe
        boolean turnoHeroe = new Random().nextBoolean();

        while (heroe.getVida() > 0 && monstruo.getVida() > 0) {
            if (turnoHeroe) {
                monstruo.recibirDanio(heroe.getAtaque());
            } else {
                heroe.recibirDanio(monstruo.getAtaque());
            }
            turnoHeroe = !turnoHeroe;   // cambia el turno
        }

        if (heroe.getVida() > 0) {
            System.out.println("Gana " + heroe.getNombre() + " con " + heroe.getVida() + " de vida");
        } else {
            System.out.println("Gana " + monstruo.getNombre() + " con " + monstruo.getVida() + " de vida");
        }
    }
}