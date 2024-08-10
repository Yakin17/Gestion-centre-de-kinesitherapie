
package vue;

import static controller.Factory.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Patient;


public class FormPatient extends JFrame implements ActionListener {
     JLabel lnom,lprenom,ldate,ltelephone,ladresse,lemail,lnumero_assur,lidpatient;
    JTextField tnom,tprenom,tdate,ttelephone,tadresse,temail,tnumero_assur,trech,tidpatient;
    JButton badd,bview,bupdate,bdelete,brein,brech;
    
    ArrayList<Patient> listePatient=new ArrayList();
    JTable tblEmpl;
    
    private final DefaultTableModel model;
    Patient pat=null;
    
    public FormPatient()
    {
        lidpatient=new JLabel("Id patient");
        lidpatient.setBounds(10,30,100,30);
        this.getContentPane().add(lidpatient);
       
        
        
        tidpatient=new JTextField("");
        tidpatient.setBounds(120,30,100,30);
        this.getContentPane().add(tidpatient);
       
        
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
        
        ldate=new JLabel("Date de naissance");
        ldate.setBounds(10,150,100,30);
        this.getContentPane().add(ldate);
        
        tdate=new JTextField("");
        tdate.setBounds(120,150,100,30);
        this.getContentPane().add(tdate);
        
        ltelephone=new JLabel("Telephone");
        ltelephone.setBounds(10,190,100,30);
        this.getContentPane().add(ltelephone);
        
        ttelephone=new JTextField("");
        ttelephone.setBounds(120,190,100,30);
        this.getContentPane().add(ttelephone);
        
        ladresse=new JLabel("Adresse");
        ladresse.setBounds(10,230,100,30);
        this.getContentPane().add(ladresse);
        
        tadresse=new JTextField("");
        tadresse.setBounds(120,230,100,30);
        this.getContentPane().add(tadresse);
        
        lemail=new JLabel("Email");
        lemail.setBounds(10,270,100,30);
        this.getContentPane().add(lemail);
        
        temail=new JTextField("");
        temail.setBounds(120,270,100,30);
        this.getContentPane().add(temail);
        
        lnumero_assur=new JLabel("Numero de carte d'assurance");
        lnumero_assur.setBounds(10,310,100,30);
        this.getContentPane().add(lnumero_assur);
        
        tnumero_assur=new JTextField();
        tnumero_assur.setBounds(120,310,100,30);
        this.getContentPane().add(tnumero_assur);
        
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
        model.addColumn("id patient");
        model.addColumn("nom");
        model.addColumn("prenom");
        model.addColumn("date de naissance");
        model.addColumn("Telephone");
        model.addColumn("Adresse");
        model.addColumn("Email");
        model.addColumn("Numero carte d'assurance maladie");
        
        this.getContentPane().setLayout(null);
        
    }
    
    public void afficher()
    {
        model.setRowCount(0);
        listePatient= getPatient();
        for(Patient pa:listePatient)
        {
            model.addRow(new Object[]{
                                        pa.getIdpatient(),pa.getNom(),pa.getPrenom(),pa.getDate_naiss(),pa.getTelephone(),pa.getAdresse(),pa.getEmail(),pa.getNumero_assur()});
        }
        tblEmpl=new JTable(model);
        JScrollPane p=new JScrollPane(tblEmpl);
        p.setBounds(20,420,900,100);
        this.getContentPane().add(p);
        
    }
    
    public void effacer()
    {
        tidpatient.setText("");
        tnom.setText("");
        tprenom.setText("");
        tdate.setText(""); 
        ttelephone.setText("");
        tadresse.setText("");
        temail.setText("");
        tnumero_assur.setText("");
        trech.setText("");
       
    }
    
     public void recupinfo(Patient pa){
        tidpatient.setText(String.valueOf(pa.getIdpatient()));
        tnom.setText(pa.getNom());
       tprenom.setText(pa.getPrenom());
       tdate.setText(pa.getDate_naiss());
       ttelephone.setText(String.valueOf(pa.getTelephone()));
       tadresse.setText(pa.getAdresse());
       temail.setText(pa.getEmail());
       tnumero_assur.setText(pa.getNumero_assur());
     }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==badd)
        {
            String idpa=tidpatient.getText();
            String nomp=tnom.getText();
            String prenomp=tprenom.getText();
            String daten=tdate.getText();
            int tel=Integer.parseInt(ttelephone.getText());
            String adr=tadresse.getText();
            String em=temail.getText();
            String numero_ass=tnumero_assur.getText();
            pat=new Patient(idpa,nomp,prenomp,daten,tel,adr,em,numero_ass);
            insererPatient(pat);
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
                        pat=controller.Factory.getPatientById(r);
                        if(pat!=null)
                        {
                            recupinfo(pat);
                        }
                        
                    }
        else
                        if(e.getSource()==bdelete)
                        {
                            if(pat!=null)
                            {
                                String msg="Voulez-vous reelement supprimez le patient "+pat.getIdpatient()+" de la liste ";
                                int rep=JOptionPane.showConfirmDialog(null, msg);
                                if(rep==0)
                                {
                                    controller.Factory.supprimerPatientById(pat);
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
                                String daten=tdate.getText();
                                int tel= Integer.parseInt(ttelephone.getText());
                                String adr=tadresse.getText();
                                String em=temail.getText();
                                String num=tnumero_assur.getText();
                                int d=Integer.parseInt(trech.getText());
                            
                                if(JOptionPane.showConfirmDialog(null, "Voulez-vous faire cette modification?","Modification",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                                {
                                    controller.Factory.ModifierPatientById(nom,pren,daten, tel, adr,em,num, d);
                                    afficher();
                                    effacer();
            
                                }
                                
                            }
    }
}
    
