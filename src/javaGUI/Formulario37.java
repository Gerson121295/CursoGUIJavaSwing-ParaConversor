package javaGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//#37 | Programación de Submenus - Cambia tamaño y color de la pantalla segun menu y submenu seleccionado.

public class Formulario37 extends JFrame implements ActionListener {

    //Componentes a usar en nuestras interfaz
    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3; //Opciones
    private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4;


    //Constructor para dar diseño a los componetes
    public Formulario37(){
        setLayout(null);  //Para agregar coordenadas
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);//Indicarle al programa que creará una barra en el programa al principio de la interfaz grafica.
        //El menuBar no es necesario agregarle coordenada para hubicarlo y tamaño ya que automaticamente se agrega.

        //Pestaña desplegable
        menu1 = new JMenu("Opciones");
        menuBar.add(menu1); //agregar a menuBar el Menu1 llamado Opciones

        menu2 = new JMenu("Tamaño de la ventana"); //Este es un subMenu
        menu1.add(menu2); //menu2 es un subMenu de menu1 por lo que se agrego a menu1

        menu3 = new JMenu("Color de fondo"); //Este es un subMenu
        menu1.add(menu3);//menu3 es un subMenu de menu1 por lo que se agrego a menu1

        menuItem1 = new JMenuItem("300*200");
        menu2.add(menuItem1); //Se agrego menuItem1 al submenu menu2
        menuItem1.addActionListener(this); //Habilitar para que escuche eventos

        menuItem2 = new JMenuItem("640*480");
        menu2.add(menuItem2);
        menuItem2.addActionListener(this); //Habilitar para que escuche eventos

        menuItem3 = new JMenuItem("Rojo");
        menu3.add(menuItem3); //El menuItem3 se agrego al subMenu menu3
        menuItem3.addActionListener(this); //Habilitar para que escuche eventos

        menuItem4 = new JMenuItem("Verde");
        menu3.add(menuItem4);
        menuItem4.addActionListener(this); //Habilitar para que escuche eventos

    }

    //Para eventos
    @Override
    public void actionPerformed(ActionEvent e) { //El evento se guarda en la variable e

        if(e.getSource() == menuItem1){ //getSource obtiene el evento de la variable e
            setSize(300,200);//Cambiar el tamaño de la pantalla a esta dimensiones.
        }
        if(e.getSource() == menuItem2){
            setSize(640,480); //Cambiar el tamaño de la pantalla a esta dimension
        }
        if(e.getSource() == menuItem3){
            getContentPane().setBackground(new Color(255,0,0)); //Cambiar el color Rojo de fondo de la pantalla
        }
        if(e.getSource() == menuItem4){
            getContentPane().setBackground(new Color(0,255,0)); //Cambiar el color Verde de fondo de la pantalla
        }

    }

    //Diseño de la interfaz Grafica
    public static void main(String[] args) {
        Formulario37 formulario37 = new Formulario37();
        formulario37.setBounds(0,0,400,300);
        formulario37.setVisible(true);//Permite que la interfaz se visualice
        formulario37.setResizable(false);//User no tiene permiso para modificar el tamaño de la variable
        formulario37.setLocationRelativeTo(null);//La interfaz se colocará en el centro de la pantalla.
    }


}
