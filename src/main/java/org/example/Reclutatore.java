package org.example;
import net.datafaker.Faker;

public class Reclutatore {

    private final Faker faker = new Faker();

    public String reclutaEroe(int difficoltaMissione) throws EroeNonIdoneoException {
        String nomeEroe = faker.superhero().name();
        int potereEroe = faker.number().numberBetween(1, 101);

        if (potereEroe < difficoltaMissione) {
            throw new EroeNonIdoneoException(
                    "Eroe non idoneo: " + nomeEroe + " con potere " + potereEroe, nomeEroe, potereEroe
            );
        }

        return ("Eroe idoneo: " + nomeEroe + " con potere " + potereEroe);
    }
}