package DOO_Expendedor;
/** Clase Sprite
 * Hija de la clase Bebida */

public class Sprite extends Bebida {

    /** Método CocaCola()
     * @param serie entero con el número de serie del producto */
    public Sprite(int serie) {
        super(serie);
    }

    /** Método sabor()
     * retorna el String "sprite" como el sabor del producto */
    public String sabor() {
        return "sprite";
    }
}