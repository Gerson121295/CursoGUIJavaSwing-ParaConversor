package javaGUI;

import javax.swing.*;
import java.awt.event.*;

//#32 | Como pasar texto de un JTextField a un JTextArea

public class Formulario32 extends JFrame implements ActionListener{

    //Componentes que quiero usar en la interfaz grafica
    private JTextField textField1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1; //El TextArea va con JScrollPane
    private JButton boton1;

    String texto = ""; //Para alojar temporalmente el texto


    public Formulario32(){ //constructor: En el constructor le damos diseño a los componenetes
      setLayout(null);
      textField1 = new JTextField(); //Campo de texto donde el usuario agregara texto
      textField1.setBounds(10,10,200,30); //ubicacion y tamaño del textField1
      add(textField1);

      boton1 = new JButton("Agregar");
      boton1.setBounds(250,10,100,30); //ubicacion y tamaño del boton
      add(boton1);

      boton1.addActionListener(this); //habilita para que este a la escucha del boton1

      textArea1 = new JTextArea();
      scrollPane1 = new JScrollPane(textArea1); //dentro del JScrollPane va el textArea1
      scrollPane1.setBounds(10,50,400,300);//Ubicacion y tamaño del scrollPane1
      add(scrollPane1);//añade el diseño anterior al scrollPane1

    }


    //Programar el evento del Boton
    @Override
    public void actionPerformed(ActionEvent e) { //ActionEvent indica que quiero guarda el dato en espacio en memoria, en la variable e
    if(e.getSource() == boton1){ //el valor del eneto esta en la variable e y con getSource lo recupero el valor para luego compararlo con el boton1
        //Funcionalidad de la interfaz grafica
        texto += textField1.getText() + "\n"; //variable acumulador de texto para guardar los datos, se crea con el signo +=  con el metodo getText() recupera lo que esta escrito en textField1 luego lo acumula dentro de la variable texto.
        textArea1.setText(texto); //El metodo setText agrega el texto en textArea1
        textField1.setText(""); //Limpiar nuestro componente textField1
    }

    }

    public static void main(String[] args) {
        Formulario32 formulario32 = new Formulario32();
        formulario32.setBounds(0,0,540,400);//Ubicacion y tamaño de la interfaz
        formulario32.setVisible(true);//sea visible la interfaz
        formulario32.setResizable(false); //El usuario no podrá modificar el tamaño de la interfaz
        formulario32.setLocationRelativeTo(null); //La interfaz iniciará en el centro de la pantalla.

    }


}
