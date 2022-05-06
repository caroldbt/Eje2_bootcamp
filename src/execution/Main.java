package execution;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 4;
        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo.");
        } else if (numeroIf == 0) {
            System.out.println("El numero " + numeroIf + " es igual a 0.");
        } else {
            System.out.println("El numero " + numeroIf + " es negativo.");
        }

        System.out.println("Bucle while");
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("Bucle do while");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        System.out.println("Bucle For");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("Switch");
        String estacion = "Invierno";
        switch (estacion) {
            case "Primavera":
                System.out.println("La estacion de primavera.");
                break;
            case "Verano":
                System.out.println("La estacion de verano.");
            case "Otoño":
                System.out.println("La estacion de otoño.");break;
            case "Invierno":
                System.out.println("La estacion de invierno.");
                break;
            default:
                System.out.println("Estacion incorrecta");
        }
    }
}