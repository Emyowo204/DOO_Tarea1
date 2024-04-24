package TESTING_1;
import java.util.ArrayList;

public enum Seleccion {
    CocaCola(800),
    Sprite(800),
    Fanta(800),
    Snickers(600),
    Super8(400),
    Flipy(500);
    private final int precio;
    Seleccion (int precio) {
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }
}
