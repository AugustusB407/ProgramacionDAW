

public class Tarjeta {
    //Atributos
    private int numero;
    private int codigo;
    private String nombre;
    private String fechaVenc;
    private Cliente cliente;   // relación 1:N (utiliza)

    //Constructores
    public Tarjeta(int numero, String nombre, int codigo, String fechaVenc, Cliente cliente) {
        this.numero = numero;
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaVenc = fechaVenc;
        this.cliente = cliente;
    }
    //Getters y Setters
    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


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


    public String getFechaVenc() {
        return fechaVenc;
    }


    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    @Override
    public String toString() {
        return "Tarjeta [numero=" + numero + ", nombre=" + nombre + ", codigo=" + codigo + ", fechaVenc=" + fechaVenc + ", cliente=" + cliente + "]";
    }
}
