package Unidad3.src.Actividadesdeclase.Actividad3;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Renault", "Clio", 2020, "ABC123", "Rojo", 20000);

        Persona p1 = new Persona("123", "Juan", "Perez", "15/03/2001", 'M', v);

        System.out.println(p1);
        System.out.println("Impuesto: " + p1.getVehiculo().calcularImpuesto());

        p1.getVehiculo().cambiarValor(25000);
        System.out.println("Nuevo impuesto: " + p1.getVehiculo().calcularImpuesto());

        Persona p2 = new Persona(p1);
        p2.setNombre("Miguel");
        System.out.println(p2);
    }
}
