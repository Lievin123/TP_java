public class Chien extends Animal {
    public Chien(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void deplacement() {
        System.out.println("Le chien se déplace en marchant, courant et nageant.");
    }

    @Override
    public void crier() {
        System.out.println("Le chien aboie.");
    }
}
