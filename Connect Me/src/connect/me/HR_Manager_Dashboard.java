/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package connect.me;

import javax.swing.JOptionPane;

/**
 *
 * @author Krishan
 */
public class HR_Manager_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form HR_Manager_Dashboard
     */
    public HR_Manager_Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        butME = new javax.swing.JButton();
        butMDD = new javax.swing.JButton();
        butCHA = new javax.swing.JButton();
        butSE = new javax.swing.JButton();
        butback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setText("Dashboard HR Manager");

        butME.setText("Manage Employee");
        butME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMEActionPerformed(evt);
            }
        });

        butMDD.setText("Add Department and designation");
        butMDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMDDActionPerformed(evt);
            }
        });

        butCHA.setText("Create New Account ");
        butCHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCHAActionPerformed(evt);
            }
        });

        butSE.setText("Search Employee");
        butSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSEActionPerformed(evt);
            }
        });

        butback.setText("Back to Login");
        butback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(butMDD, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(butCHA, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(butSE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(butME)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(butback)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butME)
                .addGap(35, 35, 35)
                .addComponent(butMDD)
                .addGap(34, 34, 34)
                .addComponent(butCHA)
                .addGap(34, 34, 34)
                .addComponent(butSE)
                .addGap(33, 33, 33)
                .addComponent(butback)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butbackActionPerformed
        log_in tologin=new log_in();
        tologin.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_butbackActionPerformed

    private void butMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMEActionPerformed
Manage_Employee tonewmanageemployee=new Manage_Employee();
tonewmanageemployee.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_butMEActionPerformed

    private void butSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSEActionPerformed
Search_Employee tonewsearchemployee=new Search_Employee();
tonewsearchemployee.setVisible(true);
dispose(); 
    }//GEN-LAST:event_butSEActionPerformed

    private void butCHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCHAActionPerformed
Create_New_Account tocreatenewaccount= new Create_New_Account();
tocreatenewaccount.setVisible(true);
dispose(); 
    }//GEN-LAST:event_butCHAActionPerformed

    private void butMDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMDDActionPerformed
Add_Department_and_Designation toDepDesi= new Add_Department_and_Designation();
toDepDesi.setVisible(true);
dispose(); 
    }//GEN-LAST:event_butMDDActionPerformed

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
            java.util.logging.Logger.getLogger(HR_Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HR_Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HR_Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HR_Manager_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HR_Manager_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCHA;
    private javax.swing.JButton butMDD;
    private javax.swing.JButton butME;
    private javax.swing.JButton butSE;
    private javax.swing.JButton butback;
    private javax.swing.JLabel lbl1;
    // End of variables declaration//GEN-END:variables
}
