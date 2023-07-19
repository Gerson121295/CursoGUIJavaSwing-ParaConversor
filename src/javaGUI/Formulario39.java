package javaGUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//#39 | Botón para Aceptar términos y condiciones (JButton - JCheckBox)

public class Formulario39 extends JFrame implements ActionListener, ChangeListener {//Para la escucha de eventos: ActionListener - para botones, ChangeListener - para checkBox

    //Componentes a utilizar en la interfaz
    private JLabel label1;
    private JCheckBox check1;
    private JButton button1;

    //Constructor nos permite diseñar los componentes
    public Formulario39(){
        setLayout(null);// para las coordenadas

        label1 = new JLabel("Aceptar terminos y condiciones");
        label1.setBounds(10,10,400,30); //Ubicacion y tamaño del label1
        add(label1); //añade el diseño anterior a label1

        check1 = new JCheckBox("Acepto");
        check1.setBounds(10,50,100,30);
        check1.addChangeListener(this); //Habilitar la escucha de eventos
        add(check1); //Agrega el diseño anterior a check1

        button1 = new JButton("Continuar");
        button1.setBounds(10,100,100,30);
        add(button1);
        button1.addActionListener(this);//Habilitar la escucha de evento del boton
        button1.setEnabled(false); //false indica que el boton esta desactivado, solo se activará cuando el check este seleccionado.

    }

    //Para Eventos de Boton y CheckBox

    //Eventos para el checkBox
    @Override
    public void stateChanged(ChangeEvent e) {
    if(check1.isSelected() == true){//si el check1 esta seleccionado
        button1.setEnabled(true); //true -> El boton este habilitado
    }else{
        button1.setEnabled(false); //false -> El boton este deshabilitado
    }
    }

    //Eventos para el Boton
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1){
            System.exit(0);//Cuando el boton sea precionado se cierre la interfaz
        }
    }


    //Diseño de la interfaz en el main
    public static void main(String[] args) {
        Formulario39 formulario39 = new Formulario39();
        formulario39.setBounds(0,0,400,300);
        formulario39.setVisible(true);//Permite que la interfaz se visualice
        formulario39.setResizable(false);//User no tiene permiso para modificar el tamaño de la variable
        formulario39.setLocationRelativeTo(null);//La interfaz se colocará en el centro de la pantalla.
    }

}
