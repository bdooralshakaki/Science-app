/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author x14521223
 */
public class SupportProjectGUI extends javax.swing.JFrame {

    /**
     * Creates new form SupportProjectGUI
     */
    public SupportProjectGUI() {
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
        biologySupportVideosBtn = new javax.swing.JButton();
        biologySupportClassesBtn = new javax.swing.JButton();
        chemistrySupportVideosBtn = new javax.swing.JButton();
        chemistrySupportClassesBtn = new javax.swing.JButton();
        physicsSupportVideosBtn = new javax.swing.JButton();
        physicsSupportClassesBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 450, 550));
        getContentPane().setLayout(null);

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        titleLbl.setText("Support");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(160, 23, 183, 66);

        biologySupportVideosBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        biologySupportVideosBtn.setText("Biology Support Videos");
        biologySupportVideosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biologySupportVideosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(biologySupportVideosBtn);
        biologySupportVideosBtn.setBounds(26, 152, 191, 53);

        biologySupportClassesBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        biologySupportClassesBtn.setText("Biology Support Classes");
        biologySupportClassesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biologySupportClassesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(biologySupportClassesBtn);
        biologySupportClassesBtn.setBounds(261, 152, 187, 53);

        chemistrySupportVideosBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chemistrySupportVideosBtn.setText("Chemistry Support Videos");
        chemistrySupportVideosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemistrySupportVideosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(chemistrySupportVideosBtn);
        chemistrySupportVideosBtn.setBounds(26, 247, 191, 55);

        chemistrySupportClassesBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chemistrySupportClassesBtn.setText("Chemistry Support Classes");
        chemistrySupportClassesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemistrySupportClassesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(chemistrySupportClassesBtn);
        chemistrySupportClassesBtn.setBounds(261, 247, 187, 55);

        physicsSupportVideosBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        physicsSupportVideosBtn.setText("Physics Support Videos");
        physicsSupportVideosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicsSupportVideosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(physicsSupportVideosBtn);
        physicsSupportVideosBtn.setBounds(26, 337, 191, 54);

        physicsSupportClassesBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        physicsSupportClassesBtn.setText("Physics Support Classes");
        physicsSupportClassesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicsSupportClassesBtnActionPerformed(evt);
            }
        });
        getContentPane().add(physicsSupportClassesBtn);
        physicsSupportClassesBtn.setBounds(261, 337, 187, 54);

        homeBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn);
        homeBtn.setBounds(150, 440, 220, 40);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Bg.jpg"))); // NOI18N
        backgroundLbl.setPreferredSize(new java.awt.Dimension(500, 550));
        getContentPane().add(backgroundLbl);
        backgroundLbl.setBounds(0, -10, 500, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void biologySupportVideosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biologySupportVideosBtnActionPerformed
      BiologySupportVideosGUI myBiologySupportVideos = new BiologySupportVideosGUI();
      myBiologySupportVideos.setVisible(true);
      dispose();
    }//GEN-LAST:event_biologySupportVideosBtnActionPerformed

    private void biologySupportClassesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biologySupportClassesBtnActionPerformed
     BiologySupportClassesGUI myBiologySupportClasses = new BiologySupportClassesGUI();
     myBiologySupportClasses.setVisible(true);
     dispose();
     
    }//GEN-LAST:event_biologySupportClassesBtnActionPerformed

    private void chemistrySupportVideosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemistrySupportVideosBtnActionPerformed
     ChemistrySupportVideosGUI myChemistrySupportVideosGUI = new ChemistrySupportVideosGUI();
     myChemistrySupportVideosGUI.setVisible(true);
     dispose();
     
    }//GEN-LAST:event_chemistrySupportVideosBtnActionPerformed

    private void chemistrySupportClassesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemistrySupportClassesBtnActionPerformed
     ChemistrySupportClassesGUI myChemistrySupportClasses = new ChemistrySupportClassesGUI();
     myChemistrySupportClasses.setVisible(true);
     dispose();
    }//GEN-LAST:event_chemistrySupportClassesBtnActionPerformed

    private void physicsSupportVideosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicsSupportVideosBtnActionPerformed
    PhysicsSupportVideosGUI myPhysicsSupportVideos = new PhysicsSupportVideosGUI();
    myPhysicsSupportVideos.setVisible(true);
    dispose();
    }//GEN-LAST:event_physicsSupportVideosBtnActionPerformed

    private void physicsSupportClassesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicsSupportClassesBtnActionPerformed
     PhysicsSupportClassesGUI myPhysicsSupportClasses = new PhysicsSupportClassesGUI();
     myPhysicsSupportClasses.setVisible(true);
     dispose();
    }//GEN-LAST:event_physicsSupportClassesBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
  HomepageGUI myHomepage = new HomepageGUI();
      myHomepage.setVisible(true);
      dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SupportProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupportProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupportProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupportProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupportProjectGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton biologySupportClassesBtn;
    private javax.swing.JButton biologySupportVideosBtn;
    private javax.swing.JButton chemistrySupportClassesBtn;
    private javax.swing.JButton chemistrySupportVideosBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton physicsSupportClassesBtn;
    private javax.swing.JButton physicsSupportVideosBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}