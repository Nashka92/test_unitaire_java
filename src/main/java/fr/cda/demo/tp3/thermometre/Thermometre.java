package fr.cda.demo.tp3.thermometre;

public class Thermometre {
    public int thermometreEgalite(int[] temperatures) {

        if (temperatures == null) {
            return 0;
        }

        // Initialisation de la valeur minimum
        int minVal = temperatures[0];

        // Parcours le tableau temperatures pour trouver la valeur minimale
        for (int index = 1; index < temperatures.length; index++) {
            if (temperatures[index] < minVal) {
                minVal = temperatures[index];
            }
        }

        // Retournez la valeur minimale
        return minVal;
    }
}

