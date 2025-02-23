class Voiture implements Vehicule {
    private int vitesseMax = 200;

    @Override
    public void demarrer() {
        System.out.println("Voiture démarrée");
    }

    @Override
    public void arreter() {
        System.out.println("Voiture arrêtée");
    }

    @Override
    public int getVitesseMax() {
        return vitesseMax;
    }
}
