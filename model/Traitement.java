/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Traitement {
    private String idpatient,description,duree,idtherapeute;
    private int idtraitement;

    public String getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(String idpatient) {
        this.idpatient = idpatient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getIdtraitement() {
        return idtraitement;
    }

    public void setIdtraitement(int idtraitement) {
        this.idtraitement = idtraitement;
    }

    public String getIdtherapeute() {
        return idtherapeute;
    }

    public void setIdtherapeute(String idtherapeute) {
        this.idtherapeute = idtherapeute;
    }
    public Traitement(int idtraitement,String idpatient,String idtherapeute,String description,String duree)
    {
        this.idtraitement=idtraitement;
        this.idpatient=idpatient;
        this.idtherapeute=idtherapeute;
        this.description=description;
        this.duree=duree;
    }
    public Traitement()
    {
        
    }
    
}
