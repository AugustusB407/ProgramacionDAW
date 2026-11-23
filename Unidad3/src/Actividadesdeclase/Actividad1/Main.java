package Unidad3.src.Actividadesdeclase.Actividad1;

public class Main {

    public static void main(String[] args) {

        // 1. Crear la persona (el DNI se asigna después con el setter)
        Persona3 persona = new Persona3("Ana López", "15/03/2001", "Calle Mayor 5", 'F', false);
        persona.setDNI("12345678A");

        // 2. Crear la cuenta con el constructor que recibe la persona
        CuentaCorriente cuenta = new CuentaCorriente("ES1234567890123456789012", 1500.50, persona);

        // 3. Mostrar la información inicial
        System.out.println("=== Datos iniciales ===");
        cuenta.imprimeCuenta();
        System.out.println(cuenta);
    }
}
