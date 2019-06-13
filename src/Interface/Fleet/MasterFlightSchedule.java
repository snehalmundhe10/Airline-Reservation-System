package Interface.Fleet;

import Business.Flight;
import Business.Airliner1;
import Business.TravelAgencyDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;

public class MasterFlightSchedule extends javax.swing.JPanel {

    private JPanel rightPanel;
    private TravelAgencyDirectory travelAgencyDir;

    public MasterFlightSchedule(JPanel rightPanel, TravelAgencyDirectory travelAgencyDir) {
        initComponents();
        this.rightPanel = rightPanel;
        this.travelAgencyDir = travelAgencyDir;
        refreshTable();
    }

    public void refreshTable() {
        //int rowCount = airlineCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel) airlineCatalog.getModel();
        model.setRowCount(0);

        for (Airliner1 travelAgency : travelAgencyDir.getTravelAgencyDirectory()) {
            for (Flight a : travelAgency.getAirlinerDirectory().getAirlinerDirectory()) {

                Object[] row = new Object[8];
                row[0] = travelAgency.getAirlineName();
                row[1] = a.getAirlineType();
                row[2] = a.getFlightId();
                row[3] = a.getAirlineCapacity();                
                row[4] = a.getSource();
                row[5] = a.getDestination();
                row[6] = a.getDate();
                row[7] = a.getFlightFare();
                model.addRow(row);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlineCatalog = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Master Flight Schedule");

        airlineCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        airlineCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Airline Type", "Flight Id", "Seat Capacity", "Source", "Destination", "Date", "Flight Fare"
            }
        ));
        jScrollPane1.setViewportView(airlineCatalog);

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        AirlineDetails AirlineDetailsJPanel = (AirlineDetails)component;
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel); 
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlineCatalog;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
