package DOO_Expendedor;

/** Clase Comprador
 * Esta clase utiliza 'Expendedor' y 'Moneda' para comprar el producto */

public class Comprador {

    /** Propiedad privada 'sabor'
     * String que contiene el sabor del producto */
    private String sabor;

    /** Propiedad privada 'vuelto'
     * Número entero que contiene el vuelto total de la compra del producto */
    private int vuelto;

    /** Método Expendedor()
     * @param moneda, instancia de 'Moneda' para comprar un producto
     * @param selectProducto, número entero que contiene la selección del producto
     * @param exp, instancia de 'Expendedor' donde se va acomprar el producto
     * Método utiliza el método comprarProducto() de 'Expendedor' para comprar un producto
     * Luego iguala el sabor y el vuelto con sus respectivas propiedades */
    public Comprador(Moneda moneda, int selectProducto, Expendedor exp){
        vuelto = 0;
        Producto p = exp.comprarProducto(moneda,selectProducto);
        if(p!= null) {
            sabor = p.sabor();
        } else {
            // Si producto es un puntero null, sabor es null
            sabor=null;
        }
        Moneda monVuelto=null;
        while (true) {
            monVuelto = exp.getVuelto();
            // Cuando el deposito depoVuelto de 'Expendedor' queda vacio, retorna null
            // Luego de esto el comprador retiró el vuelto de la compra
            if (monVuelto == null) {
                break;
            } else {
                vuelto += monVuelto.getValor();
            }
        }
    }

    /** Método cuantoVuelto()
     * @return 'vuelto', número entero con el total del vuelto recibido por la compra */
    public int cuantoVuelto() {
        return vuelto;
    }

    /** Método queSabor()
     * @return 'sabor', String que contiene el sabor del producto comprado */
    public String queSabor() {
        return sabor;
    }
}