
package controller;
import static controller.Factory_partenaire.getConnection;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JTable;

public class Factory_therapeute {
    ArrayList<Therapeute> listetherapeute=new ArrayList();
 JTable tbtherapeute;
 
 private static Connection conn = null;
 private static Statement stm;
 private static PreparedStatement pstmet=null;
 private static ResultSet rs=null;
 
    public static Connection getConnection()
 {
    String serveur="localhost";
    int port = 3306;
    String database="centre_kin";
    String username = "root";
    String password="";
    
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://"+serveur+":"+port+"/"+database+"?characterEncoding=latin1";
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("connected");
        return conn;
    }
    
    catch(Exception e){
        System.out.println("ERREUR");
        e.printStackTrace();
        return null;
    }
    
 }
 
    
    public static void insererTherapeute(Therapeute ther){
     try{
     conn = getConnection();
     pstmet = conn.prepareStatement("insert into centre_kin.therapeute(id_therapeute,nom,prenom,specialite,telephone,adresse,email) values(?,?,?,?,?,?,?)");
     pstmet .setString(1, ther.getIdtherapeute());
     pstmet .setString(2, ther.getNom());
     pstmet .setString(3, ther.getPrenom());
     pstmet .setString(4, ther.getSpecialite());
     pstmet .setInt(5, ther.getTelephone());
     pstmet .setString(6, ther.getAdresse());    
     pstmet .setString(7, ther.getEmail());    

     pstmet .executeUpdate();
    conn.close();             
     
     }
     catch(Exception e){
     JOptionPane.showConfirmDialog(null,e.getMessage());
     }
 }
    
      public static ArrayList<Therapeute> getTherapeute(){
     ArrayList<Therapeute> lic=new ArrayList();
     Therapeute ther=null;
     try{
     conn=getConnection();
     stm=conn.createStatement();
     rs=stm.executeQuery("select * from centre_kin.therapeute");
     while(rs.next())
     {//idclient,nom,prenom,adresse,tel,nationalite
         ther = new Therapeute();
         ther.setIdtherapeute(rs.getString("id_therapeute"));
         ther.setNom(rs.getString("nom"));
         ther.setPrenom(rs.getString("prenom"));
         ther.setSpecialite(rs.getString("specialite"));
         ther.setTelephone(rs.getInt("telephone"));
         ther.setAdresse(rs.getString("adresse"));
         ther.setEmail(rs.getString("email"));


         lic.add(ther);
     }
     conn.close();
     stm.close();
     }
     catch(Exception e){
         
     }return lic;
 }
      
      
         public static Therapeute getRechC(String c)
  {
      Therapeute ther =null;
      try
      {
         conn = getConnection();
         stm=conn.createStatement();
         rs=stm.executeQuery("select * from centre_kin.therapeute where id_therapeute='"+c+"' ");
         if(rs.next())
         {
         ther = new Therapeute();
         ther.setIdtherapeute(rs.getString("id_therapeute"));
         ther.setNom(rs.getString("nom"));
         ther.setPrenom(rs.getString("prenom"));
         ther.setSpecialite(rs.getString("specialite"));
         ther.setTelephone(rs.getInt("telephone"));
         ther.setAdresse(rs.getString("adresse"));
         ther.setEmail(rs.getString("email"));
         }
         conn.close();
         stm.close();
         return ther;
         
         
      }
     catch (Exception e){
         JOptionPane.showConfirmDialog(null, e.getMessage());
        return null;
     }
      
   
  }
         
         
     public static void deleteTherapeute(Therapeute T)
  {
      try{
      conn=getConnection();
     stm=conn.createStatement();
     String Requete="delete from centre_kin.therapeute where nom ='"+T.getNom()+"'";
     stm.executeUpdate(Requete);
     conn.close();
      }
      catch (SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());

      }
  }     
     
     public static void modifierTherapeute(Therapeute t,String mot)
 {
     try{
              conn = getConnection();
              pstmet = conn.prepareStatement("update centre_kin.therapeute set nom=?,prenom=?,specialite=?,telephone=?,	adresse=?,email=? where id_therapeute='"+mot+"'");
              
              pstmet.setString(1,t.getNom());
              pstmet.setString(2,t.getPrenom());
              pstmet.setString(3,t.getSpecialite());
              pstmet.setInt(4,t.getTelephone());
              pstmet.setString(5,t.getAdresse());
              pstmet.setString(6,t.getEmail());
                       

              pstmet.executeUpdate();
              conn.close();

     }
     catch(Exception ex)
     {
         JOptionPane.showConfirmDialog(null, ex.getMessage());
     }
 }
}
