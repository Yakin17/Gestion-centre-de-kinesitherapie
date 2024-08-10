
package model;


public class Partenaire {
private String nom_part;
private String link_site;
private String email;


    public Partenaire(String nom_part, String link_site, String email) {
        this.nom_part = nom_part;
        this.link_site = link_site;
        this.email = email;
        
    }


   

    public Partenaire() {
    }

    public void setNom_part(String nom_part) {
        this.nom_part = nom_part;
    }

    public void setLink_site(String link_site) {
        this.link_site = link_site;
    }

    

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getNom_part() {
        return nom_part;
    }

    public String getLink_site() {
        return link_site;
    }

    

    public String getEmail() {
        return email;
    }


    
}
