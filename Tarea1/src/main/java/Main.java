package TESTING_1;
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2);
        Moneda m = null;
        Comprador c=null;
        m = null;
        c = new Comprador(m,1,exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto()); // cocacola $700
        m = new Moneda1000();
        c = new Comprador(m,2,exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto()); // cocacola $700
        m = new Moneda1000();
        c = new Comprador(m,45,exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto());// cocacola $700
        m = new Moneda100();
        c = new Comprador(m,4,exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto()); // cocacola $700
    }
}