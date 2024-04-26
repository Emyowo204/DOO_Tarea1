package DOO_Expendedor;

/** Una moneda de valor 500 que utiliza para comprar un producto, se puede almacenar en un deposito
 * @author Chloe Yañez Lavin
 * @author Emily Osvaldo Gaete Bobadilla */

public class Moneda500 extends Moneda {

    /** Constructor por defecto de Moneda500 */
    public Moneda500() {
        super();
    }

    /** Método para obtener el valor economico de la moneda
     * @return Número entero con el valor 500 de la moneda */
    public int getValor() {
        return 500;
    }

    /** Método de la interfaz 'Comparable' para comparar este Objeto con otro Objeto
     * @param o El Objeto a comparar
     * @return Número entero dependiendo si este Objeto es menor, igual o mayor que el Objeto especificado.*/
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
