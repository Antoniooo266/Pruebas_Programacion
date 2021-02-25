package GUI;

import java.awt.*;

public class Ventana1 extends Frame {
    private static Object Ventana1;
    private Button b1,b2,b3;

    public Ventana1(){
        super("Esta es la ventana 1");
        setLayout(new FlowLayout());

        b1 = new Button("boton 1");
        add(b1);
        b2 = new Button("boton 2");
        add(b2);
        b3 = new Button("boton 3");
        add(b3);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana1 = new Ventana1();
    }
}
