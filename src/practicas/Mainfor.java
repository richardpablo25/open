package practicas;
public class Mainfor {
    public static void main(String[] args){
        // cuento de 1 a 10
        for (int contador = 1; contador <= 10; contador++){
            System.out.println(contador);
        }
        //recorro un array
        //int arreglo[] = new int[5];
        int arreglo[] = {10,20,30,40,50};
        for (int i=0; i < arreglo.length; i++){
            System.out.println("posicion " + i + "--> " + arreglo[i]);
        }
    }
}
