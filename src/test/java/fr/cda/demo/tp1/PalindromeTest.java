package fr.cda.demo.tp1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;

    /**
     * Avant chaque test, on instancie l'objet Moyenne
     */
    @BeforeEach
    public void setUp() {
        palindrome = new Palindrome();
    }

    @AfterEach
    public void tearDown() {
        int nombrePalindrome = 0;
        int nombreNonPalindrome = 0;
    }

    /**
     * Cas de test où le nombre est un palindrome
     */
    @CsvSource({
            "121",
            "757",
            "363"
    })
    @DisplayName("Test le nombre est un palindrome")
    @ParameterizedTest(name = "Test {index} : {0} ")
    public void nombreEstUnPalindrome(
            int nombrePalindrome
    ) {
        boolean result = palindrome.estUnPalindrome(nombrePalindrome);

        assertTrue(result);
    }

    /**
     * Cas de test où le nombre n'est un palindrome
     */
    @Test
    @DisplayName("Test le nombre n'est pas un palindrome")
    public void nombreNestPasUnPalindrome() {
        int nombreNonPalindrome = 123;

        boolean result = palindrome.estUnPalindrome(nombreNonPalindrome);

        assertFalse(result, "Le nombre ne devrait pas être un palindrome");
    }

    /**
     * Cas de test où le nombre est inférieur à 10
     */
    @Test
    @DisplayName("Test le nombre est inférieur à 10")
    public void nombreInferieurDix() {
        int nombre = 5;

        assertThrows(IllegalArgumentException.class,
                () -> palindrome.estUnPalindrome(nombre),
                "Le nombre doit contenir au moins 2 chiffres");
    }


}