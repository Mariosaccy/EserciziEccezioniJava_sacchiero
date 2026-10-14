package org.example;

public class EroeNonIdoneoException extends Exception {

    private final String nomeEroe;
    private final int livelloEroe;

    public EroeNonIdoneoException(String message, String nomeEroe, int livelloEroe) {
        super(message);
        this.nomeEroe = nomeEroe;
        this.livelloEroe = livelloEroe;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

    public int getLivelloEroe() {
        return livelloEroe;
    }
}
