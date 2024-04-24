package DOO_Expendedor;

//Clase extendida de la interfaz Moneda
public class Moneda100 extends Moneda {
    //Constructor de moneda100
    public Moneda100() {
        super();
    }
    //Metodo getValor retorna el valor 100
    public int getValor() {
        return 100;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
