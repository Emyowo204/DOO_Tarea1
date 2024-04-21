package TESTING_1;
public abstract class Moneda implements Comparable {
    public Moneda() {}
    public Moneda getSerie() {
        return null;
    }
    public abstract int getValor();
    public abstract int compareTo(Object o);
}
