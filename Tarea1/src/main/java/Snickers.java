package DOO_Expendedor;

// Clase hija Dulce
public class Snickers extends Dulce{
    // Método Snickers, tiene como parametro la serie del producto
    public Snickers(int serie) {
        super(serie);
    }
    // Método que retorna el sabor del producto
    public String sabor() {
        return "snickers";
    }
}
