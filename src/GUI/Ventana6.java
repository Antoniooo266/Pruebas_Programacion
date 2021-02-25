package GUI;

import javax.swing.*;
import java.awt.*;

public class Ventana6 extends JFrame {
    public Ventana6(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new Label("Escribe aqui"), FlowLayout.LEFT);
        p1.add(new JButton("A Fº"));
        p1.add(new JButton("A Cº"));

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new TextField("Introduce los grados"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        add(p2, BorderLayout.CENTER);

        setSize(400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {
        Ventana6 v6 = new Ventana6();
    }
}
