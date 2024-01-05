package fr.cda.demo.tp2;

/**
 * Classe Identite qui a pour but de stocker des données, pas de méthodes.
 * Aucunes méthodes implanter, Pour les test unitaire, il sera mocked
 */
public class Identite {
    public String nom;
    public String prenom;
    public Adresse adresse;

    public Identite(String nom, String prenom, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getIdentite() {
        return this.nom + " " + this.prenom + " " + this.adresse;
    }
}
