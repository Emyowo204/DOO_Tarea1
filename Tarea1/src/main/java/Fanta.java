package DOO_Expendedor;
/** Clase Fanta
 * Sub clase (Hija) de la clase Bebida */

public class Fanta extends Bebida {

    /** Método Fanta()
     * @param serie entero con el número de serie del producto */
    public Fanta(int serie) {
        super(serie);
    }

    /** Método sabor()
     * @return el String "fanta" como el sabor del producto */
    public String sabor() {
        return "fanta";
    }
}