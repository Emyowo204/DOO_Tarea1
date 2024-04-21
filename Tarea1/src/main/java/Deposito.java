package TESTING_1;
import java.util.ArrayList;

public class Deposito<T> {
    ArrayList<T> contenido;
    public Deposito() {
        contenido = new ArrayList<>();
    }
    public void addContenido(T t) {
        contenido.add(t);
    }
    public T getContenido() {
        if(contenido.isEmpty()){
            return null;
        } else {
            return contenido.removeFirst();
        }
    }

}
