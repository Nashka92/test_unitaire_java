package fr.cda.demo.tp2;

public abstract class Salarie {
    public Salaire salaire;
    public Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    /**
     * Méthode pour faire travailler le salarié
     * @param heures si aucuns heure indiqué, la valeur par défaut est de 151.67 heures
     */
    public void travailler(int heures) {
        double salaireRecu = this.salaire.payer(heures);
        System.out.println("Le salarié " + this.identite.getNom() + " " + this.identite.getPrenom()
                            + " a travaillé " + heures + " heures et a perçu " + salaireRecu + " €");
    }

    public void demenager(Adresse nouvelleAdresse) {
        this.identite.setAdresse(nouvelleAdresse);
    }

    public void travailler() {
        travailler(151);
    }

    /**
     * Méthode pour augmenter le salaire du salarié
     * @param pourcentage de l'augmentation
     */
    public void augmenter(float pourcentage) {
        float nouveauTaux = this.salaire.getTauxHoraire() * (1 + pourcentage / 100);
        this.salaire.setTauxHoraire(nouveauTaux);
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }
}

