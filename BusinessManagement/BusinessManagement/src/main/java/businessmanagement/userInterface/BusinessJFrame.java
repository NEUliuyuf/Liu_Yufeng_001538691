/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessmanagement.userInterface;

import businessmanagement.Business.Business;
import businessmanagement.ProductManagement.ProductCatalog;

/**
 *
 * @author 43999
 */
public class BusinessJFrame extends javax.swing.JFrame{

    /**
     * Creates new form BusinessJFrame
     */
    
    static Business business;
    public BusinessJFrame(Business b) {
        initComponents();
        business = b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        LeftPane = new javax.swing.JPanel();
        MarketListButton = new javax.swing.JButton();
        ChannelListButton = new javax.swing.JButton();
        SolutionCatalogButton = new javax.swing.JButton();
        SupplierDirectoryButton = new javax.swing.JButton();
        MasterOrderListButton = new javax.swing.JButton();
        PersonDirectoryButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setDividerLocation(170);

        MarketListButton.setText("Markets");
        MarketListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketListButtonActionPerformed(evt);
            }
        });

        ChannelListButton.setText("Channels");
        ChannelListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChannelListButtonActionPerformed(evt);
            }
        });

        SolutionCatalogButton.setText("Solutions");
        SolutionCatalogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolutionCatalogButtonActionPerformed(evt);
            }
        });

        SupplierDirectoryButton.setText("Suppliers");
        SupplierDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDirectoryButtonActionPerformed(evt);
            }
        });

        MasterOrderListButton.setText("Orders");
        MasterOrderListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterOrderListButtonActionPerformed(evt);
            }
        });

        PersonDirectoryButton.setText("Person Directory");
        PersonDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonDirectoryButtonActionPerformed(evt);
            }
        });

        OrderButton.setText("Order");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPaneLayout = new javax.swing.GroupLayout(LeftPane);
        LeftPane.setLayout(LeftPaneLayout);
        LeftPaneLayout.setHorizontalGroup(
            LeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MasterOrderListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChannelListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarketListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PersonDirectoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(OrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SolutionCatalogButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SupplierDirectoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LeftPaneLayout.setVerticalGroup(
            LeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPaneLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(MarketListButton)
                .addGap(18, 18, 18)
                .addComponent(ChannelListButton)
                .addGap(18, 18, 18)
                .addComponent(SupplierDirectoryButton)
                .addGap(18, 18, 18)
                .addComponent(SolutionCatalogButton)
                .addGap(18, 18, 18)
                .addComponent(PersonDirectoryButton)
                .addGap(18, 18, 18)
                .addComponent(MasterOrderListButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(OrderButton)
                .addGap(39, 39, 39))
        );

        SplitPane.setLeftComponent(LeftPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SolutionCatalogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolutionCatalogButtonActionPerformed
        // TODO add your handling code here:
        SolutionCatalogPane scp = new SolutionCatalogPane(business);
        SplitPane.setRightComponent(scp);
    }//GEN-LAST:event_SolutionCatalogButtonActionPerformed

    private void SupplierDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDirectoryButtonActionPerformed
        // TODO add your handling code here:
        SupplierDirectory sd = new SupplierDirectory(business);
        SplitPane.setRightComponent(sd);
    }//GEN-LAST:event_SupplierDirectoryButtonActionPerformed

    private void MasterOrderListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterOrderListButtonActionPerformed
        // TODO add your handling code here:
       OrderListPane olp = new OrderListPane(business);
       SplitPane.setRightComponent(olp);
    }//GEN-LAST:event_MasterOrderListButtonActionPerformed

    private void PersonDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonDirectoryButtonActionPerformed
        // TODO add your handling code here:
        PersonDirectoryPane pdp = new PersonDirectoryPane(business);
        SplitPane.setRightComponent(pdp);
    }//GEN-LAST:event_PersonDirectoryButtonActionPerformed

    private void MarketListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarketListButtonActionPerformed
        // TODO add your handling code here:
        MarketListPane mlp = new MarketListPane(business);
        SplitPane.setRightComponent(mlp);
    }//GEN-LAST:event_MarketListButtonActionPerformed

    private void ChannelListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChannelListButtonActionPerformed
        // TODO add your handling code here:
        ChannelListPane clp = new ChannelListPane(business);
        SplitPane.setRightComponent(clp);
    }//GEN-LAST:event_ChannelListButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
        OrderPane op = new OrderPane(business);
        SplitPane.setRightComponent(op);
    }//GEN-LAST:event_OrderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BusinessJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusinessJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusinessJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusinessJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusinessJFrame(business).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChannelListButton;
    private javax.swing.JPanel LeftPane;
    private javax.swing.JButton MarketListButton;
    private javax.swing.JButton MasterOrderListButton;
    private javax.swing.JButton OrderButton;
    private javax.swing.JButton PersonDirectoryButton;
    private javax.swing.JButton SolutionCatalogButton;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton SupplierDirectoryButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
