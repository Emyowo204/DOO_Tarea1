package TESTING_1;

import java.util.ArrayList;

public enum Seleccion {
    CocaCola(100),
    Sprite(200),
    Fanta(300),
    Snickers(400),
    Super8(500),
    Flippy(600);
    private final int precio;
    Seleccion (int precio) {
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }
}
