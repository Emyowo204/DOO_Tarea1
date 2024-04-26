package DOO_Expendedor;

/** Una moneda de valor 1000 que utiliza para comprar un producto, se puede almacenar en un deposito
 * @author Chloe Yañez Lavin
 * @author Emily Osvaldo Gaete Bobadilla */

public class Moneda1000 extends Moneda {

    /** Constructor por defecto de Moneda1000 */
    public Moneda1000() {
        super();
    }

    /** Método para obtener el valor económico de la moneda
     * @return Número entero con el valor 1000 de la moneda */
    public int getValor() {
        return 1000;
    }

    /** Método de la interfaz 'Comparable' para comparar este Objeto con otro Objeto
     * @param o El Objeto a comparar
     * @return Número entero dependiendo si este Objeto es menor, igual o mayor que el Objeto especificado.*/
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
