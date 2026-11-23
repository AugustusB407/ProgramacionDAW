package Unidad3.src.Actividadesdeclase.Actividad4;

public class Proveedor {
    //Atributos
    private int codigo;
    private String direccion;
    private String ciudad;
    private String provincia;

    // Constructor con parámetros
    public Proveedor(int codigo, String direccion, String ciudad, String provincia) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }
    // Constructor de copia
    public Proveedor(Proveedor otro) {
        this.codigo = otro.codigo;
        this.direccion = otro.direccion;
        this.ciudad = otro.ciudad;
        this.provincia = otro.provincia;
    }
    // Constructor por defecto
    public Proveedor() {
        this.codigo = 0;
        this.direccion = "";
        this.ciudad = "";
        this.provincia = "";
    }

    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Proveedor [codigo=" + codigo + ", direccion=" + direccion + ", ciudad=" + ciudad + ", provincia=" + provincia + "]";
    }
}
