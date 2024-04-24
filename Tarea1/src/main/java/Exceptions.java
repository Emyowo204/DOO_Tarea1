package DOO_Expendedor;

/** Clase RuntimeException NoHayProductoException
 * Esta excepción es resultante de la carencia o inexistencia de un producto */
class NoHayProductoException extends RuntimeException {
    public NoHayProductoException(String errorMessage) {
        super(errorMessage);
    }
}

/** Clase RuntimeException PagoInsuficienteException
 * Esta excepción es resultante de un precio del producto mayor al valor de la moneda entregada */
class PagoInsuficienteException extends RuntimeException {
    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);
    }
}

/** Clase RuntimeException PagoIncorrectoException
 * Esta excepción es resultante de un ingreso incorecto o inexistente de una moneda */
class PagoIncorrectoException extends RuntimeException {
    public PagoIncorrectoException(String errorMessage) {
        super(errorMessage);
    }
}
