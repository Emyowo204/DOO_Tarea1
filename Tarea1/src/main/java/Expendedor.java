package TESTING_1;
import javax.swing.*;
import java.util.ArrayList;

public class Expendedor {
    private ArrayList<Deposito> listDepositos;
    private Deposito<Moneda> depoVuelto;
    public Expendedor(int numProductos) {
        listDepositos = new ArrayList();
        depoVuelto = new Deposito();

        for(int i=0; i<6; i++) {
            Deposito newDepo = new Deposito();
            for(int j=0; j<numProductos; j++) {
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
                        newDepo.addContenido(new Flippy(j + 600));
                        break;
                }
            }
            listDepositos.add(newDepo);
        }
    }

    public Producto comprarProducto(Moneda moneda, int select) {
        if(moneda == null)
            return null;
        if(select<=0 || select>=6) {
            depoVuelto.addContenido(moneda);
            return null;
        }
        Producto producto = null;

        Seleccion compra = Seleccion.values()[select-1];
        int precio = compra.getPrecio();

        int vuelto = moneda.getValor() - precio;
        if(vuelto >= 0) {
            Deposito depto_producto = listDepositos.get(select-1);
            producto = (Producto) depto_producto.getContenido();
            if(producto == null) {
                depoVuelto.addContenido(moneda);
                return null;
            }
            Moneda m_vuelto = null;
            for (int i = 0; i < vuelto; i+=100) {
                m_vuelto = new Moneda100();
                depoVuelto.addContenido(m_vuelto);
            }
        }
        else
            depoVuelto.addContenido(moneda);
        return producto;
    }

    public Moneda getVuelto() {
        return depoVuelto.getContenido();
    }
}