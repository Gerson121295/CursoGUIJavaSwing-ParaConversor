package javaGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


//#38 | Interfaces gráficas (Swing - JCheckBox) - Nombre del checkbox seleccionado se agrega de titulo de la interfaz.

public class Formulario38 extends JFrame implements ChangeListener { // implements ChangeListener - Para eventos de JCheckBox

    //Componentes a utilizar en la interfaz
    private JCheckBox check1, check2, check3;


    //Constructor permite diseñar los componentes
    public Formulario38(){
        setLayout(null); // para las coordenadas de los componentes

        check1 = new JCheckBox("Inglés");
        check1.setBounds(10,10,150,30);//Ubicacion y tamaño del checkBox
        add(check1); //Todo el diseño anterior es para el check1
        check1.addChangeListener(this); //Habilitar para escuchar un evento

        check2 = new JCheckBox("Francés");
        check2.setBounds(10,50,150,30);
        add(check2); //Todo el diseño anterior es para el check1
        check2.addChangeListener(this); //Habilitar para escuchar un evento

        check3 = new JCheckBox("Alemán");
        check3.setBounds(10,90,150,30);
        add(check3); //Todo el diseño anterior es para el check1
        check3.addChangeListener(this); //Habilitar para escuchar un evento

    }

    //Eventos a los JCheckBox
    @Override
    public void stateChanged(ChangeEvent e) { //los eventos se guardan en el espacio de memoria en la variable "e"

       String cad = ""; //Guarda temporal el valor del checkbox para luego pegarlo de titulo de la interfaz

        if (check1.isSelected() == true){ //Si el componente check1 es seleccionado
            cad = cad + "Inglés-";
        }
        if (check2.isSelected() == true){
            cad = cad + "Francés-";
        }
        if (check3.isSelected() == true){
            cad = cad + "Alemán-";
        }
        setTitle(cad); //Agrega el valor a mostrar de titulo segun el checkBox seleccionado

    }


    //Diseño de la interfaz en el main
    public static void main(String[] args) {
        Formulario38 formulario38 = new Formulario38();
        formulario38.setBounds(0,0,400,300);
        formulario38.setVisible(true);//Permite que la interfaz se visualice
        formulario38.setResizable(false);//User no tiene permiso para modificar el tamaño de la variable
        formulario38.setLocationRelativeTo(null);//La interfaz se colocará en el centro de la pantalla.
    }

}
