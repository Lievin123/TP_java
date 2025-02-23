class Moto implements Vehicule {
    private int vitesseMax = 180;

    @Override
    public void demarrer() {
        System.out.println("Moto démarrée");
    }

    @Override
    public void arreter() {
        System.out.println("Moto arrêtée");
    }

    @Override
    public int getVitesseMax() {
        return vitesseMax;
    }
}
