package Interface.Fleet;
import Business.Airliner1;
import Business.TravelAgencyDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXDatePicker;

public class AirlineDetails extends javax.swing.JPanel {

    private JPanel rightPanel;
    private TravelAgencyDirectory travelAgencyDir;
    public AirlineDetails(JPanel rightPanel,TravelAgencyDirectory travelAgencyDir) {
        initComponents();
        this.rightPanel      = rightPanel;
        this.travelAgencyDir = travelAgencyDir; 
        airlineComboBox.removeAllItems();
        for(Airliner1 travelAgency : travelAgencyDir.getTravelAgencyDirectory()){
        airlineComboBox.addItem(travelAgency);
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlineNameLbl = new javax.swing.JLabel();
        airlineComboBox = new javax.swing.JComboBox();
        goBtn = new javax.swing.JButton();
        airlineDetailsLbl = new javax.swing.JLabel();
        masterFlightScheduleLbl = new javax.swing.JButton();

        airlineNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        airlineNameLbl.setText("Airline Name");

        airlineComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airlineComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineComboBoxActionPerformed(evt);
            }
        });

        goBtn.setText("GO>>");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        airlineDetailsLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        airlineDetailsLbl.setText("Airline Details");

        masterFlightScheduleLbl.setText("Master Flight Schedule");
        masterFlightScheduleLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterFlightScheduleLblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(masterFlightScheduleLbl)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(airlineDetailsLbl))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(airlineNameLbl)
                            .addGap(13, 13, 13)
                            .addComponent(airlineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(goBtn)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(masterFlightScheduleLbl)
                .addGap(58, 58, 58))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 113, Short.MAX_VALUE)
                    .addComponent(airlineDetailsLbl)
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(airlineNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(airlineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(goBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 114, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlineComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlineComboBoxActionPerformed

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        // TODO add your handling code here:
        Airliner1 travelAgency = (Airliner1)airlineComboBox.getSelectedItem();
        ManageAirlines manageAirlines = new ManageAirlines(rightPanel, travelAgency);
        rightPanel.add("manageAirlines",manageAirlines);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);              
    }//GEN-LAST:event_goBtnActionPerformed

    private void masterFlightScheduleLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterFlightScheduleLblActionPerformed
        // TODO add your handling code here:
        MasterFlightSchedule masterFlightSchedule = new MasterFlightSchedule(rightPanel, travelAgencyDir);
        rightPanel.add("masterFlightSchedule",masterFlightSchedule);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel); 
    }//GEN-LAST:event_masterFlightScheduleLblActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlineComboBox;
    private javax.swing.JLabel airlineDetailsLbl;
    private javax.swing.JLabel airlineNameLbl;
    private javax.swing.JButton goBtn;
    private javax.swing.JButton masterFlightScheduleLbl;
    // End of variables declaration//GEN-END:variables
}
