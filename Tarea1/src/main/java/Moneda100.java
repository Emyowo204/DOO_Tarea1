package DOO_Expendedor;

/** Clase Moneda100
 * Sub clase (Hija) de la clase Moneda */
public class Moneda100 extends Moneda {

    /** Método Moneda100() */
    public Moneda100() {
        super();
    }

    /** Método getValor()
     * @return el int 100 como el valor de la moneda */
    public int getValor() {
        return 100;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
