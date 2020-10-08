/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.VitalSignHistory;
import Business.VitalSigns;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yufengliu
 */
public class ViewVtialsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVtialsJPanel
     */
    private VitalSignHistory vsh;
    public ViewVtialsJPanel(VitalSignHistory vsh) {
        initComponents();
        this.vsh = vsh;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)TableVitalSign.getModel();
        dtm.setRowCount(0);
        
        for(VitalSigns vs : vsh.getVitalSignHistory()){
            Object row[] = new Object[2];
            row[0] = vs;
            row[1] = vs.getBloodPressure();
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableVitalSign = new javax.swing.JTable();
        BtnDelete = new javax.swing.JButton();
        BtnViewD = new javax.swing.JButton();
        TxtTemp = new javax.swing.JTextField();
        TxtBP = new javax.swing.JTextField();
        lableTemp1 = new javax.swing.JLabel();
        TxtPulse = new javax.swing.JTextField();
        lableTemp2 = new javax.swing.JLabel();
        TxtDate = new javax.swing.JTextField();
        lableTemp3 = new javax.swing.JLabel();
        lableTemp = new javax.swing.JLabel();

        TableVitalSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableVitalSign);

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnViewD.setText("View Details");
        BtnViewD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewDActionPerformed(evt);
            }
        });

        TxtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBPActionPerformed(evt);
            }
        });

        lableTemp1.setText("Blood Pressure");

        lableTemp2.setText("Pulse");

        lableTemp3.setText("Date");

        lableTemp.setText("Temperature");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnViewD)
                        .addGap(27, 27, 27)
                        .addComponent(BtnDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lableTemp3)
                                .addGap(4, 4, 4))
                            .addComponent(lableTemp2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPulse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lableTemp)
                            .addComponent(lableTemp1))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtBP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDelete)
                    .addComponent(BtnViewD))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableTemp)
                    .addComponent(TxtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableTemp1)
                    .addComponent(TxtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableTemp2)
                    .addComponent(TxtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableTemp3)
                    .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBPActionPerformed

    private void BtnViewDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewDActionPerformed
        // TODO add your handling code here:
        int selectedRow = TableVitalSign.getSelectedRow();
        if(selectedRow >= 0){
            VitalSigns vs = (VitalSigns)TableVitalSign.getValueAt(selectedRow,0);
            TxtBP.setText(String.valueOf(vs.getBloodPressure()));
            TxtTemp.setText(String.valueOf(vs.getTemperature()));
            TxtPulse.setText(String.valueOf(vs.getPulse()));
            TxtDate.setText(vs.getDate());
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
        }
    }//GEN-LAST:event_BtnViewDActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = TableVitalSign.getSelectedRow();
        if(selectedRow >= 0){
            VitalSigns vs = (VitalSigns)TableVitalSign.getValueAt(selectedRow,0);
            vsh.deleteVitals(vs);
            populateTable();
            JOptionPane.showMessageDialog(null, "Delete Sucessfully");
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnViewD;
    private javax.swing.JTable TableVitalSign;
    private javax.swing.JTextField TxtBP;
    private javax.swing.JTextField TxtDate;
    private javax.swing.JTextField TxtPulse;
    private javax.swing.JTextField TxtTemp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableTemp;
    private javax.swing.JLabel lableTemp1;
    private javax.swing.JLabel lableTemp2;
    private javax.swing.JLabel lableTemp3;
    // End of variables declaration//GEN-END:variables
}
