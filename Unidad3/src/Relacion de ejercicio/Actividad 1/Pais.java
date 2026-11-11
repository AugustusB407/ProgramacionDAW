
public class Pais {

    /*1. Crea una clase llamada País que tenga los parámetros (nombre, población, PIB), con los
        constructores, los correspondientes getter y setters y un método que devuelva el PIB per cápita,
        calculado como el PIB*100000 dividido por la población. En main haz uso de estas funciones.*/


        //Atributos
        private String nombre;
        private double poblacion;
        private double PIB;

        //Constructor vacío
        public Pais() {
        }

        //Constructor con parámetros
        public Pais(String nombre, double poblacion, double PIB) {
            this.nombre = nombre;
            this.poblacion = poblacion;
            this.PIB = PIB;
        }

        //Getters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPoblacion() {
            return poblacion;
        }

        //Setters
        public void setPoblacion(double poblacion) {
            this.poblacion = poblacion;
        }

        //Método para calcular el PIB per cápita
        public double calcularPIBPerCapita() {
            return (PIB * 100000) / poblacion;
        }

        public String getPIB() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getPIB'");
        }

        public void setPIB(int i) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setPIB'");
        }
    

    public static void main(String[] args) {
        // Crear un objeto utilizando el constructor con parámetros
        Pais pais1 = new Pais("España", 480000, 1500000);

        // Utilizar los getters
        System.out.println("Nombre: " + pais1.getNombre());
        System.out.println("Población: " + pais1.getPoblacion());
        System.out.println("PIB: " + pais1.getPIB());

        // Calcular el PIB per cápita
        System.out.println("PIB per cápita: " + pais1.calcularPIBPerCapita());

        // Modificar los datos utilizando los setters
        pais1.setNombre("Francia");
        pais1.setPoblacion(680000);
        pais1.setPIB(2800000);

        // Mostrar los datos modificados
        System.out.println("Nombre: " + pais1.getNombre());
        System.out.println("Población: " + pais1.getPoblacion());
        System.out.println("PIB: " + pais1.getPIB());
        System.out.println("Nuevo PIB per cápita: " + pais1.calcularPIBPerCapita());
    }   
    }    

