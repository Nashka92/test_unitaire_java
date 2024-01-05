package fr.cda.demo.tp2;

/**
 * Classe enfant de Salarie, la classe principale pour effectuer les test unitaires et les mocks
 * étant donnée que la classe Salarie est une classe abstraite et donc impossible pour les instanciations
 */
public class SalarieCdi extends Salarie {
    public SalarieCdi(Salaire salaire, Identite identite) {
        super(salaire, identite);
    }
}