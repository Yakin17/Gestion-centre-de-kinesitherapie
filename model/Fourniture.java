
package model;


public class Fourniture {
    private String nom_fourn;
    private int quantite;
    private String origine;

    public Fourniture(String nom_fourn, int quantite, String origine) {
        this.nom_fourn = nom_fourn;
        this.quantite = quantite;
        this.origine = origine;
    }

    public Fourniture() {
    }

    public void setNom_fourn(String nom_fourn) {
        this.nom_fourn = nom_fourn;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getNom_fourn() {
        return nom_fourn;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getOrigine() {
        return origine;
    }
    
    
}
