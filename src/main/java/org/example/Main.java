package org.example;

import static java.lang.IO.println;

public class Main {
    public  static void main() {
        println("es 1: Conto Corrente");

        ContoBancario conto = new ContoBancario(1000);

        // Prelievo eccessivo
        try {
            conto.preleva(1500);
        } catch (SaldoInsufficienteException e) {
            println("Eccezione catturata: " + e.getMessage());
        } finally {
            println("Blocco finally eseguito.");
        }

        // Prelievo negativo
        try {
            conto.preleva(-100);
        } catch (ImportoNonValidoException e) {
            println("Eccezione catturata: " + e.getMessage());
        }

        // Prelievo valido
        try {
            conto.preleva(500);
            println("Prelievo completato con successo. Saldo attuale: " + conto.getSaldo());
        } catch (SaldoInsufficienteException | ImportoNonValidoException e) {
            println("Eccezione catturata: " + e.getMessage());
        }

        println("\n\nes 2: Reclutamento Supereroi");
        Reclutatore reclutatore = new Reclutatore();
        int difficoltaMissione = 75;

        for (int i = 0; i < 5; i++) {
            try {
                String risultato = reclutatore.reclutaEroe(difficoltaMissione);
                println(risultato);
            } catch (EroeNonIdoneoException e) {
                println("Eccezione catturata: " + e.getMessage());
                println("Nome eroe: " + e.getNomeEroe() + ", livello: " + e.getLivelloEroe());
            }
        }

        
    }
}
