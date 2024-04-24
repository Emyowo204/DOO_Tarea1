package DOO_Expendedor;

// Clase hija Dulce
public class Flipy extends Dulce{
    // Método Flipy, tiene como parametro la serie del producto
    public Flipy(int serie) {
        super(serie);
    }
    // Método que retorna el sabor del producto
    public String sabor() {
        return "flipy";
    }
}
