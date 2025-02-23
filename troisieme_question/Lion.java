public class Lion extends Animal {
    public Lion(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void deplacement() {
        System.out.println("Le lion se déplace en marchant et courant.");
    }

    @Override
    public void crier() {
        System.out.println("Le lion rugit.");
    }
}
