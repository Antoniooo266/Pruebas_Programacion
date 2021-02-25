package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana7 extends JFrame {
    private JButton boton1;
    private JLabel label;

    Ventana7(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        boton1 = new JButton("Pulsa");
        label = new JLabel("Pulasaciones: 0");
        add(boton1);
        add(label);
        boton1.addActionListener(new ListenerBoton());
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana7 v6 = new Ventana7();
    }

    private class ListenerBoton implements ActionListener {
        private int contador;
        @Override
        public void actionPerformed(ActionEvent e) {
            contador++;
            label.setText("Pulsaciones: " + contador);
        }
    }
}


