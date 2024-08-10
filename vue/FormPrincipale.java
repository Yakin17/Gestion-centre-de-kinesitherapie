/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 *
 * @author YAKIN
 */
public class FormPrincipale extends JFrame implements ActionListener{
    JMenuBar menubar;
    JMenu mform,mquitter;
    JMenuItem mipatient,mipersonneladm,miservice,mitraitement,mifourniture,mipartenaire,mitherapeute;
    
    public FormPrincipale()
    {
        menubar=new JMenuBar();
        mform=new JMenu("Formulaires");
        
        mquitter=new JMenu("Quitter");
        mquitter.addActionListener(this);
        
        mipatient=new JMenuItem("Patient");
        mipatient.addActionListener(this);
        
        mipersonneladm=new JMenuItem("Personnel Administrative");
        mipersonneladm.addActionListener(this);
        
        miservice=new JMenuItem("Service");
        miservice.addActionListener(this);
        
        mitraitement=new JMenuItem("Traitement");
        mitraitement.addActionListener(this);
        
        mifourniture=new JMenuItem("Fourniture");
        mifourniture.addActionListener(this);
        
        mipartenaire=new JMenuItem("Partenaire");
        mipartenaire.addActionListener(this);
        
        mitherapeute=new JMenuItem("Therapeute");
        mitherapeute.addActionListener(this);
        
        menubar.add(mform);
        menubar.add(mquitter);
        
        mform.add(mipatient);
        mform.add(mipersonneladm);
        mform.add(miservice);
        mform.add(mitraitement);
        mform.add(mifourniture);
        mform.add(mipartenaire);
        mform.add(mitherapeute);
        
        this.getContentPane().add(menubar);
        menubar.setBounds(20,15,800,30);
        this.setLayout(null);
        
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==mipatient)
        {
            FormPatient pat=new FormPatient();
            pat.setSize(600,550);
            pat.setTitle("Formulaire patient");
            pat.setVisible(true);
        }
        else
            if(e.getSource()==mipersonneladm)
        {
            FormPersonnelAdm pers=new FormPersonnelAdm();
            pers.setSize(600,550);
            pers.setTitle("Formulaire Personnel");
            pers.setVisible(true);
        } 
        else
                if(e.getSource()==miservice)
                {
                    FormService ser=new FormService();
                    ser.setSize(600,550);
                    ser.setTitle("Formulaire Service");
                    ser.setVisible(true);
                }
        else
                    if(e.getSource()==mitraitement)
                    {
                        FormTraitement tr=new FormTraitement();
                        tr.setSize(600,550);
                        tr.setTitle("Formulaire Traitement");
                        tr.setVisible(true);
                    }
        else
                        if(e.getSource()==mifourniture)
                        {
                            FormFourniture four=new FormFourniture();
                            four.setSize(600,550);
                            four.setTitle("Formulaire Fourniture");
                            four.setVisible(true);
                            
                        }
        else
                            if(e.getSource()==mipartenaire)
                            {
                                Form_partenaire part=new Form_partenaire();
                                part.setSize(600,550);
                                part.setTitle("Formulaire Partenaire");
                                part.setVisible(true);
                            }
        else
                                if(e.getSource()==mitherapeute)
                                {
                                    Form_therapeute th=new Form_therapeute();
                                    th.setSize(600,550);
                                    th.setTitle("Formulaire Therapeute");
                                    th.setVisible(true);
                                    
                                }
        else
                                    if(e.getSource()==mquitter)
                                    {
                                        dispose();
                                    }
        
    }
    
}
