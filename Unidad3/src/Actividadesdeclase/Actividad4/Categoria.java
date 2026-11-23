package Unidad3.src.Actividadesdeclase.Actividad4;

public class Categoria {
    //Crear Atributos
    private int codigo;
    private String nombre;

     // Constructor con parámetros
    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
     // Constructor de copia
    public Categoria(Categoria otra) {
        this.codigo = otra.codigo;
        this.nombre = otra.nombre;
    }

     // Constructor por defecto
    public Categoria() {
        this.codigo = 0;
        this.nombre = "";
    }

    // Getters y Setters
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

    @Override
    public String toString() {
        return "Categoria [codigo=" + codigo + ", nombre=" + nombre + "]";
    }
}
