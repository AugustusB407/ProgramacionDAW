package Unidad3.src.Actividadesdeclase.Actividad2;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private char genero;
    private Fecha fechaNacimiento;
    private Ciudad ciudadNacimiento;
    private Ciudad ciudadResidencia;

    // Constructor por defecto
    public Persona() {
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
        this.genero = ' ';
        this.fechaNacimiento = new Fecha();
        this.ciudadNacimiento = new Ciudad();
        this.ciudadResidencia = new Ciudad();
    }

    // Constructor con parámetros
    public Persona(String cedula, String nombre, String apellido, char genero, Fecha fechaNacimiento, Ciudad ciudadNacimiento, Ciudad ciudadResidencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadNacimiento = ciudadNacimiento;
        this.ciudadResidencia = ciudadResidencia;
    }

    // Constructor de copia
    public Persona(Persona otra) {
    this.cedula = otra.cedula;
    this.nombre = otra.nombre;
    this.apellido = otra.apellido;
    this.genero = otra.genero;
    this.fechaNacimiento = new Fecha(otra.fechaNacimiento);
    this.ciudadNacimiento = new Ciudad(otra.ciudadNacimiento);
    this.ciudadResidencia = new Ciudad(otra.ciudadResidencia);
}
    
     //Crear los metodos
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    public char getGenero() {
        return genero;
    }
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Ciudad getCiudadNacimiento() {
        return ciudadNacimiento;
    }
    public void setCiudadNacimiento(Ciudad ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }
    public Ciudad getCiudadResidencia() {
        return ciudadResidencia;
    }
    public void setCiudadResidencia(Ciudad ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + ", ciudadNacimiento=" + ciudadNacimiento + ", ciudadResidencia=" + ciudadResidencia + "]";
    }
    }    
