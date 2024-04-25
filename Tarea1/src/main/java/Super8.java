package DOO_Expendedor;

/** Clase Super8
 * Sub clase (Hija) de la clase Dulce */
public class Super8 extends Dulce{

    /** Método Super8()
     * @param serie entero con el número de serie del producto */
    public Super8(int serie) {
        super(serie);
    }

    /** Método sabor()
     * @return el String "super8" como el sabor del producto */
    public String sabor() {
        return "super8";
    }
}
