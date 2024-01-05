package fr.cda.demo.tp3.thermometre;

import fr.cda.demo.Isbn.Isbn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThermometreTest {

    @Test
    public void thermometreEgalitePositive(){
        Thermometre thermometre = new Thermometre();
        boolean resultat = thermometre.thermometreEgalite();
        assertEqual(resultat);
    }

}
