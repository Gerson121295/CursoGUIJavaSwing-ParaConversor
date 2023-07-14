import java.util.Scanner;

public class Conversor {

    public static void mostrarMenu(){
        System.out.println("=============================");
        System.out.println("Bienvenido al Conversor ONE =]");
        System.out.println("1 - cm -->  metros");
        System.out.println("2 - metros -->  cm ");
        System.out.println("9 - salir");
        System.out.println("Elija una opcion valida: ");
        System.out.println("=============================");
    }

    public static void conversion(String unidadOrigen, String unidadDestino,
                                  double proporcion, Scanner lector){
        System.out.println("Elegiste la opción: "+ unidadOrigen+ " -> "+unidadDestino);
        System.out.println("Ingrese con el valor:");
        double valor = lector.nextDouble();// valor guarda el dato que usuario ingreso en el lector
        double valorFinal = valor * proporcion;
        System.out.println("Valor Final = " + valorFinal);

    }

}
