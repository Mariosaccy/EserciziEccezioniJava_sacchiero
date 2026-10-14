package org.example;

/**
 * Eccezione custom per importo non valido.
 * Estende RuntimeException, quindi è unchecked.
 */

public class ImportoNonValidoException extends RuntimeException {
    public ImportoNonValidoException(String message) {
        super(message);
    }
}
