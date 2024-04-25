package DOO_Expendedor;

/** Clase Flipy
 * Sub clase (Hija) de la clase Dulce */
public class Flipy extends Dulce{

    /** Método Flipy()
     * @param serie entero con el número de serie del producto */
    public Flipy(int serie) {
        super(serie);
    }

    /** Método sabor()
     * @return el String "flipy" como el sabor del producto */
    public String sabor() {
        return "flipy";
    }
}
