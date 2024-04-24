package DOO_Expendedor;
import java.util.ArrayList;

/** Clase Expendedor
 * Esta clase utiliza la clase Java ArrayList */

public class Expendedor {

    /** Propiedad privada 'listDepositos'
     * ArrayList de instancias de 'Deposito' de tipo 'Producto'
     * Es una lista de todos los depositos de la expendedora, con un producto distinto cada uno */
    private ArrayList<Deposito<Producto>> listDepositos;

    /** Propiedad privada 'depoVuelto'
     * Instancia de 'Deposito', se guarda una lista de instancias de 'Moneda100'
     * Esto constituye al vuelto de la compra, utilizando monedas de 100 */
    private Deposito<Moneda> depoVuelto;

    /** Método Expendedor()
     * @param numProductos, número entero con la cantidad de productos que tiene cada deposito de 'listDepositos' */
    public Expendedor(int numProductos) {
        // Creación instancia ArrayList y Deposito para listDepositos y depoVuelto respectivamente
        listDepositos = new ArrayList<>();
        depoVuelto = new Deposito<>();
        // Ciclo for para crear instancias de 'Deposito' para añadir a listDepositos
        for(int i=0; i<6; i++) {
            Deposito<Producto> newDepo = new Deposito<>();
            for(int j=0; j<numProductos; j++) {
                // Switch-case para llenar cada deposito con un producto distinto, siendo el total 'numProductos'
                switch(i) {
                    case 0:
                        newDepo.addContenido(new CocaCola(j + 100));
                        break;
                    case 1:
                        newDepo.addContenido(new Sprite(j + 200));
                        break;
                    case 2:
                        newDepo.addContenido(new Fanta(j + 300));
                        break;
                    case 3:
                        newDepo.addContenido(new Snickers(j + 400));
                        break;
                    case 4:
                        newDepo.addContenido(new Super8(j + 500));
                        break;
                    case 5:
                        newDepo.addContenido(new Flipy(j + 600));
                        break;
                }
            }
            listDepositos.add(newDepo);
        }
    }
}