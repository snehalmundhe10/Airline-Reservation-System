package Interface.ManageTravelAgency;

import Business.Airliner1;
import Business.TravelAgencyDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CreateAirliner extends javax.swing.JPanel {

    private JPanel                rightPanel;
    private TravelAgencyDirectory travelAgencyDir;
    public CreateAirliner(JPanel rightPanel,TravelAgencyDirectory travelAgencyDir) {
        initComponents();
        this.rightPanel      = rightPanel;
        this.travelAgencyDir = travelAgencyDir;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAirlinerLbl = new javax.swing.JLabel();
        airlineNameLbl = new javax.swing.JLabel();
        airlineNameTxt = new javax.swing.JTextField();
        createAirlineBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        createAirlinerLbl.setText("Create Airliner");

        airlineNameLbl.setText("Airline Name:");

        createAirlineBtn.setText("Create");
        createAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirlineBtnActionPerformed(evt);
            }
        });

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
                        .addGap(159, 159, 159)
                        .addComponent(createAirlinerLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backBtn)
                            .addComponent(airlineNameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createAirlineBtn)
                            .addComponent(airlineNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(createAirlinerLbl)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlineNameLbl)
                    .addComponent(airlineNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(createAirlineBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(71, 71, 71))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
        rightPanel.remove(this);
        Component[] componentArray = rightPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        ManageTravelAgency manageTravelAgencyJPanel = (ManageTravelAgency)component;
        manageTravelAgencyJPanel.refreshTable();
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);                            
    }//GEN-LAST:event_backBtnActionPerformed

    private void createAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirlineBtnActionPerformed
        // TODO add your handling code here:
        
        if (airlineNameTxt.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Airline name cannot be blank", "Warning", JOptionPane.INFORMATION_MESSAGE); 
          return;
        }
        else
        {
         Airliner1 travelAgency = travelAgencyDir.addTravelAgency();  
         travelAgency.setAirlineName(airlineNameTxt.getText());        
         JOptionPane.showMessageDialog(null, "Airline name added successfully", "Warning", JOptionPane.INFORMATION_MESSAGE); 
         airlineNameTxt.setText(""); 
        }         
    }//GEN-LAST:event_createAirlineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlineNameLbl;
    private javax.swing.JTextField airlineNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createAirlineBtn;
    private javax.swing.JLabel createAirlinerLbl;
    // End of variables declaration//GEN-END:variables
}
