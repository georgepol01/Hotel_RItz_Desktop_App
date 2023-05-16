package hotel;

import static hotel.CheckIn.cList;
import static hotel.CheckOut.resList;
import static hotel.Rooms.rList;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hotelNameLabel = new javax.swing.JLabel();
        loginUserLabel = new javax.swing.JLabel();
        loginPassLabel = new javax.swing.JLabel();
        loginUserField = new javax.swing.JTextField();
        loginPassField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ritz Hotel");
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));

        jPanel1.setMaximumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1600, 900));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,180));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 600));

        hotelNameLabel.setFont(new java.awt.Font("Bell MT", 0, 40)); // NOI18N
        hotelNameLabel.setForeground(new java.awt.Color(150, 114, 2));
        hotelNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotelNameLabel.setText("RITZ HOTEL");

        loginUserLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        loginUserLabel.setForeground(new java.awt.Color(0, 0, 0));
        loginUserLabel.setText("Username");

        loginPassLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        loginPassLabel.setForeground(new java.awt.Color(0, 0, 0));
        loginPassLabel.setText("Password");

        loginUserField.setBackground(new java.awt.Color(255, 255, 255));
        loginUserField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        loginPassField.setBackground(new java.awt.Color(255, 255, 255));
        loginPassField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        loginButton.setBackground(new java.awt.Color(255, 172, 90));
        loginButton.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(loginUserLabel)
                            .addGap(18, 18, 18)
                            .addComponent(loginUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginPassLabel)
                                .addGap(18, 18, 18)
                                .addComponent(loginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(375, 375, 375)
                                .addComponent(hotelNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hotelNameLabel)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(300, 150, 1000, 600);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lounge.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
            String username = String.valueOf(loginUserField.getText());
            String password = String.valueOf(loginPassField.getText());
            
            if(username.equalsIgnoreCase("User1") && password.equalsIgnoreCase("pass1")){
                        createObjs();
                        MainMenu mainFrame = new MainMenu();
                        mainFrame.show();
                        dispose();
                  }else{
                        showMessageDialog(null, "Λάθος στοιχεία!!!");
                  }
            
    }//GEN-LAST:event_loginButtonActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
     public void createObjs(){
         rList.add(0, new DataRooms(101,"Single Room",100,"Reserved"));
         rList.add(1, new DataRooms(102,"Double Room",250,"Reserved"));
         rList.add(2, new DataRooms(103,"Single Room",100,"Reserved"));
         rList.add(3, new DataRooms(201,"Studio Room",350,"Reserved"));
         rList.add(4, new DataRooms(202,"Deluxe Room",450,"Reserved"));
         rList.add(5, new DataRooms(301,"Suite",600,"Reserved"));
         rList.add(6, new DataRooms(302,"Presidential Suite",2000,"Reserved"));
         rList.add(7, new DataRooms(104,"Single Room",100,"Not Reserved"));
         rList.add(8, new DataRooms(105,"Double Room",250,"Not Reserved"));
         rList.add(9, new DataRooms(106,"Single Room",100,"Not Reserved"));
         rList.add(10, new DataRooms(203,"Studio Room",350,"Not Reserved"));
         rList.add(11, new DataRooms(204,"Deluxe Room",450,"Not Reserved"));
         rList.add(12, new DataRooms(303,"Suite",600,"Not Reserved"));
         rList.add(13, new DataRooms(304,"Presidential Suite",2000,"Not Reserved"));
         
         cList.add(0, new DataClients(1,"George Pit","AD154244","6984526548","georgepit01@gmail.com"));
         cList.add(1, new DataClients(2,"Mary Smith","KD569845","6984567845","mary33@gmail.com"));
         cList.add(2, new DataClients(3,"John Taylor","KK152521","6955123425","john73@gmail.com"));
         cList.add(3, new DataClients(4,"Nick Jones","LO526585","6915678453","nik11@gmail.com"));
         cList.add(4, new DataClients(5,"Steve Williams","ED696586","6909857483","steve444@gmail.com"));
         cList.add(5, new DataClients(6,"David Brown","BV254714","6988463778","david909@gmail.com"));
         cList.add(6, new DataClients(7,"Jessica Green","ZZ525012","6909808781","jes76@gmail.com"));
         
         resList.add(0, new DataReservations(1, (DataClients) cList.get(0),(DataRooms) rList.get(0),"21/11/2022","",0,0));
         resList.add(1, new DataReservations(2, (DataClients) cList.get(1),(DataRooms) rList.get(1),"22/11/2022","",0,0));
         resList.add(2, new DataReservations(3,(DataClients) cList.get(2),(DataRooms) rList.get(2),"22/11/2022","",0,0));
         resList.add(3, new DataReservations(4,(DataClients) cList.get(3),(DataRooms) rList.get(3),"28/11/2022","",0,0));
         resList.add(4, new DataReservations(5,(DataClients) cList.get(4),(DataRooms) rList.get(4),"20/11/2022","",0,0));
         resList.add(5, new DataReservations(6,(DataClients) cList.get(5),(DataRooms) rList.get(5),"29/11/2022","",0,0));
         resList.add(6, new DataReservations(7,(DataClients) cList.get(6),(DataRooms) rList.get(6),"18/11/2022","",0,0));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hotelNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField loginPassField;
    private javax.swing.JLabel loginPassLabel;
    private javax.swing.JTextField loginUserField;
    private javax.swing.JLabel loginUserLabel;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables
}
