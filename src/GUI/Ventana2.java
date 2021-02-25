package GUI;

import java.awt.*;

public class Ventana2 extends Frame {
    private static Object Ventana2;
    private Button bNorte, bSur, bEste, bOeste, bCentro;

    public Ventana2(){
       super("Esta es la ventana 2");
       setLayout(new BorderLayout());

       bNorte = new Button("Norte");
        add(bNorte, BorderLayout.NORTH);

        bSur = new Button("Sur");
        add(bSur, BorderLayout.SOUTH);

        bEste = new Button("Este");
        add(bEste, BorderLayout.EAST);

        bOeste = new Button("Oeste");
        add(bOeste, BorderLayout.WEST);

        bCentro = new Button("Centro");
        add(bCentro, BorderLayout.CENTER);

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana2 = new Ventana2();
    }
}
