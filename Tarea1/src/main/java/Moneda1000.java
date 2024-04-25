package DOO_Expendedor;

/** Clase Moneda1000
 * Sub clase (Hija) de la clase Moneda */
public class Moneda1000 extends Moneda {

    /** Método Moneda1000() */
    public Moneda1000() {
        super();
    }

    /** Método getValor()
     * @return el int 1000 como el valor de la moneda */
    public int getValor() {
        return 1000;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
