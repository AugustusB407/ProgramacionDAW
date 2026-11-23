package Unidad3.src.Actividadesdeclase.Actividad3;

public class Persona {
    private String docId;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private char genero;
    private Vehiculo vehiculo;

    // Constructor por defecto
    public Persona() {
        this.docId = "";
        this.nombre = "";
        this.apellido = "";
        this.fechaNac = "";
        this.genero = ' ';
        this.vehiculo = new Vehiculo();
    }
    
    // Constructor con parámetros
    public Persona(String docId, String nombre, String apellido, String fechaNac, char genero, Vehiculo vehiculo) {
        this.docId = docId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.vehiculo = vehiculo;
    }

    // Constructor de copia
    public Persona(Persona otra) {
        this.docId = otra.docId;
        this.nombre = otra.nombre;
        this.apellido = otra.apellido;
        this.fechaNac = otra.fechaNac;
        this.genero = otra.genero;
        this.vehiculo = new Vehiculo(otra.vehiculo);
    }

    // Getters y setters
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Persona [docId=" + docId + ", nombre=" + nombre + ", apellido=" + apellido  + ", fechaNac=" + fechaNac + ", genero=" + genero + ", vehiculo=" + vehiculo + "]";
    }

}
