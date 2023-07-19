package javaGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// #40 | Interfaces gráficas (Swing - JRadioButton) - Conjunto de Opciones, solo 1 seleccionada.
public class Formulario40 extends JFrame implements ChangeListener {

    //Componentes necesarios para la interfaz
    private JRadioButton radio1, radio2, radio3; //Opciones
    private ButtonGroup bg;  //Grupo al que van a pertenecer las opciones

    //Constructor permite dar diseño a los componentes
    public Formulario40(){
        setLayout(null); //para las coordenadas

        bg = new ButtonGroup();//No se agrega nada en los parentecis se agrega las opciones mas adelante.

        radio1 = new JRadioButton("640*480");
        radio1.setBounds(10,20,100,30);//Ubicacion y tamaño de los radioButton
        radio1.addChangeListener(this); //Habilitar para eventos mas adelante
        add(radio1); //Agrega todo el diseño anterior a radio1
        bg.add(radio1); //agregar radio1 al grupo bg

        radio2 = new JRadioButton("800*600");
        radio2.setBounds(10,70,100,30); //Ubicacion y tamaño del radio2
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);

        radio3 = new JRadioButton("1024*768");
        radio3.setBounds(10,120,100,30); //Ubicacion y tamaño del radio2
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3); //Radio3 formará parte del grupo bg
    }

    //Para eventos
    @Override
    public void stateChanged(ChangeEvent e) {
        if(radio1.isSelected()){ //Solo 1 se activará, por eso no necesita comparar con el true, ya que JRadioButton solo permite seleccionar 1 y los demas estarán deseleccionados.
            setSize(640,480);
        }
        if(radio2.isSelected()){
            setSize(800,600);
        }
        if(radio3.isSelected()){
            setSize(1024,768);
        }

    }

    //Diseño de la interfaz en el main
    public static void main(String[] args) {
        Formulario40 formulario40 = new Formulario40();
        formulario40.setBounds(0,0,350,250);
        formulario40.setVisible(true);//Permite que la interfaz se visualice
        formulario40.setResizable(false);//User no tiene permiso para modificar el tamaño de la variable
        //formulario40.setLocationRelativeTo(null);//La interfaz se colocará en el centro de la pantalla.
    }

}
