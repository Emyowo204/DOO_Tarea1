package DOO_Expendedor;

//Clase extendida de la interfaz Moneda
public class Moneda500 extends Moneda {
    //Constructor de moneda500
    public Moneda500() {
        super();
    }
    //Metodo getValor retorna el valor 500
    public int getValor() {
        return 500;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
