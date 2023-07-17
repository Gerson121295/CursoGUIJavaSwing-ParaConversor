package ejemplosGUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//https://introcs.cs.princeton.edu/java/15inout/GUI.java.html

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;


    public GUI(){ //constructor
        //JFrame frame = new JFrame();
        frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);

        //JLabel label = new JLabel("Number of Clicks");
        label = new JLabel("Number of Clicks: 0 ");

        //JPanel panel = new JPanel();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //salir
        frame.setTitle("Nuestro GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count ++;
        label.setText("Numeros de Clics: "+ count);


    }
}
