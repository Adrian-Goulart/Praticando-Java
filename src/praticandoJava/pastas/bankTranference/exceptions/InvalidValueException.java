package praticandoJava.pastas.bankTranference.exceptions;

public class InvalidValueException extends RuntimeException {
    public InvalidValueException() {
        super("Valor inválido");
    }

    public InvalidValueException(String message) {
        super(message);
    }
}
