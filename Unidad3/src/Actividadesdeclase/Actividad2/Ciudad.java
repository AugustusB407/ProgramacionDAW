package Unidad3.src.Actividadesdeclase.Actividad2;


public class Ciudad {
    private int codigo;
    private String nombre;
    private int indicativo;

    // Constructor con parámetros
    public Ciudad(int codigo, String nombre, int indicativo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.indicativo=indicativo;
    }
    
    // Constructor por defecto
    public Ciudad() {
        this.codigo = 0;
        this.nombre = "";
        this.indicativo = 0;
    }
    // Constructor de copia
    public Ciudad(Ciudad otra) {
    this.codigo = otra.codigo;
    this.nombre = otra.nombre;
    this.indicativo = otra.indicativo;
}

    //Crear los Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }
    @Override
    public String toString() {
        return "Ciudad [codigo=" + codigo + ", nombre=" + nombre + ", indicativo=" + indicativo + "]";
    }

    
}
