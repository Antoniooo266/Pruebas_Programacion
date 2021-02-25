package Filas.EstructuraE;

public class ColaEnla<E> {
    NodoLEG<E> primero, ultimo;
    int talla;

    public ColaEnla(){
        primero = null;
        ultimo = null;
        talla = 0;
    }

    public void encolar(E x){
        NodoLEG nuevo = new NodoLEG(x);
        if(ultimo != null){
            ultimo.siguiente = nuevo;
        }else{
            primero = nuevo;
            ultimo = nuevo;
            talla++;
        }
    }
}
