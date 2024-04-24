package DOO_Expendedor;

//Interfaz de las clases Moneda
public abstract class Moneda implements Comparable {
    public Moneda() {}
    public Moneda getSerie() {
        return null;
    }
    public abstract int getValor();
    public abstract int compareTo(Object o);
}
