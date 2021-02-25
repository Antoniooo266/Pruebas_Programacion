package Filas.ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<Integer> intList = new ArrayList<Integer>();

        strList.add("Hola");
        strList.add("Mundo");

        intList.add(1);
        intList.add(3);

        System.out.println(strList.get(0));
        System.out.println(strList.set(0, "Adios"));
        System.out.println(strList.get(0));

    }
}
