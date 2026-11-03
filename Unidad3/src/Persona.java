package Unidad3.src;

public class Persona {
    //Atributos

    private String nombre;
    private int edad;
    private double estatura;
    private final String DNI = "1111111111111A";

    //Constructores

    public Persona(){}
    public Persona(String nombre, int edad, double estatura){
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
    }

    public Persona(Persona otra){
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
    }
    //Metodos
     public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void saludar(){
        System.out.print(" Hola a todos, soy " +nombre);
    }
    public void saludar2(){
        System.out.print(" Hola a todos, soy " +nombre);
    }
    public void presentacion(){
        System.out.print(" Hola a todos, soy " +nombre+ ", tengo: "+edad+ " anos y tengo una estatura de: "+estatura);
    }

   
     //Main

    public static void main(String[] args) {

         //Crear un objeto persona
        Persona p=new Persona();
        Persona p2=new Persona("Domingo",41,1.70);
        //Dar un nombre a la persona
        p.setNombre("Luis");
        p.saludar();

        p2.saludar();
        p2.presentacion();


        //Crear 3 personas
        Persona pepa=new Persona("Pepa",18,1.87);
        Persona miguel=new Persona("Miguel",27,1.79);
        Persona paco=new Persona("Paco",51,1.68);

        // Persona otra=pepa; //ESTO ES UNA REFERENCIA EN MEMORIA RAM
        Persona otra=new Persona(pepa);
        pepa.presentacion();
        otra.setNombre("Luis");
        otra.nombre="Antonio";//SUSENSO AUTOMÁTICO EN EL EXAMEN
        pepa.presentacion();
        otra.presentacion();

    }


}
