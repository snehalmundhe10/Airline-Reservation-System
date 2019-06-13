package Interface;
import Interface.ManageTravelAgency.ManageTravelAgency;
import Business.TravelAgencyDirectory;
import Interface.CustomerDirectory.ManageCustomer;
import Interface.CustomerDirectory.SearchFlight;
import Interface.Fleet.AirlineDetails;
import java.awt.CardLayout;
public class MainFrame extends javax.swing.JFrame {

private TravelAgencyDirectory travelAgencyDirectory;
public MainFrame() {
     initComponents();
     travelAgencyDirectory = new TravelAgencyDirectory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        manageAirlinesBtn = new javax.swing.JButton();
        manageTravelAgencyBtn1 = new javax.swing.JButton();
        manageCustomersBtn = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAirlinesBtn.setText("Manage Airliners");
        manageAirlinesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinesBtnActionPerformed(evt);
            }
        });
        leftPanel.add(manageAirlinesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, 143, -1));

        manageTravelAgencyBtn1.setText("Manage Travel Agency");
        manageTravelAgencyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTravelAgencyBtn1ActionPerformed(evt);
            }
        });
        leftPanel.add(manageTravelAgencyBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, -1, -1));

        manageCustomersBtn.setText("Manage Customers");
        manageCustomersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomersBtnActionPerformed(evt);
            }
        });
        leftPanel.add(manageCustomersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, 143, -1));

        splitPane.setLeftComponent(leftPanel);

        rightPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageTravelAgencyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTravelAgencyBtn1ActionPerformed
        // TODO add your handling code here:
        ManageTravelAgency manageTravelAgency = new ManageTravelAgency(rightPanel,travelAgencyDirectory);
        CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
        rightPanel.add("manageTravelAgency",manageTravelAgency);
        cardLayout.next(rightPanel);
    }//GEN-LAST:event_manageTravelAgencyBtn1ActionPerformed

    private void manageAirlinesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinesBtnActionPerformed
        // TODO add your handling code here:
        AirlineDetails airlineDetails = new AirlineDetails(rightPanel,travelAgencyDirectory);
        CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
        rightPanel.add("airlineDetails",airlineDetails);
        cardLayout.next(rightPanel);
    }//GEN-LAST:event_manageAirlinesBtnActionPerformed

    private void manageCustomersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomersBtnActionPerformed
        // TODO add your handling code here:
        ManageCustomer manageCustomer = new ManageCustomer(rightPanel, travelAgencyDirectory);
        CardLayout cardLayout = (CardLayout)rightPanel.getLayout();
        rightPanel.add("manageCustomer",manageCustomer);
        cardLayout.next(rightPanel);
    }//GEN-LAST:event_manageCustomersBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton manageAirlinesBtn;
    private javax.swing.JButton manageCustomersBtn;
    private javax.swing.JButton manageTravelAgencyBtn1;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
