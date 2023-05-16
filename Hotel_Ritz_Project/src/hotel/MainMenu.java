package hotel;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mainCheckinButton = new javax.swing.JButton();
        maiinRoomsButton = new javax.swing.JButton();
        mainCheckoutButton = new javax.swing.JButton();
        hotelNameLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        backgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1600, 900));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 600));

        mainCheckinButton.setBackground(new java.awt.Color(114, 64, 13));
        mainCheckinButton.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        mainCheckinButton.setForeground(new java.awt.Color(255, 204, 153));
        mainCheckinButton.setText("Check In");
        mainCheckinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainCheckinButtonActionPerformed(evt);
            }
        });

        maiinRoomsButton.setBackground(new java.awt.Color(114, 64, 13));
        maiinRoomsButton.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        maiinRoomsButton.setForeground(new java.awt.Color(255, 204, 153));
        maiinRoomsButton.setText("Rooms");
        maiinRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maiinRoomsButtonActionPerformed(evt);
            }
        });

        mainCheckoutButton.setBackground(new java.awt.Color(114, 64, 13));
        mainCheckoutButton.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        mainCheckoutButton.setForeground(new java.awt.Color(255, 204, 153));
        mainCheckoutButton.setText("Check Out");
        mainCheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainCheckoutButtonActionPerformed(evt);
            }
        });

        hotelNameLabel.setFont(new java.awt.Font("Bell MT", 0, 60)); // NOI18N
        hotelNameLabel.setForeground(new java.awt.Color(150, 114, 2));
        hotelNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotelNameLabel.setText("RITZ HOTEL");

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maiinRoomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(mainCheckinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(mainCheckoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addGap(305, 305, 305))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(hotelNameLabel)
                        .addGap(193, 193, 193))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(mainCheckinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(mainCheckoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(maiinRoomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(logoLabel)
                        .addGap(41, 41, 41)
                        .addComponent(hotelNameLabel)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        mainCheckinButton.setFocusPainted(false);
        maiinRoomsButton.setFocusPainted(false);
        mainCheckoutButton.setFocusPainted(false);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(200, 150, 1200, 600);

        backgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lounge2.jpg"))); // NOI18N
        jPanel1.add(backgroundImageLabel);
        backgroundImageLabel.setBounds(0, 0, 1600, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainCheckinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainCheckinButtonActionPerformed
          CheckIn resFrame = new CheckIn();
          resFrame.show();
          dispose();
    }//GEN-LAST:event_mainCheckinButtonActionPerformed

    private void maiinRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maiinRoomsButtonActionPerformed
          Rooms roomFrame = new Rooms();
          roomFrame.show();
          dispose();
    }//GEN-LAST:event_maiinRoomsButtonActionPerformed

    private void mainCheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainCheckoutButtonActionPerformed
          CheckOut clientsFrame = new CheckOut();
          clientsFrame.show();
          dispose();
    }//GEN-LAST:event_mainCheckoutButtonActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImageLabel;
    private javax.swing.JLabel hotelNameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton maiinRoomsButton;
    private javax.swing.JButton mainCheckinButton;
    private javax.swing.JButton mainCheckoutButton;
    // End of variables declaration//GEN-END:variables
}
