
package model;


public class Therapeute {
    private String nom,idtherapeute;

    public String getIdtherapeute() {
        return idtherapeute;
    }

    public void setIdtherapeute(String idtherapeute) {
        this.idtherapeute = idtherapeute;
    }
    private String prenom;
    private String specialite;
    private int telephone;
    private String adresse;
    private String email;

    
    public Therapeute(String idtherapeute,String nom, String prenom, String specialite, int telephone, String adresse, String email) {
        this.idtherapeute=idtherapeute;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
    }
    public Therapeute(String nom, String prenom, String specialite, int telephone, String adresse, String email) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
    }

    public Therapeute() {
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }
    
    
    

}
