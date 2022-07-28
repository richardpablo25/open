package practicas;
public class Mainswitch {
    public static void main(String[] args) {
        var estacion = "verano";

        switch (estacion) {
            case "verano":
            System.out.println("es verano");
            break;
            case "invierno":
            System.out.println("es invierno");
            break;
            case "primavera":
            System.out.println("es primavera");
            break;
            default:
            System.out.println("es otra");
            break;
        }

        var hoy = "lunes";
        
        switch (hoy){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(hoy + " dia laborable");
                break;
            case "sabado":
            case "domingo":
                System.out.println(hoy + " dia no laborable");
                break;
        }
    }
}
