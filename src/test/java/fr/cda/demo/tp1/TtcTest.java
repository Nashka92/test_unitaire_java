package fr.cda.demo.tp1;

import fr.cda.demo.calculatrice.Calculatrice;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TtcTest {

    private Ttc ttc;
    private int prixHt;

    @BeforeEach
    public void setUp() {
        ttc = new Ttc();
    }

    @AfterEach
    public void tearDown() {
        prixHt = 0;
    }

    /**
     * Le prix HT est positif
     */
    @CsvSource({
            "20, 24",
            "10, 12",
            "100, 120"
    })
    @DisplayName("Test prix HT positif")
    @ParameterizedTest(name = "Test {index} : {0}, {1}")
    public void prixHtPositif(
            int prixHt,
            int expected
    ) {


        double result = ttc.HtToTtc(prixHt);

        assertEquals(expected, result);

    }

    /**
     * Un cas où le prix serait négatif
     */
    @Test
    @DisplayName("Test le prix HT est négatif")
    public void prixHtNegatif() {
        prixHt = -5;

        assertThrows(IllegalArgumentException.class,
                () -> ttc.HtToTtc(prixHt),
                "Le prix HT doit être positif");
    }

}

