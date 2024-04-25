package DOO_Expendedor;
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(1);
        Moneda m = null;
        Comprador c=null;

        try {
            m = new Moneda1000();
            c = new Comprador(m,8,exp);
            System.out.println(c.queSabor()+", "+c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        m = new Moneda1000();
        c = new Comprador(m,1,exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto());
    }
}
