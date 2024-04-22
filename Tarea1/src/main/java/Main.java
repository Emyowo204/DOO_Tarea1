package TESTING_1;
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(0);
        Moneda m = null;
        Comprador c=null;

        try {
            m = new Moneda100();
            c = new Comprador(m,1,exp);
            System.out.println(c.queSabor()+", "+c.cuantoVuelto());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        }
    }
}