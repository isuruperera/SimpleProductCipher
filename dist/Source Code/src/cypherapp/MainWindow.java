/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cypherapp;

import java.awt.Color;
import java.text.NumberFormat;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Isuru Tharanga
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    private MainLogic mainLogic;

    public MainWindow() {
        initComponents();
        //this.mainLogic = mainLogic;
        //btnDecrypt.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textKey1 = new javax.swing.JTextField();
        textKey2 = new javax.swing.JTextField();
        btnDecrypt = new javax.swing.JButton();
        btnEncrypt = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnOpen1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        logText = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel1.setText("SimPher");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Key  1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Message");

        messageText.setColumns(20);
        messageText.setRows(5);
        jScrollPane1.setViewportView(messageText);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Key 2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 8)); // NOI18N
        jLabel5.setText("A SIMPLE PRODUCT CIPHER");

        textKey1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textKey1ActionPerformed(evt);
            }
        });
        textKey1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textKey1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKey1KeyTyped(evt);
            }
        });

        textKey2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textKey2ActionPerformed(evt);
            }
        });
        textKey2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textKey2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKey2KeyTyped(evt);
            }
        });

        btnDecrypt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDecrypt.setText("DECRYPT");
        btnDecrypt.setToolTipText("");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        btnEncrypt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEncrypt.setText("ENCRYPT");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        btnOpen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOpen.setText("OPEN");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnOpen1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOpen1.setText("SAVE");
        btnOpen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpen1ActionPerformed(evt);
            }
        });

        logText.setEditable(false);
        logText.setColumns(20);
        logText.setRows(5);
        jScrollPane2.setViewportView(logText);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Log");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDecrypt))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textKey1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textKey2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textKey1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textKey2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        //labelStatus.setText("");
        messageText.setText("");
        mainLogic.readFile();
        //labelStatus.setText(mainLogic.getSTATUS());
        logText.append(mainLogic.getSTATUS() + "\n");
        messageText.setText(mainLogic.getCipherText());
    }//GEN-LAST:event_btnOpenActionPerformed

    private void textKey1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textKey1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textKey1ActionPerformed

    private void textKey1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKey1KeyTyped
        //new String(passField.getPassword());// TODO add your handling code here:
//        try{
//            String key1 = textKey1.getText();
//            Integer.parseInt(key1);
//            textKey1.setBackground(Color.white);
//            
//        }catch(Exception e){
//            textKey1.setBackground(Color.red);
//        }
    }//GEN-LAST:event_textKey1KeyTyped

    private void textKey1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKey1KeyReleased
        try {
            String key1 = textKey1.getText();
            Integer.parseInt(key1);
            textKey1.setBackground(Color.white);

        } catch (Exception e) {
            textKey1.setBackground(Color.red);
        }
    }//GEN-LAST:event_textKey1KeyReleased

    private void textKey2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textKey2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textKey2ActionPerformed

    private void textKey2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKey2KeyReleased
        try {
            String key1 = textKey2.getText();
            Integer.parseInt(key1);
            textKey2.setBackground(Color.white);

        } catch (Exception e) {
            textKey2.setBackground(Color.red);
        }
    }//GEN-LAST:event_textKey2KeyReleased

    private void textKey2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKey2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textKey2KeyTyped

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        if (!textKey1.getText().equals("") && !textKey2.getText().equals("")) {
            if (!textKey1.getText().contains("-") && !textKey2.getText().contains("-")) {
                try {
                    int key1 = Integer.parseInt(textKey1.getText());
                    int key2 = Integer.parseInt(textKey2.getText());
                    mainLogic.setCipherText(messageText.getText());
                    mainLogic.encryptText(key1, key2);
                    messageText.setText(mainLogic.getCipherText());
                    mainLogic.setSTATUS("Status: Message encrypted");
                    logText.append(mainLogic.getSTATUS() + "\n");
                    // btnEncrypt.setEnabled(false);
                    //btnDecrypt.setEnabled(true);

                } catch (Exception ex) {
                    ex.printStackTrace();
                    mainLogic.setSTATUS("Warning: Enter an integer input as key");
                    logText.append(mainLogic.getSTATUS() + "\n");
                    JOptionPane.showMessageDialog(rootPane, "Please enter an integer value as key");
                }
            }else{
                mainLogic.setSTATUS("Warning: Keys cannot be negative");
                logText.append(mainLogic.getSTATUS() + "\n");
            }

        } else {
            mainLogic.setSTATUS("Warning: Keys cannot be empty");
            logText.append(mainLogic.getSTATUS() + "\n");
        }


    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        if (!textKey1.getText().equals("") && !textKey2.getText().equals("")) {
            if (!textKey1.getText().contains("-") && !textKey2.getText().contains("-")) {
                try {
                    int key1 = Integer.parseInt(textKey1.getText());
                    int key2 = Integer.parseInt(textKey2.getText());
                    mainLogic.setCipherText(messageText.getText());
                    mainLogic.decryptText(key1, key2);
                    messageText.setText(mainLogic.getCipherText());
                    mainLogic.setSTATUS("Status: Message decrypted");
                    logText.append(mainLogic.getSTATUS() + "\n");
                    //btnEncrypt.setEnabled(true);
                    //btnDecrypt.setEnabled(false);

                } catch (Exception ex) {
                    mainLogic.setSTATUS("Warning: Enter an integer input as key");
                    logText.append(mainLogic.getSTATUS() + "\n");
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(rootPane, "Please enter an integer value as key");
                }
            } else {
                mainLogic.setSTATUS("Warning: Keys cannot be negative");
                logText.append(mainLogic.getSTATUS() + "\n");
            }

        } else {
            mainLogic.setSTATUS("Warning: Keys cannot be empty");
            logText.append(mainLogic.getSTATUS() + "\n");
        }
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void btnOpen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpen1ActionPerformed
        mainLogic.writeFile();
        logText.append(mainLogic.getSTATUS() + "\n");
    }//GEN-LAST:event_btnOpen1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnOpen1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea logText;
    private javax.swing.JTextArea messageText;
    private javax.swing.JTextField textKey1;
    private javax.swing.JTextField textKey2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the mainLogic
     */
    public MainLogic getMainLogic() {
        return mainLogic;
    }

    /**
     * @param mainLogic the mainLogic to set
     */
    public void setMainLogic(MainLogic mainLogic) {
        this.mainLogic = mainLogic;
    }
}
