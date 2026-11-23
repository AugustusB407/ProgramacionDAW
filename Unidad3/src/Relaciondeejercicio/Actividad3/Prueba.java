
public class Prueba {
    public static void main(String[] args) {
       // La sucursal se crea primero, porque el cliente la recibe
        Sucursal s = new Sucursal(1, "Calle Mayor 5", "Madrid");

        // Cliente con su sucursal y el descuento de la compra
        Cliente c = new Cliente("12345678A", "01/05/1990", 1, "Ana", "Madrid", s, 10.0);

        // Tarjeta con el cliente que la utiliza
        Tarjeta t = new Tarjeta(1111, "Ana", 123, "12/2030", c);

        // Fábrica y producto (el producto guarda su fábrica)
        Fabrica f = new Fabrica("30-123", "Fabrica SA", "Espana", 50, "Luis");
        Producto p = new Producto(10, "Silla", "Negro", 25.5, f);

        // Empleado con un solo teléfono
        Empleado e = new Empleado(100, "87654321B", "Marta", "600111222", "Calle Sol", "Madrid", "7");

        // Relaciones N:N con atributos propios
        Vende vende = new Vende(s, p, 39.9);
        Trabaja trabaja = new Trabaja(e, s, "9-17", "Lunes");

        // Mostramos todo
        System.out.println(c);
        System.out.println(t);
        System.out.println(f);
        System.out.println(p);
        System.out.println(s);
        System.out.println(e);
        System.out.println(vende);
        System.out.println(trabaja);

    }

}
