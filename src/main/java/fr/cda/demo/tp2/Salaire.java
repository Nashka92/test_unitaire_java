package fr.cda.demo.tp2;

public class Salaire {
    public float tauxHoraire;

    public Salaire(float tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    /**
     * @param heures
     * @return Calcul Salaire normal + Calcul salaire Supplementaire
     */
    public double payer(int heures) {
        double heuresNormales = Math.min(heures, 151.67);
        double heuresSupplementaires = Math.max(0, heures - 151.67);

        return calculerSalaireNormal(heuresNormales) + calculerSalaireSupplementaire(heuresSupplementaires);
    }

    /**
     * @param heures
     * @return le taux horaire x les heures
     */
    private double calculerSalaireNormal(double heures) {
        return tauxHoraire * heures;
    }

    /**
     * @param heures
     * @return les heures x le taux horaire avec les 25%
     */
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