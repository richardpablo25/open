public class main2 {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.IncPuertas();
        System.out.println(miCoche.puertas);
    }
    
    
}

class coche {
    public int puertas = 3;

    public void IncPuertas() {
        this.puertas++;
    }
}