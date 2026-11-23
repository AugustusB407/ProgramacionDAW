
public class Empleado {
    //Atributod
    private int legajo;
    private String dni;
    private String nombre;
    private String telefono;
    private String calle, ciudad, numero;     // domicilio

    //Constructores
    public Empleado(int legajo, String dni, String nombre, String telefono, String calle, String ciudad, String numero) {
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }

    //Getters y Setters
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Empleado [legajo=" + legajo + ", dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", domicilio=" + calle + " " + numero + ", " + ciudad + "]";
    }
}
