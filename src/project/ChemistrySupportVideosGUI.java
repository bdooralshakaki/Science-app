/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Desktop;
//Below code is imported for the URL links to the YouTube videos.
import java.net.URL;

/**
 *
 * @author x14521223
 */
public class ChemistrySupportVideosGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChemistrySupportVideos
     */
    public ChemistrySupportVideosGUI() {
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

        titleLbl = new javax.swing.JLabel();
        video1Btn = new javax.swing.JButton();
        video2Btn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        video1Lbl = new javax.swing.JLabel();
        video2Lbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 550));
        getContentPane().setLayout(null);

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 45)); // NOI18N
        titleLbl.setText("Chemistry Support Videos");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(10, 20, 480, 54);

        video1Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Chemistry video 1.JPG"))); // NOI18N
        video1Btn.setText("jButton1");
        video1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video1BtnActionPerformed(evt);
            }
        });
        getContentPane().add(video1Btn);
        video1Btn.setBounds(70, 90, 290, 150);

        video2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/chemistry video 2.JPG"))); // NOI18N
        video2Btn.setText("jButton2");
        video2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video2BtnActionPerformed(evt);
            }
        });
        getContentPane().add(video2Btn);
        video2Btn.setBounds(70, 280, 290, 140);

        returnBtn.setText("Back to Support");
        returnBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn);
        returnBtn.setBounds(120, 460, 210, 30);

        video1Lbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        video1Lbl.setText("Recrystallisation of Impure Benzoic Acid");
        getContentPane().add(video1Lbl);
        video1Lbl.setBounds(60, 250, 330, 22);

        video2Lbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        video2Lbl.setText("Vacuum Filtration");
        getContentPane().add(video2Lbl);
        video2Lbl.setBounds(140, 420, 160, 22);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Bg.jpg"))); // NOI18N
        backgroundLbl.setText("jLabel1");
        backgroundLbl.setPreferredSize(new java.awt.Dimension(500, 550));
        getContentPane().add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 500, 550);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
//This button allows users to return to the SuppportProjectGUI page.
        SupportProjectGUI mySupportProjectGUI = new SupportProjectGUI();
        mySupportProjectGUI.setVisible(true);
        dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_returnBtnActionPerformed

    private void video1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_video1BtnActionPerformed
//This button when pressed brings the user to the YouTube video linked below. I got this code from StackOverflow.        
        try {
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=5M0QhhmCFQg&list=PLRKZ0wjPBaEn7udHGtRLxaXQ-SBRJMJPC").toURI());
        } catch (Exception e) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_video1BtnActionPerformed

    private void video2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_video2BtnActionPerformed
//This button when pressed brings the user to the YouTube video linked below. I got this code from StackOverflow.        
        try {
            Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=IrD8IqflCkU").toURI());
        } catch (Exception e) {
        }   // TODO add your handling code here:
    }//GEN-LAST:event_video2BtnActionPerformed

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
            java.util.logging.Logger.getLogger(ChemistrySupportVideosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChemistrySupportVideosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChemistrySupportVideosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChemistrySupportVideosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChemistrySupportVideosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton video1Btn;
    private javax.swing.JLabel video1Lbl;
    private javax.swing.JButton video2Btn;
    private javax.swing.JLabel video2Lbl;
    // End of variables declaration//GEN-END:variables
}
