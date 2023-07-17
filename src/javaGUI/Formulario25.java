package javaGUI;

import javax.swing.*;

// #25 - JFrame

public class Formulario25 extends JFrame {
    public Formulario25(){
        setLayout(null);//permite a nosotros elegir donde ubicarlo
    }

    public static void main(String args[]){
        Formulario25 formulario25 = new Formulario25();
       // formulario25.setBounds(0,0,400,550); //0(todo a la izq), 0(que tan al alto 0muy arriba),400(que tan ancho,550(altura)
        formulario25.setBounds(350,100,400,550); //0(todo a la izq), 0(que tan al alto 0muy arriba),400(que tan ancho,550(altura)

        formulario25.setVisible(true);//indica a la interfaz que se vea
        formulario25.setLocationRelativeTo(null); // Coloca el formulario al centro de la pantalla omitiendo las config anteriores.
        formulario25.setResizable(false);//false no da permiso para que el usuario pueda modificar el tamaño del programa.

    }
}
