package Unidad3.src.Relaciondeejercicio.Actividad6;
/*6. Ejercicio tipo examen. Juego de la carta más alta. 
El proyecto tiene dos clases principales: Carta y Jugador. 
Para Jugador se guardarán los atributos que estimes oportunos y la Carta que le haya tocado. 
Para Carta tendrá como atributos el valor y como enum el palo (Oros, Copas, Espadas o Bastos) Las clases están completas y tendrán una función para mostrar sus atributos (ej. imprimeJugador() e imprimeCarta()). Para utilizar ambas clases, la clase Juego tiene como atributos ganadas1 y ganadas2 y en main se en cargará de: • Crear un objeto juego que inicializa ganadas1 y ganadas2 a 0. Después ejecuta su función cartaAlta() que hará: ◦ Asignar una carta aleatoria a cada jugador. Cada carta se genera con un valor aleatorio entre 1 y 12. ◦ Mostrar las cartas de cada jugador y comprobar quién ha ganado. Gana la carta mayor. ◦ El juego se acaba cuando uno de los jugadores ha ganado 3 veces ◦ Al terminar guardará en un fichero el resultado de ganadas1 y ganadas2 a modo de histórico de partidas. (Recuerda usar append*/
import java.util.Random;

public class Juego {
    // Rondas ganadas por cada jugador (empiezan en 0)
    private int ganadas1 = 0;
    private int ganadas2 = 0;

    public void cartaAlta() throws Exception {
        Random azar = new Random();
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};

        // Creamos los dos jugadores
        Jugador j1 = new Jugador("Jugador 1");
        Jugador j2 = new Jugador("Jugador 2");

        // Se juega hasta que uno gane 3 rondas
        while (ganadas1 < 3 && ganadas2 < 3) {

            // Damos una carta aleatoria a cada jugador (valor de 1 a 12)
            j1.setCarta(new Carta(azar.nextInt(12) + 1, palos[azar.nextInt(4)]));
            j2.setCarta(new Carta(azar.nextInt(12) + 1, palos[azar.nextInt(4)]));

            // Mostramos las cartas
            j1.imprimeJugador();
            j2.imprimeJugador();

            // Gana la carta con mayor valor (si empatan, nadie suma)
            if (j1.getCarta().getValor() > j2.getCarta().getValor()) {
                ganadas1++;
            } else if (j2.getCarta().getValor() > j1.getCarta().getValor()) {
                ganadas2++;
            }
            // Mostramos quién ha ganado la partida
        if (ganadas1 == 3) {
            System.out.println("Gana el Jugador 1 (" + ganadas1 + " - " + ganadas2 + ")");
}       else {
            System.out.println("Gana el Jugador 2 (" + ganadas1 + " - " + ganadas2 + ")");
}
        }
}

    public static void main(String[] args) throws Exception {
        // Creamos el juego y lo ejecutamos
        new Juego().cartaAlta();

    }
}
