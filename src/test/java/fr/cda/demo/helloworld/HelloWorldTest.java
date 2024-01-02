package fr.cda.demo.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        //création d'une instance de classe a tester
        HelloWorld helloWorld = new HelloWorld();

        // On appele la méthode à tester et on enregistre le resultat dans une variable
        String resultat = helloWorld.sayHello();

        // On compare le résultat attendu
        assertEquals("Hello world !", resultat, "Les deux messages doivent être identiques");

        // Autre assertions pour l'exemple :
        assertNotEquals("TROLOLO", resultat, "Le message est bien différent de trololo");
        assertTrue(resultat == "Hello world !");
        assertFalse(resultat == "azrjlkfr");
    }
}

