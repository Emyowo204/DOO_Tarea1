package DOO_Expendedor;

// Clase hija Dulce
public class Super8 extends Dulce{
    // Método Super8, tiene como parametro la serie del producto
    public Super8(int serie) {
        super(serie);
    }
    // Método que retorna el sabor del producto
    public String sabor() {
        return "super8";
    }
}
