public class Tigre extends Animal {
    public Tigre(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void deplacement() {
        System.out.println("Le tigre se déplace en marchant, courant et sautant.");
    }

    @Override
    public void crier() {
        System.out.println("Le tigre rugit.");
    }
}
