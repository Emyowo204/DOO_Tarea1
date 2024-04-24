package DOO_Expendedor;

/** Clase abstracta Bebida
 * Sub clase (Hija) de la clase Producto
 * Súper clase (Madre) de las clases CocaCola, Sprite y Fanta */

public abstract class Bebida extends Producto {

    /** Método Bebida()
     * @param serie entero con el número de serie del producto */
    public Bebida(int serie) {
        super(serie);
    }

    /** Método abstracto sabor()
     * @return String con el sabor del producto */
    public abstract String sabor();
}
