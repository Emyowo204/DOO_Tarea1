package TESTING_1;
public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2);
        Moneda m = null;
        Comprador c=null;
        m = new Moneda1000();
        c = new Comprador(m,Seleccion.CocaCola.getPrecio(),exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto()); // cocacola $700
        m = new Moneda1000();
        c = new Comprador(m,Seleccion.CocaCola.getPrecio(),exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto()); // cocacola $700
        m = new Moneda1000();
        c = new Comprador(m,Seleccion.CocaCola.getPrecio(),exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto());// cocacola $700
        m = new Moneda1000();
        c = new Comprador(m,Seleccion.CocaCola.getPrecio(),exp);
        System.out.println(c.queSabor()+", "+c.cuantoVuelto()); // cocacola $700
    }
}