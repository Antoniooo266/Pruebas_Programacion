package Refactoring;

public class Game {

    Player p;

    //...

    public void movement(Movimiento m){
        if (m == Movimiento.DERECHA){
            p.mueveDerecha();
        }

        if (m == Movimiento.IZQUIERDA){
            p.mueveIzquierda();
        }

        if (m == Movimiento.ARRIBA){
            p.mueveArriba();
        }

        if (m == Movimiento.ABAJO){
            p.mueveAbajo();
        }
    }
}
