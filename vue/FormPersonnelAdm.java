
package vue;

import controller.Factory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.PersonnelAdm;


public class FormPersonnelAdm extends JFrame implements ActionListener {
     JLabel lnom,lprenom,ltelephone,ladresse,lemail,lrole,ldescription,lidpersonnel;
    JTextField tnom,tprenom,ttelephone,tadresse,temail,trole,trech,tidpersonnel;
    JTextArea tdescription;
    JButton badd,bview,bupdate,bdelete,brein,brech;
    
    ArrayList<PersonnelAdm> listePersonnelAdm=new ArrayList();
    JTable tblEmpl;
    
    private final DefaultTableModel model;
    PersonnelAdm pers=null;
    
    public FormPersonnelAdm()
    {
        lidpersonnel=new JLabel("Id personnel");
        lidpersonnel.setBounds(10,30,100,30);
        this.getContentPane().add(lidpersonnel);
       
        
        
        tidpersonnel=new JTextField("");
        tidpersonnel.setBounds(120,30,100,30);
        this.getContentPane().add(tidpersonnel);
       
        
        lnom=new JLabel("Nom");
        lnom.setBounds(10,70,100,30);
        this.getContentPane().add(lnom);
        
        tnom=new JTextField("");
        tnom.setBounds(120,70,100,30);
        this.getContentPane().add(tnom);
        
        trech=new JTextField("");
        trech.setBounds(380,60,100,30);
        this.getContentPane().add(trech);
        
        lprenom=new JLabel("Prenom");
        lprenom.setBounds(10,110,100,30);
        this.getContentPane().add(lprenom);
        
        tprenom=new JTextField("");
        tprenom.setBounds(120,110,100,30);
        this.getContentPane().add(tprenom);
        
        ltelephone=new JLabel("Telephone");
        ltelephone.setBounds(10,150,100,30);
        this.getContentPane().add(ltelephone);
        
        ttelephone=new JTextField("");
        ttelephone.setBounds(120,150,100,30);
        this.getContentPane().add(ttelephone);
        
        ladresse=new JLabel("Adresse");
        ladresse.setBounds(10,190,100,30);
        this.getContentPane().add(ladresse);
        
        tadresse=new JTextField("");
        tadresse.setBounds(120,190,100,30);
        this.getContentPane().add(tadresse);
        
        lemail=new JLabel("Email");
        lemail.setBounds(10,230,100,30);
        this.getContentPane().add(lemail);
        
        temail=new JTextField("");
        temail.setBounds(120,230,100,30);
        this.getContentPane().add(temail);
        
        lrole=new JLabel("Role");
        lrole.setBounds(10,270,100,30);
        this.getContentPane().add(lrole);
        
        trole=new JTextField("");
        trole.setBounds(120,270,100,30);
        this.getContentPane().add(trole);
        
        ldescription=new JLabel("Description");
        ldescription.setBounds(10,310,100,30);
        this.getContentPane().add(ldescription);
        
        tdescription=new JTextArea();
        tdescription.setBounds(120,310,100,30);
        this.getContentPane().add(tdescription);
        
        badd=new JButton("Add");
        badd.setBounds(10,360,100,20);
        badd.addActionListener(this);
        this.getContentPane().add(badd);
        
        bview=new JButton("View");
        bview.setBounds(130,360,100,20);
        bview.addActionListener(this);
        this.getContentPane().add(bview);
        
        bupdate=new JButton("Update");
        bupdate.setBounds(250,360,100,20);
        bupdate.addActionListener(this);
        this.getContentPane().add(bupdate);
        
        bdelete=new JButton("Delete");
        bdelete.setBounds(370,360,100,20);
        bdelete.addActionListener(this);
        this.getContentPane().add(bdelete);
        
        brein=new JButton("Reset");
        brein.setBounds(490,360,120,20);
        brein.addActionListener(this);
        this.getContentPane().add(brein);
        
        brech=new JButton("Search");
        brech.setBounds(260,65,100,20);
        brech.addActionListener(this);
        this.getContentPane().add(brech);
        
        model=new DefaultTableModel();
        model.addColumn("id personnel");
        model.addColumn("nom");
        model.addColumn("prenom");
        model.addColumn("telephone");
        model.addColumn("adresse");
        model.addColumn("email");
        model.addColumn("role");
        model.addColumn("description");
        
        
        this.getContentPane().setLayout(null);
        
    }
    
