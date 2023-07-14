import java.util.Scanner;

public class ConversorApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int input = 0;

        while (input != 9){
            Conversor.mostrarMenu(); //gracias a que el metodo mostrarMenu esta defifnido static no es necesario crear un objeto para su llamada.
            input = entrada.nextInt();// El valor de entrada se guarda en input.

            switch (input){
                case 1 :
                    Conversor.conversion("cm", "metros", 0.01, entrada);
                    break;
                case 2:
                    Conversor.conversion("metros", "cm",  100, entrada);
                    break;
                case 9:
                    System.out.println("Que pena! Saliendo del programa ...");
                    break;
                default:
                    System.out.println("Elija una opcion valida!");
                    break;
            }
            System.out.println();
        }
        entrada.close(); //cierre de la entrada de texto, liberacion del recurso.
    }
}
