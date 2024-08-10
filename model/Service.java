
package model;


public class Service {
    private int idservice,tarif;
    private String nom,description,statut;

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getIdservice() {
        return idservice;
    }

    public void setIdservice(int idservice) {
        this.idservice = idservice;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public Service(int idservice,String nom,String description,int tarif,String statut)
    {
        this.idservice=idservice;
        this.nom=nom;
        this.description=description;
        this.tarif=tarif;
        this.statut=statut;
    }
    
    public Service()
    {
    }
    
    
    
}
