package DOO_Expendedor;

/** Clase Moneda500
 * Sub clase (Hija) de la clase Moneda */
public class Moneda500 extends Moneda {

    /** Método Moneda500() */
    public Moneda500() {
        super();
    }

    /** Método getValor()
     * @return el int 500 como el valor de la moneda */
    public int getValor() {
        return 500;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
