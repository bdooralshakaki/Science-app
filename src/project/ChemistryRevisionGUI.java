/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import javax.swing.ButtonGroup;
/**
 *
 * @author Shannon
 */
public class ChemistryRevisionGUI extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    
    /**
     * Creates new form PhysicsRevision
     */
    public ChemistryRevisionGUI() {
        initComponents();
        groupButton();
    }
;
    private void groupButton( ) {

ButtonGroup bg1 = new ButtonGroup( );
bg1.add(jRadioButton1);
bg1.add(jRadioButton2);
bg1.add(jRadioButton3);
ButtonGroup bg2 = new ButtonGroup( );
bg2.add(jRadioButton4);
bg2.add(jRadioButton5);
bg2.add(jRadioButton6);
ButtonGroup bg3 = new ButtonGroup( );
bg3.add(jRadioButton7);
bg3.add(jRadioButton8);
bg3.add(jRadioButton9);
ButtonGroup bg4 = new ButtonGroup( );
bg4.add(jRadioButton10);
bg4.add(jRadioButton11);
bg4.add(jRadioButton12);

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        btnRadios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        btnRadios2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        btnRadios3 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        btnRadios4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("1ml");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(10, 90, 80, 25);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("4ml");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(130, 90, 60, 25);

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setText("0.5ml");
        jRadioButton3.setOpaque(false);
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(230, 90, 90, 25);

        btnRadios.setForeground(new java.awt.Color(255, 255, 255));
        btnRadios.setText("Pick");
        btnRadios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRadios.setContentAreaFilled(false);
        btnRadios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiosActionPerformed(evt);
            }
        });
        getContentPane().add(btnRadios);
        btnRadios.setBounds(410, 90, 60, 21);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("How much Phenylmethanol is added to the glass?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 60, 280, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("What color does the residue turn?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 130, 400, 17);

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setText("blue");
        jRadioButton4.setOpaque(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(10, 160, 100, 25);

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton5.setText("orange");
        jRadioButton5.setOpaque(false);
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(130, 160, 110, 25);

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton6.setText("brown");
        jRadioButton6.setOpaque(false);
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(250, 160, 90, 25);

        btnRadios2.setForeground(new java.awt.Color(255, 255, 255));
        btnRadios2.setText("Pick");
        btnRadios2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRadios2.setContentAreaFilled(false);
        btnRadios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadios2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRadios2);
        btnRadios2.setBounds(410, 160, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("How much aluminium is used?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 240, 190, 17);

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton7.setText("4g");
        jRadioButton7.setOpaque(false);
        getContentPane().add(jRadioButton7);
        jRadioButton7.setBounds(20, 270, 70, 25);

        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton8.setText("2g");
        jRadioButton8.setOpaque(false);
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton8);
        jRadioButton8.setBounds(110, 270, 90, 25);

        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton9.setText("6g");
        jRadioButton9.setOpaque(false);
        getContentPane().add(jRadioButton9);
        jRadioButton9.setBounds(220, 270, 80, 25);

        btnRadios3.setForeground(new java.awt.Color(255, 255, 255));
        btnRadios3.setText("Pick");
        btnRadios3.setAutoscrolls(true);
        btnRadios3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRadios3.setContentAreaFilled(false);
        btnRadios3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadios3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRadios3);
        btnRadios3.setBounds(410, 270, 60, 21);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Near the end of the experiment what is needed ?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 320, 290, 17);

        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton10.setText("residue");
        jRadioButton10.setOpaque(false);
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton10);
        jRadioButton10.setBounds(10, 360, 80, 25);
        jRadioButton10.getAccessibleContext().setAccessibleDescription("");

        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton11.setText("Stoppers");
        jRadioButton11.setOpaque(false);
        getContentPane().add(jRadioButton11);
        jRadioButton11.setBounds(110, 360, 140, 23);

        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton12.setText("More Bubbles");
        jRadioButton12.setOpaque(false);
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton12);
        jRadioButton12.setBounds(260, 360, 140, 25);

        btnRadios4.setForeground(new java.awt.Color(255, 255, 255));
        btnRadios4.setText("Pick");
        btnRadios4.setAutoscrolls(true);
        btnRadios4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRadios4.setContentAreaFilled(false);
        btnRadios4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadios4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRadios4);
        btnRadios4.setBounds(410, 370, 60, 21);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Refresh Your Mind");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 10, 180, 19);

        jToggleButton1.setText("Back to Homepage");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(0, 420, 150, 23);

        jToggleButton2.setText("Refresh");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(330, 420, 150, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Protien");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 210, 90, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Oxidation");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 40, 80, 17);

        jButton1.setText("Keep Track Of Your Score Here!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 460, 240, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Science.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 500, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRadiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiosActionPerformed
    String radioTest="";
    if(jRadioButton1.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "Correct Answer! Very Good!");
    }
    if(jRadioButton2.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "Incorrect Answer! Try Again!");
    }
    if(jRadioButton3.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "Incorrect Answer! Try Again!");
    }
// TODO add your handling code here:
    }//GEN-LAST:event_btnRadiosActionPerformed

    private void btnRadios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadios2ActionPerformed
       String radioTest="";
    if(jRadioButton4.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "Incorrect Answer! Try Again!");
    }
    if(jRadioButton5.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "Incorrect Answer! Try Again!");
    }
if(jRadioButton6.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "Correct Answer! Very good!!");
    }// TODO add your handling code here:
    }//GEN-LAST:event_btnRadios2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void btnRadios3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadios3ActionPerformed
         String radioTest="";
    if(jRadioButton7.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null,"False try again");
    }
    if(jRadioButton8.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "Correct Answer!");
    }
if(jRadioButton9.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "Incorrect Answer! Try Again!");
    }// TODO add your handling code here:
    }//GEN-LAST:event_btnRadios3ActionPerformed

    private void btnRadios4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadios4ActionPerformed
    String radioTest="";
    if(jRadioButton10.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "False");
    }
    if(jRadioButton11.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "True");
if(jRadioButton12.isSelected()){
javax.swing.JOptionPane.showMessageDialog(null, "False");
}
    }
    }//GEN-LAST:event_btnRadios4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
ExperimentsGUI myExperimentsGUI;
        myExperimentsGUI = new ExperimentsGUI();
myExperimentsGUI.setVisible(true); 
dispose();// TODO add your handling code here:       // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
ChemistryRevisionGUI myBioRevision = new ChemistryRevisionGUI();
myBioRevision.setVisible(true); 
dispose();// TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
QuestionGUI myQuestionGUI = new QuestionGUI();
myQuestionGUI.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChemistryRevisionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            @Override
            public void run() {
                new ChemistryRevisionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRadios;
    private javax.swing.JButton btnRadios2;
    private javax.swing.JToggleButton btnRadios3;
    private javax.swing.JButton btnRadios4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
