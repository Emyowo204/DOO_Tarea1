

public abstract class Producto {
    private int serie;
    private String sabor;

    public int getSerie() {
        return serie;
    }
    public Producto(int n, String s){
        serie = n;
        sabor = s;
    }
}
