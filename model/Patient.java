/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Patient {
    private String idpatient,nom,prenom,date_naiss,adresse,email,numero_assur;
    private int telephone;

    public String getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(String idpatient) {
        this.idpatient = idpatient;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getNumero_assur() {
        return numero_assur;
    }

    public void setNumero_assur(String numero_assur) {
        this.numero_assur = numero_assur;
    }
    
    public String getIdpatientNom()
    {
        return idpatient+"-"+nom;
    }
    
    public Patient(String idpatient,String nom,String prenom,String date_naiss,int telephone,String adresse,String email,String numero_assur)
    {
        this.idpatient=idpatient;
        this.nom=nom;
        this.prenom=prenom;
        this.date_naiss=date_naiss;
        this.telephone=telephone;
        this.adresse=adresse;
        this.email=email;
        this.numero_assur=numero_assur;
    }
    public Patient(){
    }
            
    
}
