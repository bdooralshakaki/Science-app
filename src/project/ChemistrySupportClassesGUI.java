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
public class ChemistrySupportClassesGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChemistrySupportClasses
     */
    public ChemistrySupportClassesGUI() {
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
        leinsterLbl = new javax.swing.JLabel();
        munsterLbl = new javax.swing.JLabel();
        connachtLbl = new javax.swing.JLabel();
        ulsterLbl = new javax.swing.JLabel();
        locLeinsterLbl = new javax.swing.JLabel();
        leinsterTimeLbl = new javax.swing.JLabel();
        locMunsterLbl = new javax.swing.JLabel();
        munsterTimeLbl = new javax.swing.JLabel();
        locConnachtLbl = new javax.swing.JLabel();
        connachtTimeLbl = new javax.swing.JLabel();
        locUlsterLbl = new javax.swing.JLabel();
        ulsterTimeLbl = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        enrollBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 550));
        getContentPane().setLayout(null);

        titleLbl.setFont(new java.awt.Font("Times New Roman", 0, 45)); // NOI18N
        titleLbl.setText("Chemistry Support Classes");
        getContentPane().add(titleLbl);
        titleLbl.setBounds(10, 20, 484, 55);

        leinsterLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        leinsterLbl.setText("Leinster:");
        getContentPane().add(leinsterLbl);
        leinsterLbl.setBounds(30, 100, 62, 22);

        munsterLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        munsterLbl.setText("Munster:");
        getContentPane().add(munsterLbl);
        munsterLbl.setBounds(30, 180, 64, 22);

        connachtLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        connachtLbl.setText("Connacht:");
        getContentPane().add(connachtLbl);
        connachtLbl.setBounds(30, 250, 73, 22);

        ulsterLbl.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ulsterLbl.setText("Ulster:");
        getContentPane().add(ulsterLbl);
        ulsterLbl.setBounds(40, 330, 47, 22);

        locLeinsterLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        locLeinsterLbl.setText("Location: The Reading Room, Maynooth, Co.Kildare.");
        getContentPane().add(locLeinsterLbl);
        locLeinsterLbl.setBounds(110, 100, 363, 17);

        leinsterTimeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        leinsterTimeLbl.setText("Time: Every Monday from 5.00pm to 7.00pm");
        getContentPane().add(leinsterTimeLbl);
        leinsterTimeLbl.setBounds(110, 140, 351, 17);

        locMunsterLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        locMunsterLbl.setText("Location: The Learning Centre, Cahir, North Tipperary.");
        getContentPane().add(locMunsterLbl);
        locMunsterLbl.setBounds(110, 180, 351, 17);

        munsterTimeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        munsterTimeLbl.setText("Time: Every Thursday from 6.00pm to 8.00pm");
        getContentPane().add(munsterTimeLbl);
        munsterTimeLbl.setBounds(110, 220, 351, 17);

        locConnachtLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        locConnachtLbl.setText("Location: Central Library, Stephen Street, Co. Sligo.");
        getContentPane().add(locConnachtLbl);
        locConnachtLbl.setBounds(110, 260, 350, 17);

        connachtTimeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        connachtTimeLbl.setText("Time: Every Tuesday from 7.30pm to 9.00pm");
        getContentPane().add(connachtTimeLbl);
        connachtTimeLbl.setBounds(110, 290, 350, 17);

        locUlsterLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        locUlsterLbl.setText("Location: The Bar Library, Chichester Street, Co. Belfast.");
        getContentPane().add(locUlsterLbl);
        locUlsterLbl.setBounds(110, 340, 350, 17);

        ulsterTimeLbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ulsterTimeLbl.setText("Time: Every 6.30pm to 8.30pm");
        getContentPane().add(ulsterTimeLbl);
        ulsterTimeLbl.setBounds(110, 380, 350, 17);

        returnBtn.setText("Back to Support");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnBtn);
        returnBtn.setBounds(120, 410, 200, 23);

        enrollBtn.setText("Enroll for Classes");
        enrollBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollBtnActionPerformed(evt);
            }
        });
        getContentPane().add(enrollBtn);
        enrollBtn.setBounds(120, 450, 200, 30);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Bg.jpg"))); // NOI18N
        backgroundLbl.setText("jLabel1");
        backgroundLbl.setPreferredSize(new java.awt.Dimension(500, 550));
        getContentPane().add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 500, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
     //This button allows the user to return the the SupportProjectGUI page.
        SupportProjectGUI mySupportProjectGUI = new SupportProjectGUI();
        mySupportProjectGUI.setVisible(true);
        dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_returnBtnActionPerformed

    private void enrollBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollBtnActionPerformed
     //This button brings the user to the EnrollFormGUI when clicked.
        EnrollFormGUI myEnrollFormGUI = new EnrollFormGUI();
        myEnrollFormGUI.setVisible(true);
        dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_enrollBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ChemistrySupportClassesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChemistrySupportClassesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChemistrySupportClassesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChemistrySupportClassesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChemistrySupportClassesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel connachtLbl;
    private javax.swing.JLabel connachtTimeLbl;
    private javax.swing.JButton enrollBtn;
    private javax.swing.JLabel leinsterLbl;
    private javax.swing.JLabel leinsterTimeLbl;
    private javax.swing.JLabel locConnachtLbl;
    private javax.swing.JLabel locLeinsterLbl;
    private javax.swing.JLabel locMunsterLbl;
    private javax.swing.JLabel locUlsterLbl;
    private javax.swing.JLabel munsterLbl;
    private javax.swing.JLabel munsterTimeLbl;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel ulsterLbl;
    private javax.swing.JLabel ulsterTimeLbl;
    // End of variables declaration//GEN-END:variables
}
