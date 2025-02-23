public class Institution {
    private String nomInstitution;
    private String paysInstitution;
    private String typeInstitution;
    private int anneeCreation;

    public Institution(String nomInstitution, String paysInstitution, String typeInstitution, int anneeCreation) {
        this.nomInstitution = nomInstitution;
        this.paysInstitution = paysInstitution;
        this.typeInstitution = typeInstitution;
        this.anneeCreation = anneeCreation;
    }

    public String getNomInstitution() {
        return nomInstitution;
    }

    public void setNomInstitution(String nomInstitution) {
        this.nomInstitution = nomInstitution;
    }

    public String getPaysInstitution() {
        return paysInstitution;
    }

    public void setPaysInstitution(String paysInstitution) {
        this.paysInstitution = paysInstitution;
    }

    public String getTypeInstitution() {
        return typeInstitution;
    }

    public void setTypeInstitution(String typeInstitution) {
        this.typeInstitution = typeInstitution;
    }

    public int getAnneeCreation() {
        return anneeCreation;
    }

    public void setAnneeCreation(int anneeCreation) {
        this.anneeCreation = anneeCreation;
    }

    public int calculerAge() {
        return java.time.Year.now().getValue() - anneeCreation;
    }

    public void decrireInstitution() {
        System.out.println("Nom de l'institution: " + nomInstitution);
        System.out.println("Pays de l'institution: " + paysInstitution);
        System.out.println("Type d'institution: " + typeInstitution);
        System.out.println("Année de création: " + anneeCreation);
        System.out.println("Âge de l'institution: " + calculerAge() + " ans");
    }
}
