package Interface.CustomerDirectory;

import Business.Flight;
import Business.AirlinerDirectory;
import Business.Customer;
import Business.Airliner1;
import Business.TravelAgencyDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

public class SearchFlight extends javax.swing.JPanel {

    private JPanel                rightPanel;
    private TravelAgencyDirectory travelAgencyDir;
    private Customer              customer;
    public SearchFlight(JPanel rightPanel, TravelAgencyDirectory travelAgencyDir, Customer customer) {
        initComponents();
        this.rightPanel      = rightPanel;
        this.travelAgencyDir = travelAgencyDir;
        this.customer        = customer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchSourceLbl = new javax.swing.JLabel();
        searchDestinationLbl = new javax.swing.JLabel();
        searchSourceTxt = new javax.swing.JTextField();
        searchDestinationTxt = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Find Your Flight");

        searchSourceLbl.setText("Source:");

        searchDestinationLbl.setText("Destination:");

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchSourceLbl)
                            .addComponent(searchDestinationLbl))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchDestinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchSourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn)))
                    .addComponent(backBtn))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchSourceLbl)
                    .addComponent(searchSourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchDestinationLbl)
                    .addComponent(searchDestinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SearchBtn)
                .addGap(81, 81, 81)
                .addComponent(backBtn)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        String searchSource       = searchSourceTxt.getText();
        String searchDestination  = searchDestinationTxt.getText();
      
        System.out.println(searchSource);
        System.out.println(searchDestination);
        ViewCustomerSearch viewCustomerSearch = new ViewCustomerSearch(rightPanel,travelAgencyDir,customer,searchSource,searchDestination);
        rightPanel.add(viewCustomerSearch);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);          
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel);
        
//        rightPanel.remove(this);
//        Component[] componentArray = rightPanel.getComponents();
//        Component component = componentArray[componentArray.length-1];
//        ManageCustomer ManageCustomerJPanel = (ManageCustomer)component;
//        CardLayout layout = (CardLayout)rightPanel.getLayout();
//        layout.previous(rightPanel);  
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel searchDestinationLbl;
    private javax.swing.JTextField searchDestinationTxt;
    private javax.swing.JLabel searchSourceLbl;
    private javax.swing.JTextField searchSourceTxt;
    // End of variables declaration//GEN-END:variables
}
