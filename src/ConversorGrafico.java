import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorGrafico extends JFrame { //extends JFrame para interfaz grafico

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem opcion1; // cm --> mts
    private JMenuItem opcion2; // mts --> cm
    private JMenuItem opcion3; // Salir

    public ConversorGrafico(){ // contructor

        setSize(600, 400);//(width, height) - Medidas de la pantalla. Base, Ventana Madre.
        setTitle("Converson ONE =] "); //Titulo de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cerra la ventana(terminar la ejecucion del programa). //cerrar al clicar la X

        JPanel panel= new JPanel();
        mostrarMenu();
        panel.add(menuBar);
        add(panel);

    }

    public void mostrarMenu(){
        //Iniciacion de los atributos
        menuBar = new JMenuBar();
        menu = new JMenu("Elija una opcion valida: ");
        opcion1 = new JMenuItem("Centimetros --> Metros");
        opcion2 = new JMenuItem("Metros --> Centimetros");
        opcion3 = new JMenuItem("Salir");

        menu.add(opcion1);
        menu.add(opcion2);
        menu.add(opcion3);

        menuBar.add(menu);

        opcion3.addActionListener(new ActionListener() { //interfaz ActionListener
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Que pena! saliendo del programa ..,");
                System.exit(0);//salir
            }
        });

    }


    public static void main(String[] args) {
        ConversorGrafico ventana = new ConversorGrafico();
        ventana.setVisible(true);

    }
}
