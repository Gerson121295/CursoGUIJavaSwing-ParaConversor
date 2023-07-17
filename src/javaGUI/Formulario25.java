package javaGUI;

import javax.swing.*;

public class Formulario25 extends JFrame {
    public Formulario25(){
        setLayout(null);//permite a nosotros elegir donde ubicarlo
    }

    public static void main(String args[]){
        Formulario25 formulario25 = new Formulario25();
       // formulario25.setBounds(0,0,400,550); //0(todo a la izq), 0(que tan al alto 0muy arriba),400(que tan ancho,550(altura)
        formulario25.setBounds(350,100,400,550); //0(todo a la izq), 0(que tan al alto 0muy arriba),400(que tan ancho,550(altura)

        formulario25.setVisible(true);//indica a la interfaz que se vea

    }
}
