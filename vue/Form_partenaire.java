
package vue;
import model.*;
import controller.Factory_partenaire;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Form_partenaire extends javax.swing.JFrame {

 ArrayList<Partenaire> listepart=new ArrayList();
JTable tbp;
Partenaire part=null;
private final DefaultTableModel model;
    public Form_partenaire() {
        initComponents();
     model=new DefaultTableModel();
    model.addColumn("Nom");
    model.addColumn("Link");
    model.addColumn("Email");
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nom = new javax.swing.JLabel();
        link = new javax.swing.JLabel();
        tnom = new javax.swing.JTextField();
        tlink = new javax.swing.JTextField();
        enregistrer = new javax.swing.JButton();
        afficher = new javax.swing.JButton();
        reinicialiser = new javax.swing.JButton();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        trecherche = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        recherche = new javax.swing.JButton();
        temail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nom.setText("Nom");

        link.setText("Link");

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

        recherche.setText("Research");
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });

        jLabel1.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(link, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tnom)
                            .addComponent(tlink)
                            .addComponent(temail, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(enregistrer)
                        .addGap(46, 46, 46)
                        .addComponent(afficher)
                        .addGap(59, 59, 59)
                        .addComponent(reinicialiser)
                        .addGap(55, 55, 55)
                        .addComponent(modifier)
                        .addGap(72, 72, 72)
                        .addComponent(supprimer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recherche)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recherche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(406, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(tlink, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enregistrer)
                            .addComponent(afficher)
                            .addComponent(reinicialiser)
                            .addComponent(modifier)
                            .addComponent(supprimer))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void afficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherActionPerformed
     if(evt.getSource()==afficher) 
       {affichage();}
    }//GEN-LAST:event_afficherActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        if(part!=null)
            {
                String msg="Voulez-vous reelement supprimer le partenaire "+part.getNom_part()+"?";
                int rep = JOptionPane.showConfirmDialog(null, msg);
                if(rep ==0)
                {
                    Factory_partenaire.deletePartenaire(part);
                    affichage();
                    effacer();
                }

            }
    }//GEN-LAST:event_supprimerActionPerformed

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
       if (evt.getSource()==enregistrer)
     {
         String no = tnom.getText();
         String lin = tlink.getText();
         String emai = temail.getText();
     
         
     
   part = new Partenaire(no,lin,emai);
   Factory_partenaire.insererPartenaire(part);
   affichage();
    }
    }//GEN-LAST:event_enregistrerActionPerformed

    private void reinicialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinicialiserActionPerformed
       if(evt.getSource()==reinicialiser) 
       {effacer();}
    }//GEN-LAST:event_reinicialiserActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        if (evt.getSource()==modifier)
     {
         String no = tnom.getText();
         String lin = tlink.getText();
         String emai = temail.getText();
    
         
     
   part = new Partenaire(no,lin,emai);
   Factory_partenaire.modifPartenaire(part,tnom.getText());
   affichage();
    }
    }//GEN-LAST:event_modifierActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        if(evt.getSource()==recherche)
            {
                String rch=trecherche.getText();
                part= Factory_partenaire.getRechC(rch);
                if(part !=null)
                {
                    tnom.setText(part.getNom_part());
                    tlink.setText(part.getLink_site());
                    temail.setText(part.getEmail());
                    
                                 
                }
                
            }
    }//GEN-LAST:event_rechercheActionPerformed

     public void affichage()
 {
     model.setRowCount(0);
     listepart = Factory_partenaire.getPartenaire();
     for(Partenaire part :listepart)
     {  
         // JLabel id_malade,nom,prenom,genre,adresse,nationalite,numero;
         model.addRow(new Object[]{
            part.getNom_part(),part.getLink_site(),part.getEmail()
         });
     }
     tbp = new JTable(model);
     JScrollPane p = new JScrollPane(tbp);
     p.setBounds(10,350,800,100);
     this.getContentPane().add(p);
 }
    
      public void effacer()
 {
     tnom.setText("");
     tlink.setText("");
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
            java.util.logging.Logger.getLogger(Form_partenaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_partenaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_partenaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_partenaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_partenaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afficher;
    private javax.swing.JButton enregistrer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel link;
    private javax.swing.JButton modifier;
    private javax.swing.JLabel nom;
    private javax.swing.JButton recherche;
    private javax.swing.JButton reinicialiser;
    private javax.swing.JButton supprimer;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tlink;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextField trecherche;
    // End of variables declaration//GEN-END:variables
}
