package Unidad3.src.Relaciondeejercicio.Actividad6;

public class Jugador {
    // Atributos del jugador
    private String nombre;
    private Carta carta;  

    // Constructor: solo recibe el nombre
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve la carta del jugador
    public Carta getCarta() {
        return carta;
    }

    // Le asigna una carta nueva
    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    // Muestra el nombre y su carta
    public void imprimeJugador() {
        System.out.print(nombre + ": ");
        carta.imprimeCarta();
    }
}