package DOO_Expendedor;
import java.util.ArrayList;

/** Clase Expendedor
 * Esta clase utiliza la clase Java ArrayList */

public class Expendedor {

    /** Propiedad privada 'listDepositos'
     * ArrayList de instancias de 'Deposito' de tipo 'Producto'
     * Es una lista de todos los depositos de la expendedora, con un producto distinto cada uno*/
    private ArrayList<Deposito<Producto>> listDepositos;

    /** Propiedad privada 'depoVuelto'
     * Instancia de 'Deposito', se guarda una lista de instancias de 'Moneda100'
     * Esto constituye al vuelto de la compra, utilizando monedas de 100*/
    private Deposito<Moneda> depoVuelto;

    /** Método Expendedor()
     * @param numProductos, número entero con la cantidad de productos que tiene cada deposito de 'listDepositos' */
    public Expendedor(int numProductos) {
        listDepositos = new ArrayList<>();
        depoVuelto = new Deposito<>();
    }
}