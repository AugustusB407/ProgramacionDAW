package Unidad3.src.Actividadesdeclase.Actividad4;

public class Suministra {
    // Atributos
    private Proveedor proveedor;
    private Pieza pieza;
    private String fecha;
    private int cantidad;

    // Constructor por defecto
    public Suministra() {
        this.proveedor = new Proveedor();
        this.pieza = new Pieza();
        this.fecha = "";
        this.cantidad = 0;
    }
    // Constructor con parámetro
    public Suministra(Proveedor proveedor, Pieza pieza, String fecha, int cantidad) {
        this.proveedor = proveedor;
        this.pieza = pieza;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }
    // Constructor de copia
    public Suministra(Suministra otro) {
        this.proveedor = new Proveedor(otro.proveedor);
        this.pieza = new Pieza(otro.pieza);
        this.fecha = otro.fecha;
        this.cantidad = otro.cantidad;
    }
    //Getters y Setters
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Suministra [proveedor=" + proveedor + ", pieza=" + pieza + ", fecha=" + fecha + ", cantidad=" + cantidad + "]";
    }
}
