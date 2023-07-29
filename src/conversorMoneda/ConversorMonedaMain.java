package conversorMoneda;

import java.util.Scanner;

public class ConversorMonedaMain {
    public static void main(String[] args) {
        EXTERNA:
        while (true) {
            System.out.println("Conversor de Monedas");
            System.out.println("1 - Quetzales a dolar\n"
                               + "2 - Quetzales a Euros\n"
                                + "3 - Quetzales a Libras esterlinas\n"
                                + "4 - Salir");

            System.out.println("Ingrese una opcion: ");
            Scanner entrada = new Scanner(System.in);
            char opcion = entrada.next().charAt(0);

            switch (opcion){
                case '1':
                    convertirMoneda(7.84, "Quetzales ");
                    break;
                case '2':
                    convertirMoneda(8.69, "Euros");
                    break;
                case '3':
                    convertirMoneda(10.06, "Libras esterlinas");
                    break;
                case '4':
                    System.out.println("Cerrando Programa.");
                    break EXTERNA; //afecta al switch y al while obligandolo a cerrar
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }

        }
    }


    static void convertirMoneda(Double valor, String monedaPaisAConvertir){
        Scanner entrada = new Scanner(System.in);
        //System.out.printf("Ingrese la cantidad a convetir %s: ", monedaPaisAConvertir);
        System.out.print("Ingrese la cantidad a convetir: "+ monedaPaisAConvertir);
        double cantidadMoneda = entrada.nextDouble();
        double dolares = cantidadMoneda / valor;
        dolares = (double) Math.round(dolares*100d)/100;
        System.out.println("Tienes $ "+dolares+" \n");

        }

}
