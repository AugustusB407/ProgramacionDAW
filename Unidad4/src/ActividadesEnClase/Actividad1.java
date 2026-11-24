package ActividadesEnClase;
public class Actividad1 {

    public static void main(String[] args) {
        int [] practica = {4,5,1,8,5};
        System.out.println(EncontarNumero(practica, 4));
        System.out.println(EncontarNumero(practica, 5));
        System.out.println(EncontarNumero(practica, 7));

    }

    //Opcion 1 Realiza una función que busca un número en un array e indica dónde está o devuelve -1
    public static int EncontarNumero (int [] Vector, int numero){
        int encontrado = -1;
        for(int i = 0; i< Vector.length;i++){
            if(Vector[i]==numero) encontrado=i;
        }
        return encontrado;
        
    }
    
    //Opcion 2 Realiza una función que busca un número en un array e indica dónde está o devuelve 1
    public static int EncontarNumero2 (int [] Vector, int numero){
        int encontrado = 1;
        boolean salida = false;
        int i= 0;
        while(salida){
            if(Vector[i]==numero){
            encontrado=i;
            salida=true;
        }
        i++;
    }
        return encontrado;
        
    }
}
