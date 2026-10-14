package org.example;


public class SaldoInsufficienteException extends RuntimeException {
    public SaldoInsufficienteException(String message) {
        super(message);
    }
}
