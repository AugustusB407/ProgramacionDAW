package Unidad3.src.Relaciondeejercicio.Actividad8;

public class Persona {
    // Atributos de la persona
    private String nombre;
    private int edad;
    private String telefono;
    private String poblacion;

    // Constructor con parámetros
    public Persona(){}
    public Persona(String nombre, int edad, String telefono, String poblacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.poblacion = poblacion;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    // Muestra los datos de la persona
    public void mostrar() {
        System.out.println(nombre + " | " + edad + " | " + telefono + " | " + poblacion);
    }
}
