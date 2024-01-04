package fr.cda.demo.tp2;


public class Identite {
    private String nom;
    private String prenom;
    private Adresse adresse;

    public Identite(String nom, String prenom, String voie, String rue, String cp, String ville, String pays) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = new Adresse(voie, rue, cp, ville, pays);
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
}
