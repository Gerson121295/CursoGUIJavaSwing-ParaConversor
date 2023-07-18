package javaGUI;

import javax.swing.*;

// #31 | Interfaces gráficas (Swing - JScrollPane)

public class Formulario31 extends JFrame {

    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;

    public Formulario31(){ //constructor: En el constructor le damos diseño a los componenetes
        setLayout(null);
        //Diseño de los componentes
        textField1 = new JTextField();
        textField1.setBounds(10,10,200,30);//ubicacion y tamaño del testField1
        add(textField1); //agregar el diseño anterior al textField1

        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane(textArea1);//textArea1 estará dentro del objeto JScrollPane, para que las barras ayuden a recorrer el texto que tiene adento del textArea1
        scrollPane1.setBounds(10,50,400,300);//Diseño al scrollPane1: se define la ubicacion y el tamaño.
        add(scrollPane1); //todo el diseño anterior se debe agregar dentro del scrollPane1.

    }

    //Dentro del metodo main hacemos el diseño de nuestra interfaz

    public static void main(String args[]){
        Formulario31 formulario31 = new Formulario31();

        formulario31.setBounds(0,0, 540,400);//ubicacion y diseño de la interfaz.
        formulario31.setVisible(true);//permite que se vea la interfaz
        formulario31.setResizable(false); //Evita que el usuario cambiel el tamaño de la interfaz
        formulario31.setLocationRelativeTo(null);//la interfaz se situe al centro de la pantalla.

    }
}
