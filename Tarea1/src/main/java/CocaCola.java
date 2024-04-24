package DOO_Expendedor;
/** Clase CocaCola
 * Sub clase (Hija) de la clase Bebida */

public class CocaCola extends Bebida {

    /** Método CocaCola()
     * @param serie entero con el número de serie del producto */
    public CocaCola(int serie) {
        super(serie);
    }

    /** Método sabor()
     * @return el String "cocacola" como el sabor del producto */
    public String sabor() {
        return "cocacola";
    }
}