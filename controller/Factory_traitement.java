
package controller;

import static controller.Factory.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Traitement;


public class Factory_traitement {
    private static Connection conn=null;
    private static Statement stm;
    private static PreparedStatement pstmet=null;
    private static ResultSet rs=null;
    
       public static void insererTraitement(Traitement trait)
    {
        
        try{
            conn=getConnection();
            pstmet=conn.prepareStatement("insert into centre_kin.traitement(id_traitement,id_patient,id_therapeute,Description_traitement,Duree) values(?,?,?,?,?)");
            pstmet.setInt(1, trait.getIdtraitement());
            pstmet.setString(2,trait.getIdpatient());
            pstmet.setString(3, trait.getIdtherapeute());
            pstmet.setString(4,trait.getDescription());
            pstmet.setString(5, trait.getDuree());
            
            
            pstmet.executeUpdate();
            conn.close();
        }
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }
       public static ArrayList<Traitement> getTraitement(){
        ArrayList<Traitement> lic=new ArrayList();
        Traitement tr=null;
        try{
            conn=getConnection();
            stm=conn.createStatement();
            rs=stm.executeQuery("select * from centre_kin.traitement");
            while(rs.next())
            {
                tr=new Traitement();
                tr.setIdtraitement(rs.getInt("id_traitement"));
                tr.setIdpatient(rs.getString("id_patient"));
                tr.setIdtherapeute(rs.getString("id_therapeute"));
                tr.setDescription(rs.getString("Description_traitement"));
                tr.setDuree(rs.getString("Duree"));
               
                
                
                lic.add(tr);
            }
            conn.close();
            stm.close();
        }
        catch(Exception e){
            
        }return lic;
    }
       
       
       public static Traitement getTraitementById(int nm){
    Traitement t=null;
    try{
        conn=getConnection();
        stm=conn.createStatement();
        rs=stm.executeQuery("select * from centre_kin.traitement where id_traitement='"+nm+"'");
        if(rs.next()){
            t=new Traitement();
            t.setIdtraitement(rs.getInt("id_traitement"));
            t.setIdpatient(rs.getString("id_patient"));
            t.setIdtherapeute(rs.getString("id_therapeute"));
            t.setDescription(rs.getString("Description_traitement"));
            t.setDuree(rs.getString("Duree"));
           
         
        }
        conn.close();
        stm.close();
        return t;
    }
    catch(Exception e){
        JOptionPane.showConfirmDialog(null, e.getMessage());
        return null;
    }
 } 
          public static void ModifierTraitementById(String pati,String thera,String descri,String dur,int c){
    try{
        conn=getConnection();
        stm=conn.createStatement();
        String req=("update centre_kin.traitement SET id_patient ='"+pati+"',id_therapeute='"+thera+"',Description_traitement='"+descri+"',Duree='"+dur+"' where id_traitement='"+c+"' ");
    
        stm.executeUpdate(req);
        conn.close();
}catch(SQLException ex){
   JOptionPane.showConfirmDialog(null, ex.getMessage());
}
}
          
          public static void supprimerTraitementById(Traitement trai){
    try{
        conn=getConnection();
        stm=conn.createStatement();
        String req=("delete from centre_kin.traitement WHERE id_traitement='"+trai.getIdtraitement()+"'");
    
        stm.executeUpdate(req);
        conn.close();
}catch(SQLException ex){
   JOptionPane.showConfirmDialog(null, ex.getMessage());
}
}

    
            
    
    
    
    public static Connection getConnection(){
        String serveur="localhost";
        int port=3306;
        String database="centre_kin";
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
