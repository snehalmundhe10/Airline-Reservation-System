package Interface.Fleet;
import Business.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXDatePicker;

public class ViewAirlinerDetailJPanel extends javax.swing.JPanel {

    private JPanel   rightPanel;
    private Flight airliner;
    private int airlineCapacity;
    private double flightFare;
    public ViewAirlinerDetailJPanel(JPanel rightPanel,Flight airliner) {
        initComponents();
        this.rightPanel = rightPanel;
        this.airliner   = airliner;
        flightIdTxt.setEnabled(false);
        flightIdTxt.setText(convertInteger(airliner.getFlightId()));
        airlineCapacityTxt.setText(String.valueOf(airliner.getAirlineCapacity()));
        airlineTypeTxt.setText(airliner.getAirlineType());
        sourceTxt.setText(airliner.getSource());
        destinationTxt.setText(airliner.getDestination());
        dateTxt.setDate((airliner.getDate()));
        flightFareTxt.setText(String.valueOf(airliner.getFlightFare()));                              
    }
    
    public static String convertInteger(int i) {
        return Integer.toString(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        airlineTypeLbl = new javax.swing.JLabel();
        airlineTypeTxt = new javax.swing.JTextField();
        updAircraftBtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        airlineCapacityTxt = new javax.swing.JTextField();
        airlineCapacityLbl = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        sourceLbl = new javax.swing.JLabel();
        sourceTxt = new javax.swing.JTextField();
        destinationLbl = new javax.swing.JLabel();
        destinationTxt = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        flightFareLbl = new javax.swing.JLabel();
        flightFareTxt = new javax.swing.JTextField();
        flightIdTxt = new javax.swing.JTextField();
        FlightIdLbl = new javax.swing.JLabel();
        dateTxt = new org.jdesktop.swingx.JXDatePicker();
        viewAirlineDetailLbl = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        airlineTypeLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        airlineTypeLbl.setText("Airline Type:");
        jPanel1.add(airlineTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        airlineTypeTxt.setEditable(false);
        airlineTypeTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        airlineTypeTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(airlineTypeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 159, -1));

        updAircraftBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updAircraftBtn.setText("Update Aircraft");
        updAircraftBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updAircraftBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updAircraftBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 176, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        airlineCapacityTxt.setEditable(false);
        airlineCapacityTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        airlineCapacityTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(airlineCapacityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 159, -1));

        airlineCapacityLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        airlineCapacityLbl.setText("Airline Capacity:");
        jPanel1.add(airlineCapacityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        saveButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 70, 30));

        sourceLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sourceLbl.setText("Source:");
        jPanel1.add(sourceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        sourceTxt.setEditable(false);
        sourceTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sourceTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(sourceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 159, -1));

        destinationLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        destinationLbl.setText("Destination:");
        jPanel1.add(destinationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        destinationTxt.setEditable(false);
        destinationTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        destinationTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(destinationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 159, -1));

        dateLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateLbl.setText("Date:");
        jPanel1.add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        flightFareLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flightFareLbl.setText("Flight Fare:");
        jPanel1.add(flightFareLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        flightFareTxt.setEditable(false);
        flightFareTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flightFareTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(flightFareTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 159, -1));

        flightIdTxt.setEditable(false);
        flightIdTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        flightIdTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(flightIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 159, -1));

        FlightIdLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FlightIdLbl.setText("Flight Id:");
        jPanel1.add(FlightIdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));
        jPanel1.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, -1));

        viewAirlineDetailLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        viewAirlineDetailLbl.setText("View Aircraft Detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(viewAirlineDetailLbl)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewAirlineDetailLbl)
                .addContainerGap(501, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 83, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 83, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updAircraftBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updAircraftBtnActionPerformed
        // TODO add your handling code here:
        flightIdTxt.setEditable(false);
        airlineTypeTxt.setEditable(true);
        airlineCapacityTxt.setEditable(true);
        sourceTxt.setEditable(true);
        destinationTxt.setEditable(true);
        dateTxt.setEditable(true);
        flightFareTxt.setEditable(true);
        saveButton.setEnabled(true);
    }//GEN-LAST:event_updAircraftBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageAirlines ManageAirlinesJPanel = (ManageAirlines)component;
        ManageAirlinesJPanel.refreshTable();
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);  
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (sourceTxt.getText().equals(destinationTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Source and Destination cannot be same", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }        
        try {
            String StrpassengerCapacity = airlineCapacityTxt.getText();
            if (StrpassengerCapacity.isEmpty() == false) {
                airlineCapacity = Integer.parseInt(StrpassengerCapacity);                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Passenger Capacity should be in number format only");
            return;
        }
        try {
            String StrFlightFare = flightFareTxt.getText();
            if (StrFlightFare.isEmpty() == false) {
                 flightFare = Double.parseDouble(StrFlightFare);                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Flight fare should be in number format only");
            return;
        }        
        airliner.setAirlineCapacity(Integer.parseInt(airlineCapacityTxt.getText()));
        airliner.setAirlineType(airlineTypeTxt.getText());
        airliner.setSource(sourceTxt.getText());
        airliner.setDestination(destinationTxt.getText());
        airliner.setDate(dateTxt.getDate());
        airliner.setFlightFare(Double.parseDouble(flightFareTxt.getText()));
        JOptionPane.showMessageDialog(null,"Details updated successfully");
        flightIdTxt.setText("");
        airlineCapacityTxt.setText("");
        airlineTypeTxt.setText("");
        sourceTxt.setText("");
        destinationTxt.setText("");
        dateTxt.setDate(null);
        flightFareTxt.setText("");
        flightIdTxt.setEnabled(false);
        airlineCapacityTxt.setEnabled(false);
        airlineTypeTxt.setEnabled(false);
        sourceTxt.setEnabled(false);
        destinationTxt.setEnabled(false);
        dateTxt.setEnabled(false);
        flightFareTxt.setEnabled(false);

    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FlightIdLbl;
    private javax.swing.JLabel airlineCapacityLbl;
    private javax.swing.JTextField airlineCapacityTxt;
    private javax.swing.JLabel airlineTypeLbl;
    private javax.swing.JTextField airlineTypeTxt;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel dateLbl;
    private org.jdesktop.swingx.JXDatePicker dateTxt;
    private javax.swing.JLabel destinationLbl;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JLabel flightFareLbl;
    private javax.swing.JTextField flightFareTxt;
    private javax.swing.JTextField flightIdTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel sourceLbl;
    private javax.swing.JTextField sourceTxt;
    private javax.swing.JButton updAircraftBtn;
    private javax.swing.JLabel viewAirlineDetailLbl;
    // End of variables declaration//GEN-END:variables
}
