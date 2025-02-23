public class Chat extends Animal {
    public Chat(int poids, String couleur) {
        super(poids, couleur);
    }

    @Override
    public void deplacement() {
        System.out.println("Le chat se déplace en marchant, courant et sautant.");
    }

    @Override
    public void crier() {
        System.out.println("Le chat miaule.");
    }
}
