package DOO_Expendedor;

// Clase abstracta Dulce
// Hija de la clase Producto
public abstract class Dulce extends Producto {
    // Método Bebida, tiene como parametro la serie del producto
    public Dulce(int serie) {
        super(serie);
    }

    // Método abstracto que retorna el sabor del producto
    public abstract String sabor();
}
