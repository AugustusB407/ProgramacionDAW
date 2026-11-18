    public class Main {

    public static void main(String[] args) {

        // Crear un objeto utilizando el constructor con parámetros
        Pais pais1 = new Pais("España", 480000, 1500000);

        // Utilizar los getters
        System.out.println("Nombre: " + pais1.getNombre());
        System.out.println("Población: " + pais1.getPoblacion());
        System.out.println("PIB: " + pais1.getPIB());

        // Calcular el PIB per cápita
        System.out.println("PIB per cápita: " +
                pais1.calcularPIBPerCapita());

        // Modificar los datos utilizando los setters
        pais1.setNombre("Francia");
        pais1.setPoblacion(680000);
        pais1.setPIB(2800000);

        // Mostrar los datos modificados
        System.out.println("\n--- Datos modificados ---");
        System.out.println("Nombre: " + pais1.getNombre());
        System.out.println("Población: " + pais1.getPoblacion());
        System.out.println("PIB: " + pais1.getPIB());

        System.out.println("Nuevo PIB per cápita: " +
                pais1.calcularPIBPerCapita());
    }
}

