package org.example;

import static java.lang.IO.println;

/*

fare questi esercizi in Java, usando eccezioni checked e unchecked, e una libreria esterna per generare dati casuali.
usa diverse classi in diversi file, e una classe Main per testare il tutto.

Esercizio 1: Conto Corrente (Checked vs Unchecked)
Gestire prelievi bancari usando due eccezioni custom diverse.
SaldoInsufficienteException (Checked): estende Exception. Viene lanciata se il prelievo supera il saldo. Deve memorizzare saldo attuale e importo richiesto.
ImportoNonValidoException (Unchecked): estende RuntimeException. Viene lanciata se l'importo è minore o uguale a zero.
Classe ContoBancario: contiene il saldo e il metodo preleva(double). Dichiara la checked exception nella firma del metodo con throws.
Classe Main: testa tre scenari distinti:
Prelievo eccessivo: cattura la checked exception, stampa il deficit di denaro e usa un blocco finally.
Prelievo negativo: cattura la unchecked exception.
Prelievo valido: operazione completata con successo.
Esercizio 2: Reclutamento Supereroi (Datafaker)
Simulare un reclutamento per missioni usando una libreria Maven esterna.
Dipendenza Maven: aggiungi net.datafaker:datafaker al file pom.xml.
EroeNonIdoneoException (Checked): estende Exception. Viene lanciata se il livello di potere dell'eroe è insufficiente. Salva nome dell'eroe e livello.
Classe Reclutatore: usa Datafaker per generare un nome da supereroe e un potere casuale (da 1 a 100). Confronta il potere con la difficoltà richiesta dalla missione.
Classe Main: imposta una missione con difficoltà 75 ed esegui un ciclo di 5 tentativi di reclutamento. Cattura l'eccezione se l'eroe è troppo debole e passa al candidato successivo senza bloccare il programma.



cose da fare:
- Creare le eccezioni custom SaldoInsufficienteException e ImportoNonValidoException.

*/
public class Main {
    public  static void main() {
        println("es 1: Conto Corrente");

        // prove:
        // Prelievo eccessivo: cattura la checked exception, stampa il deficit di denaro e usa un blocco finally.
        // Prelievo negativo: cattura la unchecked exception.
        // Prelievo valido: operazione completata con successo.

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

        
    }
}
