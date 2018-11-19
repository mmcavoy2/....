/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.swing.JOptionPane;

/**
 *
 * @author mjwat
 */
public class FrameCourier extends javax.swing.JFrame {

    /**
     * Creates new form Courier
     */
    private DatabaseConnection databaseConnection;
    private Order[] arrayOfOrders;
    private Item[] arrayOfItems;
    private Location[] arrayOfLocations;
    private int currentIndex;
    private int numberOfRecords;
    private String courierID = Main.courierID;

    public FrameCourier() {
        initComponents();
        setLocationRelativeTo(null);
        txtCourierID.setText(courierID);///
        databaseConnection = new DatabaseConnection();
        // HERE>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        arrayOfItems = databaseConnection.getAllItemsTest();
        arrayOfLocations = databaseConnection.getAllLocations();
        for (Item arrayOfItem : arrayOfItems) {
            System.out.println(arrayOfItem.getItemName());
        }
    }//FrameCourier

    /**
     * This method is called from within the constructor to the form. WARNING:
     * Do NOT modify this code. The content of this method is always regenerated
     * by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblRequestedBy = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnSelectDelivery = new javax.swing.JButton();
        btnNextDelivery = new javax.swing.JButton();
        btnPreviousDelivery = new javax.swing.JButton();
        btnRefreshOrderline = new javax.swing.JButton();
        lblDeliveryID = new javax.swing.JLabel();
        txtOrderID = new javax.swing.JTextField();
        txtItem = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtRequestedBy = new javax.swing.JTextField();
        txtBuilderID = new javax.swing.JTextField();
        lvlCourierID = new javax.swing.JLabel();
        lblNotes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        lblStatus = new javax.swing.JLabel();
        lblBuilder = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCourierID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblOrderIDSelected = new javax.swing.JLabel();
        lblSelectedTitle = new javax.swing.JLabel();
        btnConfirmDelivered = new javax.swing.JButton();
        txtOrderIDSelected = new javax.swing.JTextField();
        txtLocationSelected = new javax.swing.JTextField();
        txtWhenSelected = new javax.swing.JTextField();
        txtItemSelected = new javax.swing.JTextField();
        lblLocationSelected = new javax.swing.JLabel();
        lblByWhen = new javax.swing.JLabel();
        lblSelectedItem = new javax.swing.JLabel();
        lblSelectedNotes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNotesSelected = new javax.swing.JTextArea();
        txtStatus = new javax.swing.JTextField();
        lblItem = new javax.swing.JLabel();
        lblAvailableDeliveries = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        lblWhiteBackground = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblTitle.setText("Manage Delivery Screen");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(280, 20, 260, 30);

        lblLocation.setText("Location:");
        getContentPane().add(lblLocation);
        lblLocation.setBounds(50, 150, 60, 20);

        lblRequestedBy.setText("By When:");
        getContentPane().add(lblRequestedBy);
        lblRequestedBy.setBounds(50, 180, 78, 20);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(693, 10, 90, 32);

        btnSelectDelivery.setText("Select Delivery");
        btnSelectDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectDeliveryActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelectDelivery);
        btnSelectDelivery.setBounds(110, 220, 140, 32);

        btnNextDelivery.setText("Next");
        btnNextDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextDeliveryActionPerformed(evt);
            }
        });
        getContentPane().add(btnNextDelivery);
        btnNextDelivery.setBounds(180, 310, 140, 32);

        btnPreviousDelivery.setText("Prevous");
        btnPreviousDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousDeliveryActionPerformed(evt);
            }
        });
        getContentPane().add(btnPreviousDelivery);
        btnPreviousDelivery.setBounds(40, 310, 140, 32);

        btnRefreshOrderline.setText("Refresh Orders");
        btnRefreshOrderline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshOrderlineActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefreshOrderline);
        btnRefreshOrderline.setBounds(380, 310, 150, 30);

        lblDeliveryID.setText("Order ID:");
        getContentPane().add(lblDeliveryID);
        lblDeliveryID.setBounds(50, 120, 60, 30);

        txtOrderID.setEditable(false);
        getContentPane().add(txtOrderID);
        txtOrderID.setBounds(110, 120, 140, 24);

        txtItem.setEditable(false);
        getContentPane().add(txtItem);
        txtItem.setBounds(310, 120, 220, 24);

        txtLocation.setEditable(false);
        getContentPane().add(txtLocation);
        txtLocation.setBounds(110, 150, 140, 24);

        txtRequestedBy.setEditable(false);
        getContentPane().add(txtRequestedBy);
        txtRequestedBy.setBounds(110, 180, 140, 24);

        txtBuilderID.setEditable(false);
        getContentPane().add(txtBuilderID);
        txtBuilderID.setBounds(310, 90, 110, 24);

        lvlCourierID.setText("Courier ID:");
        getContentPane().add(lvlCourierID);
        lvlCourierID.setBounds(40, 90, 60, 30);

        lblNotes.setText("Notes:");
        getContentPane().add(lblNotes);
        lblNotes.setBounds(260, 180, 50, 20);

        txtNotes.setEditable(false);
        txtNotes.setColumns(20);
        txtNotes.setRows(5);
        jScrollPane1.setViewportView(txtNotes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 180, 220, 120);

        lblStatus.setText("Status:");
        getContentPane().add(lblStatus);
        lblStatus.setBounds(260, 150, 40, 30);

        lblBuilder.setText("Builder:");
        getContentPane().add(lblBuilder);
        lblBuilder.setBounds(260, 90, 50, 30);

        jLabel1.setText("of");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 280, 20, 16);

        txtCourierID.setEditable(false);
        getContentPane().add(txtCourierID);
        txtCourierID.setBounds(110, 90, 70, 24);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(null);

        lblOrderIDSelected.setText("OrderID:");
        jPanel1.add(lblOrderIDSelected);
        lblOrderIDSelected.setBounds(10, 50, 50, 16);

        lblSelectedTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSelectedTitle.setText("Your Selected Delivery");
        jPanel1.add(lblSelectedTitle);
        lblSelectedTitle.setBounds(10, 10, 203, 24);

        btnConfirmDelivered.setText("Confirm Delivered");
        btnConfirmDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmDeliveredActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmDelivered);
        btnConfirmDelivered.setBounds(80, 270, 140, 32);

        txtOrderIDSelected.setEditable(false);
        jPanel1.add(txtOrderIDSelected);
        txtOrderIDSelected.setBounds(70, 50, 150, 24);

        txtLocationSelected.setEditable(false);
        jPanel1.add(txtLocationSelected);
        txtLocationSelected.setBounds(70, 80, 150, 24);

        txtWhenSelected.setEditable(false);
        jPanel1.add(txtWhenSelected);
        txtWhenSelected.setBounds(70, 110, 150, 24);

        txtItemSelected.setEditable(false);
        jPanel1.add(txtItemSelected);
        txtItemSelected.setBounds(70, 140, 150, 24);

        lblLocationSelected.setText("Location:");
        jPanel1.add(lblLocationSelected);
        lblLocationSelected.setBounds(10, 80, 52, 16);

        lblByWhen.setText("By when:");
        jPanel1.add(lblByWhen);
        lblByWhen.setBounds(10, 110, 60, 16);

        lblSelectedItem.setText("Item:");
        jPanel1.add(lblSelectedItem);
        lblSelectedItem.setBounds(10, 140, 30, 16);

        lblSelectedNotes.setText("Notes:");
        jPanel1.add(lblSelectedNotes);
        lblSelectedNotes.setBounds(10, 170, 36, 16);

        txtNotesSelected.setEditable(false);
        txtNotesSelected.setColumns(20);
        txtNotesSelected.setRows(5);
        jScrollPane2.setViewportView(txtNotesSelected);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(70, 170, 150, 83);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(560, 50, 230, 310);

        txtStatus.setEditable(false);
        getContentPane().add(txtStatus);
        txtStatus.setBounds(310, 150, 220, 24);

        lblItem.setText("Item:");
        getContentPane().add(lblItem);
        lblItem.setBounds(270, 120, 50, 30);

        lblAvailableDeliveries.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblAvailableDeliveries.setText("Available Deliveries");
        getContentPane().add(lblAvailableDeliveries);
        lblAvailableDeliveries.setBounds(180, 60, 190, 24);

        txtnum1.setEditable(false);
        getContentPane().add(txtnum1);
        txtnum1.setBounds(130, 270, 40, 24);

        txtnum2.setEditable(false);
        getContentPane().add(txtnum2);
        txtnum2.setBounds(200, 270, 40, 24);

        lblWhiteBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/whiteBackground.png"))); // NOI18N
        lblWhiteBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(lblWhiteBackground);
        lblWhiteBackground.setBounds(20, 50, 530, 310);

        lblBackground.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shutterstock_617032220.jpg"))); // NOI18N
        lblBackground.setToolTipText("");
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This button allows the user to return to home page
     */
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.dispose();
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPreviousDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousDeliveryActionPerformed
        if (currentIndex != 0) {
            currentIndex--;
            txtnum1.setText(Integer.toString(currentIndex + 1));
            //display the first students details                 
            String idText = Integer.toString(arrayOfOrders[currentIndex].getOrderID());
            txtOrderID.setText(idText);
            System.out.println("Set Order ID");
            txtRequestedBy.setText(arrayOfOrders[currentIndex].getDateRequired());
            System.out.println("Set date");
            txtNotes.setText(arrayOfOrders[currentIndex].getNotes());
            System.out.println("Set Notes");
            txtStatus.setText((arrayOfOrders[currentIndex].getStatus()));
            System.out.println("Set Status");

            //Broken down due to compile errors with netbeans
            int tempItemID = (arrayOfOrders[currentIndex].getItemID());
            int tempBuilderID = (arrayOfOrders[currentIndex].getBuilderID());
            int tempLocationID = (arrayOfOrders[currentIndex].getLocationID());

            String tempItemIDString = arrayOfItems[tempItemID - 1].getItemName();
            String tempBuilderIDString = Integer.toString(tempBuilderID);
            String tempLocationIDString = arrayOfLocations[tempLocationID - 1].getLocationName();

            txtItem.setText(tempItemIDString);
            System.out.println("Set item ID");
            txtBuilderID.setText(tempBuilderIDString);
            System.out.println("Set Builder ID");
            txtLocation.setText(tempLocationIDString);
            System.out.println("Set Location");

        }//if
    }//GEN-LAST:event_btnPreviousDeliveryActionPerformed

    private void btnRefreshOrderlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshOrderlineActionPerformed
        try {

            //set up array to store the data sent back from the DatabaseConnection             
            arrayOfOrders = databaseConnection.getAllOrders();
            //number of items in the array             
            numberOfRecords = databaseConnection.numRecordsInQuery;
            currentIndex = 0;
            if (numberOfRecords != 0) {

                //display the first Order details                 
                String idText = Integer.toString(arrayOfOrders[currentIndex].getOrderID());
                txtOrderID.setText(idText);
                System.out.println("Set Order ID");
                txtRequestedBy.setText(arrayOfOrders[currentIndex].getDateRequired());
                System.out.println("Set date");
                txtNotes.setText(arrayOfOrders[currentIndex].getNotes());
                System.out.println("Set Notes");
                txtStatus.setText((arrayOfOrders[currentIndex].getStatus()));
                System.out.println("Set Status");

                //Broken down due to compile errors with netbeans
                int tempItemID = (arrayOfOrders[currentIndex].getItemID());
                int tempBuilderID = (arrayOfOrders[currentIndex].getBuilderID());
                int tempLocationID = (arrayOfOrders[currentIndex].getLocationID());

                String tempItemIDString = arrayOfItems[tempItemID - 1].getItemName();
                String tempBuilderIDString = Integer.toString(tempBuilderID);
                String tempLocationIDString = arrayOfLocations[tempLocationID - 1].getLocationName();

                txtItem.setText(tempItemIDString);
                System.out.println("Set item ID");
                txtBuilderID.setText(tempBuilderIDString);
                System.out.println("Set Builder ID");
                txtLocation.setText(tempLocationIDString);
                System.out.println("Set Location");

                //display the current index for current and last record                 
                txtnum1.setText(Integer.toString(currentIndex + 1));
                txtnum2.setText(Integer.toString(numberOfRecords));

                //enable buttons to navigate through students                 
                btnNextDelivery.setEnabled(true);
                btnPreviousDelivery.setEnabled(true);
            }//if
        } catch (Exception ex) {
            ex.printStackTrace();
        }//catch
    }//GEN-LAST:event_btnRefreshOrderlineActionPerformed

    private void btnNextDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextDeliveryActionPerformed
        numberOfRecords = databaseConnection.numRecordsInQuery;
        //button will move to the record after current one         
        //if the last record is showing there will be no response         
        if (currentIndex < numberOfRecords - 1) {
            currentIndex++;
            txtnum1.setText(Integer.toString(currentIndex + 1));
            //display the order details at currentIndex             
            String idText = Integer.toString(arrayOfOrders[currentIndex].getOrderID());
            txtOrderID.setText(idText);
            System.out.println("Set Order ID");
            txtRequestedBy.setText(arrayOfOrders[currentIndex].getDateRequired());
            System.out.println("Set date");
            txtNotes.setText(arrayOfOrders[currentIndex].getNotes());
            System.out.println("Set Notes");
            txtStatus.setText((arrayOfOrders[currentIndex].getStatus()));
            System.out.println("Set Status");

            //Broken down due to compile errors with netbeans
            int tempItemID = (arrayOfOrders[currentIndex].getItemID());
            int tempBuilderID = (arrayOfOrders[currentIndex].getBuilderID());
            int tempLocationID = (arrayOfOrders[currentIndex].getLocationID());

            String tempItemIDString = arrayOfItems[tempItemID - 1].getItemName();
            String tempBuilderIDString = Integer.toString(tempBuilderID);
            String tempLocationIDString = arrayOfLocations[tempLocationID - 1].getLocationName();

            txtItem.setText(tempItemIDString);
            System.out.println("Set item ID");
            txtBuilderID.setText(tempBuilderIDString);
            System.out.println("Set Builder ID");
            txtLocation.setText(tempLocationIDString);
            System.out.println("Set Location");
        }//if
    }//GEN-LAST:event_btnNextDeliveryActionPerformed

    private void btnSelectDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectDeliveryActionPerformed
        int pos = currentIndex;
        String status = "Pending";
        boolean done = databaseConnection.updateOrder(Integer.parseInt(txtOrderID.getText()), status);
        if (done) {
            JOptionPane.showMessageDialog(this, "Order Selected, status set to Pending", "updated Record", JOptionPane.PLAIN_MESSAGE);
            //add information to YOUR SELECTED DELIVERY
            txtOrderIDSelected.setText(txtOrderID.getText());
            txtLocationSelected.setText(txtLocation.getText());
            txtWhenSelected.setText(txtRequestedBy.getText());
            txtItemSelected.setText(txtItem.getText());
            txtNotesSelected.setText(txtNotes.getText());

            //reload the records by calling the refreshbutton method with the event  
            btnRefreshOrderlineActionPerformed(evt);

            currentIndex = pos;
            String idText = Integer.toString(arrayOfOrders[currentIndex].getOrderID());
            txtOrderID.setText(idText);
            System.out.println("Set Order ID");
            txtRequestedBy.setText(arrayOfOrders[currentIndex].getDateRequired());
            System.out.println("Set date");
            txtNotes.setText(arrayOfOrders[currentIndex].getNotes());
            System.out.println("Set Notes");
            txtStatus.setText((arrayOfOrders[currentIndex].getStatus()));
            System.out.println("Set Status");

            //Broken down due to compile errors with netbeans
            int tempItemID = (arrayOfOrders[currentIndex].getItemID());
            int tempBuilderID = (arrayOfOrders[currentIndex].getBuilderID());
            int tempLocationID = (arrayOfOrders[currentIndex].getLocationID());

            String tempItemIDString = arrayOfItems[tempItemID - 1].getItemName();
            String tempBuilderIDString = Integer.toString(tempBuilderID);
            String tempLocationIDString = arrayOfLocations[tempLocationID - 1].getLocationName();

            txtItem.setText(tempItemIDString);
            System.out.println("Set item ID");
            txtBuilderID.setText(tempBuilderIDString);
            System.out.println("Set Builder ID");
            txtLocation.setText(tempLocationIDString);
            System.out.println("Set Location");

            //display the current index for current and last record                 
            txtnum1.setText(Integer.toString(currentIndex + 1));

            //add information to YOUR SELECTED DELIVERY
        } else {
            JOptionPane.showMessageDialog(this, "Order not Deleted", "Error", JOptionPane.PLAIN_MESSAGE);
        }//else
    }//GEN-LAST:event_btnSelectDeliveryActionPerformed

    private void btnConfirmDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmDeliveredActionPerformed
        int pos = currentIndex;
        String status = "Complete";
        boolean done = databaseConnection.updateOrder(Integer.parseInt(txtOrderIDSelected.getText()), status);
        if (done) {
            JOptionPane.showMessageDialog(this, "Order Completed, status set to Complete", "updated Record", JOptionPane.PLAIN_MESSAGE);
            //add information to YOUR SELECTED DELIVERY
            txtOrderIDSelected.setText("");
            txtLocationSelected.setText("");
            txtWhenSelected.setText("");
            txtItemSelected.setText("");
            txtNotesSelected.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Error Order not delivered", "Error", JOptionPane.PLAIN_MESSAGE);
        }//else
    }//GEN-LAST:event_btnConfirmDeliveredActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCourier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCourier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCourier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCourier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCourier().setVisible(true);

            }
        });
    }//main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmDelivered;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnNextDelivery;
    private javax.swing.JButton btnPreviousDelivery;
    private javax.swing.JButton btnRefreshOrderline;
    private javax.swing.JButton btnSelectDelivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAvailableDeliveries;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBuilder;
    private javax.swing.JLabel lblByWhen;
    private javax.swing.JLabel lblDeliveryID;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblLocationSelected;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JLabel lblOrderIDSelected;
    private javax.swing.JLabel lblRequestedBy;
    private javax.swing.JLabel lblSelectedItem;
    private javax.swing.JLabel lblSelectedNotes;
    private javax.swing.JLabel lblSelectedTitle;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWhiteBackground;
    private javax.swing.JLabel lvlCourierID;
    private javax.swing.JTextField txtBuilderID;
    private javax.swing.JTextField txtCourierID;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtItemSelected;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtLocationSelected;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextArea txtNotesSelected;
    private javax.swing.JTextField txtOrderID;
    private javax.swing.JTextField txtOrderIDSelected;
    private javax.swing.JTextField txtRequestedBy;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtWhenSelected;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}
