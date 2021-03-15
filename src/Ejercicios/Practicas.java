package Ejercicios;

import java.util.Scanner;

public class Practicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase = sc.nextLine();
        String cambiada = Ejercicio7(frase);
        System.out.println(cambiada);
    }
    public static String palabraEspejo(String palabra){
        char[] letras = palabra.toCharArray();
        String res = palabra;
        for(int i = letras.length - 2; i >= 0; i--){
            res += letras[i];
        }
        return res;
    }

    public static String Ejercicio7(String frase){
        String[] palabras = frase.split(" ");
        String aux = palabras[0];
        palabras[0] = palabras[palabras.length-1];
        palabras[palabras.length-1] = aux;
        String res = " ";
        for (int i = 0; i < palabras.length; i++){
            res += palabras[i];
            res += " ";
        }
        return res;
    }
}
