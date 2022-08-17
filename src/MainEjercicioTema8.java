public class MainEjercicioTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
            persona.setEdad (25);
            persona.setNombre( "Pablo");
            persona.setTelefono( 55555555);

            int edad = persona.getEdad();
            String nombre = persona.getNombre();
            int telefono = persona.getTelefono();

            System.out.println("Nombre: " + nombre + "  Edad: " + edad + "  Teléfono: " + telefono);

        }

    }

class Persona {
 
    private int edad;
    private String nombre;
    private int telefono;
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}

    
 

