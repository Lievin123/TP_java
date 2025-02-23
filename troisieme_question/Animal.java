public abstract class Animal {
    int poids;
    String couleur;

    public Animal(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
    }

    public void manger() {
        System.out.println("L'animal mange de la viande.");
    }

    public void boire() {
        System.out.println("L'animal boit de l'eau.");
    }

    public abstract void deplacement();
    public abstract void crier();
}
