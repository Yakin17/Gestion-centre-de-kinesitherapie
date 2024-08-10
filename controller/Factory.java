/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import model.Patient;
import model.PersonnelAdm;
import model.Service;



public class Factory {
    private static Connection conn=null;
    private static Statement stm;
    private static PreparedStatement pstmet=null;
    private static ResultSet rs=null;
    
    public static void insererPatient(Patient pat)
    {
        try{
            conn=getConnection();
            pstmet=conn.prepareStatement("insert into centre_kin.patient(id_patient,Nom_patient,Prenom_patient,Date_naiss,Telephone,Adresse,Email,Num_carte_assur_maladie) values(?,?,?,?,?,?,?,?)");
            pstmet.setString(1, pat.getIdpatient());
            pstmet.setString(2,pat.getNom());
            pstmet.setString(3, pat.getPrenom());
            pstmet.setString(4,pat.getDate_naiss());
            pstmet.setInt(5, pat.getTelephone());
            pstmet.setString(6, pat.getAdresse());
            pstmet.setString(7, pat.getEmail());
            pstmet.setString(8, pat.getNumero_assur());
            pstmet.executeUpdate();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
        
        
    }
    
    public static ArrayList<Patient> getPatient(){
        ArrayList<Patient> lic=new ArrayList();
        Patient pat=null;
        try{
            conn=getConnection();
            stm=conn.createStatement();
            rs=stm.executeQuery("select * from centre_kin.patient");
            while(rs.next())
            {
                pat=new Patient();
                pat.setIdpatient(rs.getString("id_patient"));
                pat.setNom(rs.getString("Nom_patient"));
                pat.setPrenom(rs.getString("Prenom_patient"));
                pat.setDate_naiss(rs.getString("Date_naiss"));
                pat.setTelephone(rs.getInt("Telephone"));
                pat.setAdresse(rs.getString("Adresse"));
                pat.setEmail(rs.getString("Email"));
                pat.setNumero_assur(rs.getString("Num_carte_assur_maladie"));
                
                lic.add(pat);
            }
            conn.close();
            stm.close();
        }
        catch(Exception e){
            
        }return lic;
    }
    
    
    
    public static Patient getPatientById(int nm){
    Patient pa=null;
    try{
        conn=getConnection();
        stm=conn.createStatement();
        rs=stm.executeQuery("select * from  centre_kin.patient where id_patient='"+nm+"'");
        if(rs.next()){
            pa=new Patient();
            pa.setIdpatient(rs.getString("id_patient"));
            pa.setNom(rs.getString("Nom_patient"));
            pa.setPrenom(rs.getString("Prenom_patient"));
            pa.setDate_naiss(rs.getString("Date_naiss"));
            pa.setTelephone(rs.getInt("Telephone"));
            pa.setAdresse(rs.getString("Adresse"));
            pa.setEmail(rs.getString("Email"));
            pa.setNumero_assur(rs.getString("Num_carte_assur_maladie"));
         
        }
        conn.close();
        stm.close();
        return pa;
    }
    catch(Exception e){
        JOptionPane.showConfirmDialog(null, e.getMessage());
        return null;
    }
}
    
    public static void supprimerPatientById(Patient p){
    try{
        conn=getConnection();
        stm=conn.createStatement();
        String req=("delete from centre_kin.patient WHERE id_patient='"+p.getIdpatient()+"'");
    
        stm.executeUpdate(req);
        conn.close();
}catch(SQLException ex){
   JOptionPane.showConfirmDialog(null, ex.getMessage());
}
}
    
    public static void ModifierPatientById(String nom,String pren,String datenaiss,int teleph,String adresse,String emai,String numeroa,int m){
    try{
        conn=getConnection();
        stm=conn.createStatement();
        String req=("update centre_kin.patient SET Nom_patient='"+nom+"',Prenom_patient='"+pren+"',Date_naiss='"+datenaiss+"',Telephone='"+teleph+"',Adresse='"+adresse+"',Email='"+emai+"',Num_carte_assur_maladie='"+numeroa+"' where id_patient='"+m+"' ");
    
        stm.executeUpdate(req);
        conn.close();
}catch(SQLException ex){
   JOptionPane.showConfirmDialog(null, ex.getMessage());
}
}
    
    public static void insererPersonnelAdm(PersonnelAdm per)
    {
        try{
            conn=getConnection();
            pstmet=conn.prepareStatement("insert into test_gestion_kinesitherapie.personnel_administratif(id_personneladm,Nom_personneladm,Prenom_personneladm,Tel_personneladm,Adresse_personneladm,email_personneladm,Role_personneladm,Description) values(?,?,?,?,?,?,?,?)");
            pstmet.setInt(1, per.getIdpersonnel());
            pstmet.setString(2,per.getNom());
            pstmet.setString(3, per.getPrenom());
            pstmet.setInt(4,per.getTelephone());
            pstmet.setString(5, per.getAdresse());
            pstmet.setString(6, per.getEmail());
            pstmet.setString(7, per.getRole());
            pstmet.setString(8, per.getDescription());
            pstmet.executeUpdate();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }
    
    public static ArrayList<PersonnelAdm> getPersonnelAdm(){
        ArrayList<PersonnelAdm> lic=new ArrayList();
        PersonnelAdm per=null;
        try{
            conn=getConnection();
            stm=conn.createStatement();
            rs=stm.executeQuery("select * from test_gestion_kinesitherapie.personnel_administratif");
            while(rs.next())
            {
                per=new PersonnelAdm();
                per.setIdpersonnel(rs.getInt("id_personneladm"));
                per.setNom(rs.getString("Nom_personneladm"));
                per.setPrenom(rs.getString("Prenom_personneladm"));
                per.setTelephone(rs.getInt("Tel_personneladm"));
                per.setAdresse(rs.getString("Adresse_personneladm"));
                per.setEmail(rs.getString("email_personneladm"));
                per.setRole(rs.getString("Role_personneladm"));
                per.setDescription(rs.getString("Description"));
                lic.add(per);
            }
            conn.close();
            stm.close();
        }
        catch(Exception e){
            
        }return lic;
        
        
    }
    
    
    public static PersonnelAdm getPersonnelAdmById(int nm){
    PersonnelAdm per=null;
    try{
        conn=getConnection();
        stm=conn.createStatement();
        rs=stm.executeQuery("select * from test_gestion_kinesitherapie.personnel_administratif where id_personneladm='"+nm+"'");
        if(rs.next()){
            per=new PersonnelAdm();
            per.setIdpersonnel(rs.getInt("id_personneladm"));
            per.setNom(rs.getString("Nom_personneladm"));
            per.setPrenom(rs.getString("Prenom_personneladm"));
            per.setTelephone(rs.getInt("Tel_personneladm"));
            per.setAdresse(rs.getString("Adresse_personneladm"));
            per.setEmail(rs.getString("email_personneladm"));
            per.setRole(rs.getString("Role_personneladm"));
            per.setDescription(rs.getString("Description"));
        }
        conn.close();
        stm.close();
        return per;
    }
    catch(Exception e){
        JOptionPane.showConfirmDialog(null, e.getMessage());
        return null;
    }
}
    
    public static void supprimerPersonnelAdmById(PersonnelAdm per){
    try{
        conn=getConnection();
        stm=conn.createStatement();
        String req=("delete from test_gestion_kinesitherapie.personnel_administratif WHERE id_personneladm='"+per.getIdpersonnel()+"'");
    
        stm.executeUpdate(req);
        conn.close();
}catch(SQLException ex){
   JOptionPane.showConfirmDialog(null, ex.getMessage());
}
}
    
    public static void ModifierPersonnelAdmById(String nom,String pren,int tel,String adresse,String em,String ro,String desc,int m){
    try{
        conn=getConnection();
        stm=conn.createStatement();
        String req=("update test_gestion_kinesitherapie.personnel_administratif SET Nom_personneladm='"+nom+"',Prenom_personneladm='"+pren+"',Tel_personneladm='"+tel+"',Adresse_personneladm='"+adresse+"',email_personneladm='"+em+"',Role_personneladm='"+ro+"',Description='"+desc+"'  where id_personneladm='"+m+"' ");
    
        stm.executeUpdate(req);
        conn.close();
}catch(SQLException ex){
   JOptionPane.showConfirmDialog(null, ex.getMessage());
}
}
    
    public static void insererService(Service se)
    {
        try{
            conn=getConnection();
            pstmet=conn.prepareStatement("insert into test_gestion_kinesitherapie.service(id_service,Nom_service,Description_service,Tarif,Statut_service) values(?,?,?,?,?)");
            pstmet.setInt(1, se.getIdservice());
            pstmet.setString(2,se.getNom());
            pstmet.setString(3, se.getDescription());
            pstmet.setInt(4,se.getTarif());
            pstmet.setString(5, se.getStatut());
            pstmet.executeUpdate();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }
    
    public static ArrayList<Service> getService(){
        ArrayList<Service> lic=new ArrayList();
        Service ser=null;
        try{
            conn=getConnection();
            stm=conn.createStatement();
            rs=stm.executeQuery("select * from test_gestion_kinesitherapie.service");
            while(rs.next())
            {
                ser=new Service();
                ser.setIdservice(rs.getInt("id_service"));
                ser.setNom(rs.getString("Nom_service"));
                ser.setDescription(rs.getString("Description_service"));
                ser.setTarif(rs.getInt("Tarif"));
                ser.setStatut(rs.getString("Statut_service"));
               
                lic.add(ser);
            }
            conn.close();
            stm.close();
        }
        catch(Exception e){
            
        }return lic;
        
        
    }
    
    public static Service getServiceById(int nm){
    Service ser=null;
    try{
        conn=getConnection();
        stm=conn.createStatement();
        rs=stm.executeQuery("select * from test_gestion_kinesitherapie.service where id_service='"+nm+"'");
        if(rs.next()){
            ser=new Service();
            ser.setIdservice(rs.getInt("id_service"));
            ser.setNom(rs.getString("Nom_service"));
            ser.setDescription(rs.getString("Description_service"));
            ser.setTarif(rs.getInt("Tarif"));
            ser.setStatut(rs.getString("Statut_service"));
            
        }
        conn.close();
        stm.close();
        return ser;
    }
    catch(Exception e){
        JOptionPane.showConfirmDialog(null, e.getMessage());
        return null;
    }
}
    
    public static void ModifierServiceById(String no,String desc,int ta,String stat,int m){
    try{
        conn=getConnection();
        stm=conn.createStatement();
            String req=("update test_gestion_kinesitherapie.service SET Nom_service='"+no+"',Description_service='"+desc+"',Tarif='"+ta+"',Statut_service='"+stat+"' where id_service='"+m+"' ");
    
        stm.executeUpdate(req);
        conn.close();
}catch(SQLException ex){
   JOptionPane.showConfirmDialog(null, ex.getMessage());
}
}
    
    public static void supprimerServiceById(Service ser){
    try{
        conn=getConnection();
        stm=conn.createStatement();
        String req=("delete from test_gestion_kinesitherapie.service WHERE id_service ='"+ser.getIdservice()+"'");
    
        stm.executeUpdate(req);
        conn.close();
}catch(SQLException ex){
   JOptionPane.showConfirmDialog(null, ex.getMessage());
}
}
   
    

    
            
    
    
    
    public static Connection getConnection(){
        String serveur="localhost";
        int port=3306;
        String database="test_gestion_kinesitherapie";
        String username="root";
        String password="";
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url="jdbc:mysql://" +serveur+":"+port+"/"+database+"?characterEncoding=latin1";
            conn=DriverManager.getConnection(url, username, password);
            System.out.println("connected");
            return conn;
        } catch(Exception e){
            System.out.println("ERREUR");
            e.printStackTrace();
            return null;
            
        }
        
    }
    
}
