package DOO_Expendedor;

/** Clase abstracta Dulce
 * Sub clase (Hija) de la clase Producto
 * Súper clase (Madre) de las clases Flipy, Super8 y Snickers */
public abstract class Dulce extends Producto {

    /** Método Dulce()
     * @param serie entero con el número de serie del producto */
    public Dulce(int serie) {
        super(serie);
    }

    /** Método abstracto sabor()
     * @return String con el sabor del producto */
    public abstract String sabor();
}
