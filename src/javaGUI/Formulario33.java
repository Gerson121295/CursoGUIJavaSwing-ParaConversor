package javaGUI;

import javax.swing.*;
import java.awt.event.*;

// #33 | Conversión de datos (Método Parse) - Suma de 2 num
public class Formulario33 extends JFrame implements ActionListener{

    //Componentes que quiero usar en la interfaz grafica
    private JTextField textField1, textField2;
    private JLabel label1, label2, label3;
    private JButton boton1;

    //Constructor
    public Formulario33(){
        setLayout(null);
        label1 = new JLabel("Valor 1:");
        label1.setBounds(50,5,100,30);//UBicacion y tamaño del label1
        add(label1); //el diseño anterior se agregue al label1

        label2 = new JLabel("Valor 2.");
        label2.setBounds(50,35,100,30);
        add(label2);//el diseño anterior se agregue al label2

        label3 = new JLabel("Resultado");
        label3.setBounds(120,80,100,30);
        add(label3); //el diseño anterior se agregue al label3

        textField1 = new JTextField();//no se agrega mensaje ya que es un campo de texto para que el usuario escriba el texto
        textField1.setBounds(120,10,150,20);
        add(textField1); //el diseño anterior se agregue al textField1

        textField2 = new JTextField();
        textField2.setBounds(120,40,150,20);
        add(textField2);

        boton1 = new JButton("Sumar");
        boton1.setBounds(10,80,100,30);
        add(boton1);

        boton1.addActionListener(this); //para activar que el boton este en escucha

    }


    //Programar el evento del Boton
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1){
            int valor1 = 0, valor2 = 0, resultado = 0;
            //parseo: Guardar momentaneamente en una variable(para que no se pierda el dato) luego pegarla en otra.
            //Valor 1
            /*valor 1 es entero y textField1 es de tipo texto, por lo que debo de indicarle al programa
            lo que recupere antes de asignarlo a la variable valor 1 debe de comvertirlo en un valor entero.
            //getText para recuperar el texto de textField1 para luego guardarlo en valor1

            parceo de un dato tipo String a un dato de tipo entero:
            Integer.parseInt(   dato a parsear );
            Integer.parseInt(textField1.getText());

            Luego del resultado del parseo es un entro ya lo podemos guardar en la variable de tipo entero.

            para float seria: Float.parseFloat(textField1.getText());
            */
            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());//Con el metodo getText recupero el texto del campo textField2( este texto es string) por lo que debo parcearlo para luego almacenar el dato en la variable valor 2 de tipo int

            resultado = valor1 + valor2;

            //Agregar el resultado en el label3
            label3.setText("resultado: " + resultado);

            //Limpiar los campos textField1 y textField2
            textField1.setText("");
            textField2.setText("");
        }
    }


    //diseño de la interfaz Grafica en el metodo main
    public static void main(String[] args) {
        Formulario33 formulario33 = new Formulario33();
        formulario33.setBounds(0,0,350,250);//Ubicacion y tamaño de la interfaz
        formulario33.setVisible(true);//sea visible la interfaz
        formulario33.setResizable(false); //El usuario no podrá modificar el tamaño de la interfaz
        formulario33.setLocationRelativeTo(null); //La interfaz iniciará en el centro de la pantalla.

    }
}