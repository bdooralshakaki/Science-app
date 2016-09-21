/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author bdoor
 */
public class Section2GUI extends javax.swing.JFrame {

    /**
     * Creates new form Section2
     */
    public Section2GUI() {
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
        yearLbl = new javax.swing.JLabel();
        exampapersBtn = new javax.swing.JButton();
        markingSchemeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 550));
        getContentPane().setLayout(null);

        titleLbl.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(102, 102, 102));
        titleLbl.setText("Leaving Certificate");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(80, 40, 330, 47);

        yearLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        yearLbl.setForeground(new java.awt.Color(102, 102, 102));
        yearLbl.setText("Leaving Cert Exampapers and Marking scheme:");
        getContentPane().add(yearLbl);
        yearLbl.setBounds(30, 120, 440, 22);

        exampapersBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exampapersBtn.setForeground(new java.awt.Color(0, 153, 204));
        exampapersBtn.setText("Exampapers");
        exampapersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exampapersBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exampapersBtn);
        exampapersBtn.setBounds(40, 200, 190, 150);

        markingSchemeBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        markingSchemeBtn.setForeground(new java.awt.Color(0, 153, 204));
        markingSchemeBtn.setText("Marking scheme");
        markingSchemeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markingSchemeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(markingSchemeBtn);
        markingSchemeBtn.setBounds(270, 200, 190, 150);

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 153, 204));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(160, 430, 180, 40);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Science.jpg"))); // NOI18N
        backgroundLbl.setText("jLabel1");
        getContentPane().add(backgroundLbl);
        backgroundLbl.setBounds(-360, -10, 950, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exampapersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exampapersBtnActionPerformed

        SciGUI j = new SciGUI();
        j.setVisible(true);
        dispose();
    }//GEN-LAST:event_exampapersBtnActionPerformed

    private void markingSchemeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markingSchemeBtnActionPerformed
          LcMarkingSchemeGUI o = new LcMarkingSchemeGUI();
          o.setVisible(true);
          dispose();
       
    }//GEN-LAST:event_markingSchemeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        ExamPapers1GUI i = new ExamPapers1GUI();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Section2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Section2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Section2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Section2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Section2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton exampapersBtn;
    private javax.swing.JButton markingSchemeBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel yearLbl;
    // End of variables declaration//GEN-END:variables
}
