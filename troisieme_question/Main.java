public class Main {
    public static void main(String[] args) {
        Animal chat = new Chat(5, "Noir");
        Animal chien = new Chien(20, "Marron");
        Animal lion = new Lion(100, "Jaune");
        Animal loup = new Loup(80, "Gris");
        Animal tigre = new Tigre(150, "Orange");

        System.out.println("--- Chat ---");
        chat.manger();
        chat.boire();
        chat.deplacement();
        chat.crier();

System.out.println("\n--- Chien ---");
        chien.manger();
        chien.boire();
        chien.deplacement();
        chien.crier();

System.out.println("\n--- Lion ---");
        lion.manger();
        lion.boire();
        lion.deplacement();
        lion.crier();

System.out.println("--- Loup ---");
        loup.manger();
        loup.boire();
        loup.deplacement();
        loup.crier();

System.out.println("--- Tigre ---");
        tigre.manger();
        tigre.boire();
        tigre.deplacement();
        tigre.crier();
    }
}
