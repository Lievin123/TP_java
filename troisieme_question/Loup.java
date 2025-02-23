public class Loup extends Animal {
    public Loup(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void deplacement() {
        System.out.println("Le loup se déplace en marchant et courant.");
    }

    @Override
    public void crier() {
        System.out.println("Le loup hurle.");
    }
}
