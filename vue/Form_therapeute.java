
package vue;
import model.Therapeute;
import controller.Factory_therapeute;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Form_therapeute extends javax.swing.JFrame {
ArrayList<Therapeute> listether=new ArrayList();
JTable tbt;
Therapeute the=null;
private final DefaultTableModel model;
    public Form_therapeute() {
        initComponents();
    model=new DefaultTableModel();
    model.addColumn("Id therapeute");
    model.addColumn("Nom");
    model.addColumn("Prenom");
    model.addColumn("specialite");
    model.addColumn("telephone");
    model.addColumn("adresse");
    model.addColumn("email");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tnom = new javax.swing.JTextField();
        tprenom = new javax.swing.JTextField();
        tspecialite = new javax.swing.JTextField();
        ttelephone = new javax.swing.JTextField();
        tadresse = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        enregistrer = new javax.swing.JButton();
        afficher = new javax.swing.JButton();
        reinicialiser = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        Recherche = new javax.swing.JButton();
        trecherche = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tidtherapeute = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nom");

        jLabel2.setText("Prenom");

        jLabel3.setText("Specialité");

        jLabel4.setText("Telephone");

        jLabel5.setText("Adresse");

        jLabel6.setText("Email");

        tprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprenomActionPerformed(evt);
            }
        });

        enregistrer.setText("Add");
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });

        afficher.setText("View");
        afficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherActionPerformed(evt);
            }
        });

        reinicialiser.setText("Reset");
        reinicialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinicialiserActionPerformed(evt);
            }
        });

        modifier.setText("Update");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        supprimer.setText("Delete");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        Recherche.setText("Research");
        Recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheActionPerformed(evt);
            }
        });

        jLabel7.setText("Id therapeute");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(enregistrer)
                        .addGap(43, 43, 43)
                        .addComponent(afficher)
                        .addGap(50, 50, 50)
                        .addComponent(reinicialiser)
                        .addGap(48, 48, 48)
                        .addComponent(modifier))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tnom)
                            .addComponent(tprenom)
                            .addComponent(tspecialite)
                            .addComponent(ttelephone)
                            .addComponent(temail, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(tadresse)
                            .addComponent(tidtherapeute))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(supprimer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(trecherche, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(165, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tidtherapeute, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(trecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tspecialite, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(temail)
                        .addGap(7, 7, 7)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enregistrer)
                    .addComponent(afficher)
                    .addComponent(reinicialiser)
                    .addComponent(modifier)
                    .addComponent(supprimer))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprenomActionPerformed

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
       if (evt.getSource()==enregistrer)
     {
         String id=tidtherapeute.getText();
         String no = tnom.getText();
         String pren = tprenom.getText();
         String spec = tspecialite.getText();
         int te = Integer.parseInt(ttelephone.getText());
         String adre = tadresse.getText();
         String emai = temail.getText();
     
   the = new Therapeute(id,no,pren,spec,te,adre,emai);
   Factory_therapeute.insererTherapeute(the);
   affichage();
    } 
    }//GEN-LAST:event_enregistrerActionPerformed

    private void afficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherActionPerformed
        if(evt.getSource()==afficher) 
       {affichage();}
    }//GEN-LAST:event_afficherActionPerformed

    private void reinicialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinicialiserActionPerformed
      if(evt.getSource()==reinicialiser) 
       {effacer();}
    }//GEN-LAST:event_reinicialiserActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
 
     
        
         String no = tnom.getText();
         String pren = tprenom.getText();
         String spec = tspecialite.getText();
         int te = Integer.parseInt(ttelephone.getText());
         String adre = tadresse.getText();
         String emai = temail.getText();
         String m=trecherche.getText();
         the=new Therapeute(no,pren,spec,te,adre,emai);
         if(JOptionPane.showConfirmDialog(null, "Voulez-vous faire cette modification?","Modification",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
     
         {
             Factory_therapeute.modifierTherapeute(the,m);
             affichage();
             
         }
   
   
     
    }//GEN-LAST:event_modifierActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
         if(the!=null)
            {
                String msg="Voulez-vous reelement supprimer le therapeute "+the.getIdtherapeute()+"?";
                int rep = JOptionPane.showConfirmDialog(null, msg);
                if(rep ==0)
                {
                    Factory_therapeute.deleteTherapeute(the);
                    affichage();
                    effacer();
                }

            }
    }//GEN-LAST:event_supprimerActionPerformed

    private void RechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheActionPerformed

            
                String rch=trecherche.getText();
                the= Factory_therapeute.getRechC(rch);
                if(the !=null)
                {
                    tidtherapeute.setText(the.getIdtherapeute());
                    tnom.setText(the.getNom());
                    tprenom.setText(the.getPrenom());
                    tspecialite.setText(the.getSpecialite());
                    ttelephone.setText(String.valueOf(the.getTelephone()));
                    tadresse.setText(the.getAdresse());
                    temail.setText(the.getEmail());

                                  
                }
                
            
    }//GEN-LAST:event_RechercheActionPerformed

    
    
     public void affichage()
 {
     model.setRowCount(0);
     listether = Factory_therapeute.getTherapeute();
     for(Therapeute ther :listether)
     {  
         // JLabel id_malade,nom,prenom,genre,adresse,nationalite,numero;
         model.addRow(new Object[]{
           ther.getIdtherapeute(),ther.getNom(),ther.getPrenom(),ther.getSpecialite(),ther.getTelephone(),ther.getAdresse(),ther.getEmail()
         });
     }
     tbt = new JTable(model);
     JScrollPane p = new JScrollPane(tbt);
     p.setBounds(10,500,800,100);
     this.getContentPane().add(p);
 }
     
     public void effacer()
 {
     
     tidtherapeute.setText("");
     tnom.setText("");
     tprenom.setText("");
     tspecialite.setText("");
     ttelephone.setText("");
     tadresse.setText("");
     temail.setText("");

    
 }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_therapeute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_therapeute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_therapeute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_therapeute.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_therapeute().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Recherche;
    private javax.swing.JButton afficher;
    private javax.swing.JButton enregistrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton modifier;
    private javax.swing.JButton reinicialiser;
    private javax.swing.JButton supprimer;
    private javax.swing.JTextField tadresse;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tidtherapeute;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextField tprenom;
    private javax.swing.JTextField trecherche;
    private javax.swing.JTextField tspecialite;
    private javax.swing.JTextField ttelephone;
    // End of variables declaration//GEN-END:variables
}
