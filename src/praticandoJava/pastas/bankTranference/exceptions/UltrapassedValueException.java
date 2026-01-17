package praticandoJava.pastas.bankTranference.exceptions;

public class UltrapassedValueException extends RuntimeException {
    public UltrapassedValueException() {
        super("Valor acima do permitido");
    }

    public UltrapassedValueException(String message) {
        super(message);
    }
}
