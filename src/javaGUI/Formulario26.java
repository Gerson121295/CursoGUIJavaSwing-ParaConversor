package javaGUI;

import javax.swing.*;
import java.awt.*;

public class Formulario26 extends JFrame {

    private JLabel label1;
    private JLabel label2;

    public Formulario26() {
        setLayout(null); //elementos con cordenadas
        label1  = new JLabel("Interfaz gráfica");
        label1.setBounds(10,20,300,30); //ubicar el label1
        add(label1); //para añadir la etiqueta a label1

        label2 = new JLabel("Version 1.0.");
        label2.setBounds(10,100,100,30);
        add(label2);
    }

    //Metodo main
    public static void main(String[] args) {
        //El objeto debe ser igual al de la clase
        Formulario26 formulario26 = new Formulario26(); //objeto para la interfaz - La interfaz no se puede mostrar si no le creamos un objeto que la ayude a mostrarse.
        //Diseño de la interfaz
        formulario26.setBounds(0,0,300,200); //ubicacion del formulario
        formulario26.setResizable(false); //User no puede modificar el tamaño de la interfaz
        formulario26.setVisible(true);//para que la interfaz se vea
        formulario26.setLocationRelativeTo(null);//para que la interfaz se ubique al centro de la pantalla.




    }

}
