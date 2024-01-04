package fr.cda.demo.tp2;

public class Salaire {
    public float tauxHoraire;

    public Salaire(float tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double payer(int heures) {
        double heuresNormales = Math.min(heures, 151.67);
        double heuresSupplementaires = Math.max(0, heures - 151.67);

        return calculerSalaireNormal(heuresNormales) + calculerSalaireSupplementaire(heuresSupplementaires);
    }

    private double calculerSalaireNormal(double heures) {
        return tauxHoraire * heures;
    }

    private double calculerSalaireSupplementaire(double heures) {
        return heures * tauxHoraire * 1.25;
    }

    public float getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(float tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public float getSalaire() {
        return this.tauxHoraire;
    }
}