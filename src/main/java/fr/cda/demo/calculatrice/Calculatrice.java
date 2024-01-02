package fr.cda.demo.calculatrice;

public class Calculatrice {



    /**
     * Retourne la somme de 2 nombres
     * @param premierNombre le 1er nombre
     * @param secondNombre le 2nd nombre
     * @return la somme des 2 nombres
     */

    public float additionner (float premierNombre, float secondNombre) {
        return premierNombre + secondNombre;
    }

    /**
     * Retourne la différence entre deux nombres
     * @param premierNombre 1er nombre
     * @param secondNombre Le nombre a soustraire au premier
     * @return la différence des deux nombres
     */

    public float soustraire (float premierNombre, float secondNombre) {
        return premierNombre - secondNombre;
    }

    /**
     * Retourne le produit de deux nombres
     * @param premierNombre le premier nombre
     * @param secondNombre le second nombre
     * @return le produit des deux
     */

    public float multiplier (float premierNombre, float secondNombre) {
        return premierNombre * secondNombre;
    }

    /**
     * Retourne le quotident des deux nombres
     * @param premierNombre le 1er nombre
     * @param secondNombre le 2eme nombre
     * @return le quotient des deux nombres
     */

    public float diviser (float premierNombre, float secondNombre) {
        if(secondNombre == 0){
            throw new IllegalArgumentException("La division par zéro est impossible !");
        }
        return premierNombre / secondNombre;

    }

}
