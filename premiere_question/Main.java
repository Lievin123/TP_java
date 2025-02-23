public class Main {
    public static void main(String[] args) {
        Institution institution = new Institution("Institution Nationale des Arts", "RD Congo", "Public", 1970);

        System.out.println("Description de l'institution:");
        institution.decrireInstitution();
        System.out.println();

        Universite universite1 = new Universite("Université de Kinshasa", "RD Congo", "Public", 1954, 12, "LMD", "Professeur ordinaire Jean-Marie Kayembe Ntumba");
        Universite universite2 = new Universite("Université Protestante au Congo", "RD Congo", "Privée", 1959, 8, "Classique", "Révérend Professeur David Ekofo");

        System.out.println("Description de l'université:");
        universite1.decrireUniversite();
        System.out.println();

        System.out.println("Noms des recteurs des universités:");
        Universite.afficherNomsRecteurs(universite1, universite2);
        System.out.println();

        Ecole ecole1 = new Ecole("Collège Boboto", "RD Congo", "Privée", 1937, "Secondaire", 50, "Père Carlos Vallés");
        Ecole ecole2 = new Ecole("Lycée Bosangani", "RD Congo", "Public", 1968, "Secondaire", 45, "Madame Antoinette Yuma");
        Ecole ecole3 = new Ecole("Ecole Primaire Mgr Shaumba", "RD Congo", "Privée", 2005, "Primaire", 20, "Sœur Marie-Thérèse Yamfu");

        System.out.println("Description de l'école:");
        ecole1.decrireEcole();
        System.out.println();

        System.out.println("Noms des promoteurs des écoles:");
        Ecole.afficherNomsPromoteurs(ecole1, ecole2, ecole3);
    }
}
