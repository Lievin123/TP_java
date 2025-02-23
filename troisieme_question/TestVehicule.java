public class TestVehicule {
    public static void main(String[] args) {
        Vehicule voiture = new Voiture();
        Vehicule velo = new Velo();
        Vehicule moto = new Moto();

        System.out.println("Voiture:");
        voiture.demarrer();
        System.out.println("Vitesse max: " + voiture.getVitesseMax() + " km/h");
        voiture.arreter();

        System.out.println("\nVelo:");
        velo.demarrer();
        System.out.println("Vitesse max: " + velo.getVitesseMax() + " km/h");
        velo.arreter();

        System.out.println("\nMoto:");
        moto.demarrer();
        System.out.println("Vitesse max: " + moto.getVitesseMax() + " km/h");
        moto.arreter();
    }
}
