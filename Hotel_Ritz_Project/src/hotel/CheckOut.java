package hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class CheckOut extends javax.swing.JFrame {

    public CheckOut() {
        initComponents();
        refreshCheckOutTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hotelNameLabel = new javax.swing.JLabel();
        λογοΛαβελ = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkoutTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        checkoutCheckInLabel = new javax.swing.JLabel();
        checkoutCheckoutLabel = new javax.swing.JLabel();
        checkoutPriceLabel = new javax.swing.JLabel();
        checkoutDaysStayedLabel = new javax.swing.JLabel();
        checkoutTotalAmountLAbel = new javax.swing.JLabel();
        checkoutClearButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        checkoutEmailField = new javax.swing.JTextField();
        checkoutChekOutField = new javax.swing.JTextField();
        checkoutPriceField = new javax.swing.JTextField();
        checkoutDaysField = new javax.swing.JTextField();
        checkoutTotalAmountField = new javax.swing.JTextField();
        checkoutPhoneField = new javax.swing.JTextField();
        checkoutCheckInField = new javax.swing.JTextField();
        checkoutRoomField = new javax.swing.JTextField();
        checkoutEmailLabel = new javax.swing.JLabel();
        checkoutPhoneLabel = new javax.swing.JLabel();
        checkoutNameLabel = new javax.swing.JLabel();
        checkoutSearchButton = new javax.swing.JButton();
        checkoutNameField = new javax.swing.JTextField();
        checkoutRoomLabel = new javax.swing.JLabel();
        checkoutIdproofLabel = new javax.swing.JLabel();
        checkoutIdproofField = new javax.swing.JTextField();
        checkoutBackButton = new javax.swing.JButton();
        backhroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(114, 64, 13));
        jPanel2.setForeground(new java.awt.Color(255, 204, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(1600, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(1600, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(1600, 100));

        hotelNameLabel.setFont(new java.awt.Font("Bell MT", 0, 55)); // NOI18N
        hotelNameLabel.setForeground(new java.awt.Color(255, 204, 153));
        hotelNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotelNameLabel.setText("Check Out");

        λογοΛαβελ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(λογοΛαβελ)
                .addGap(527, 527, 527)
                .addComponent(hotelNameLabel)
                .addContainerGap(682, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(λογοΛαβελ))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(hotelNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1600, 100);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(1600, 800));
        jPanel3.setPreferredSize(new java.awt.Dimension(1600, 800));
        jPanel3.setLayout(null);

        checkoutTable.setBackground(new java.awt.Color(204, 204, 204));
        checkoutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Client Name", "ID proof", "Phone", "Email", "Check In", "Room", "Type", "Price?Day"
            }
        ));
        jScrollPane1.setViewportView(checkoutTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(620, 40, 920, 400);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255,100));

        checkoutCheckInLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutCheckInLabel.setText("Check In Date");

        checkoutCheckoutLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutCheckoutLabel.setText("Check Out Date");

        checkoutPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutPriceLabel.setText("Price/Day");

        checkoutDaysStayedLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutDaysStayedLabel.setText("Days Stayed");

        checkoutTotalAmountLAbel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutTotalAmountLAbel.setText("Total Amount");

        checkoutClearButton.setBackground(new java.awt.Color(114, 64, 13));
        checkoutClearButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutClearButton.setForeground(new java.awt.Color(255, 172, 90));
        checkoutClearButton.setText("Clear Fields");
        checkoutClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutClearButtonActionPerformed(evt);
            }
        });

        checkoutButton.setBackground(new java.awt.Color(255, 172, 90));
        checkoutButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutButton.setForeground(new java.awt.Color(114, 64, 13));
        checkoutButton.setText("Check Out");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        checkoutEmailField.setEditable(false);
        checkoutEmailField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutEmailField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutChekOutField.setEditable(false);
        checkoutChekOutField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutChekOutField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutPriceField.setEditable(false);
        checkoutPriceField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutPriceField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutDaysField.setEditable(false);
        checkoutDaysField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutDaysField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutTotalAmountField.setEditable(false);
        checkoutTotalAmountField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutTotalAmountField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutPhoneField.setEditable(false);
        checkoutPhoneField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutPhoneField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutCheckInField.setEditable(false);
        checkoutCheckInField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutCheckInField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutRoomField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutRoomField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutEmailLabel.setText("Email");

        checkoutPhoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutPhoneLabel.setText("Phone");

        checkoutNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutNameLabel.setText("Name");

        checkoutSearchButton.setBackground(new java.awt.Color(153, 25, 5));
        checkoutSearchButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutSearchButton.setForeground(new java.awt.Color(0, 0, 0));
        checkoutSearchButton.setText("Search");
        checkoutSearchButton.setFocusPainted(false);
        checkoutSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutSearchButtonActionPerformed(evt);
            }
        });

        checkoutNameField.setEditable(false);
        checkoutNameField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutNameField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkoutRoomLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutRoomLabel.setText("Room");

        checkoutIdproofLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkoutIdproofLabel.setText("ID Proof");

        checkoutIdproofField.setEditable(false);
        checkoutIdproofField.setBackground(new java.awt.Color(255, 255, 255));
        checkoutIdproofField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkoutDaysStayedLabel)
                                    .addComponent(checkoutCheckoutLabel)
                                    .addComponent(checkoutTotalAmountLAbel)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(checkoutCheckInLabel)
                                        .addGap(8, 8, 8))
                                    .addComponent(checkoutEmailLabel)
                                    .addComponent(checkoutPhoneLabel)
                                    .addComponent(checkoutNameLabel)
                                    .addComponent(checkoutPriceLabel)
                                    .addComponent(checkoutIdproofLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkoutEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(checkoutChekOutField)
                                    .addComponent(checkoutPriceField)
                                    .addComponent(checkoutDaysField)
                                    .addComponent(checkoutTotalAmountField)
                                    .addComponent(checkoutPhoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(checkoutCheckInField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(checkoutNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(checkoutIdproofField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkoutClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(checkoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(73, 73, 73))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(checkoutRoomLabel)
                        .addGap(18, 18, 18)
                        .addComponent(checkoutRoomField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkoutSearchButton)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutRoomLabel)
                    .addComponent(checkoutRoomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkoutNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkoutNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutIdproofLabel)
                    .addComponent(checkoutIdproofField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutPhoneLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutEmailLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutCheckInField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutCheckInLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutChekOutField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutCheckoutLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutDaysField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutDaysStayedLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutTotalAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutTotalAmountLAbel))
                .addGap(31, 31, 31)
                .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkoutClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        checkoutClearButton.setFocusPainted(false);
        checkoutButton.setFocusPainted(false);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(120, 40, 440, 720);

        checkoutBackButton.setBackground(new java.awt.Color(255, 172, 90));
        checkoutBackButton.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        checkoutBackButton.setForeground(new java.awt.Color(114, 64, 13));
        checkoutBackButton.setText("Back");
        checkoutBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBackButtonActionPerformed(evt);
            }
        });
        jPanel3.add(checkoutBackButton);
        checkoutBackButton.setBounds(1390, 640, 150, 60);

        backhroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clients.jpg"))); // NOI18N
        jPanel3.add(backhroundLabel);
        backhroundLabel.setBounds(0, 0, 1600, 800);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 1600, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBackButtonActionPerformed
        MainMenu mainFrame = new MainMenu();
        mainFrame.show();
        dispose();
    }//GEN-LAST:event_checkoutBackButtonActionPerformed

    private void checkoutClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutClearButtonActionPerformed
        checkoutRoomField.setText("");
        checkoutNameField.setText("");
        checkoutIdproofField.setText("");
        checkoutPhoneField.setText("");
        checkoutEmailField.setText("");
        checkoutCheckInField.setText("");
        checkoutChekOutField.setText("");
        checkoutPriceField.setText("");
        checkoutDaysField.setText("");
        checkoutTotalAmountField.setText("");
    }//GEN-LAST:event_checkoutClearButtonActionPerformed

    private void checkoutSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutSearchButtonActionPerformed
            try{
                        int room = Integer.parseInt(checkoutRoomField.getText());
                        int temp = 0;
                        boolean flag = false;
                        long diff = 0;
                        for(int i=0; i<resList.size(); i++){
                                DataReservations resl = (DataReservations)resList.get(i);
                                temp = resl.getRoom().getRoomNo();
                                if(temp == room && flag == false){
                                    flag = true;
                                    String checkout = dtf.format(date);
                                    LocalDate checkin = LocalDate.parse(resl.getCheckIn(),dtf);
                                    diff =ChronoUnit.DAYS.between(checkin, date);
                                    if(diff < 0){
                                        diff=diff*-1;
                                    }
                                    checkoutNameField.setText(resl.getClient().getName());
                                    checkoutIdproofField.setText(resl.getClient().getIdProof());
                                    checkoutPhoneField.setText(resl.getClient().getPhone());
                                    checkoutEmailField.setText(resl.getClient().getEmail());
                                    checkoutCheckInField.setText(resl.getCheckIn());
                                    checkoutChekOutField.setText(checkout);
                                    checkoutPriceField.setText(String.valueOf(resl.getRoom().getPrice()));
                                    checkoutDaysField.setText(String.valueOf(diff));
                                    checkoutTotalAmountField.setText(String.valueOf(diff * resl.getRoom().getPrice()));
                                    showMessageDialog(null, "Reservation details found!");
                                }
                         }
                        if(flag == false){
                                    showMessageDialog(null, "Reservation for that Room does not exist!");
                                }
                 }catch (IllegalArgumentException e) {
                                  showMessageDialog(null, "Input fields not valid!");
                 }
    }//GEN-LAST:event_checkoutSearchButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
                try{
                                int room = Integer.parseInt(checkoutRoomField.getText());
                                boolean flag = false;
                                for(int i=0; i<resList.size(); i++){
                                        DataReservations resl = (DataReservations)resList.get(i);
                                        int temp = resl.getRoom().getRoomNo();
                                        if(temp == room && flag == false){
                                            flag = true;
                                            resList.remove(i);
                                            showMessageDialog(null, "Check Out completed!");
                                            checkoutRoomField.setText("");
                                            checkoutNameField.setText("");
                                            checkoutIdproofField.setText("");
                                            checkoutPhoneField.setText("");
                                            checkoutEmailField.setText("");
                                            checkoutCheckInField.setText("");
                                            checkoutChekOutField.setText("");
                                            checkoutPriceField.setText("");
                                            checkoutDaysField.setText("");
                                            checkoutTotalAmountField.setText("");
                                        }
                                 }
                           refreshCheckOutTable();
                        }catch (IllegalArgumentException e) {
                                         showMessageDialog(null, "Input fields not valid!");
                        }
    }//GEN-LAST:event_checkoutButtonActionPerformed
     
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut().setVisible(true);
            }
        });
    }
    
    public void refreshCheckOutTable(){
         DefaultTableModel model = (DefaultTableModel) CheckOut.checkoutTable.getModel();
         model.setRowCount(0);
         for(int i=0; i<resList.size(); i++){
               DataReservations resl = (DataReservations)resList.get(i);
               
               String resid = String.valueOf(resl.getResId());
               String name =resl.getClient().getName();
               String idproof = resl.getClient().getIdProof();
               String phone = resl.getClient().getPhone();
               String email = resl.getClient().getEmail();
               String checkin = resl.getCheckIn();
               String room = String.valueOf(resl.getRoom().getRoomNo());
               String type = resl.getRoom().getType();
               String price = String.valueOf(resl.getRoom().getPrice());

               String tbData [] = {resid,name,idproof,phone,email,checkin,room,type,price,};
               model.addRow(tbData);
        }
    }
    
     static LinkedList resList =new LinkedList();
     LocalDate date = LocalDate.now();
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backhroundLabel;
    private javax.swing.JButton checkoutBackButton;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JTextField checkoutCheckInField;
    private javax.swing.JLabel checkoutCheckInLabel;
    private javax.swing.JLabel checkoutCheckoutLabel;
    private javax.swing.JTextField checkoutChekOutField;
    private javax.swing.JButton checkoutClearButton;
    private javax.swing.JTextField checkoutDaysField;
    private javax.swing.JLabel checkoutDaysStayedLabel;
    private javax.swing.JTextField checkoutEmailField;
    private javax.swing.JLabel checkoutEmailLabel;
    private javax.swing.JTextField checkoutIdproofField;
    private javax.swing.JLabel checkoutIdproofLabel;
    private javax.swing.JTextField checkoutNameField;
    private javax.swing.JLabel checkoutNameLabel;
    private javax.swing.JTextField checkoutPhoneField;
    private javax.swing.JLabel checkoutPhoneLabel;
    private javax.swing.JTextField checkoutPriceField;
    private javax.swing.JLabel checkoutPriceLabel;
    private javax.swing.JTextField checkoutRoomField;
    private javax.swing.JLabel checkoutRoomLabel;
    private javax.swing.JButton checkoutSearchButton;
    public static javax.swing.JTable checkoutTable;
    private javax.swing.JTextField checkoutTotalAmountField;
    private javax.swing.JLabel checkoutTotalAmountLAbel;
    private javax.swing.JLabel hotelNameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel λογοΛαβελ;
    // End of variables declaration//GEN-END:variables
}
