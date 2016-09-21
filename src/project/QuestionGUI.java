
/*
*Shannon Mitchell
*Java Project
*Section: Expeiments
*/
package project;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class QuestionGUI extends javax.swing.JFrame {
    private String questionText;
    private String answer;
    private int mark;
    private ArrayList<Question> aList;
    



    public QuestionGUI() {
        initComponents();
        questionText = new String();
        answer = new String();
        mark = 0;
        aList = new ArrayList<>();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        questionLbl = new javax.swing.JLabel();
        answerLbl = new javax.swing.JLabel();
        questionTf = new javax.swing.JTextField();
        answerTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Question Application");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 186, 22);

        questionLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        questionLbl.setText("Question:");
        getContentPane().add(questionLbl);
        questionLbl.setBounds(20, 80, 76, 22);

        answerLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        answerLbl.setText("Correct  (C) /Incorrect (I)  :");
        getContentPane().add(answerLbl);
        answerLbl.setBounds(10, 220, 230, 22);
        getContentPane().add(questionTf);
        questionTf.setBounds(260, 70, 200, 20);
        getContentPane().add(answerTf);
        answerTf.setBounds(270, 220, 200, 20);

        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        addBtn.setContentAreaFilled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(20, 370, 90, 23);

        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear Form");
        clearBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        clearBtn.setContentAreaFilled(false);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn);
        clearBtn.setBounds(140, 370, 100, 23);

        displayBtn.setForeground(new java.awt.Color(255, 255, 255));
        displayBtn.setText("Display All");
        displayBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        displayBtn.setContentAreaFilled(false);
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });
        getContentPane().add(displayBtn);
        displayBtn.setBounds(260, 370, 100, 23);

        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn);
        deleteBtn.setBounds(380, 370, 100, 23);

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Homepage");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 440, 90, 23);

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Biology");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 440, 100, 23);

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Chemistry");
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 440, 100, 23);

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Physics");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(380, 440, 100, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Science.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 510, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // Get text from TextFields
        questionText = questionTf.getText();
        answer = answerTf.getText();
        
        //create a new Question object
        Question q = new Question();
        
        //add contents of textfields to q
        q.setQuestionText(questionText);
        q.setAnswer(answer);
        //add q to arrayList of Question objects
        aList.add(q);    
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // set text in textfields to " "
        questionTf.setText("");
        answerTf.setText("");
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // Loop through arraylist of question objects
        for (Question aList1 : aList) {
            JOptionPane.showMessageDialog(null, "Question: " + aList1.getQuestionText() + "\n Answer: " + aList1.getAnswer());
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ExperimentsGUI myExperimentsGUI;
myExperimentsGUI = new ExperimentsGUI();
myExperimentsGUI.setVisible(true); 
dispose();// TODO add your handling code here:       // TODO add your handling code here        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
BioRevisionGUI myBioRevision = new BioRevisionGUI();
myBioRevision.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
ChemistryRevisionGUI myChemistryRevision = new ChemistryRevisionGUI();
myChemistryRevision.setVisible(true);
dispose();// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
PhysicsRevisionGUI myPhysicsRevisionGUI = new PhysicsRevisionGUI();
myPhysicsRevisionGUI.setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuestionGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel answerLbl;
    private javax.swing.JTextField answerTf;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JTextField questionTf;
    // End of variables declaration//GEN-END:variables
}
