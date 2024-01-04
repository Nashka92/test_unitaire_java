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

    /**
     * Annotation BeforeEach exécutée avant chaque test unitaire
     * Il prépare l'environnement de test avant d'exécuter chaque test individuel
     */
    @BeforeEach
    public void setUp() {

         // Ici on utilise Mockito pour créer un simulacre.
         // Ce mock sera utilisé pour simuler l'objet Identite et Salaire dans les tests
        identiteMock = mock(Identite.class);
        when(identiteMock.getIdentite()).thenReturn("Bernard", "Lavillier");

        salaireMock = mock(Salaire.class);
        when(salaireMock.getSalaire()).thenReturn(151.67F);

        // Crée une instance de SalarieCdi en passant les mocks salaireMock et identiteMock
        salarieCdi = new SalarieCdi(
                salaireMock,
                identiteMock
        );
    }

    /**
     * Ce test testDemenager vérifie la méthode demenager()
     * et elle met à jour la nouvelle adresse
     */
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

    /**
     * testTravaillerHeures vérifie que la méthode travailler() fonctionne
     * pour un nombre d'heures de travail
     */
    @Test
    @DisplayName("Test le salarié travaille et gagne son salaire")
    public void testTravaillerHeures() {
        int heures = 100;
        float tauxHoraire = 10.0f;
        double salaireAttendu = tauxHoraire * heures;

        when(salaireMock.getTauxHoraire()).thenReturn(tauxHoraire);
        when(salaireMock.payer(heures)).thenReturn(salaireAttendu);

        salarieCdi.travailler(heures);
        // Vérifier que certaines interactions ont eu lieu avec l'objet mocké
        // On spécifie le nombre de fois que l'interaction attendue doit avoir eu lieu, ici times 1
        verify(salaireMock, times(1)).payer(heures);
    }

    /**
     * testAugmenteSalaire vérifie si la méthode augmenter()
     * calcule correctement le nouveau taux horaire
     */
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