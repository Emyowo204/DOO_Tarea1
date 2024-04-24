package DOO_Expendedor;
/** Clase abstracta Bebida
 * Hija de la clase Producto y Madre de las clases CocaCola, Sprite y Fanta */

public class Bebida{

    /** Método Bebida()
     * @param serie entero con el número de serie del producto */
    public Bebida(int serie) {

    }

    /** Método abstracto sabor()
     * @return String con el sabor del producto */
    public String sabor() {
        return null;
    }
}
