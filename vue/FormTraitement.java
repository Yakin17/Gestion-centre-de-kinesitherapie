/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vue;
import controller.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.Therapeute;
import model.Traitement;

/**
 *
 * @author YAKIN
 */
public class FormTraitement extends javax.swing.JFrame {

    /**
     * Creates new form FormTraitement
     */
    
    ArrayList<Traitement> listeTraitement=new ArrayList();
    ArrayList<Patient> listePatient=new ArrayList();
    ArrayList<Therapeute> listeTherapeute=new ArrayList();
    
    JTable tblEmpl;
    int index=0;
    int index1=0;
    
    private final DefaultTableModel model;
    Traitement tr=null;
    public FormTraitement() {
        initComponents();
        
        listePatient=controller.Factory.getPatient();
        for(Patient p:listePatient){
            cpatient.addItem(p.getNom());
        }
        cpatient.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                index/=cpatient.getSelectedIndex();
            }
        });
        this.getContentPane().add(cpatient);
        model=new DefaultTableModel();
        model.addColumn("Id traitement");
        model.addColumn("Patient");
        model.addColumn("Therapeute");
        model.addColumn("Description");
        model.addColumn("Duree");
        
        
        this.getContentPane().setLayout(null);
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
        tidtraitement = new javax.swing.JTextField();
        tdescription = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tduree = new javax.swing.JTextField();
        ctherapeute = new javax.swing.JComboBox<>();
        badd = new javax.swing.JButton();
        bview = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        tsearch = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        cpatient = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identification traitement");

        jLabel2.setText("Patient");

        jLabel3.setText("Therapeute");

        jLabel4.setText("Description");

        jLabel5.setText("Duree");

        listeTherapeute=controller.Factory_therapeute.getTherapeute();
        for(Therapeute th:listeTherapeute){
            ctherapeute.addItem(th.getNom());
        }
        ctherapeute.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                index1=ctherapeute.getSelectedIndex();
            }
        });
        this.getContentPane().add(ctherapeute);
        ctherapeute.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        breset.setText("Reset");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        bdelete.setText("Delete");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        jButton6.setText("Research");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        listePatient=controller.Factory.getPatient();
        for(Patient p:listePatient){
            cpatient.addItem(p.getIdpatientNom());
        }
        cpatient.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                index=cpatient.getSelectedIndex();
            }
        });
        this.getContentPane().add(cpatient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(96, 96, 96)
                        .addComponent(ctherapeute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(badd)
                                .addGap(18, 18, 18)
                                .addComponent(bview)
                                .addGap(18, 18, 18)
                                .addComponent(bupdate)
                                .addGap(18, 18, 18)
                                .addComponent(breset))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cpatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tduree, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(29, 29, 29)
                                    .addComponent(tidtraitement, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton6))
                            .addComponent(bdelete))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tidtraitement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cpatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ctherapeute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tduree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(badd)
                    .addComponent(bview)
                    .addComponent(bupdate)
                    .addComponent(breset)
                    .addComponent(bdelete))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed

        int idtr=Integer.parseInt(tidtraitement.getText());
        String pat=(String) cpatient.getSelectedItem();
        String therap= (String) ctherapeute.getSelectedItem();
        String desc=tdescription.getText();
        String dur=tduree.getText();
        tr=new Traitement(idtr,pat,therap,desc,dur);
        Factory_traitement.insererTraitement(tr);
        afficher();
        
    }//GEN-LAST:event_baddActionPerformed

    public String getPatientId(String nm){
       String num="";
       for(Patient pati:listePatient){
          if(pati.getIdpatientNom().equals(nm)){
              num=pati.getIdpatientNom();
              break;
          }
       }
       return num;
   }
    
    public String getTherapeuteId(String nm){
       String nume="";
       for(Therapeute the:listeTherapeute){
          if(the.getNom().equals(nm)){
              nume=the.getNom();
              break;
          }
       }
       return nume;
   }
    
    public void afficher()
    {
        model.setRowCount(0);
        {
            listeTraitement=Factory_traitement.getTraitement();
            for(Traitement trait:listeTraitement)
            {
                model.addRow(new Object[]{
                                        trait.getIdtraitement(),trait.getIdpatient(),trait.getIdtherapeute(),trait.getDescription(),trait.getDuree()});
                
            }
            tblEmpl=new JTable(model);
            JScrollPane p=new JScrollPane(tblEmpl);
            p.setBounds(60,400,600,100);
            this.getContentPane().add(p);
            
        }
    }
    private void bviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviewActionPerformed
        // TODO add your handling code here:
        afficher();
    }//GEN-LAST:event_bviewActionPerformed

    public void effacer()
    {
        tidtraitement.setText("");
        tdescription.setText("");
        tduree.setText("");
        
        tsearch.setText("");
    }
    
    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        // TODO add your handling code here:
        String patie=listePatient.get(index).getIdpatientNom();
        String therap=listeTherapeute.get(index1).getNom();
        String des=tdescription.getText();
        String dur=tduree.getText();
        int c=Integer.parseInt(tsearch.getText());
        if(JOptionPane.showConfirmDialog(null, "Voulez-vous faire cette modification?","Modification",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
        {
            controller.Factory_traitement.ModifierTraitementById(patie, therap, des, dur, c);
            afficher();
            effacer();
        }
        
    }//GEN-LAST:event_bupdateActionPerformed

    
    
    public void recupinfo(Traitement trai){
        tidtraitement.setText(String.valueOf(trai.getIdtraitement()));
        String pati=getPatientId(trai.getIdpatient());
        cpatient.setSelectedItem(pati);
        String ther=getTherapeuteId(trai.getIdtherapeute());
       ctherapeute.setSelectedItem(ther);
       tdescription.setText(trai.getDescription());
       tduree.setText(trai.getDuree());
       
       
   }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        int r=Integer.parseInt(tsearch.getText());
        tr=controller.Factory_traitement.getTraitementById(r);
        if(tr!=null)
        {
            recupinfo(tr);
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
        if(tr!=null)
        {
            String msg="Voulez-vous reelement supprimez le traitement "+tr.getIdtraitement()+"  de la liste";
            int repp=JOptionPane.showConfirmDialog(null, msg);
            if(repp==0)
            {
                controller.Factory_traitement.supprimerTraitementById(tr);
                afficher();
                effacer();
            }
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        // TODO add your handling code here:
        effacer();
    }//GEN-LAST:event_bresetActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormTraitement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTraitement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTraitement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTraitement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTraitement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton breset;
    private javax.swing.JButton bupdate;
    private javax.swing.JButton bview;
    private javax.swing.JComboBox<String> cpatient;
    private javax.swing.JComboBox<String> ctherapeute;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tdescription;
    private javax.swing.JTextField tduree;
    private javax.swing.JTextField tidtraitement;
    private javax.swing.JTextField tsearch;
    // End of variables declaration//GEN-END:variables
}
