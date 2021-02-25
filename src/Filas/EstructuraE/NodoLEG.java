package Filas.EstructuraE;

public class NodoLEG<E> {
    E dato;
    NodoLEG<E> siguiente;

    public NodoLEG(E dato, NodoLEG<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoLEG(E dato) {
        this(dato, null);
    }
}
