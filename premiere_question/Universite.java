public class Universite extends Institution {
    private int nombreFaculte;
    private String systemeEnseignement;
    private String nomRecteur;

    public Universite(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, int nombreFaculte, String systemeEnseignement, String nomRecteur) {
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.nombreFaculte = nombreFaculte;
        this.systemeEnseignement = systemeEnseignement;
        this.nomRecteur = nomRecteur;
    }

    public int getNombreFaculte() {
        return nombreFaculte;
    }

    public void setNombreFaculte(int nombreFaculte) {
        this.nombreFaculte = nombreFaculte;
    }

    public String getSystemeEnseignement() {
        return systemeEnseignement;
    }

    public void setSystemeEnseignement(String systemeEnseignement) {
        this.systemeEnseignement = systemeEnseignement;
    }

    public String getNomRecteur() {
        return nomRecteur;
    }

    public void setNomRecteur(String nomRecteur) {
        this.nomRecteur = nomRecteur;
    }

    public void decrireUniversite() {
        super.decrireInstitution();
        System.out.println("Nombre de facultés: " + nombreFaculte);
        System.out.println("Système d'enseignement: " + systemeEnseignement);
        System.out.println("Nom du recteur: " + nomRecteur);
    }

    public static void afficherNomsRecteurs(Universite univ1, Universite univ2) {
        System.out.println("Recteur de " + univ1.getNomInstitution() + ": " + univ1.getNomRecteur());
        System.out.println("Recteur de " + univ2.getNomInstitution() + ": " + univ2.getNomRecteur());
    }
}
