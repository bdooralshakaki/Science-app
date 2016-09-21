/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Gareth
 */
public class PhysicsSummary extends javax.swing.JFrame {

    /**
     * Creates new form PhysicsQuestion1
     */
    public PhysicsSummary() {
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

        quizSummary = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Answer1 = new javax.swing.JLabel();
        Answer2 = new javax.swing.JLabel();
        Answer3 = new javax.swing.JLabel();
        Homepage = new javax.swing.JButton();
        retry = new javax.swing.JButton();
        bground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quizSummary.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        quizSummary.setText("Quiz Summary");
        getContentPane().add(quizSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 270, 80));

        Text.setText("you have completed the biology quiz");
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        Text1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Text1.setText("Here are the correct answers from the quiz.");
        getContentPane().add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 410, -1));

        Answer1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Answer1.setText("1. Refraction");
        getContentPane().add(Answer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 230, -1));

        Answer2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Answer2.setText(" 2. Convex");
        getContentPane().add(Answer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, -1));

        Answer3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Answer3.setText("3. Ohms");
        getContentPane().add(Answer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 242, 190, 20));

        Homepage.setText("Return to Hompage");
        Homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomepageActionPerformed(evt);
            }
        });
        getContentPane().add(Homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 130, 100));

        retry.setText("Retry the quiz");
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryActionPerformed(evt);
            }
        });
        getContentPane().add(retry, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 130, 100));

        bground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Bg.jpg"))); // NOI18N
        bground.setText("jLabel1");
        getContentPane().add(bground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomepageActionPerformed
        HomepageGUI myHomepage1 = new HomepageGUI();
        myHomepage1.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomepageActionPerformed

    private void retryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryActionPerformed
        BiologyQuestion1GUI myBiologyQuestion1 = new BiologyQuestion1GUI();
        myBiologyQuestion1.setVisible(true);
        dispose();
    }//GEN-LAST:event_retryActionPerformed

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
            java.util.logging.Logger.getLogger(PhysicsSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhysicsSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhysicsSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhysicsSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhysicsSummary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Answer1;
    private javax.swing.JLabel Answer2;
    private javax.swing.JLabel Answer3;
    private javax.swing.JButton Homepage;
    private javax.swing.JLabel Text;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel bground;
    private javax.swing.JLabel quizSummary;
    private javax.swing.JButton retry;
    // End of variables declaration//GEN-END:variables
}
