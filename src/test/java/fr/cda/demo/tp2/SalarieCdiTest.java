package fr.cda.demo.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class SalarieCdiTest {

    private SalarieCdi salarieCdi;
    private Identite identiteMock;

    @BeforeEach
    public void setUp(){
        identiteMock = mock(Identite.class);
        when(identiteMock.getIdentite()).thenReturn("Bernard", "Lavillier");


        Salaire salaireMock = mock(Salaire.class);
        when(salaireMock.getSalaire()).thenReturn(151.67F);

        salarieCdi = new SalarieCdi(
                salaireMock,
                identiteMock
        );
    }

    @Test
    @DisplayName("Test déménager")
    public void should_demenager_wesh(){

        Adresse adresseMock = mock(Adresse.class);
        when(adresseMock.getAdresse()).thenReturn("5 rue de la paix");

        salarieCdi.demenager(adresseMock);

        verify(
                identiteMock,
                times(1)
        ).setAdresse(adresseMock);

    }
}