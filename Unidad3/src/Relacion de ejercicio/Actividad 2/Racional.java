/**2. Construir una clase Racional que permita representar y manipular números racionales. Un
número racional permite representar la relación a/b entre dos números enteros siendo a el
numerador y b el denominador (distinto de cero). Se deben implementar los siguientes métodos para
la clase Racional: asignaNumerador(int x), asignaDenominador(int y), imprimirRacional(),
las operaciones de suma, resta, producto y división y esIgual(Racional b). En main haz uso de ellas */


public class Racional {

    // Atributos
    private int numerador;
    private int denominador;

    // Asignar numerador
    public void asignaNumerador(int x) {
        numerador = x;
    }

    // Asignar denominador
    public void asignaDenominador(int y) {
        if (y != 0) {
            denominador = y;
        } else {
            System.out.println("Error: denominador cero");
        }
    }

    // Imprimir racional
    public void imprimirRacional() {
        System.out.println(numerador + "/" + denominador);
    }

    // Suma
    public Racional suma(Racional b) {
        Racional r = new Racional();

        r.asignaNumerador(numerador * b.denominador + b.numerador * denominador);

        r.asignaDenominador(denominador * b.denominador);
        return r;
    }

    // Resta
    public Racional resta(Racional b) {
        Racional r = new Racional();

        r.asignaNumerador(numerador * b.denominador - b.numerador * denominador);

        r.asignaDenominador(denominador * b.denominador);
        return r;
    }

    // Producto
    public Racional producto(Racional b) {
        Racional r = new Racional();

        r.asignaNumerador(numerador * b.numerador);
        r.asignaDenominador(denominador * b.denominador);
        return r;
    }

    // División
    public Racional division(Racional b) {
        if (b.numerador == 0) {
            System.out.println("No se puede dividir entre cero");
            return null;
        }

        Racional r = new Racional();

        r.asignaNumerador(numerador * b.denominador);
        r.asignaDenominador(denominador * b.numerador);
        return r;
    }

    // Comparar racionales
    public boolean esIgual(Racional b) {
        return numerador * b.denominador == b.numerador * denominador;
    }

    // MAIN
    public static void main(String[] args) {

        Racional x = new Racional();
        Racional y = new Racional();

        x.asignaNumerador(1);
        x.asignaDenominador(2);

        y.asignaNumerador(3);
        y.asignaDenominador(4);

        System.out.print("X = ");
        x.imprimirRacional();

        System.out.print("Y = ");
        y.imprimirRacional();

        Racional resultado;

        resultado = x.suma(y);
        System.out.print("Suma = ");
        resultado.imprimirRacional();

        resultado = x.resta(y);
        System.out.print("Resta = ");
        resultado.imprimirRacional();

        resultado = x.producto(y);
        System.out.print("Producto = ");
        resultado.imprimirRacional();

        resultado = x.division(y);
        System.out.print("Division = ");

        if (resultado != null) {
            resultado.imprimirRacional();
        }

        System.out.println("¿Son iguales? " + x.esIgual(y));
    }
}
