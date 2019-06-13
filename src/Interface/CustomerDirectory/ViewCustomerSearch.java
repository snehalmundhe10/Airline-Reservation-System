package Interface.CustomerDirectory;

import Business.Flight;
import Business.AirlinerDirectory;
import Business.Customer;
import Business.Airliner1;
import Business.TravelAgencyDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;

public class ViewCustomerSearch extends javax.swing.JPanel {

    private JPanel                rightPanel;
    private TravelAgencyDirectory travelAgencyDir;
    private String                searchSource;
    private String                searchDestination;
    private Customer              customer;
    private int                   seat;
    private int                   unreserve;
    public ViewCustomerSearch(JPanel rightPanel,TravelAgencyDirectory travelAgencyDir,Customer customer, String searchSource, String searchDestination) {
        initComponents();
        this.rightPanel        = rightPanel;
        this.travelAgencyDir   = travelAgencyDir;
        this.searchSource      = searchSource;
        this.searchDestination = searchDestination;
        this.customer          = customer;
        refreshTable();
    }
    
    public void refreshTable() {        
        int rowCount = airlineCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlineCatalog.getModel();
        model.setRowCount(0);
        
        for(Airliner1 travelAgency : travelAgencyDir.getTravelAgencyDirectory()){
            for(Flight a : travelAgency.getAirlinerDirectory().getAirlinerDirectory()){
                
                if (searchSource.isEmpty() || searchDestination.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "All the fileds are mandatory");
                }
                
                if (a.getSource().equals(searchSource) && a.getDestination().equals(searchDestination))
                {
                   Object[] row = new Object[7];
                   row[0] = travelAgency.getAirlineName();
                   row[1] = a.getAirlineType();
                   row[2] = a.getAirlineCapacity();
                   row[3] = a.getDate(); 
                   row[4] = a.getSource();
                   row[5] = a.getDestination();
                   row[6] = a.getFlightFare();
                   model.addRow(row);
                }                                
            }                
        }    
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        airlineCatalog = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unreserveTxt = new javax.swing.JTextField();
        bookFlightLbl = new javax.swing.JButton();
        cancelFlightBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        seatNumberTxt = new javax.swing.JTextField();

        airlineCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        airlineCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Airline Type", "Airline Capacity", "Date", "Source", "Destination", "Flight Fare"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airlineCatalog);

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Flight Details");

        jLabel2.setText("Enter total seats to be booked");

        bookFlightLbl.setText("Book Flight");
        bookFlightLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightLblActionPerformed(evt);
            }
        });

        cancelFlightBtn.setText("Cancel Flights");
        cancelFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelFlightBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter total seats to be unreserved");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seatNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unreserveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelFlightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookFlightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(bookFlightLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(seatNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(unreserveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelFlightBtn)
                    .addComponent(backBtn))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
         rightPanel.remove(this);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.previous(rightPanel); 
    }//GEN-LAST:event_backBtnActionPerformed

    private void bookFlightLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightLblActionPerformed
        // TODO add your handling code here:        
        seatNumberTxt.getText();
        refreshTable2();
        seatNumberTxt.setText("");
    }
        public void refreshTable2() {        
        int rowCount = airlineCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlineCatalog.getModel();
        model.setRowCount(0);
        
        for(Airliner1 travelAgency : travelAgencyDir.getTravelAgencyDirectory()){
            for(Flight a : travelAgency.getAirlinerDirectory().getAirlinerDirectory()){
                
                if (a.getAirlineCapacity() < Integer.parseInt(seatNumberTxt.getText()) )
                {
                    JOptionPane.showMessageDialog(null, "The total number of seats you are trying to book are unavailable"); 
                    if (a.getSource().equals(searchSource) && a.getDestination().equals(searchDestination))
                    {
                    
                        Object[] row = new Object[7];
                        row[0] = travelAgency.getAirlineName();
                        row[1] = a.getAirlineType();
                        int seat =  a.getAirlineCapacity() ;
                        row[2] = seat;                  
                        a.setAirlineCapacity(seat);
                        row[3] = a.getDate();
                        row[4] = a.getSource();
                        row[5] = a.getDestination();
                        row[6] = a.getFlightFare();
                        model.addRow(row);
                   }
                }
                else
                {
                if (a.getSource().equals(searchSource) && a.getDestination().equals(searchDestination))
                {
                    
                   Object[] row = new Object[7];
                   row[0] = travelAgency.getAirlineName();
                   row[1] = a.getAirlineType();
                   int seat =  a.getAirlineCapacity() -(Integer.parseInt(seatNumberTxt.getText()));
                   row[2] = seat;                  
                   a.setAirlineCapacity(seat);
                   row[3] = a.getDate();
                   row[4] = a.getSource();
                   row[5] = a.getDestination();
                   row[6] = a.getFlightFare();
                   model.addRow(row);
                }
                }
            }                                        
    }//GEN-LAST:event_bookFlightLblActionPerformed
        }
    private void cancelFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelFlightBtnActionPerformed
        // TODO add your handling code here:
        unreserveTxt.getText();
        refreshTable3();
        unreserveTxt.setText("");
    }//GEN-LAST:event_cancelFlightBtnActionPerformed
        
      public void refreshTable3() {        
        int rowCount = airlineCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)airlineCatalog.getModel();
        model.setRowCount(0);
        
        for(Airliner1 travelAgency : travelAgencyDir.getTravelAgencyDirectory()){
            for(Flight a : travelAgency.getAirlinerDirectory().getAirlinerDirectory()){
                                
                if (a.getSource().equals(searchSource) && a.getDestination().equals(searchDestination))
                {
                   Object[] row = new Object[7];
                   row[0] = travelAgency.getAirlineName();
                   row[1] = a.getAirlineType();
                   int unreserve =  a.getAirlineCapacity() +(Integer.parseInt(unreserveTxt.getText()));
                   row[2] = unreserve;                  
                   a.setAirlineCapacity(unreserve);
                   row[3] = a.getDate();
                   row[4] = a.getSource();
                   row[5] = a.getDestination();
                   row[6] = a.getFlightFare();
                   model.addRow(row);
                }
            }                                        
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlineCatalog;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookFlightLbl;
    private javax.swing.JButton cancelFlightBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField seatNumberTxt;
    private javax.swing.JTextField unreserveTxt;
    // End of variables declaration//GEN-END:variables
}
