package javaGUI;
import javax.swing.*;
import java.awt.event.*;

// #25 - Interfaces gráficas (Manejo de botones & etiquetas)
public class Formulario28 extends JFrame implements ActionListener { //implements ActionListener indica al programa que debe estar atento a la escucha cuando se ejecute un evento(presione el boton, etc.)

    private JLabel label1;
    private JButton boton1, boton2, boton3;
    //Los botones se diseñan en 2 parte: 1ro el diseño luego la funcionalidad.

    //Diseño del boton
    public Formulario28(){
        setLayout(null);
        boton1 = new JButton("1");// nombre del boton1
        boton1.setBounds(10,100,90,30);//Ubicacion y tamaño del boton
        add(boton1); //agregar el boton1

        boton1.addActionListener(this);//agregar evento al boton 1. this = este. Estas a la espera de lo que ocurra en este boton.

        //Boton 2
        boton2 = new JButton("2"); //Name del boton
        boton2.setBounds(110,100,90,30);//Ubicacion y tamaño del boton
        add(boton2); //Agregar el boton2
        boton2.addActionListener(this);//agregar evento al boton 2. this = este. Estas a la espera de lo que ocurra en este boton.

        //Boton 2
        boton3 = new JButton("3"); //Name del boton
        boton3.setBounds(210,100,90,30);//Ubicacion y tamaño del boton
        add(boton3); //Agregar el boton2
        boton3.addActionListener(this);//agregar evento al boton 3. this = este. Estas a la espera de lo que ocurra en este boton.

        label1 = new JLabel("En espera...");
        label1.setBounds(10,10,300,30);//Ubicacion y tamaño del label1
        add(label1);//Agregar el diseño anterior al label1

    }

    // Funcionalidad(eventos) del boton.
    @Override
    public void actionPerformed(ActionEvent e) { // para capturar el evento, cuando el usuario da clic. Guarda el evento en la variable e. es de tipo ActionEvent.
    if(e.getSource() == boton1){//verifica que boton fue presionado. con getSource recuperamos el evento guadado enla variable e para despues compararlo con boton1
        label1.setText("Has presionado el boton 1");//agregar texto al label
    }
    if(e.getSource() == boton2){
        label1.setText("Haz presionado el boton 2");
    }
    if(e.getSource() == boton3){
        label1.setText("Haz presionado el boton 3");
    }
    }

    //Diseño de nuestra interfaz grafica
    public static void main(String args[]){
        Formulario28 formulario28 = new Formulario28(); //Creacion del objeto para la interfaz debe ser igual o del tipo a la clase.
        formulario28.setBounds(0,0,350,200);//ubicacion y tamaño de la interfaz
        formulario28.setVisible(true);//Permite ver la interfaz
        formulario28.setResizable(false);//Evita que el usuario pueda modificar el tamaño
        formulario28.setLocationRelativeTo(null);//agrega la interfaz al centro de la pantalla
    }


}
