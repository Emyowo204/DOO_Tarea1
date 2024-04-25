package DOO_Expendedor;

/** Clase Snickers
 * Sub clase (Hija) de la clase Dulce */

public class Snickers extends Dulce{

    /** Método Snickers()
     * @param serie entero con el número de serie del producto */
    public Snickers(int serie) {
        super(serie);
    }

    /** Método sabor()
     * @return el String "snickers" como el sabor del producto */
    public String sabor() {
        return "snickers";
    }
}
