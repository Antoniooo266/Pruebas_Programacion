package Filas.EstructuraInt;

public class ColaInt {
    private NodoInt primero,ultimo;
    private int talla;

    public ColaInt(){
        primero = null;
        ultimo = null;
        talla = 0;
    }

    public void encolar (int x){
        NodoInt nuevo = new NodoInt(x);
        if (ultimo != null) {
            ultimo.siguiente = nuevo;
        } else {
            primero = nuevo;
            ultimo = nuevo;
            talla++;
        }

    }

    public int desencolar (){
        int x = primero.dato;
        primero = primero.siguiente;
        if (primero == null){
            ultimo = null;
            talla--;
        }
        return x;
    }

    public int primero(){
        return primero.dato;
    }

    public boolean vacia(){
        return primero == null;
    }

    public int talla(){
        return talla;
    }
}
