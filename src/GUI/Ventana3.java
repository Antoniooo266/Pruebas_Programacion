package GUI;

import java.awt.*;

public class Ventana3 extends Frame {
    private Button b1,b2,b3,b4,b5,b6;
    
    public Ventana3(){
        super("Esta es la ventana 3");
        setLayout(new GridLayout());

        b1 = new Button("boton 1");
        add(b1);
        b2 = new Button("boton 2");
        add(b2);
        b3 = new Button("boton 3");
        add(b3);
        b4 = new Button("boton 4");
        add(b4);
        b5 = new Button("boton 5");
        add(b5);
        b6 = new Button("boton 6");
        add(b6);
        
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        Object ventana3 = new Ventana3();
    }
}
