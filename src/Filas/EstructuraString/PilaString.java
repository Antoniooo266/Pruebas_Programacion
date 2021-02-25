package Filas.EstructuraString;

public class PilaString {
    private NodoString cima;
    private int talla;

    public PilaString(){
        cima = null;
        talla = 0;
    }

    public void apilar (String x){
        cima = new NodoString(x,cima);
        talla++;
    }

    public String desapilar (){
        String x = cima.dato;
        cima = cima.siguiente;
        talla--;
        return x;
    }

    public String cima(){
        return cima.dato;
    }

    public boolean vacia(){
        return cima == null;
    }

    public int talla(){
        return talla;
    }
}
