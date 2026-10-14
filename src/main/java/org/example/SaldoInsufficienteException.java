package org.example;

/**
 * Eccezione custom per saldo insufficiente.
 * Estende RuntimeException, quindi è unchecked.
 */

public class SaldoInsufficienteException extends RuntimeException {
    public SaldoInsufficienteException(String message) {
        super(message);
    }
}
