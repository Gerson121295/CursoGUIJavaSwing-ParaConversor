package javaGUI;
import javax.swing.*;

//#30 | Interfaces gráficas (Swing - JTextArea)

public class Formulario30  extends JFrame{
    private JTextField textField1; //JTextField - Solo permite escribir en la misma linea de texto, no enter.
    private JTextArea textArea1; //JTextArea - Permite escribir en la misma linea y en la de abajo, permite dar enter y seguir escribiendo.

    //constructor para programar el diseño de los componenetes
    public Formulario30(){
        setLayout(null);//agrega coordenadas por el usuario

        textField1 = new JTextField();//No se agrega nombre a mostrar, pero si se puede
        textField1.setBounds(10,10,200,30); //Ubicacion y tamaño del boton
        add(textField1); //todo el diseño anterior se debe agregar a textField1.

        textArea1 = new JTextArea(); //TextArea iniciara en blanco, se pude agregar texto
        textArea1.setBounds(10,50,400,300);
        add(textArea1);//todo el diseño anterior se debe agregar a textArea1.
    }

    public static void main(String args[]){
        Formulario30 formulario30 = new Formulario30(); //Objeto para la interfaz
        formulario30.setBounds(0,0,540,400);
        formulario30.setVisible(true); //sea visible la interfaz
        formulario30.setResizable(false);//user no puede modificar el tamaño de la interfaz
        formulario30.setLocationRelativeTo(null); // La interfaz saldra al centro de la pantalla

    }
}

