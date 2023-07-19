package javaGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// #36 | Programación de un menú con eventos (JMenuBar - JMenu - JMenuItem) - Cambia el color de pantalla.

public class Formulario36 extends JFrame implements ActionListener { //botones y menus usar ActionListener

    //Componentes a usar en nuestra interfaz
    private JMenuBar menuBar; //solo se podra crear un menu en una interfaz
    private JMenu menu1;
    private JMenuItem menuItem1, menuItem2, menuItem3;

    //Constructor para darle diseño a  los componentes
    public Formulario36(){
        setLayout(null); //para agregar coordenadas
        menuBar = new JMenuBar();//No se agrega texto
        setJMenuBar(menuBar); //Indicarle al programa que creará una barra en el programa
        //El menuBar no es necesario agregarle coordenada para hubicarlo y tamaño ya que automaticamente se agrega.

        //Pestañas desplegables
        menu1 = new JMenu("Opciones");
        menuBar.add(menu1); //menu1 lo agrega dentro de la barra menuBar.

        menuItem1 = new JMenuItem("Rojo");//Item de Opciones
        menuItem1.addActionListener(this);//Que este a la espera del evento de este menuItem1
        menu1.add(menuItem1); //agrega a menu1(Opciones) el menuItem1(Rojo)

        menuItem2 = new  JMenuItem("Verde");
        menuItem2.addActionListener(this);//habilito para que este atento al evento
        menu1.add(menuItem2); //agrega a menu1(Opciones) el menuItem2(Rojo)

        menuItem3 = new JMenuItem("Azul");
        menuItem3.addActionListener(this);
        menu1.add(menuItem3);


    }

    //Metodo de eventos de las opciones
    @Override
    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane(); //libreria awt

        if(e.getSource() == menuItem1 ){ //e.getSource recupera el evento y lo compare con el menuItem1
            fondo.setBackground(new Color(255,0,0)); //en caso de que halla sigo el menuItem1 el seleccionado
        }

        if(e.getSource() == menuItem2){
            fondo.setBackground(new Color(0,255,0));
        }

        if(e.getSource() == menuItem3){
            fondo.setBackground(new Color(0,0,255));
        }
    }

    //Diseño de la interfaz Grafica
    public static void main(String[] args) {
        Formulario36 formulario36 = new Formulario36();
        formulario36.setBounds(0,0,400,500);
        formulario36.setVisible(true);//Permite que la interfaz se visualice
        formulario36.setResizable(false);//User no tiene permiso para modificar el tamaño de la variable
        formulario36.setLocationRelativeTo(null);//La interfaz se colocará en el centro de la pantalla.

    }

}