    public void afficher()
    {
        model.setRowCount(0);
        listePersonnelAdm= Factory.getPersonnelAdm();
        for(PersonnelAdm per:listePersonnelAdm)
        {
            model.addRow(new Object[]{
                                        per.getIdpersonnel(),per.getNom(),per.getPrenom(),per.getTelephone(),per.getAdresse(),per.getEmail(),per.getRole(),per.getDescription()});
        }
        tblEmpl=new JTable(model);
        JScrollPane p=new JScrollPane(tblEmpl);
        p.setBounds(60,400,1000,100);
        this.getContentPane().add(p);
        
    }
    
    public void effacer()
    {
        tidpersonnel.setText("");
        tnom.setText("");
        tprenom.setText(""); 
        ttelephone.setText("");
        tadresse.setText("");
        temail.setText("");
        trole.setText("");
        tdescription.setText("");
        trech.setText("");
       
    }
    
    public void recupinfo(PersonnelAdm per){
        
       tidpersonnel.setText(String.valueOf(per.getIdpersonnel())); 
       tnom.setText(per.getNom());
       tprenom.setText(per.getPrenom());
       ttelephone.setText(String.valueOf(per.getTelephone()));
       tadresse.setText(per.getAdresse());
       temail.setText(per.getEmail());
       trole.setText(per.getRole());
       tdescription.setText(per.getDescription());
       
       
   }
    
    
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==badd)
        {
            int idpers=Integer.parseInt(tidpersonnel.getText());
            String nomp=tnom.getText();
            String pren=tprenom.getText();
            int tel=Integer.parseInt(ttelephone.getText());
            String adr=tadresse.getText();
            String ema=temail.getText();
            String rolep=trole.getText();
            String desc=tdescription.getText();
            
            pers=new PersonnelAdm(idpers,nomp,pren,tel,adr,ema,rolep,desc);
            Factory.insererPersonnelAdm(pers);
            afficher();
            
        }
        else
            if(e.getSource()==bview)
            {
                afficher();
            }
        else
                if(e.getSource()==brein)
                {
                    effacer();
                }
        else
                  if(e.getSource()==brech)
                  {
                      int r=Integer.parseInt(trech.getText());
                        pers=controller.Factory.getPersonnelAdmById(r);
                        if(pers!=null)
                        {
                            recupinfo(pers);
                        }
                      
                  }
        else
                   if(e.getSource()==bdelete)
                   {
                       if(pers!=null)
                            {
                                String msg="Voulez-vous reelement supprimez le personnel "+pers.getIdpersonnel()+" de la liste ";
                                int rep=JOptionPane.showConfirmDialog(null, msg);
                                if(rep==0)
                                {
                                    controller.Factory.supprimerPersonnelAdmById(pers);
                                    afficher();
                                    effacer();
                                }
                            
                            }
                       
                   }
        else
                       if(e.getSource()==bupdate)
                            {
                                String nom=tnom.getText();
                                String pren=tprenom.getText();
                                
                                int tel= Integer.parseInt(ttelephone.getText());
                                String adr=tadresse.getText();
                                String em=temail.getText();
                                String rol=trole.getText();
                                String des=tdescription.getText();
                                
                                int d=Integer.parseInt(trech.getText());
                            
                                if(JOptionPane.showConfirmDialog(null, "Voulez-vous faire cette modification?","Modification",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                                {
                                    controller.Factory.ModifierPersonnelAdmById(nom,pren,tel,adr,em,rol,des,d);
                                    afficher();
                                    effacer();
            
                                }
                                
                            }
                       
                
        
    }
    
    
    
}
