package Interface.Fleet;

import Interface.Fleet.CreateFlightDetails;
import Business.Flight;
import Business.AirlinerDirectory;
import Business.Airliner1;
import Interface.Fleet.ViewAirlinerDetailJPanel;
import Interface.ManageTravelAgency.ManageTravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;

public class ManageAirlines extends javax.swing.JPanel {
    private JPanel       rightPanel;
    private Airliner1 travelAgency;
    public ManageAirlines(JPanel rightPanel,Airliner1 travelAgency) {
        initComponents();
        this.rightPanel = rightPanel;
        this.travelAgency = travelAgency;
        aNameTextField.setText(travelAgency.getAirlineName());
        refreshTable();
    }
    
    public void refreshTable() {
        //int rowCount = airlineCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlineCatalog.getModel();
        model.setRowCount(0);
        
        for(Flight a : travelAgency.getAirlinerDirectory().getAirlinerDirectory()) {
            Object row[] = new Object[model.getColumnCount()];
            row[0] = a;
            row[1] = a.getFlightId();
            row[2] = a.getAirlineCapacity();
            row[3] = a.getSource();
            row[4] = a.getDestination();
            row[5] = a.getDate(); 
            row[6] = a.getFlightFare();
            model.addRow(row);
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlineCatalog = new javax.swing.JTable();
        viewScheduleBtn = new javax.swing.JButton();
        createSButton = new javax.swing.JButton();
        backButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        aNameTextField = new javax.swing.JTextField();
        delButton = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Airlines");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        airlineCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        airlineCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Type", "Flight Id", "Seat Capacity", "Source", "Destination", "Date", "Flight Fare"
            }
        ));
        jScrollPane1.setViewportView(airlineCatalog);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 500, 170));

        viewScheduleBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewScheduleBtn.setText("View Schedule >>");
        viewScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewScheduleBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewScheduleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 220, -1));

        createSButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createSButton.setText("Create New Schedule >>");
        createSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createSButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 220, -1));

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Airline:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, -1));

        aNameTextField.setEditable(false);
        aNameTextField.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        aNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        aNameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        aNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(aNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 150, 30));

        delButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delButton.setText("Delete Schedule");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });
        jPanel1.add(delButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewScheduleBtnActionPerformed
        // TODO add your handling code here:
        int row = airlineCatalog.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight a = (Flight)airlineCatalog.getValueAt(row, 0);
        ViewAirlinerDetailJPanel vadjp = new ViewAirlinerDetailJPanel(rightPanel,a);
        rightPanel.add( "vadjp",vadjp);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_viewScheduleBtnActionPerformed

    private void createSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSButtonActionPerformed
        CreateFlightDetails createFlightDetails = new CreateFlightDetails(rightPanel, travelAgency);
        rightPanel.add(createFlightDetails);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_createSButtonActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed
        // TODO add your handling code here:
//        rightPanel.remove(this);
//        CardLayout layout = (CardLayout)rightPanel.getLayout();
//        layout.previous(rightPanel);
        
        rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        AirlineDetails AirlineDetailsJPanel = (AirlineDetails)component;
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);  
    }//GEN-LAST:event_backButton4ActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        // TODO add your handling code here:
        int row = airlineCatalog.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight a = (Flight)airlineCatalog.getValueAt(row, 0);
        travelAgency.getAirlinerDirectory().deleteAirline(a);
        refreshTable();
    }//GEN-LAST:event_delButtonActionPerformed

    private void aNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aNameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aNameTextField;
    private javax.swing.JTable airlineCatalog;
    private javax.swing.JButton backButton4;
    private javax.swing.JButton createSButton;
    private javax.swing.JButton delButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewScheduleBtn;
    // End of variables declaration//GEN-END:variables
}
