package fr.cda.demo.tp3.thermometre;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ThermometreTest {

    @Test
    public void thermometre_egalite_Positive_retourne_1(){
        int[] temperatures = {1, 2, 3};
        Thermometre thermometre = new Thermometre();
        int resultat = thermometre.thermometreEgalite(temperatures);
        assertEquals(1, resultat);
    }

    @Test
    public void thermometre_egalite_Positive_retourne_4(){
        int[] temperatures = {4, 5, 6, 7};
        Thermometre thermometre = new Thermometre();
        int resultat = thermometre.thermometreEgalite(temperatures);
        assertEquals(4, resultat);
    }

}
