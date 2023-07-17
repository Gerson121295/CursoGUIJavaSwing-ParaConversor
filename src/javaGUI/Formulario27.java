package javaGUI;

import javax.swing.*;
import java.awt.event.*;

public class Formulario27 extends JFrame implements ActionListener {//implements ActionListener debe estar atento a la escucha cuando se ejecute un evento(presione el boton, etc.)

    JButton boton1;
    //Los botones se diseñan en 2 parte: 1ro el diseño luego la funcionalidad.

    //Diseño del boton
    public Formulario27(){ //constructor
        setLayout(null); //Permite poner nuestro componentes en coordenadas, null para que quede a nuestra eleccion
        boton1 = new JButton("Cerrar");
        boton1.setBounds(300, 250,100,30); //Ubicar el boton1. derecha,abajo, ancho, alto
        add(boton1); //agregar al boton1

        //Agregar el evento
        boton1.addActionListener(this); //agregar evento al boton 1. this = este. Estas a la espera de lo que ocurra en este boton.


    }
    // funcionalidad(eventos) del boton.
    //
    @Override
    public void actionPerformed(ActionEvent e) { // para capturar el evento, cuando el usuario da clic. Guarda el evento en la variable e. es de tipo ActionEvent.

        if(e.getSource() == boton1){ //verifica que boton fue presionado. con getSource recuperamos el evento guadado enla variable e para despues compararlo con boton1
            System.exit(0); //cierra la interfaz grafica
        }
    }

    //Diseño de la interfaz grafica en el main
    public static void main(String[] args) {
        Formulario27 formulario27 = new Formulario27(); //objeto para la interfaz - La interfaz no se puede mostrar si no le creamos un objeto que la ayude a mostrarse. El objeto debe ser igual a la clase.
        formulario27.setBounds(0,0,450,350); //Ubicacion y tamaño de la interfaz grafica.
        formulario27.setVisible(true);//permite ver la interfaz
        formulario27.setResizable(false); //No permite que el usuario modifique el tamaño de la interfaz
        formulario27.setLocationRelativeTo(null); //Indica a la interfaz que se ubique al centro de la pantalla.
    }
}











