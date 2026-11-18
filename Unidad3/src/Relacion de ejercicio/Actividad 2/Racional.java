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

// 4. Operaciones (devuelven un Racional nuevo)
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

// 5. Comparación
public boolean esIgual(Racional b) {
    return ((this.numerador * b.denominador) == (b.numerador * this.denominador));
}

// 6. main (aquí, o en una clase Main aparte)
public static void main(String[] args) {
    
    // crear racionales, asignar valores, imprimir,
    // probar las cuatro operaciones y esIgual
}
}