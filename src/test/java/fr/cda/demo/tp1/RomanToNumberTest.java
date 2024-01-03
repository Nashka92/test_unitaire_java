package fr.cda.demo.tp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToNumberTest {
    private RomanToNumber romanToNumber;

    @BeforeEach
    public void setUp() {
        romanToNumber = new RomanToNumber();
    }

    /**
     * @param chiffreRomain en entier
     * @param expected en string
     */
    @ParameterizedTest
    @CsvSource({
            "X, 10",
            "V, 5",
            "IX, 9"
    })
    @DisplayName("Test un nombre romain correct")
    public void convertirRomainANombre(String chiffreRomain, int expected) {
        int result = romanToNumber.convertirNombreRomainEnNombreArabe(chiffreRomain);
        assertEquals(expected, result);
    }
}