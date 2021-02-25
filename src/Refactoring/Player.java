package Refactoring;

public class Player {

    int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void mueveDerecha(){
        x += 1;
    }

    public void mueveIzquierda(){
        x -= 1;
    }

    public void mueveArriba(){
        y += 1;
    }

    public void mueveAbajo(){
        y -= 1;
    }
}
