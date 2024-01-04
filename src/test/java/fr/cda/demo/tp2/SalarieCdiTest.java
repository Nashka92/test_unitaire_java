package fr.cda.demo.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class SalarieCdiTest {

    private SalarieCdi salarieCdi;
    private Identite identiteMock;
    private Salaire salaireMock;

    @BeforeEach
    public void setUp() {
        identiteMock = mock(Identite.class);
        when(identiteMock.getIdentite()).thenReturn("Bernard", "Lavillier");

        salaireMock = mock(Salaire.class);
        when(salaireMock.getSalaire()).thenReturn(151.67F);

        salarieCdi = new SalarieCdi(
                salaireMock,
                identiteMock
        );
    }

    @Test
    @DisplayName("Test le salarié déménage et change d'adresse")
    public void testDemenager() {

        Adresse adresseMock = mock(Adresse.class);
        when(adresseMock.getAdresse()).thenReturn("5 rue de la paix");

        salarieCdi.demenager(adresseMock);

        verify(
                identiteMock,
                times(1)
        ).setAdresse(adresseMock);
    }

    @Test
    @DisplayName("Test le salarié travaille et gagne son salaire")
    public void testTravaillerHeures() {
        int heures = 100;
        float tauxHoraire = 10.0f;
        double salaireAttendu = tauxHoraire * heures;

        when(salaireMock.getTauxHoraire()).thenReturn(tauxHoraire);
        when(salaireMock.payer(heures)).thenReturn(salaireAttendu);

        salarieCdi.travailler(heures);

        verify(salaireMock, times(1)).payer(heures);
    }

    @Test
    @DisplayName("Test l'augmentation du salaire")
    public void testAugmenteSalaire() {
        float tauxHoraireInitial = 10.0f;
        float pourcentage = 10.0f;
        float tauxHoraireAttendu = tauxHoraireInitial * (1 + pourcentage / 100);

        when(salaireMock.getTauxHoraire()).thenReturn(tauxHoraireInitial);

        salarieCdi.augmenter(pourcentage);

        verify(salaireMock).setTauxHoraire(tauxHoraireAttendu);
    }

}