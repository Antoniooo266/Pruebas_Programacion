package Filas.EstructuraString;

public class NodoString {
    public String dato;
    public NodoString siguiente;
    public NodoString(String dato, NodoString siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoString(String dato) {
        this.dato = dato;
    }
}
