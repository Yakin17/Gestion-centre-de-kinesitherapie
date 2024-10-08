/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vue;

import controller.Factory;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Service;

/**
 *
 * @author YAKIN
 */
public class FormService extends javax.swing.JFrame {

    ArrayList<Service> listeService=new ArrayList();
    JTable tblEmpl;
    private final DefaultTableModel model ;
    Service serv=null;
    private static ResultSet rs=null;
    public FormService() {
        initComponents();
        
        model=new DefaultTableModel();
        
        model.addColumn("id service");
        model.addColumn("Nom");
        model.addColumn("Description");
        model.addColumn("Tarif");
        model.addColumn("Statut");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lnom = new javax.swing.JLabel();
        tnom = new javax.swing.JTextField();
        ldescription = new javax.swing.JLabel();
        tdescription = new javax.swing.JTextField();
        ltarif = new javax.swing.JLabel();
        ttarif = new javax.swing.JTextField();
        badd = new javax.swing.JButton();
        bview = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        brein = new javax.swing.JButton();
        bsearch = new javax.swing.JButton();
        tsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tidservice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tstatut = new javax.swing.JTextField();
        bdelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lnom.setText("Nom du service");

        ldescription.setText("Description du service");

        tdescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdescriptionActionPerformed(evt);
            }
        });

        ltarif.setText("Tarif");

        badd.setText("Add");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        bview.setText("View");
        bview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviewActionPerformed(evt);
            }
        });

        bupdate.setText("Update");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        brein.setText("Reset");
        brein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breinActionPerformed(evt);
            }
        });

        bsearch.setText("Search");
        bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Id service");

        jLabel2.setText("Statut");

        bdelete.setText("Delete");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(badd)
                        .addGap(18, 18, 18)
                        .addComponent(bview)
                        .addGap(18, 18, 18)
                        .addComponent(bupdate)
                        .addGap(18, 18, 18)
                        .addComponent(brein)
                        .addGap(18, 18, 18)
                        .addComponent(bdelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lnom, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ldescription, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ltarif, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tstatut, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tidservice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ttarif, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(bsearch)
                                .addGap(42, 42, 42)
                                .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tidservice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lnom)
                        .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsearch)
                            .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ldescription)
                    .addComponent(tdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ltarif)
                    .addComponent(ttarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tstatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badd)
                    .addComponent(bview)
                    .addComponent(bupdate)
                    .addComponent(brein)
                    .addComponent(bdelete))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdescriptionActionPerformed

    public void afficher()
    {
        model.setRowCount(0);
        listeService= Factory.getService();
        for(Service ser:listeService)
        {
            model.addRow(new Object[]{
                                        ser.getIdservice(),ser.getNom(),ser.getDescription(),ser.getTarif(),ser.getStatut()});
        }
        tblEmpl=new JTable(model);
        JScrollPane p=new JScrollPane(tblEmpl);
        p.setBounds(60,300,800,100);
        this.getContentPane().add(p);
        
    }
    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        // TODO add your handling code here:
        int ids=Integer.parseInt(tidservice.getText());
        String noms=tnom.getText();
        String desc=tdescription.getText();
        int tar=Integer.parseInt(ttarif.getText());
        String statuts=tstatut.getText();
        serv=new Service(ids,noms,desc,tar,statuts);
        Factory.insererService(serv);
        afficher();
    }//GEN-LAST:event_baddActionPerformed

    private void bviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviewActionPerformed
        // TODO add your handling code here:
        afficher();
    }//GEN-LAST:event_bviewActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        // TODO add your handling code here:
        String nomm=tnom.getText();
        String descr=tdescription.getText();
        int ta=Integer.parseInt(ttarif.getText());
        String stat=tstatut.getText();
        int m=Integer.parseInt(tsearch.getText());
        if(JOptionPane.showConfirmDialog(null, "Voulez-vous faire cette modification?","Modification",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
        {
            controller.Factory.ModifierServiceById( nomm, descr, ta, stat,m);
            afficher();
            
        }
        
    }//GEN-LAST:event_bupdateActionPerformed

    public void recupinfo(Service ser){
        
       tidservice.setText(String.valueOf(ser.getIdservice())); 
       tnom.setText(ser.getNom());
       tdescription.setText(ser.getDescription());
       ttarif.setText(String.valueOf(ser.getTarif()));
       tstatut.setText(ser.getStatut());
       
       
   }
    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsearchActionPerformed
        // TODO add your handling code here:
        int r=Integer.parseInt(tsearch.getText());
        serv=controller.Factory.getServiceById(r);
        if(serv!=null)
        {
            recupinfo(serv);
            
        }
    }//GEN-LAST:event_bsearchActionPerformed

    public void effacer()
    {
        tidservice.setText("");
        tnom.setText("");
        tdescription.setText("");
        ttarif.setText("");
        tstatut.setText("");
        tsearch.setText("");
    }
    private void breinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breinActionPerformed
        // TODO add your handling code here:
        effacer();
    }//GEN-LAST:event_breinActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        if(serv!=null)
        {
            String msg="Voulez-vous reelement supprimez le service "+tsearch.getText()+" de la liste des clients";
            int rep=JOptionPane.showConfirmDialog(null, msg);
            if(rep==0)
            {
                controller.Factory.supprimerServiceById(serv);
                afficher();
                effacer();
                
            }
        }
        
    }//GEN-LAST:event_bdeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton brein;
    private javax.swing.JButton bsearch;
    private javax.swing.JButton bupdate;
    private javax.swing.JButton bview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel ldescription;
    private javax.swing.JLabel lnom;
    private javax.swing.JLabel ltarif;
    private javax.swing.JTextField tdescription;
    private javax.swing.JTextField tidservice;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextField tsearch;
    private javax.swing.JTextField tstatut;
    private javax.swing.JTextField ttarif;
    // End of variables declaration//GEN-END:variables
}
