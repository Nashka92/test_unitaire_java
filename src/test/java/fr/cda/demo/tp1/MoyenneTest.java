package fr.cda.demo.tp1;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoyenneTest {

    /**
     * On initialise l'instance Moyenne
     */
    private Moyenne moyenne;
    private float note1;
    private float note2;
    private float note3;

    /**
     * Avant chaque test, on instancie l'objet Moyenne
     */
    @BeforeEach
    public void setUp(){
       moyenne = new Moyenne();
    }

    /**
     * Après l'execution de chaque test, on initialise les attributs à zéro
     */

    @AfterEach
    public void tearDown(){
        note1 = 0;
        note2 = 0;
        note3 = 0;
    }

    /**
     * Le tableau devrait contenir 3 notes
     */
    @Test
    @DisplayName("Test le tableau contient 3 notes")
    public void testTroisNotes(){
        int[] notesExactementTrois = {15, 11, 9};

        assertDoesNotThrow(() -> moyenne.moyenne(notesExactementTrois), "Le tableau contient exactement 3 notes");
    }

    /**
     * Le tableau contient moins que 3 notes
     */
    @Test
    @DisplayName("Test le tableau a moins de 3 notes")
    public void testMoinsDeTroisNotes(){
        int[] notesMoinsQueTrois = {15,11};

        assertThrows(IllegalArgumentException.class,
                ()->moyenne.moyenne(notesMoinsQueTrois), "Attention ! Le tableau contient moins de 3 notes");
    }

    /**
     * Le tableau contient plus que 3 notes
     */
    @Test
    @DisplayName("Test le tableau a plus de 3 notes")
    public void testPlusQueTroisNotes(){
        int[] notesPlusQueTrois = {15,11,9,11};

        assertThrows(IllegalArgumentException.class,
                () -> moyenne.moyenne(notesPlusQueTrois), "Attention ! Le tableau contient plus que 3 notes");
    }

    /**
     * Le tableau contient une note négatif
     */
    @Test
    @DisplayName("Test une note inférieur à 0")
    public void testNoteInferieurZero(){
        int[] notesAvecNoteInferieurZero = {10, 15, -5};

        assertThrows(IllegalArgumentException.class,
                () -> moyenne.moyenne(notesAvecNoteInferieurZero),
                "Attention ! Le tableau contient une note inférieur à 0");
    }
    /**
     * Le tableau contient une note supérieur à 20
     */
    @Test
    @DisplayName("Test une note supérieur à 20")
    public void testNoteSuperieurVingt(){
        int[] noteSuperieurVingt = {32,15, 11};

        assertThrows(IllegalArgumentException.class,
                ()-> moyenne.moyenne(noteSuperieurVingt),
                "Attention ! le tableau contient une note supérieur à 20");
    }
}