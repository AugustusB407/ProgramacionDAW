package Unidad3.src.Relaciondeejercicio.Actividad7;

public class Monstruo {
    // Atributos del monstruo
    private String nombre;
    private int vida;
    private int ataque;

    // Constructor: da valores a los tres atributos
    public Monstruo(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    // Getters: permiten leer los atributos
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    // Resta a la vida el daño recibido
    public void recibirDanio(int danio) {
        vida = vida - danio;
    }

    // Muestra los datos del monstruo
    public void mostrarInfo() {
        System.out.println("Monstruo " + nombre + ": vida " + vida + ", ataque " + ataque);
    }
}
