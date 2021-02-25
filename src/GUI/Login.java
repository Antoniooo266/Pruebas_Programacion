package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPasswordField Pass;
    private TextField User;
    private JLabel Label;
    private JButton LoginB;

    private String Usuario = "antonio";
    private String Contraseña = "1234";


    public Login(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,2,5,5));
        p1.add(new Label("Usuario"));
        p1.add(User = new TextField());
        p1.add(new Label("Contraseña"));
        p1.add(Pass = new JPasswordField());
        p1.add(LoginB = new JButton("Login"));
        p1.add(new JButton("Oldide la cont"));
        LoginB.addActionListener(new Login.ListenerBoton());

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(Label = new JLabel(), BorderLayout.SOUTH);
        p2.add(p1, BorderLayout.CENTER);

        add(p2);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Login l1 = new Login();
    }

    private class ListenerBoton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        if (User.getText().equals(Usuario) && Pass.getText().equals(Contraseña)){
            Label.setText("Contraseña Correcta");
            Label.setForeground(Color.green);
        }else{
            Label.setText("Una pena");
            Label.setForeground(Color.red);
        }
        }
    }
}
