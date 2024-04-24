package DOO_Expendedor;
/** Clase abstracta Producto
 * Madre de las clases Bebida y Dulce */

public abstract class Producto {

    /** Propiedad 'serie', entera privada, que guarda la serie del Producto */
    private int serie;

    /** Método Producto()
     * @param sr entero con el número de serie del producto, se guarda en la propiedad 'serie' */
    public Producto(int sr) {
        serie = sr;
    }

    /** Método getSerie()
     * @return 'serie', un entero con el número de serie del producto */
    public int getSerie() {
        return serie;
    }

    /** Método sabor()
     * @return un String con el sabor del producto */
    public abstract String sabor();
}