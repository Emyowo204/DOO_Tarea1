package TESTING_1;
public abstract class Producto {
    private int serie;
    public Producto(int sr) {
        serie = sr;
    }
    public int getSerie() {
        return serie;
    }
    public abstract String sabor();
}
