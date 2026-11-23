package Unidad3.src.Relaciondeejercicio.Actividad6;


public class Carta {
    // Atributos de la carta
    private int valor;     
    private String palo;  

    // Constructor: crea la carta con su valor y su palo
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Devuelve el valor para poder compararlo
    public int getValor() {
        return valor;
    }

    // Muestra la carta por pantalla
    public void imprimeCarta() {
        System.out.println(valor + " de " + palo);
    }
}

