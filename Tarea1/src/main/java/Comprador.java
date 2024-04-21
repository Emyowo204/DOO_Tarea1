package TESTING_1;
public class Comprador{
    private String sabor;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Producto p = exp.comprarProducto(m,cualBebida);

        if(p!= null) {
            sabor = p.sabor();
        } else {
            sabor=null;
        }
        Moneda monVuelto=null;

        while (true) {
            monVuelto = exp.getVuelto();
            if (monVuelto == null) {
                break;
            } else {
                vuelto += monVuelto.getValor();
            }
        }

    }
    public int cuantoVuelto() {
        return vuelto;
    }
    public String queSabor() {
        return sabor;
    }
}
