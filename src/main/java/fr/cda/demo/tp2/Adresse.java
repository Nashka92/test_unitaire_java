package fr.cda.demo.tp2;

/**
 * Classe Adresse qui a pour seul intérêt de stocker les données
 * Aucunes méthodes implanter, Pour les test unitaire, il sera mocked
 */
public class Adresse {
    public String voie;
    public String rue;
    public String cp;
    public String ville;
    public String pays;

    public Adresse(String voie, String rue, String cp, String ville, String pays) {
        this.voie = voie;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return this.voie + " " + this.rue + " " + this.cp + " " + this.ville + " " + this.pays;
    }
}