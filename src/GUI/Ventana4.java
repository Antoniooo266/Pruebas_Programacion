package GUI;

import javax.swing.*;
import java.awt.*;

public class Ventana4 extends JFrame {
    private static Object Ventana4;
    private JButton b1, b2, b3;
    
    public Ventana4(){
        super("Esta es la ventana 1");
        setLayout(new FlowLayout());

        b1 = new JButton("boton 1");
        add(b1);
        b2 = new JButton("boton 2");
        add(b2);
        b3 = new JButton("boton 3");
        add(b3);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana4 = new Ventana4();
    }
}


