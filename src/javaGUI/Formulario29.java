package javaGUI;

import javax.swing.*;
import java.awt.event.*;

public class Formulario29 extends JFrame implements ActionListener { //implements ActionListener indica al programa que debe estar atento a la escucha cuando se ejecute un evento(presione el boton, etc.)

    private JTextField textField1;
    private JLabel label1;
    private JButton boton1;


    public Formulario29(){//Constructor
        //Diseño
        setLayout(null);//permite agregar coodernadas al componente
        label1 = new JLabel("Usuario: "); //Valor de label1
        label1.setBounds(10,10,100,30); //UBicacion y tamaño del label1
        add(label1);

        textField1 = new JTextField();//Cajita de texto no tendr texo, se puede agregar igual que los botones
        textField1.setBounds(120,17,150,20); //ubicacion y tamaño del textField
        add(textField1); //Agregar las config o diseño anterior hecho al textField1

        //diseño del boton
        boton1 = new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);

        boton1.addActionListener(this); //agregar evento al boton 1. this = este. Estas a la espera de lo que ocurra en este boton.

    }


    //Funcionalidad del evento - Captura el evento
    @Override
    public void actionPerformed(ActionEvent e) { //evento se guarda en la variable e(espacio de memoria)
        if(e.getSource() == boton1) {
            //al utilizar un elemento JTextField hace referencia a que se utilizará texto, por lo que necesitamos un espacion de tipo String
            String texto = textField1.getText();  //texto guarda lo que esta en textField1.getText(); -- Con getText ayuda a recuperar el texto que el usuario agrego al textField1 y lo guarde en texto
            setTitle(texto); //Colocar el texto escrito por el usuario en el titulo de la interfaz

        }
    }

    public static void main(String args[]){
        Formulario29 formulario29 = new Formulario29(); //Crea un objeto del tipo de la clase, para la interfaz
        formulario29.setBounds(0,0,300,150); //ubicacion y tamaño de la interfaz
        formulario29.setVisible(true);//visible la interfaz
        formulario29.setResizable(false);//evita que el usuario modifique el tamaño de la interfaz
        formulario29.setLocationRelativeTo(null);//Agrega la interfaz en medio de la pantalla
    }
}










