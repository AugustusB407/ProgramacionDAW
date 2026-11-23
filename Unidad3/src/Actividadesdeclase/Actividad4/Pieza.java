package Unidad3.src.Actividadesdeclase.Actividad4;

public class Pieza {
    // Atributos
    private int codigo;
    private String nombre;
    private String color;
    private double precio;
    private Categoria categoria;

    // Constructor con parámetro
    public Pieza(int codigo, String nombre, String color, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    // Constructor de copia
    public Pieza(Pieza otra) {
        this.codigo = otra.codigo;
        this.nombre = otra.nombre;
        this.color = otra.color;
        this.precio = otra.precio;
        this.categoria = new Categoria(otra.categoria);
    }

    // Constructor por defecto
    public Pieza() {
        this.codigo = 0;
        this.nombre = "";
        this.color = "";
        this.precio = 0.0;
        this.categoria = new Categoria();
    }


    //Getters y Setters
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


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Pieza [codigo=" + codigo + ", nombre=" + nombre + ", color=" + color + ", precio=" + precio + ", categoria=" + categoria + "]";
    }
}
