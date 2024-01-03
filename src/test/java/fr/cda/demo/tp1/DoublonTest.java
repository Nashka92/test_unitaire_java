package fr.cda.demo.tp1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class DoublonTest {
    private Doublon doublon = new Doublon();

    @ParameterizedTest
    @CsvSource("'5,7,5,10,2'")
    @DisplayName("Test de tableau avec doublon")
    public void testAvecDoublons(String tableauString) {
        int[] tableau = convertirStringEnTableau(tableauString);
        assertTrue(doublon.verifierSiDoublons(tableau));
    }

    @ParameterizedTest
    @CsvSource("'1,2,3,4,5'")
    @DisplayName("Test de tableau sans doublon")
    public void testSansDoublons(String tableauString) {
        int[] tableau = convertirStringEnTableau(tableauString);
        assertFalse(doublon.verifierSiDoublons(tableau));
    }

    /**
     * @param tableauString
     * @return tableau en chaine de caractere
     */
    // @CsvSource traite chaque entrée comme une chaîne de texte
    // le passage de tableaux entiers n'est pas possible.
    private int[] convertirStringEnTableau(String tableauString) {
        String[] elements = tableauString.split(",");
        int[] tableau = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            tableau[i] = Integer.parseInt(elements[i].trim());
        }
        return tableau;
    }
}





