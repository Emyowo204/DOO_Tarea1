package TESTING_1;

class NoHayProductoException extends RuntimeException {
    public NoHayProductoException(String errorMessage) {
        super(errorMessage);
    }
}
class PagoInsuficienteException extends RuntimeException {
    public PagoInsuficienteException(String errorMessage) {
        super(errorMessage);
    }
}
class PagoIncorrectoException extends RuntimeException {
    public PagoIncorrectoException(String errorMessage) {
        super(errorMessage);
    }
}