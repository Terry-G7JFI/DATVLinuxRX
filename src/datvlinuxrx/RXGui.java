/*
 * Copyright (C) 2020 Terry Steeper
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package datvlinuxrx;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

/**
 *
 * @author terry
 */
public class RXGui extends javax.swing.JFrame {
    
    /**
     * Creates new form RXGui
     */
    public RXGui() {
        initComponents();
    }
    
    private Process p = null;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jProgressBarSS = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldMER = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldState = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jToggleButtonSocketA = new javax.swing.JToggleButton();
        jToggleButtonSocketB = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFreq = new javax.swing.JTextField();
        jButtonTune = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPort = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPath = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setName("Info"); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setText("Service Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 2, 90, 53);

        jTextField1.setEditable(false);
        jTextField1.setText("Waiting..");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 10, 300, 40);

        jLabel2.setText("Viterbi");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 90, 53);

        jTextField2.setEditable(false);
        jTextField2.setText("Waiting..");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(110, 70, 300, 40);

        jProgressBarSS.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBarSS.setForeground(new java.awt.Color(0, 204, 0));
        jProgressBarSS.setMaximum(255);
        jPanel1.add(jProgressBarSS);
        jProgressBarSS.setBounds(0, 280, 380, 19);

        jLabel7.setText("Signal Strength");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 300, 360, 15);

        jLabel8.setText("MER dB");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 130, 80, 15);

        jTextFieldMER.setEditable(false);
        jTextFieldMER.setText("Waiting..");
        jPanel1.add(jTextFieldMER);
        jTextFieldMER.setBounds(110, 120, 270, 40);

        jLabel9.setText("State");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 180, 90, 15);

        jTextFieldState.setEditable(false);
        jTextFieldState.setText("None..");
        jPanel1.add(jTextFieldState);
        jTextFieldState.setBounds(110, 170, 270, 30);

        jTabbedPane1.addTab("Info", jPanel1);

        buttonGroup1.add(jToggleButtonSocketA);
        jToggleButtonSocketA.setText("Top Input A");
        jToggleButtonSocketA.setMaximumSize(new java.awt.Dimension(121, 27));
        jToggleButtonSocketA.setMinimumSize(new java.awt.Dimension(121, 27));

        buttonGroup1.add(jToggleButtonSocketB);
        jToggleButtonSocketB.setText("Bottom Input B");

        jLabel3.setText("Symbol Rate kS/s");

        jTextFieldSR.setText("4000");

        jLabel4.setText("Frequency MHz");

        jTextFieldFreq.setText("1310");

        jButtonTune.setText("Tune!");
        jButtonTune.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonTuneMouseReleased(evt);
            }
        });

        jLabel5.setText("Video Sink Port");

        jTextFieldPort.setText("10000");

        jLabel6.setText("Video Sink IP");

        jTextFieldIP.setText("127.0.0.1");

        jLabel10.setText("Path to Longmynd");

        jTextFieldPath.setText("/usr/bin/longmynd");

        jButton1.setText("Choose");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldPath)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jToggleButtonSocketA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jToggleButtonSocketB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButtonTune, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSR, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(jTextFieldFreq)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldIP))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButtonSocketA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonSocketB))
                    .addComponent(jButtonTune, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Tune", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTuneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTuneMouseReleased
        // TODO add your handling code here:
        // We will launch longmynd here...
        if (p != null)
        {
            // we need to kill lonmynd..
            p.destroyForcibly();
        }
        try {
        // enter code here
        String commandline = jTextFieldPath.getText(); //"/home/terry/longmynd ";
        if(jToggleButtonSocketB.isSelected())
        {
            commandline += " -w ";
        }
        
        //commandline += "-i 192.168.1.77 10000 -I 127.0.0.1 10001 ";
        commandline += "-i " + jTextFieldIP.getText() + " " + jTextFieldPort.getText() + " -I 127.0.0.1 10001 ";
        commandline += jTextFieldFreq.getText() + "000 ";
        commandline += jTextFieldSR.getText();
        //commandline += " &";
         
        
        System.out.println(commandline);

        p = Runtime.getRuntime().exec(commandline);
        
    } catch (Exception err) {
        err.printStackTrace();
    }
        
        
        
    }//GEN-LAST:event_jButtonTuneMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        // we need to kill longmynd
        if(p != null)
        {
            System.out.println("Killing longmynd before we go!");
            p.destroyForcibly();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
        jFileChooser1.showOpenDialog(jPanel1);
        jTextFieldPath.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_jButton1MouseReleased

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
            java.util.logging.Logger.getLogger(RXGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RXGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RXGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RXGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RXGui().setVisible(true);
            }
        });
    }

    public void setProvider(String aValue)
    {
        jTextField1.setText(aValue);
    }
    public void setViterbi(String aValue)
    {
        jTextField2.setText(aValue);
    }
    
    public void setSignalStrength(int aValue)
    {
        if(aValue > 170)
        {
            jProgressBarSS.setForeground(Color.red);
        }
        else
        {
            jProgressBarSS.setForeground(Color.green);
        }
       jProgressBarSS.setValue(aValue);
    }
    
    public void setMER(String aValue)
    {
        jTextFieldMER.setText(aValue);
    }
    
    public void setState(String aValue)
    {
        jTextFieldState.setText(aValue);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonTune;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBarSS;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldFreq;
    private javax.swing.JTextField jTextFieldIP;
    private javax.swing.JTextField jTextFieldMER;
    private javax.swing.JTextField jTextFieldPath;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldSR;
    private javax.swing.JTextField jTextFieldState;
    private javax.swing.JToggleButton jToggleButtonSocketA;
    private javax.swing.JToggleButton jToggleButtonSocketB;
    // End of variables declaration//GEN-END:variables
}
