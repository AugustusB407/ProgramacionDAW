/**2. Construir una clase Racional que permita representar y manipular números racionales. Un
número racional permite representar la relación a/b entre dos números enteros siendo a el
numerador y b el denominador (distinto de cero). Se deben implementar los siguientes métodos para
la clase Racional: asignaNumerador(int x), asignaDenominador(int y), imprimirRacional(),
las operaciones de suma, resta, producto y división y esIgual(Racional b). En main haz uso de ellas */

public class Racional {

//Atributos
private int numerador;
private int denominador;

//Métodos de asignación
public void asignaNumerador(int x) {
    this.numerador = x;
}

public void asignaDenominador(int y) {
    if (y != 0){
        this.denominador = y;
    }else {
        System.out.println("Error");
    }
}

//Mostrar por pantalla
public void imprimirRacional() {
    //imprimir numerador/denominador
    System.out.println(numerador+ "/" +denominador);
}

//Operaciones (devuelven un Racional nuevo)
public Racional suma(Racional b) {
    Racional r = new Racional();
    r.asignaNumerador(this.numerador * b.denominador + b.numerador * this.denominador);
    r.asignaDenominador(this.denominador * b.denominador);
    return r;

}

public Racional resta(Racional b) {
    Racional r = new Racional();
    r.asignaNumerador(this.numerador * b.denominador - b.numerador * this.denominador);
    r.asignaDenominador(this.denominador * b.denominador);
    return r;
}

public Racional producto(Racional b) {
    Racional r = new Racional();
    r.asignaNumerador(this.numerador * b.numerador);
    r.asignaDenominador(this.denominador * b.denominador);
    return r;

}

public Racional division(Racional b) {
    Racional r = new Racional();
    r.asignaNumerador(this.numerador * b.denominador);
    r.asignaDenominador(this.denominador * b.numerador);
    return r;
}

//Comparación
public boolean esIgual(Racional b) {
    return ((this.numerador * b.denominador) == (b.numerador * this.denominador));
}

//main (aquí, o en una clase Main aparte)
public static void main(String[] args) {
    Racional x = new Racional();
    Racional y = new Racional();
    x.asignaNumerador(1);
    x.asignaDenominador(2);
    y.asignaNumerador(3);
    y.asignaDenominador(4);
    
    Racional suma = x.suma(y);
    System.out.print("x + y = ");
    suma.imprimirRacional();

    Racional resta = x.resta(y);
    System.out.print("x - y = ");
    resta.imprimirRacional();

    Racional producto = x.producto(y);
    System.out.print("x * y = ");
    producto.imprimirRacional();

    Racional division = x.division(y);
    System.out.print("x / y = ");
    division.imprimirRacional();

    if (x.esIgual(y)) {
    System.out.println("Son iguales");
} else {
    System.out.println("No son iguales");
}
}
}