package Refactoring;

import java.util.ArrayList;

public class Profesor extends Persona{

   String name;
   int edad;
   ArrayList<String> prestamos;


    public Profesor(String numeroTelefono) {
        super(numeroTelefono);
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroTelefono);
    }

    public void printTodaLaInformacion(){
        printInformacionPersonal();
        for (String libro:prestamos) {
            System.out.println(libro);
        }
    }
}
