package org.example;

public class ContoBancario {

    private double saldo;

    public ContoBancario(double saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public void preleva(double importo) throws SaldoInsufficienteException {
        if (importo <= 0) {
            throw new ImportoNonValidoException("Importo non valido: " + importo);
        }
        if (importo > saldo) {
            throw new SaldoInsufficienteException("Saldo insufficiente. Saldo attuale: " + saldo + ", importo richiesto: " + importo + "mancano: " + (importo-saldo));
        }
        saldo -= importo;
    }
}
