package practicas;



public class objetosprovacidad {
   
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();

        // usamos set para setear el valor:
        vehiculo.setTipo("Coche");
        vehiculo.setRapido(true);

        // usamos get para traer el valor
        String tipo = vehiculo.getTipo();
        
        System.out.println("vehiculo tipo " + tipo);
        System.out.println("Es rápido " + vehiculo.isRapido());


        // otra instancia
        Vehiculo moto = new Vehiculo();
        moto.setTipo("Honda");
        moto.setRapido(false);
        System.out.println("moto tipo "+ moto.getTipo() + " Es rápido " + moto.isRapido());

    }
}

    class Vehiculo {
        // definimos las propiedades como privadas
        private String tipo;

        // creamos una nueva variable qu e vamos a utilizar solo dentro de la clase
        // entonces no hay que utilizar getter y setter
        private int estado;

        // para el caso de variables boolean el setter queda igual pero cambia el getter que se usa this
        private boolean rapido;

        // usamos setter para poder pasar el valor del parámetro
        // usamos this porque el nombre es el mismo 
        
        
        public void setRapido(boolean rapido){
            this.rapido = rapido;
        }
        public boolean isRapido(){
            return  this.rapido;
        }
        
        public void setTipo(String tipo){
            if (this.estado == 0){
            this.tipo = tipo;
            }
        }

        // usamos getter para poder devolver el valor del parámetro
        public String getTipo(){
            return this.tipo;
        }
    }
 

