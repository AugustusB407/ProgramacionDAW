
public class Vende {
    //Atributos
    private Sucursal sucursal;
    private Producto producto;
    private double precioVenta;
    
    //Constructores
    public Vende(Sucursal sucursal, Producto producto, double precioVenta) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.precioVenta = precioVenta;    
    }

    //Getters ySetters
    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Vende [sucursal=" + sucursal + ", producto=" + producto + ", precioVenta=" + precioVenta + "]";
    }
}
