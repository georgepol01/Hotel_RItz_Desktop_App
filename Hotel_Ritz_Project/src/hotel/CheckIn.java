package hotel;

import static hotel.CheckOut.resList;
import static hotel.Rooms.rList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import static javax.swing.JOptionPane.showMessageDialog;

public class CheckIn extends javax.swing.JFrame {

    public CheckIn() {
        initComponents();
        checkinDateField.setText(String.valueOf(dtf.format(date)));
        checkinRtypeComboBox.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hotelNameLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        checkinNameLabel = new javax.swing.JLabel();
        checkinPhoneLabel = new javax.swing.JLabel();
        checkinEmailLabel = new javax.swing.JLabel();
        checkinRtypeLabel = new javax.swing.JLabel();
        checkinRoomLabel = new javax.swing.JLabel();
        checkinClearButton = new javax.swing.JButton();
        checkinButton = new javax.swing.JButton();
        checkinNameField = new javax.swing.JTextField();
        checkinPhoneField = new javax.swing.JTextField();
        checkinEmailField = new javax.swing.JTextField();
        checkinPriceLabel = new javax.swing.JLabel();
        checkinPriceField = new javax.swing.JTextField();
        checkinRoomComboBox = new javax.swing.JComboBox<>();
        checkinRtypeComboBox = new javax.swing.JComboBox<>();
        checkinDateLabel = new javax.swing.JLabel();
        checkinDateField = new javax.swing.JTextField();
        checkinIdField = new javax.swing.JTextField();
        checkinIdLabel = new javax.swing.JLabel();
        ckeckinBackButton = new javax.swing.JButton();
        backhroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        hotelNameLabel.setText("Check in");

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(logoLabel)
                .addGap(553, 553, 553)
                .addComponent(hotelNameLabel)
                .addContainerGap(700, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(logoLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(hotelNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1600, 100);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(1600, 800));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255,100));

        checkinNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinNameLabel.setText("Name");

        checkinPhoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinPhoneLabel.setText("Phone");

        checkinEmailLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinEmailLabel.setText("Email");

        checkinRtypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinRtypeLabel.setText("Room Type");

        checkinRoomLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinRoomLabel.setText("Room");

