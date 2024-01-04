package fr.cda.demo.tp2;

public class Salaire {
    public float tauxHoraire;

    public Salaire(float tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double payer(int heures) {
        return tauxHoraire * heures;
    }

    public float getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(float tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}