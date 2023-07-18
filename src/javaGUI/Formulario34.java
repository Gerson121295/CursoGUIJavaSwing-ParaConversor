package javaGUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

// #34 | Interfaces gráficas (Swing - JComboBox) - Agrega al titulo de la interfaz la opcion seleccionada
public class Formulario34 extends JFrame implements ItemListener { //implements ItemListener a la espera de crear el evento del item

    //Componentes a usar en la interfaz
    private JComboBox comboBox1;


    //Diseño del constructor para darle diseño a los componentes
    public Formulario34(){
        setLayout(null); //Agregar coordenadas a los elementos

        comboBox1 = new JComboBox();// NO se recomienda agregar texto
        comboBox1.setBounds(10,10,80,20);
        add(comboBox1); //agregar el diseño anterior a comboBox1

        //Introducir el texto de la lista desplegable del comboBox1
        comboBox1.addItem("rojo");
        comboBox1.addItem("verde");
        comboBox1.addItem("Azul");
        comboBox1.addItem("amarillo");
        comboBox1.addItem("negro");

        //Agregar un evento al comboBox1
        comboBox1.addItemListener(this); //this esto tendra un evento

    }

    //Diseño del evento de la lista
    @Override
    public void itemStateChanged(ItemEvent e) { //variable e guarda el evento de tipo ItemEvent

        if(e.getSource() == comboBox1){ //getSource recupera el evento del espacio en memoria guardado en la variable e y lo compara con el comboBox1
            //Recupera los elementos(listas) del combox como texto

            // El metodo toString comvierte en texto lo que el usuario halla seleccionado(getSelectedItem() del comboBox1 para luego guardar en seleccion.
            String seleccion = comboBox1.getSelectedItem().toString(); //getSelectedItem() recupera el texto que el usuario halla seleccionado de la lista, y el toString lo convierte el texto seleccionado en String para luego guardar en seleccion
            setTitle(seleccion); //Agrega a titulo de la interfaz la opcion seleccionada por el usuario en el comboBox1
        }
    }

    //Metodo main
    public static void main(String[] args) {
        Formulario34 formulario34 = new Formulario34();
        formulario34.setBounds(0,0,300,250); //Ubicacion y tamaño del formulario
        formulario34.setVisible(true); //La interfaz sea visible
        formulario34.setResizable(false); //Usuario no pueda modificar el tamaño de la interfaz
        formulario34.setLocationRelativeTo(null); //La interfaz se agrega al centro de la pantalla

    }
}
