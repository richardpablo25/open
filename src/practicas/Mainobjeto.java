package practicas;
public class Mainobjeto {
    public static void main(String[] args) {
    
    // creamos el objeto auto
    Coche auto = new Coche();
    
    System.out.println("veloc actual " + auto.velocidadActual);
    
    // podemos invocar las funciones que definimos abajo
    auto.acelerar();
    System.out.println("veloc luego funcion " + auto.velocidadActual);
    
    // mostramos los valores asignados en el constructor
    System.out.println("puertas " + auto.numeroDePuertas);
    System.out.println("veloc max " + auto.velocidadMaxima);
    
    //creamos otro objeto con paramtros (sobrecarga) (constructor overloading)
    Coche auto2 = new Coche(2, 90);
    System.out.println( "puertas " + auto2.numeroDePuertas);
    System.out.println( "velox max " + auto2.velocidadMaxima);

    }
        
}
//creamos clase en JAVA
class Coche {
    // creamos las propiedades que son variables o constantes
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    // creamos con constructor 
    public Coche(){
        //asignamos valores a las var
        numeroDePuertas = 4;
        velocidadMaxima = 120;
        System.out.println( "constructor sin parámetros");
    }

    // creamos otra con constructor pero pasandole parametros
    public Coche(int numeroDePuertas, int velocidadMaxima){
        // se colocan los mismos nomrbes de parametros y para defierenciarlos de los de la clase se agrega this adelante
        // el this hace referencia al definido en la clase
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println( "constructor con parámetros");
        
    }

    // creamos las funciones (metodos) que puede hacer
    public void acelerar (){
        velocidadActual +=15;
    }
    public void desacelerar(){}

}    

