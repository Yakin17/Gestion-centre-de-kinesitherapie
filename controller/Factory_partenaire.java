
package controller;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JTable;

public class Factory_partenaire {
    ArrayList<Partenaire> listepartenaire=new ArrayList();
 JTable tbpartenaire;
 
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
 
     public static void insererPartenaire(Partenaire part){
     try{
     conn = getConnection();
     pstmet = conn.prepareStatement("insert into centre_kin.partenaire(nom ,link,email) values(?,?,?)");
     pstmet .setString(1, part.getNom_part());
     pstmet .setString(2, part.getLink_site());
     pstmet .setString(3, part.getEmail());
     
        

     pstmet .executeUpdate();
    conn.close();             
     
     }
     catch(Exception e){
     JOptionPane.showConfirmDialog(null,e.getMessage());
     }
 }
     
    public static ArrayList<Partenaire> getPartenaire(){
     ArrayList<Partenaire> lic=new ArrayList();
     Partenaire part=null;
     try{
     conn=getConnection();
     stm=conn.createStatement();
     rs=stm.executeQuery("select * from centre_kin.partenaire");
     while(rs.next())
     {//idclient,nom,prenom,adresse,tel,nationalite
         part = new Partenaire();
         part.setNom_part(rs.getString("nom"));
         part.setLink_site(rs.getString("link"));
         part.setEmail(rs.getString("email"));
         
        


         lic.add(part);
     }
     conn.close();
     stm.close();
     }
     catch(Exception e){
         
     }return lic;
 }
       
       
    public static Partenaire getRechC(String c)
  {
      Partenaire part =null;
      try
      {
         conn = getConnection();
         stm=conn.createStatement();
         rs=stm.executeQuery("select * from centre_kin.partenaire where nom='"+c+"'");
         if(rs.next())
         {
         part = new Partenaire();
         part.setNom_part(rs.getString("nom"));
         part.setLink_site(rs.getString("link"));
         part.setEmail(rs.getString("email"));
         
         
       
       
         }
         conn.close();
         stm.close();
         
      }
     catch (Exception e){
        return null;
     }
   return part;
  }
    
    
     public static void deletePartenaire(Partenaire P)
   {
      try{
      conn=getConnection();
     stm=conn.createStatement();
     String Requete="delete from centre_kin.partenaire where nom='"+P.getNom_part()+"'";
     stm.executeUpdate(Requete);
     conn.close();
      }
      catch (SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());

      }
  }
     
      public static void modifPartenaire(Partenaire c,String mot)
 {
     try{
              conn = getConnection();
              pstmet = conn.prepareStatement("update centre_kin.partenaire set nom=?,link=?,email=? where nom='"+mot+"'");
              
              pstmet.setString(1,c.getNom_part());
              pstmet.setString(2,c.getLink_site());
              pstmet.setString(3,c.getEmail());
                       

              pstmet.executeUpdate();
              conn.close();

     }
     catch(Exception ex)
     {
         JOptionPane.showConfirmDialog(null, ex.getMessage());
     }
 }
}
