package Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicio1();

    }
    public static void Ejercicio1(){
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[4];
        float media = 0;
        for (int i=0; i < numeros.length; i++){
            System.out.println("Ingrese un numero: ");
            int num = sc.nextInt();
            numeros[i] = num;
            media += numeros[i];
            sc.close();
        }
        System.out.println("La media es " + media/4);
    }
    public static void Ejercicio2(){
        Scanner sc = new Scanner(System.in);

    }
}
