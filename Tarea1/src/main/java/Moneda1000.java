package DOO_Expendedor;

//Clase extendida de la interfaz Moneda
public class Moneda1000 extends Moneda {
    //Constructor de moneda1000
    public Moneda1000() {
        super();
    }
    //Metodo getValor retorna el valor 1000
    public int getValor() {
        return 1000;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
