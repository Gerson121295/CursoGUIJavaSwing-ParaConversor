package javaGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//  #35 | Interfaces gráficas - Botón RGB - Usuario define el color del boton

public class Formulario35 extends JFrame implements ActionListener {

    //Agregar los componentes a usar en la interfaz
    private JLabel label1, label2, label3;
    private JComboBox combo1, combo2, combo3;
    private JButton boton1;

    //Constructor para agregar diseño a los componentes
    public Formulario35(){
        setLayout(null);
        label1 = new JLabel("Rojo:");
        label1.setBounds(10,10,100,10);
        add(label1);

        combo1 = new JComboBox();
        combo1.setBounds(120,10,50,30);

        for(int i = 0; i <= 255; i++){
            //Parcear el tipo de dato entero de "i" a string, ya que addItem(i) la "i" debe ser String
            combo1.addItem(String.valueOf(i)); //Toma el valor de "i" y lo comvierte a string, luego lo va a agregar al componente combo1
        }
        add(combo1); //agrega el diseño anterior a combo1


        label2 = new JLabel("verde");
        label2.setBounds(10,50,100,10);
        add(label2);

        combo2 = new JComboBox();
        combo2.setBounds(120,50,50,30);
        for (int i = 0; i<=255; i++){
            combo2.addItem(String.valueOf(i));
        }
        add(combo2);


        label3 = new JLabel("Azul");
        label3.setBounds(10,90,100,10);
        add(label3);

        combo3 = new JComboBox();
        combo3.setBounds(120,90,50,30);
        for (int i = 0; i<= 255; i++){
            combo3.addItem(String.valueOf(i));
        }
        add(combo3);

        boton1 = new JButton("Fijar color");
        boton1.setBounds(10,130,100,30);
        add(boton1);

        boton1.addActionListener(this); //Que este a la espera del evento de este boton

    }


    //Eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
            //Parcear los dato, obtener los item del combox en String
            String cad1 = combo1.getSelectedItem().toString(); //toString permite que el Resultado sale en tipo String luego se guarda en cad1
            String cad2 = combo2.getSelectedItem().toString();
            String cad3 = combo3.getSelectedItem().toString();

        //Parsear los datos: de tipo de dato String de las variables cad1,cad2,cad3 a tipo de dato int
            int rojo = Integer.parseInt(cad1);
            int verde = Integer.parseInt(cad2);
            int azul = Integer.parseInt(cad3);

            //color1 guardará los datos elegidos por el usuario para agregarle color al fondo del boton.
            Color color1 = new Color(rojo,verde,azul); //OBjeto de tipo color
            boton1.setBackground(color1);

        }

    }



    //Diseñar la interfaz grafica en el main
    public static void main(String[] args) {
        Formulario35 formulario35 = new Formulario35();
        formulario35.setBounds(0,0,200,210);
        formulario35.setVisible(true);//Permite que la interfaz se visualice
        formulario35.setResizable(false);//User no tiene permiso para modificar el tamaño de la variable
        formulario35.setLocationRelativeTo(null);//La interfaz se colocará en el centro de la pantalla.
    }
}
