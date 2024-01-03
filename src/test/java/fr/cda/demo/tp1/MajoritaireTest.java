package fr.cda.demo.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajoritaireTest {

    private Majoritaire majoritaire;

    @BeforeEach
    public void setUp() {
        majoritaire = new Majoritaire();
    }

    @Test
    @DisplayName("Test un tableau avec un nombre majoritaire")
    public void tabAvecUnNombreMajoritaire(){
        int[] tabNombre = {10, 10, 55, 47, 10};
        int result = majoritaire.hashMap(tabNombre);
        assertEquals(10, result);
    }
    @Test
    public void retourneZeroSiPasElementMajoritaire(){
        int[] tabNombre = {10, 14, 55, 47, 87};

        int result = majoritaire.hashMap(tabNombre);

        assertEquals(0, result);
    }
}
