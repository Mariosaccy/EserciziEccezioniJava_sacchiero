package org.example;
import net.datafaker.Faker;

// Classe Reclutatore: usa Datafaker per generare un nome da supereroe e un potere casuale (da 1 a 100). Confronta il potere con la difficoltà richiesta dalla missione.

public class Reclutatore {

    private final Faker faker = new Faker();

    public String reclutaEroe(int difficoltaMissione) throws EroeNonIdoneoException {
        String nomeEroe = faker.superhero().name();
        int potereEroe = faker.number().numberBetween(1, 101);

        if (potereEroe < difficoltaMissione) {
            throw new EroeNonIdoneoException(
                    "Eroe non idoneo: " + nomeEroe + " con potere " + potereEroe,
                    nomeEroe,
                    potereEroe
            );
        }

        return ("Eroe idoneo: " + nomeEroe + " con potere " + potereEroe);
    }
}