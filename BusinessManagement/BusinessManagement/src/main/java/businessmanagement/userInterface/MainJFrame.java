/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.userInterface;

import businessmanagement.Business.Business;
import businessmanagement.CustomerManagement.CustomerAccount;
import businessmanagement.CustomerManagement.CustomerProfile;
import businessmanagement.MarketModel.Market;
import businessmanagement.Personnel.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author 43999
 */

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    static String bn;
    static Business business;
    boolean isNewBusiness = true;
    public MainJFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        menuPane = new javax.swing.JPanel();
        BusinessLabel = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        BusinessNameLabel = new javax.swing.JLabel();
        BusinessNameInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        UserButton = new javax.swing.JRadioButton();
        ManagerButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPane.setAutoscrolls(true);
        menuPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BusinessLabel.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        BusinessLabel.setText("Business Management");

        ConfirmButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        ConfirmButton.setText("Confirm");
        ConfirmButton.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ConfirmButtonComponentAdded(evt);
            }
        });
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        BusinessNameLabel.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        BusinessNameLabel.setText("Business Name: ");

        BusinessNameInput.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("User or Manager: ");

        buttonGroup1.add(UserButton);
        UserButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        UserButton.setText("User");

        buttonGroup1.add(ManagerButton);
        ManagerButton.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        ManagerButton.setText("Manager");
        ManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPaneLayout = new javax.swing.GroupLayout(menuPane);
        menuPane.setLayout(menuPaneLayout);
        menuPaneLayout.setHorizontalGroup(
            menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BusinessLabel)
                .addGap(198, 198, 198))
            .addGroup(menuPaneLayout.createSequentialGroup()
                .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPaneLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPaneLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(UserButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ManagerButton))
                            .addGroup(menuPaneLayout.createSequentialGroup()
                                .addComponent(BusinessNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BusinessNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(menuPaneLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(ConfirmButton)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        menuPaneLayout.setVerticalGroup(
            menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BusinessLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusinessNameLabel)
                    .addComponent(BusinessNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(menuPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserButton)
                    .addComponent(ManagerButton))
                .addGap(129, 129, 129)
                .addComponent(ConfirmButton)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        // TODO add your handling code here:
        boolean user = buttonGroup1.isSelected(UserButton.getModel());
        boolean manager = buttonGroup1.isSelected(ManagerButton.getModel());
        bn = BusinessNameInput.getText();
        if(isNewBusiness == true){
            business = new Business(bn);
        }
        if(user){
            UserLoginJFrame ujf = new UserLoginJFrame(business);
            ujf.setTitle(BusinessNameInput.getText()+" Management");
            ujf.setVisible(true);
            isNewBusiness = false;
        }else if(manager){
            ManagerLogInJFrame mlj = new ManagerLogInJFrame(business,bn);
            mlj.setVisible(true);
            isNewBusiness = false;
        }else{
            JOptionPane.showMessageDialog(null,"Select user or manager");
        }
        
        
        
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void ConfirmButtonComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ConfirmButtonComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmButtonComponentAdded

    private void ManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ManagerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BusinessLabel;
    private javax.swing.JTextField BusinessNameInput;
    private javax.swing.JLabel BusinessNameLabel;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JRadioButton ManagerButton;
    private javax.swing.JRadioButton UserButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuPane;
    // End of variables declaration//GEN-END:variables
}
