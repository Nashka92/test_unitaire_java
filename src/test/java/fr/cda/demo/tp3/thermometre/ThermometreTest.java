package fr.cda.demo.tp3.thermometre;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ThermometreTest {

    @Test
    public void thermometreEgalitePositive(){
        int[] temperatures = {1, 2, 3};
        Thermometre thermometre = new Thermometre();
        int resultat = thermometre.thermometreEgalite(temperatures);
        assertEquals(1, resultat);
    }

}
