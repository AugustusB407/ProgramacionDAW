
public class Cliente {
    //Atributos
    private String dni;
    private String fechaNac;
    private String nombre;
    private String ciudad;
    private int codigo;
    private Sucursal sucursal;    // relación compra (1:N)
    private double descuento;     // atributo de la relación compra

    public Cliente(String dni, String fechaNac, int codigo, String nombre, String ciudad, Sucursal sucursal, double descuento) {
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
        this.descuento = descuento;
    }
    //Getters y Setter
    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getFechaNac() {
        return fechaNac;
    }


    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCiudad() {
        return ciudad;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public Sucursal getSucursal() {
        return sucursal;
    }


    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    public double getDescuento() {
        return descuento;
    }


    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    
    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", fechaNac=" + fechaNac + ", codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", sucursal=" + sucursal + ", descuento=" + descuento + "]";
    }
}