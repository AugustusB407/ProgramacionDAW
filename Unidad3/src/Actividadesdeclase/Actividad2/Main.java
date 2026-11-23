package Unidad3.src.Actividadesdeclase.Actividad2;

public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(15, 3, 2001);
        Ciudad nacimiento = new Ciudad(1, "Bogota", 601);
        Ciudad residencia = new Ciudad(2, "Medellin", 604);

        Persona p1 = new Persona("123456", "Juan", "Perez", 'M', fecha, nacimiento, residencia);
        System.out.println(p1);

        Persona p2 = new Persona(p1);
        p2.setNombre("Ana");
        System.out.println(p2);
    }
}


