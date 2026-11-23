package Unidad3.src.Actividadesdeclase.Actividad2;

public class Fecha {
    // Crear los atributos
    private int dia;
    private int mes;
    private int anio;

    // Constructor con parámetros
    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
     // Constructor por defecto
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }
    // Constructor de copia
    public Fecha(Fecha otra) {
    this.dia = otra.dia;
    this.mes = otra.mes;
    this.anio = otra.anio;
    }
    
    //Metodos
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
    }
}
