package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicio3();

    }

    public static void Ejercicio1() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        float media = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            int num = sc.nextInt();
            numeros[i] = num;
            media += numeros[i];
            sc.close();
        }
        System.out.println("La media es " + media / 4);
    }

    public static void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        float[] numeros = new float[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            int num = sc.nextInt();
            numeros[i] = num;
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void Ejercicio3(){
        Scanner sc = new Scanner(System.in);
        int[] dmes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i= 0;i < dmes.length; i++){
            System.out.println("Indique el mes: ");
            int mes = sc.nextInt();
            dmes[i] = mes;
            sc.close();
        }
        System.out.println("El mes seleccionado tiene ");
    }
}
