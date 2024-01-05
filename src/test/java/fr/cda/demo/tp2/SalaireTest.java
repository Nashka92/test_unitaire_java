package fr.cda.demo.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaireTest {

    private Salaire salaire;

    @BeforeEach
    public void setUp() {

        salaire = new Salaire(10.0f);
    }

    /**
     * Calcul du salaire avec horaires standard et avec un fichier CSV source
     */
    @ParameterizedTest
    @CsvSource({
            "100, 1000.0", // heure effectués (heures)  et salaire attendu (expected)
            "80, 800.0"
    })
    @DisplayName("Test le calcul du salaire pour des heures normales avec CSV Source")
    public void testPayerHeuresNormales(int heures, double expected) {
        assertEquals(expected, salaire.payer(heures));
    }

    /**
     * Calcul salaire avec des heures supplémentaire, payés 25% plus cher avec CSV source
     */
    @ParameterizedTest
    @CsvSource({
            "160, 1275.0",
            "170, 1350.0"
    })
    @DisplayName("Test calcul du salaire avec heures supplémentaires")
    public void testPayerHeuresSupplementaires() {
        int heures = 160;
        double salaireNormal = 10.0 * 151.67;
        double salaireSupplementaire = 10.0 * 1.25 * (heures - 151.67);
        double salaireAttendu = salaireNormal + salaireSupplementaire;

        assertEquals(salaireAttendu, salaire.payer(heures));
    }

    /**
     * Test Nouveau taux horaire
     */
    @Test
    @DisplayName("Test mise à jour du taux horaire")
    public void testNouveauTauxHoraire() {
        float nouveauTauxHoraire = 15.0f;
        salaire.setTauxHoraire(nouveauTauxHoraire);

        assertEquals(nouveauTauxHoraire, salaire.getTauxHoraire());
    }
}