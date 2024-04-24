package DOO_Expendedor;

/** Clase Enum Seleccion
 * Este Enum contiene una lista de los productos, junto con sus precios
 * Producto(precio) */

public enum Seleccion {
    CocaCola(800),
    Sprite(800),
    Fanta(800),
    Snickers(600),
    Super8(400),
    Flipy(500);

    /** Propiedad privada final 'precio'
     * Número entero que contiene el precio de un de los productos */
    private final int precio;

    /** Método Seleccion()
     * @param precio, número entero con el precio de un de los productos
     * Iguala el precio entregado por el Enum a la propiedad 'precio' */
    Seleccion (int precio) {
        this.precio = precio;
    }

    /** Método getPrecio()
     * @return 'precio', número entero con el precio del producto elegido por Seleccion() */
    public int getPrecio() {
        return precio;
    }
}