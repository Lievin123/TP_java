class Velo implements Vehicule {
    private int vitesseMax = 30;

    @Override
    public void demarrer() {
        System.out.println("Velo démarré");
    }

    @Override
    public void arreter() {
        System.out.println("Velo arrêté");
    }

    @Override
    public int getVitesseMax() {
        return vitesseMax;
    }
}
