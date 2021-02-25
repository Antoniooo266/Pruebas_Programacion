package Filas.EstructuraInt;

public class PilaInt {
    private NodoInt cima;
    private int talla;

    public PilaInt(){
        cima = null;
        talla = 0;
    }

    public void apilar (int x){
        cima = new NodoInt(x,cima);
        talla++;
    }

    public int desapilar (){
        int x = cima.dato;
        cima = cima.siguiente;
        talla--;
        return x;
    }

    public int cima(){
        return cima.dato;
    }

    public boolean vacia(){
        return cima == null;
    }

    public int talla(){
        return talla;
    }
}
