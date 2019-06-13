package Interface.ManageTravelAgency;
import Business.Airliner1;
import Business.TravelAgencyDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageTravelAgency extends javax.swing.JPanel {
private JPanel                rightPanel;
private TravelAgencyDirectory travelAgencyDirectory;

public ManageTravelAgency(JPanel rightPanel,TravelAgencyDirectory travelAgencyDirectory) {
        initComponents();
        this.rightPanel            = rightPanel;
        this.travelAgencyDirectory = travelAgencyDirectory;
        refreshTable();
    }

public void refreshTable() {
        int rowCount = airlineTbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlineTbl.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        
        for(Airliner1  ta : travelAgencyDirectory.getTravelAgencyDirectory()) {
            Object row[] = new Object[1];
            row[0] = ta;
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAirlinerBtn = new javax.swing.JButton();
        viewArlinerBtn = new javax.swing.JButton();
        manageTALabel = new javax.swing.JLabel();
        viewAirlinerTxtLbl = new javax.swing.JLabel();
        createAirlinerTxtLbl = new javax.swing.JLabel();
        Jtbl = new javax.swing.JScrollPane();
        airlineTbl = new javax.swing.JTable();

        createAirlinerBtn.setText("Create Airliner");
        createAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirlinerBtnActionPerformed(evt);
            }
        });

        viewArlinerBtn.setText("View Airliner");
        viewArlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewArlinerBtnActionPerformed(evt);
            }
        });

        manageTALabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageTALabel.setText("Manage Travel Agency");

        viewAirlinerTxtLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewAirlinerTxtLbl.setText("Click here to view Airliner details:");

        createAirlinerTxtLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createAirlinerTxtLbl.setText("Click here to enter new Airliner details:");

        airlineTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "airlinerName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jtbl.setViewportView(airlineTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jtbl, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(viewAirlinerTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewArlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(createAirlinerTxtLbl)
                            .addGap(38, 38, 38)
                            .addComponent(createAirlinerBtn))))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(manageTALabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageTALabel)
                .addGap(30, 30, 30)
                .addComponent(Jtbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAirlinerBtn)
                    .addComponent(createAirlinerTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAirlinerTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewArlinerBtn))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirlinerBtnActionPerformed
        CreateAirliner createAirliner = new CreateAirliner(rightPanel,travelAgencyDirectory);
        CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
        rightPanel.add(createAirliner);
        cardLayout.next(rightPanel);
    }//GEN-LAST:event_createAirlinerBtnActionPerformed

    private void viewArlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewArlinerBtnActionPerformed
           
        int row = airlineTbl.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Airliner1 travelAgency = (Airliner1)airlineTbl.getValueAt(row, 0);
        ViewAirliner viewAirliner = new ViewAirliner(rightPanel, travelAgency);
        rightPanel.add("ViewSupplier", viewAirliner);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        
    }//GEN-LAST:event_viewArlinerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Jtbl;
    private javax.swing.JTable airlineTbl;
    private javax.swing.JButton createAirlinerBtn;
    private javax.swing.JLabel createAirlinerTxtLbl;
    private javax.swing.JLabel manageTALabel;
    private javax.swing.JLabel viewAirlinerTxtLbl;
    private javax.swing.JButton viewArlinerBtn;
    // End of variables declaration//GEN-END:variables
}
