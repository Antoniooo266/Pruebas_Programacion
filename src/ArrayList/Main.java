package ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicio1();
    }

    public static void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int n;
        int suma = 0;
        do {
            System.out.println("Introduce un numero (introduce el 0 para mostrar todos los numeros): ");
            n = sc.nextInt();
            if (n != 0) {
                numeros.add(n);
                suma += n;
            }
        } while (n != 0);

        System.out.println("Ha introducido " + numeros.size() + " numeros");

        System.out.println(numeros);

        System.out.println("La suma de los numeros es " + suma);

        System.out.println("La media es " + suma / numeros.size());

    }

    public static void Ejercicio2(){

    }
}
