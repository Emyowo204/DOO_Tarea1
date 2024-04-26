package DOO_Expendedor;

/** Clase abstracta Moneda
 * Implementa Interfaz Comparable
 * Súper clase (Madre) de las clases Moneda100, Moneda500 y Moneda1000 */

public abstract class Moneda implements Comparable {

    /** Método Moneda() */
    public Moneda() {}

    /** Método abstracto getValor()
     * @return int con el valor de la moneda */
    public abstract int getValor();
    public abstract int compareTo(Object o);
}
