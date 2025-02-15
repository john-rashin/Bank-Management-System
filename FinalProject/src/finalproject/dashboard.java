/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.table.DefaultTableModel;
public class dashboard extends javax.swing.JFrame {

    String gender;
    DefaultTableModel model;
    Object tablerow[][];
    String[] tablecol = {"User_ID","First Name","Last Name","Middle","Gender"};
    int getRow;
    QueryProcessor dash;
    
    public dashboard() {
        initComponents();
        dash =new QueryProcessor();
        setTable();
    }
    
// WHERE `user` = '"+userTF.getText()+"'"); WHERE `account`='"++"'");
      public void setTable(){
       tablerow = dash.getAllRecord("SELECT * FROM `user_info`");
        model = new DefaultTableModel(tablerow, tablecol);
        table1.setModel(model);
        
      }
      
       public void unEditable(){
        Fname.setEditable(false);
        Lname.setEditable(false);
        Mname.setEditable(false);
    }
      public void clearText(){
        Fname.setText("");
        Lname.setText("");
        Mname.setText("");
    }
      public void setEditable(){
        Fname.setEditable(true);
        Lname.setEditable(true);
        Mname.setEditable(true);
        
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        idL = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Mname = new javax.swing.JTextField();
        Lname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        deposit = new javax.swing.JLabel();
        withdraw = new javax.swing.JLabel();
        pay = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 130, 201));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Main Dashboard");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 800));

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashin\\OneDrive - Teams\\Pictures\\Saved Pictures\\exit icon.png")); // NOI18N
        exit.setText("EXIT");
        exit.setFocusable(false);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashin\\OneDrive - Teams\\Pictures\\Saved Pictures\\log out.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashin\\OneDrive - Teams\\Pictures\\Saved Pictures\\passcode.png")); // NOI18N
        jLabel3.setText("Create Pin");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(184, 184, 170));

        edit.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        edit.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(0, 0, 0));
        edit.setText("Save Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(0, 0, 0));
        save.setText("Add");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        idL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        idL.setText("0");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table1);

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel5.setText("First Name:");

        Fname.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N

        Mname.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N

        Lname.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel7.setText("Last Name:");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel8.setText("Middle Name:");

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel10.setText("User ID:");

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel9.setText("Gender:");

        male.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(131, 131, 131)
                        .addComponent(edit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(idL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(male)
                                .addGap(77, 77, 77)
                                .addComponent(female))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Mname)
                                .addComponent(Fname)
                                .addComponent(Lname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)))))
                .addGap(118, 118, 118)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idL)
                    .addComponent(jLabel10))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(edit)
                    .addComponent(delete))
                .addGap(44, 44, 44))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("User Info", jPanel3);

        jPanel4.setBackground(new java.awt.Color(184, 184, 170));

        deposit.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        deposit.setForeground(new java.awt.Color(51, 51, 51));
        deposit.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashin\\OneDrive - Teams\\Pictures\\Saved Pictures\\deposit icon.jpg")); // NOI18N
        deposit.setText("Deposit");
        deposit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        deposit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositMouseClicked(evt);
            }
        });

        withdraw.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        withdraw.setForeground(new java.awt.Color(51, 51, 51));
        withdraw.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashin\\OneDrive - Teams\\Pictures\\Saved Pictures\\withdraw icon.jpg")); // NOI18N
        withdraw.setText("Withdraw");
        withdraw.setToolTipText("");
        withdraw.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawMouseClicked(evt);
            }
        });

        pay.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        pay.setForeground(new java.awt.Color(51, 51, 51));
        pay.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashin\\OneDrive - Teams\\Pictures\\Saved Pictures\\pay bills icon.png")); // NOI18N
        pay.setText("Pay Bills");
        pay.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pay.setFocusable(false);
        pay.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(deposit)
                .addGap(124, 124, 124)
                .addComponent(withdraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(pay)
                .addGap(139, 139, 139))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 148, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );

        jTabbedPane1.addTab("Transactions", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel11.setText("Group Members;");

        jLabel12.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel12.setText("Lomoya, John Rashin P.");

        jLabel13.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel13.setText("Ypil, John Clifford D.");

        jLabel14.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel14.setText("Soria, John Clarence T.");

        jLabel15.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel15.setText("Rebalbusa, Sherimae S.");

        jLabel16.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel16.setText("Solis, Jed G.");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel17.setText("Database Bank System");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel18.setText("This is for educational purpose only!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel6)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel17))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(521, 521, 521)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13)))
                                .addComponent(jLabel15))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(jLabel16))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel18)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17))
                .addGap(93, 93, 93)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );

        jTabbedPane1.addTab("About", jPanel5);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rashin\\OneDrive - Teams\\Pictures\\Saved Pictures\\create-account-button.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(exit)
                .addGap(176, 176, 176)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(jLabel4)
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(exit))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1308, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositMouseClicked
        // TODO add your handling code here:
        deposit obj = new deposit();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositMouseClicked

    private void withdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawMouseClicked
        // TODO add your handling code here:
        withdraw obj=new withdraw();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_withdrawMouseClicked

    private void payMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseClicked
        // TODO add your handling code here:
        payment obj =new payment();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_payMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO addF your handling code here:
         System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        loginForm obj =new loginForm();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        pinForm obj=new pinForm();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        RegisterForm obj=new RegisterForm();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        gender =female.getText();
       
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        gender =male.getText();
         
    }//GEN-LAST:event_maleActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        getRow = table1.getSelectedRow();
        idL.setText(model.getValueAt(getRow,0).toString());
        Fname.setText(model.getValueAt(getRow,1).toString());
        Lname.setText(model.getValueAt(getRow,2).toString());
        Mname.setText(model.getValueAt(getRow,3).toString());
        setEditable();
    }//GEN-LAST:event_table1MouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        dash.executeUpdate("DELETE FROM `user_info` WHERE `user_ID` = '"+idL.getText()+"'");
        setTable();
        clearText();
        unEditable();
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        dash.executeUpdate("INSERT INTO `user_info` VALUES (NULL,'"+Fname.getText()+"','"+Lname.getText()+"','"+Mname.getText()+"','"+gender+"')");
        setTable();
        clearText();
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        dash.executeUpdate("UPDATE `user_info` SET `First Name`='"+Fname.getText()+"', `Lname` = '"+Lname.getText()+"', `Middle Name` = '"+Mname.getText()+"',`Sex`='"+gender+"' WHERE `user_ID` = '"+idL.getText()+"'");
        unEditable();
        clearText();
    }//GEN-LAST:event_editActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField Mname;
    private javax.swing.JButton delete;
    private javax.swing.JLabel deposit;
    private javax.swing.JButton edit;
    private javax.swing.JLabel exit;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel idL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel pay;
    private javax.swing.JButton save;
    private javax.swing.JTable table1;
    private javax.swing.JLabel withdraw;
    // End of variables declaration//GEN-END:variables
}
