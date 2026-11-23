package Unidad3.src.Actividadesdeclase.Actividad4;

public class Main {
    public static void main(String[] args) {
        Categoria c = new Categoria(1, "Tornilleria");
        Pieza pz = new Pieza(10, "Tornillo", "Gris", 0.25, c);
        Proveedor pv = new Proveedor(100, "Calle Mayor 5", "Madrid", "Madrid");
        Suministra s = new Suministra(pv, pz, "20/11/2026 10:30", 500);

        System.out.println(s);

        // Prueba de setter
        s.setCantidad(800);
        System.out.println("Nueva cantidad: " + s.getCantidad());

        // Prueba del constructor de copia
        Suministra copia = new Suministra(s);
        copia.getPieza().getCategoria().setNombre("Herramientas");
        System.out.println("Original: " + s.getPieza().getCategoria());
        System.out.println("Copia:    " + copia.getPieza().getCategoria());

        // Prueba del constructor por defecto
        System.out.println(new Suministra());
    }
}
