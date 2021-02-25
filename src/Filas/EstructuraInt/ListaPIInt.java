package Filas.EstructuraInt;

public class ListaPIInt {
    private NodoInt primero, PI, antPI;
    private int talla;

    public ListaPIInt() {
        primero = null;
        PI = null;
        antPI = null;
        talla = 0;
    }

    public boolean vacia() {
        return talla == 0;
    }

    public boolean fin() {
        return PI == null;
    }

    public int talla() {
        return talla;
    }

    public void inicio() {
        PI = primero;
        antPI = null;
    }

    public void siguiente() {
        antPI = PI;
        PI = PI.siguiente;
    }

    public int recuperar() {
        return PI.dato;
    }

    public void insertar(int x) {
        if (PI == primero) {
            primero = new NodoInt(x, PI);
            antPI = primero;
        } else {
            antPI.siguiente = new NodoInt(x, PI);
            antPI = antPI.siguiente;
        }
        talla++;
    }

    public int eliminar() {
        int x = PI.dato;
        if (PI == primero) {
            primero = primero.siguiente;
        } else {
            antPI.siguiente = PI.siguiente;
            PI = PI.siguiente;
            talla--;
        }
        return x;
    }

    private boolean buscar(NodoInt ant, int x) {
        NodoInt aux;
        if (ant == null) aux = primero;
        else aux = ant.siguiente;
        while (aux != null && aux.dato != x) {
            ant = aux;
            aux = aux.siguiente;
        }
        if (aux == null) {
            return false;
        } else {
            antPI = aux;
            PI = aux;
            return true;
        }

    }

    public boolean buscarInicio(int x){
        return buscar(null,x);
    }

    public boolean buscarSiguiente(int x){
        return buscar(antPI,x);
    }
}

