package Interface.ManageTravelAgency;

import Business.Flight;
import Business.Airliner1;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ViewAirliner extends javax.swing.JPanel {
    private Airliner1 travelAgency;
    private JPanel       rightPanel;
    public ViewAirliner(JPanel rightPanel,Airliner1 travelAgency) {
        initComponents();
        this.rightPanel      = rightPanel;
        this.travelAgency    = travelAgency;        
        airlineNameLbl.setText(travelAgency.getAirlineName());        
        refreshTable();
    }
    
     private void refreshTable() {
        int rowCount = airlineTbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlineTbl.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for( Flight a : travelAgency.getAirlinerDirectory().getAirlinerDirectory())   {
            Object row[] = new Object[4];
            row[0] = a;
            row[1] = a.getSource();
            row[2] = a.getDestination();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlineTbl = new javax.swing.JTable();
        airlineNameLbl = new javax.swing.JLabel();

        BackBtn.setText("< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        airlineTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Source", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airlineTbl);

        airlineNameLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        airlineNameLbl.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlineNameLbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(airlineNameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackBtn)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        rightPanel.remove(this);
        CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
        cardLayout.previous(rightPanel);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel airlineNameLbl;
    private javax.swing.JTable airlineTbl;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
