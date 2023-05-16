package hotel;

import java.util.LinkedList;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class Rooms extends javax.swing.JFrame {

    public Rooms() {
        initComponents();
        refreshRoomsTable();
        roomsTypeComboBox.setSelectedIndex(-1);
        roomsStausComboBox.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hotelNameLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        roomsRoomLabel = new javax.swing.JLabel();
        roomsTypeLabel = new javax.swing.JLabel();
        roomsPriceLabel = new javax.swing.JLabel();
        roomsStatusLabel = new javax.swing.JLabel();
        roomsClearButton = new javax.swing.JButton();
        roomsAddButton = new javax.swing.JButton();
        roomsRemoveButton = new javax.swing.JButton();
        roomsRoomField = new javax.swing.JTextField();
        roomsPriceField = new javax.swing.JTextField();
        roomsTypeComboBox = new javax.swing.JComboBox<>();
        roomsStausComboBox = new javax.swing.JComboBox<>();
        RoomsBackButton = new javax.swing.JButton();
        backhroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(114, 64, 13));
        jPanel2.setForeground(new java.awt.Color(255, 204, 153));

        hotelNameLabel.setFont(new java.awt.Font("Bell MT", 0, 55)); // NOI18N
        hotelNameLabel.setForeground(new java.awt.Color(255, 204, 153));
        hotelNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotelNameLabel.setText("Rooms");

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(logoLabel)
                .addGap(571, 571, 571)
                .addComponent(hotelNameLabel)
                .addContainerGap(723, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(logoLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(hotelNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1600, 102);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(1600, 800));
        jPanel3.setLayout(null);

        roomsTable.setBackground(new java.awt.Color(204, 204, 204));
        roomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Type", "Pricer/day", "Status"
            }
        ));
        jScrollPane1.setViewportView(roomsTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(620, 70, 910, 380);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255,100));

        roomsRoomLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsRoomLabel.setText("Room");

        roomsTypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsTypeLabel.setText("Type");

        roomsPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsPriceLabel.setText("Price per Day");

        roomsStatusLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsStatusLabel.setText("Status");

        roomsClearButton.setBackground(new java.awt.Color(114, 64, 13));
        roomsClearButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsClearButton.setForeground(new java.awt.Color(255, 172, 90));
        roomsClearButton.setText("Clear Fields");
        roomsClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsClearButtonActionPerformed(evt);
            }
        });

        roomsAddButton.setBackground(new java.awt.Color(255, 172, 90));
        roomsAddButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsAddButton.setForeground(new java.awt.Color(114, 64, 13));
        roomsAddButton.setText("Add");
        roomsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsAddButtonActionPerformed(evt);
            }
        });

        roomsRemoveButton.setBackground(new java.awt.Color(255, 172, 90));
        roomsRemoveButton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsRemoveButton.setForeground(new java.awt.Color(114, 64, 13));
        roomsRemoveButton.setText("Remove");
        roomsRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsRemoveButtonActionPerformed(evt);
            }
        });

        roomsRoomField.setBackground(new java.awt.Color(255, 255, 255));
        roomsRoomField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        roomsPriceField.setBackground(new java.awt.Color(255, 255, 255));
        roomsPriceField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        roomsTypeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        roomsTypeComboBox.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsTypeComboBox.setForeground(new java.awt.Color(0, 0, 0));
        roomsTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room", "Double Room", "Studio Room", "Deluxe Room", "Suite", "Presidential Suite" }));
        roomsTypeComboBox.setToolTipText("");

        roomsStausComboBox.setBackground(new java.awt.Color(255, 255, 255));
        roomsStausComboBox.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        roomsStausComboBox.setForeground(new java.awt.Color(0, 0, 0));
        roomsStausComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reserved", "Not Reserved" }));
        roomsStausComboBox.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(roomsStatusLabel)
                                    .addComponent(roomsPriceLabel)
                                    .addComponent(roomsTypeLabel)
                                    .addComponent(roomsRoomLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roomsRoomField)
                                    .addComponent(roomsPriceField)
                                    .addComponent(roomsTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roomsStausComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(roomsAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(roomsRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roomsClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomsRoomLabel)
                    .addComponent(roomsRoomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomsTypeLabel)
                    .addComponent(roomsTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomsPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomsStausComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomsStatusLabel))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomsAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomsRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(roomsClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        roomsClearButton.setFocusPainted(false);
        roomsAddButton.setFocusPainted(false);
        roomsRemoveButton.setFocusPainted(false);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(130, 70, 430, 480);

        RoomsBackButton.setBackground(new java.awt.Color(255, 172, 90));
        RoomsBackButton.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        RoomsBackButton.setForeground(new java.awt.Color(114, 64, 13));
        RoomsBackButton.setText("Back");
        RoomsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsBackButtonActionPerformed(evt);
            }
        });
        jPanel3.add(RoomsBackButton);
        RoomsBackButton.setBounds(1380, 630, 150, 60);

        backhroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Room.jpg"))); // NOI18N
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

    private void RoomsBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsBackButtonActionPerformed
        MainMenu mainFrame = new MainMenu();
        mainFrame.show();
        dispose();
    }//GEN-LAST:event_RoomsBackButtonActionPerformed

    private void roomsClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsClearButtonActionPerformed
        roomsRoomField.setText("");
        roomsTypeComboBox.setSelectedIndex(-1);
        roomsPriceField.setText("");
        roomsStausComboBox.setSelectedIndex(-1);
    }//GEN-LAST:event_roomsClearButtonActionPerformed

    private void roomsRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsRemoveButtonActionPerformed
                try{
                            int room = Integer.parseInt(roomsRoomField.getText());
                            boolean flag = false;
                            for(int i=0; i<rList.size(); i++){
                                    DataRooms rl = (DataRooms)rList.get(i);
                                    if(rl.getRoomNo() == room && rl.getStatus().equalsIgnoreCase("Not Reserved") && flag == false){
                                        flag = true;
                                        rList.remove(i);
                                        showMessageDialog(null, "Success!");
                                    }
                             }
                            if(flag == false){
                                showMessageDialog(null, "Room number is not valid or currently reserved!");
                            }
                            refreshRoomsTable();
        
                    }catch (NumberFormatException e) {
                                  showMessageDialog(null, "Input fields not valid!");
                   }
    }//GEN-LAST:event_roomsRemoveButtonActionPerformed

    private void roomsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsAddButtonActionPerformed
                try{
                            int room = Integer.valueOf(roomsRoomField.getText());
                            String type = String.valueOf(roomsTypeComboBox.getSelectedItem());
                            int price = Integer.valueOf(roomsPriceField.getText());
                            String status = String.valueOf(roomsStausComboBox.getSelectedItem());
                            boolean flag = false;
                            for(int i=0; i<rList.size(); i++){
                                    DataRooms rl = (DataRooms)rList.get(i);
                                    if(rl.getRoomNo() == room && flag == false){
                                        flag = true;
                                    }
                             }
                            if(flag == false){
                                        rList.addLast( new DataRooms(room,type,price,status));
                                        showMessageDialog(null, "Success!");
                            }else{
                                         showMessageDialog(null, "This room number already exists!");
                            }
                            refreshRoomsTable();
        
                }catch (NumberFormatException e) {
                              showMessageDialog(null, "Input fields not valid!");
               }
    }//GEN-LAST:event_roomsAddButtonActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }
    
    
    public void refreshRoomsTable(){
        DefaultTableModel model = (DefaultTableModel) Rooms.roomsTable.getModel();
        model.setRowCount(0);
         for(int i=0; i<rList.size(); i++){
               DataRooms rl = (DataRooms)rList.get(i);
               
               String room = String.valueOf(rl.getRoomNo());
               String type = rl.getType();
               String price = String.valueOf(rl.getPrice());
               String status = rl.getStatus();

               String tbData [] = {room,type,price,status};
               model.addRow(tbData);
        }
    }
     static LinkedList rList =new LinkedList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RoomsBackButton;
    private javax.swing.JLabel backhroundLabel;
    private javax.swing.JLabel hotelNameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton roomsAddButton;
    private javax.swing.JButton roomsClearButton;
    private javax.swing.JTextField roomsPriceField;
    private javax.swing.JLabel roomsPriceLabel;
    private javax.swing.JButton roomsRemoveButton;
    private javax.swing.JTextField roomsRoomField;
    private javax.swing.JLabel roomsRoomLabel;
    private javax.swing.JLabel roomsStatusLabel;
    private javax.swing.JComboBox<String> roomsStausComboBox;
    public static javax.swing.JTable roomsTable;
    private javax.swing.JComboBox<String> roomsTypeComboBox;
    private javax.swing.JLabel roomsTypeLabel;
    // End of variables declaration//GEN-END:variables
}
