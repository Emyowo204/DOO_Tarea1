package DOO_Expendedor;
import java.util.ArrayList;

/** Clase Expendedor
 * Esta clase utiliza la clase Java ArrayList */

public class Expendedor {

    /** Propiedad privada 'listDepositos'
     * ArrayList de instancias de 'Deposito' de tipo 'Producto'
     * Es una lista de todos los depositos del expendedor, con un producto distinto cada uno */
    private ArrayList<Deposito<Producto>> listDepositos;

    /** Propiedad privada 'depoVuelto'
     * Instancia de 'Deposito', se guarda una lista de instancias de 'Moneda100'
     * Esto constituye al vuelto de la compra, utilizando monedas de 100 */
    private Deposito<Moneda> depoVuelto;

    /** Método Expendedor()
     * @param numProductos, número entero con la cantidad de productos que tiene cada deposito de 'listDepositos'
     * Método para la crear y llenar los depositos del expendedor*/
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

    /** Método comprarProducto()
     * @param moneda, intancia de 'Moneda', que se utiliza para comprar un producto'
     * @param select, número entero con la selección del producto a comprar'
     * @return 'producto', Instancia de 'Producto' con el producto comprado
     * retorna un puntero null si la compra no se completa correctamente */
    public Producto comprarProducto(Moneda moneda, int select) {
        //Moneda con puntero null (No existe moneda)
        if(moneda == null)
            return null;
        //Selección del producto fuera del rango para elegir
        if(select<=0 || select>6) {
            depoVuelto.addContenido(moneda);
            return null;
        }
        Producto producto = null;
        //Precio y vuelto del producto elegido
        int precio = 800; //Preio genérico; Agregar precio
        int vuelto = moneda.getValor() - precio;
        if(vuelto >= 0) {
            producto = listDepositos.get(select-1).getContenido();
            //Deposito vacio (No queda producto elegido)
            if(producto == null) {
                depoVuelto.addContenido(moneda);
                return null;
            }
            //Creación de las instancias 'Moneda100' en depoVuelto para el vuelto del producto
            Moneda m_vuelto = null;
            for (int i = 0; i < vuelto; i+=100) {
                m_vuelto = new Moneda100();
                depoVuelto.addContenido(m_vuelto);
            }
        }
        //Pago menor al precio del producto
        else {
            depoVuelto.addContenido(moneda);
            return null;
        }
        return producto;
    }

    /** Método getVuelto()
     * @return una instancia de 'Moneda100' del Deposito 'depoVuelto'
     * retorna un puntero null si el Deposito 'depoVuelto' está vacio */
    public Moneda getVuelto() {
        return depoVuelto.getContenido();
    }
}
