/*
*Shannon Mitchell
*Java Project
*Section: Expeiments
* @author x14322491
*/
package project;
public class BiologyGUI extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    public BiologyGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("If the food to be tested is solid, make an extract. Grind, crush or chop a small ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 80, 480, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("amount and put it into a test tube to  a depth of about of alcohol  stir with a ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 110, 470, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("glass rod and leave for several minutes. Draw up some of the clear liquid into");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 130, 470, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("into a pipette and  let a single drop fall on to filter paper.Using clean pipettes");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 160, 470, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("draw up a similar quantity from a fresh sample of alcohol and put a drop onto");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 180, 490, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("a clean part of  the filter paper, or a new paper.Let dry and examine when");
        jLabel8.setRequestFocusEnabled(false);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 210, 480, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("dry. If a transparednt spot is present, Fat is present too.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 240, 460, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Food- Test for Protien");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(160, 310, 170, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Label boiling tube A ‘protein solution’ and boiling tube B ‘water’,Place 2 cm3");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 330, 470, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("of the protein solution into tube A.Place 2 cm3  of water into tube B. This");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 360, 460, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("acts as the control. 5. Add 2 cm3 of sodium hydroxide solution to each tube ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 390, 480, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("followed by 2– 3 drops of copper sulfate solution (or add 2 cm3 of biuret ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 410, 470, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("reagent to each tube). 6. Swirl both tubes. Protien will turn the solution from");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 430, 470, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Biology Experiments");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 130, 19);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Food - Test for Fat");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(180, 40, 114, 17);

        jButton1.setText("Back to homepage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 480, 150, 23);

        jButton2.setText("Refresh your mind");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 480, 150, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Science.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(500, 550));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 490, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ExperimentsGUI myExperiments = new ExperimentsGUI();
        myExperiments.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
BioRevisionGUI myBioRevision = new BioRevisionGUI();
myBioRevision.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BiologyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
