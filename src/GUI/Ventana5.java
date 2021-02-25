package GUI;

import javax.swing.*;
import java.awt.*;

public class Ventana5 extends JFrame {
    public Ventana5(){
        super("Esta es la ventana 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3, 5, 5));

        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton("" + i));
        }
        p1.add(new JButton("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JTextField("Aqui va el tiempo"), BorderLayout.NORTH);

        p2.add(p1, BorderLayout.CENTER);

        add(p2, BorderLayout.EAST);
        add(new JButton("Aqui va la comida"), BorderLayout.CENTER);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana5 v5 = new Ventana5();
    }
}
