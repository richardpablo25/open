package practicas;
public class Mainejercicio4 {
    public static void main(String[] args) {
        
        // IF
        int numerolf = 0;
        if (numerolf > 0){
            System.out.println("Es positivo");
        } else if (numerolf < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es cero");
        }
        
        // WHILE
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        
        //DO WHILE
        int numeroDoWhile = 0;
        do {
             System.out.println(numeroDoWhile);
             numeroDoWhile++;
         } while(numeroDoWhile < 1);
        
    
        //FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //SWITCH
        var estacion = "verano";
        switch (estacion){
        case "verano":
            System.out.println("es verano");
            break;
        case "invierno":
            System.out.println("es invierno");
            break;
        case "otoño":
            System.out.println("es otoño");
            break;
        case "primavera":
            System.out.println("es primavera");
            break;
        default:
            System.out.println("no es una estación");
            break;

        }

    }
    
}


    

