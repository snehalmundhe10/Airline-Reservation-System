package Interface.Fleet;

import Business.Flight;
import Business.Airliner1;
import java.awt.CardLayout;
import java.awt.Component;
//import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXDatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CreateFlightDetails extends javax.swing.JPanel {

    private JPanel rightPanel;
    private Airliner1 travelAgency;
    private int airlineCapacity;
    private double flightFare;

    public CreateFlightDetails(JPanel rightPanel, Airliner1 travelAgency) {
        initComponents();
        this.rightPanel = rightPanel;
        this.travelAgency = travelAgency;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        airlineTypeLbl = new javax.swing.JLabel();
        airlineTypeTxt = new javax.swing.JTextField();
        passengerCapacityLbl = new javax.swing.JLabel();
        airlineCapacityTxt = new javax.swing.JTextField();
        sourceLbl = new javax.swing.JLabel();
        sourceTxt = new javax.swing.JTextField();
        destinationLbl = new javax.swing.JLabel();
        destinationTxt = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        createAirlinerBtn = new javax.swing.JButton();
        dateLbl = new javax.swing.JLabel();
        flightFareLbl = new javax.swing.JLabel();
        flightFareTxt = new javax.swing.JTextField();
        dateTxt = new org.jdesktop.swingx.JXDatePicker();
        createAirlinerLbl = new javax.swing.JLabel();

        airlineTypeLbl.setText("Airline Type:");

        passengerCapacityLbl.setText("Passenger Capacity:");

        airlineCapacityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineCapacityTxtActionPerformed(evt);
            }
        });

        sourceLbl.setText("Source:");

        destinationLbl.setText("Destination:");

        BackBtn.setText("< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        createAirlinerBtn.setText("Create");
        createAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirlinerBtnActionPerformed(evt);
            }
        });

        dateLbl.setText("Date:");

        flightFareLbl.setText("Flight Fare:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlineTypeLbl)
                    .addComponent(passengerCapacityLbl)
                    .addComponent(sourceLbl)
                    .addComponent(destinationLbl)
                    .addComponent(BackBtn)
                    .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightFareLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(airlineTypeTxt)
                    .addComponent(airlineCapacityTxt)
                    .addComponent(sourceTxt)
                    .addComponent(destinationTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(createAirlinerBtn)
                    .addComponent(flightFareTxt)
                    .addComponent(dateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlineTypeLbl)
                    .addComponent(airlineTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passengerCapacityLbl)
                    .addComponent(airlineCapacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceLbl)
                    .addComponent(sourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destinationLbl)
                    .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateLbl)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightFareLbl)
                    .addComponent(flightFareTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(createAirlinerBtn))
                .addContainerGap())
        );

        createAirlinerLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createAirlinerLbl.setText("Create Flight Schedule");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(createAirlinerLbl)
                .addGap(137, 137, 137))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAirlinerLbl)
                .addContainerGap(389, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 49, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 48, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed

        rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlines ManageAirlinesJPanel = (ManageAirlines) component;
        ManageAirlinesJPanel.refreshTable();
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void createAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirlinerBtnActionPerformed

        System.out.println(sourceTxt.getText());
        System.out.println(destinationTxt.getText());
        if (airlineTypeTxt.getText().isEmpty() || sourceTxt.getText().isEmpty() || destinationTxt.getText().isEmpty() || airlineCapacityTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All the details are mandatory", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

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
        System.out.println("call here drectly");
        Flight airliner = travelAgency.getAirlinerDirectory().addAirline();
        airliner.setAirlineType(airlineTypeTxt.getText());
        airliner.setDate(dateTxt.getDate());
        airliner.setAirlineCapacity(airlineCapacity);
        airliner.setFlightFare(flightFare);              
        airliner.setSource(sourceTxt.getText());
        airliner.setDestination(destinationTxt.getText());   
        JOptionPane.showMessageDialog(null, "Flight Schedule added successfully");

        airlineTypeTxt.setText("");
        dateTxt.setDate(null);
        sourceTxt.setText("");
        destinationTxt.setText("");
        airlineCapacityTxt.setText("");
        flightFareTxt.setText("");
    }//GEN-LAST:event_createAirlinerBtnActionPerformed

    private void airlineCapacityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineCapacityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlineCapacityTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField airlineCapacityTxt;
    private javax.swing.JLabel airlineTypeLbl;
    private javax.swing.JTextField airlineTypeTxt;
    private javax.swing.JButton createAirlinerBtn;
    private javax.swing.JLabel createAirlinerLbl;
    private javax.swing.JLabel dateLbl;
    private org.jdesktop.swingx.JXDatePicker dateTxt;
    private javax.swing.JLabel destinationLbl;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JLabel flightFareLbl;
    private javax.swing.JTextField flightFareTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passengerCapacityLbl;
    private javax.swing.JLabel sourceLbl;
    private javax.swing.JTextField sourceTxt;
    // End of variables declaration//GEN-END:variables
}
