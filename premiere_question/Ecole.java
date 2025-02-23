public class Ecole extends Institution {
    private String typeEcole;
    private int nombreClasses;
    private String nomPromoteur;

    public Ecole(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation, String typeEcole, int nombreClasses, String nomPromoteur) {
        super(nomInstitution, paysInstitution, typeInstitution, anneeCreation);
        this.typeEcole = typeEcole;
        this.nombreClasses = nombreClasses;
        this.nomPromoteur = nomPromoteur;
    }

    public String getTypeEcole() {
        return typeEcole;
    }

    public void setTypeEcole(String typeEcole) {
        this.typeEcole = typeEcole;
    }

    public int getNombreClasses() {
        return nombreClasses;
    }

    public void setNombreClasses(int nombreClasses) {
        this.nombreClasses = nombreClasses;
    }

    public String getNomPromoteur() {
        return nomPromoteur;
    }

    public void setNomPromoteur(String nomPromoteur) {
        this.nomPromoteur = nomPromoteur;
    }

    public void decrireEcole() {
        super.decrireInstitution();
        System.out.println("Type d'école: " + typeEcole);
        System.out.println("Nombre de classes: " + nombreClasses);
        System.out.println("Nom du promoteur: " + nomPromoteur);
    }

    public static void afficherNomsPromoteurs(Ecole ecole1, Ecole ecole2, Ecole ecole3) {
        System.out.println("Promoteur de " + ecole1.getNomInstitution() + ": " + ecole1.getNomPromoteur());
        System.out.println("Promoteur de " + ecole2.getNomInstitution() + ": " + ecole2.getNomPromoteur());
        System.out.println("Promoteur de " + ecole3.getNomInstitution() + ": " + ecole3.getNomPromoteur());
    }
}