        checkinClearButton.setBackground(new java.awt.Color(114, 64, 13));
        checkinClearButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinClearButton.setForeground(new java.awt.Color(255, 172, 90));
        checkinClearButton.setText("Clear Fields");
        checkinClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinClearButtonActionPerformed(evt);
            }
        });

        checkinButton.setBackground(new java.awt.Color(255, 172, 90));
        checkinButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinButton.setForeground(new java.awt.Color(114, 64, 13));
        checkinButton.setText("Check In");
        checkinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinButtonActionPerformed(evt);
            }
        });

        checkinNameField.setBackground(new java.awt.Color(255, 255, 255));
        checkinNameField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkinPhoneField.setBackground(new java.awt.Color(255, 255, 255));
        checkinPhoneField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkinEmailField.setBackground(new java.awt.Color(255, 255, 255));
        checkinEmailField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkinPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinPriceLabel.setText("Price/Day");

        checkinPriceField.setEditable(false);
        checkinPriceField.setBackground(new java.awt.Color(255, 255, 255));
        checkinPriceField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkinRoomComboBox.setBackground(new java.awt.Color(255, 255, 255));
        checkinRoomComboBox.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinRoomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinRoomComboBoxActionPerformed(evt);
            }
        });

        checkinRtypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        checkinRtypeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinRtypeComboBox.setForeground(new java.awt.Color(0, 0, 0));
        checkinRtypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room", "Double Room", "Studio Room", "Deluxe Room", "Suite", "Presidential Suite" }));
        checkinRtypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinRtypeComboBoxActionPerformed(evt);
            }
        });

        checkinDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinDateLabel.setText("Check In Date");

        checkinDateField.setEditable(false);
        checkinDateField.setBackground(new java.awt.Color(255, 255, 255));
        checkinDateField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkinIdField.setBackground(new java.awt.Color(255, 255, 255));
        checkinIdField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        checkinIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        checkinIdLabel.setText("ID Proof");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkinDateLabel)
                    .addComponent(checkinRtypeLabel)
                    .addComponent(checkinEmailLabel)
                    .addComponent(checkinPhoneLabel)
                    .addComponent(checkinNameLabel)
                    .addComponent(checkinRoomLabel)
                    .addComponent(checkinPriceLabel)
                    .addComponent(checkinIdLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkinNameField)
                    .addComponent(checkinPhoneField)
                    .addComponent(checkinEmailField)
                    .addComponent(checkinRoomComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkinRtypeComboBox, 0, 212, Short.MAX_VALUE)
                    .addComponent(checkinIdField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkinPriceField)
                    .addComponent(checkinDateField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkinClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinNameLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinIdLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinPhoneLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinRtypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinRtypeLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinRoomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinRoomLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkinDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkinDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(checkinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkinClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        checkinClearButton.setFocusPainted(false);
        checkinButton.setFocusPainted(false);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(160, 50, 470, 670);

        ckeckinBackButton.setBackground(new java.awt.Color(255, 172, 90));
        ckeckinBackButton.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        ckeckinBackButton.setForeground(new java.awt.Color(114, 64, 13));
        ckeckinBackButton.setText("Back");
        ckeckinBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckeckinBackButtonActionPerformed(evt);
            }
        });
        jPanel3.add(ckeckinBackButton);
        ckeckinBackButton.setBounds(1390, 650, 150, 60);

        backhroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reservations.jpg"))); // NOI18N
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

    private void ckeckinBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckeckinBackButtonActionPerformed
        MainMenu mainFrame = new MainMenu();
        mainFrame.show();
        dispose();
    }//GEN-LAST:event_ckeckinBackButtonActionPerformed

    private void checkinClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinClearButtonActionPerformed
        checkinNameField.setText("");
        checkinIdField.setText("");
        checkinPhoneField.setText("");
        checkinEmailField.setText("");
        checkinRtypeComboBox.setSelectedIndex(-1);
        checkinRoomComboBox.setSelectedIndex(-1);
        checkinPriceField.setText("");
    }//GEN-LAST:event_checkinClearButtonActionPerformed

    private void checkinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinButtonActionPerformed
                try{
                            String name = checkinNameField.getText();
                            String id = checkinIdField.getText();
                            String phone = checkinPhoneField.getText();
                            String email = checkinEmailField.getText();
                            String room = String.valueOf(checkinRoomComboBox.getSelectedItem());
                            boolean flag = false;
                            boolean flag2 = false;
                            for(int i=0; i<resList.size(); i++){
                                    DataReservations resl = (DataReservations)resList.get(i);
                                    String temp = String.valueOf(resl.getClient().getIdProof());
                                    if(temp.equals(id)&& flag == false){
                                        flag = true;
                                        showMessageDialog(null, "This ID Proof already exists!");
                                    }
                             }
                            if(flag == false && !"".equals(name) && !"".equals(id) && !"".equals(phone) && !"".equals(email)){
                                          int index = 0;
                                          for(int i=0; i<rList.size(); i++){
                                                    DataRooms rl = (DataRooms)rList.get(i);
                                                    if(rl.getRoomNo() == Integer.parseInt(room)){
                                                        index = i;
                                                    }
                                          }
                                         DataReservations resl = (DataReservations)resList.getLast();
                                         int last = resl.getResId();
                                        resList.addLast(new DataReservations(last+1,new DataClients(cList.size()+1,name,id,phone,email), (DataRooms) rList.get(index),checkinDateField.getText(),"",0,0));
                                        showMessageDialog(null, "Success!");
                                        checkinNameField.setText("");
                                        checkinIdField.setText("");
                                        checkinPhoneField.setText("");
                                        checkinEmailField.setText("");
                                        checkinRtypeComboBox.setSelectedIndex(-1);
                                        checkinRoomComboBox.setSelectedIndex(-1);
                                        checkinPriceField.setText("");
                            }else{
                                 showMessageDialog(null, "Input fields not valid!");
                            }
                }catch (IllegalArgumentException e) {
                              showMessageDialog(null, "Input fields not valid!");
               }
    }//GEN-LAST:event_checkinButtonActionPerformed

    private void checkinRtypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinRtypeComboBoxActionPerformed
        String type = String.valueOf(checkinRtypeComboBox.getSelectedItem());
        checkinRoomComboBox.removeAllItems();;
        for(int i=0; i<Rooms.rList.size(); i++){
                DataRooms rl = (DataRooms)rList.get(i);
                if(rl.getType().equals(type) && rl.getStatus().equalsIgnoreCase("Not Reserved")){
                    checkinRoomComboBox.addItem(String.valueOf(rl.getRoomNo()));
                 }
        }
    }//GEN-LAST:event_checkinRtypeComboBoxActionPerformed

    private void checkinRoomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinRoomComboBoxActionPerformed
         String room = String.valueOf(checkinRoomComboBox.getSelectedItem());
        for(int i=0; i<Rooms.rList.size(); i++){
                DataRooms rl = (DataRooms)rList.get(i);
                if(String.valueOf(rl.getRoomNo()).equals(room)){
                    checkinPriceField.setText(String.valueOf(rl.getPrice()));
                 }
        }
    }//GEN-LAST:event_checkinRoomComboBoxActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }
    
     static LinkedList cList = new LinkedList();
     LocalDate date = LocalDate.now();
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backhroundLabel;
    private javax.swing.JButton checkinButton;
    private javax.swing.JButton checkinClearButton;
    private javax.swing.JTextField checkinDateField;
    private javax.swing.JLabel checkinDateLabel;
    private javax.swing.JTextField checkinEmailField;
    private javax.swing.JLabel checkinEmailLabel;
    private javax.swing.JTextField checkinIdField;
    private javax.swing.JLabel checkinIdLabel;
    private javax.swing.JTextField checkinNameField;
    private javax.swing.JLabel checkinNameLabel;
    private javax.swing.JTextField checkinPhoneField;
    private javax.swing.JLabel checkinPhoneLabel;
    private javax.swing.JTextField checkinPriceField;
    private javax.swing.JLabel checkinPriceLabel;
    private javax.swing.JComboBox<String> checkinRoomComboBox;
    private javax.swing.JLabel checkinRoomLabel;
    private javax.swing.JComboBox<String> checkinRtypeComboBox;
    private javax.swing.JLabel checkinRtypeLabel;
    private javax.swing.JButton ckeckinBackButton;
    private javax.swing.JLabel hotelNameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables
}
