package DOO_Expendedor;
import java.util.ArrayList;

/** Clase Deposito
 * Esta clase utiliza un tipo genérico <T>
 * Esta clase utiliza la clase Java ArrayList */

public class Deposito<T> {

    /** Propiedad privada 'contenido'
     * ArrayList genérica que guarda una lista de Objetos */
    private ArrayList<T> contenido;

    /** Método Deposito()
     * Crea una nueva instancia de ArrayList y la guarda en 'contenido' */
    public Deposito() {
        contenido = new ArrayList<>();
    }

    /** Método addContenido()
     * @param objeto genérico que se agrega al Arraylist 'contenido' */
    public void addContenido(T objeto) {
        contenido.add(objeto);
    }

    /** Método getContenido()
     * @return un objeto genérico que se remueve de la primera posición de Arraylist 'contenido'
     * retorna un puntero null si el tamaño de 'çontenido' es igual a 0 */
    public T getContenido() {
        if(contenido.size() == 0){
            return null;
        } else {
            return contenido.remove(0);
        }
    }
}