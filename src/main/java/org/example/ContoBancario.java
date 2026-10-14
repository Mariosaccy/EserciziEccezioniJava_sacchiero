package org.example;

/**
 * Classe ContoBancario che rappresenta un conto corrente.
 * Contiene il saldo e il metodo preleva(double).
 * Classe ContoBancario: contiene il saldo e il metodo preleva(double). Dichiara la checked exception nella firma del metodo con throws.
 */

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
            throw new SaldoInsufficienteException("Saldo insufficiente. Saldo attuale: " + saldo + ", importo richiesto: " + importo);
        }
        saldo -= importo;
    }
}
