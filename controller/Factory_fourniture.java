
package controller;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JTable;

public class Factory_fourniture {
    ArrayList<Fourniture> listefourniture=new ArrayList();
 JTable tbfourn;
 
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
 
    public static void insererFourniture(Fourniture fourn){
     try{
     conn = getConnection();
     pstmet = conn.prepareStatement("insert into centre_kin.fourniture(nomfourn,quantite,origine) values(?,?,?)");
     pstmet .setString(1, fourn.getNom_fourn());
     pstmet .setInt(2, fourn.getQuantite());
     pstmet .setString(3, fourn.getOrigine());   
     pstmet .executeUpdate();
    conn.close();             
     
     }
     catch(Exception e){
     JOptionPane.showConfirmDialog(null,e.getMessage());
     }
 }
 
    public static ArrayList<Fourniture> getFourniture(){
     ArrayList<Fourniture> lic=new ArrayList();
     Fourniture fourn=null;
     try{
     conn=getConnection();
     stm=conn.createStatement();
     rs=stm.executeQuery("select * from centre_kin.fourniture");
     while(rs.next())
     {//idclient,nom,prenom,adresse,tel,nationalite
         fourn = new Fourniture();
         fourn.setNom_fourn(rs.getString("nomfourn"));
         fourn.setQuantite(rs.getInt("quantite"));
         fourn.setOrigine(rs.getString("origine"));


         lic.add(fourn);
     }
     conn.close();
     stm.close();
     }
     catch(Exception e){
         
     }return lic;
 }
            
   public static Fourniture getRechC(String c)
  {
      Fourniture four=null;
    try{
        conn=getConnection();
        stm=conn.createStatement();
        rs=stm.executeQuery("select * from centre_kin.fourniture where nomfourn='"+c+"'");
        if(rs.next()){
            four=new Fourniture();
            four.setNom_fourn(rs.getString("nomfourn"));
            four.setQuantite(rs.getInt("quantite"));
            four.setOrigine(rs.getString("origine"));
           
         
        }
        conn.close();
        stm.close();
        return four;
    }
    catch(Exception e){
        JOptionPane.showConfirmDialog(null, e.getMessage());
        return null;
    }
      
  }
   
   
    public static void deleteFourniture(Fourniture f)
  {
      try{
      conn=getConnection();
     stm=conn.createStatement();
     String Requete="delete from centre_kin.fourniture where nomfourn ='"+f.getNom_fourn()+"'";
     stm.executeUpdate(Requete);
     conn.close();
      }
      catch (SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());

      }
  }
    
     public static void modifFourniture(Fourniture c,String mot)
 {
     try{
              conn = getConnection();
              pstmet = conn.prepareStatement("update centre_kin.fourniture set nomfourn =?,quantite=?,origine=? where nomfourn='"+mot+"'");
              
              pstmet.setString(1,c.getNom_fourn());
              pstmet.setInt(2,c.getQuantite());
              pstmet.setString(3,c.getOrigine());
              pstmet.executeUpdate();
              conn.close();

     }
     catch(Exception ex)
     {
         JOptionPane.showConfirmDialog(null, ex.getMessage());
     }
 }
}
