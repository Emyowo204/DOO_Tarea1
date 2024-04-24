package TESTING_1;
import java.lang.Class;
import java.util.ArrayList;

public class Expendedor {
    private ArrayList<Deposito<Producto>> listDepositos;
    private Deposito<Moneda> depoVuelto;
    public Expendedor(int numProductos) {
        listDepositos = new ArrayList<>();
        depoVuelto = new Deposito<>();
        for(int i=0; i<6; i++) {
            Deposito<Producto> newDepo = new Deposito<>();
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
                        newDepo.addContenido(new Flipy(j + 600));
                        break;
                }
            }
            listDepositos.add(newDepo);
        }
    }
    public Producto comprarProducto(Moneda moneda, int select) {
        if(moneda == null)
            throw new PagoIncorrectoException("Método de pago invalido");
        if(select<=0 || select>6) {
            depoVuelto.addContenido(moneda);
            throw new NoHayProductoException("Producto seleccionado inexistente");
        }

        Producto producto = null;
        int precio = Seleccion.values()[select-1].getPrecio();
        int vuelto = moneda.getValor() - precio;
        if(vuelto >= 0) {
            producto = listDepositos.get(select-1).getContenido();
            if(producto == null) {
                depoVuelto.addContenido(moneda);
                throw new NoHayProductoException("Producto seleccionado agotado");
            }
            Moneda m_vuelto = null;
            for (int i = 0; i < vuelto; i+=100) {
                m_vuelto = new Moneda100();
                depoVuelto.addContenido(m_vuelto);
            }
        }
        else {
            depoVuelto.addContenido(moneda);
            throw new PagoInsuficienteException("Pago insuficiente");
        }
        return producto;
    }
    public Moneda getVuelto() {
        return depoVuelto.getContenido();
    }
}