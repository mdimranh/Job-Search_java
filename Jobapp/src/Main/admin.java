/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Md.Imran Hossain
 */
public class admin extends javax.swing.JFrame {
Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form Signin
     */
    int x,y,p;
    
    public admin() {
        initComponents();
        showTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jobtitleTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        qualificationTextArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        companyTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jobcategoryComboBox = new javax.swing.JComboBox<>();
        emailTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        aboutjobTextArea = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        experienceTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 120, 215));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 939, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));

        jPanel2.setBackground(new java.awt.Color(19, 34, 65));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_48px.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log Out");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 80, 470));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Job Category");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 22));

        locationTextField.setBackground(new java.awt.Color(19, 34, 65));
        locationTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        locationTextField.setForeground(new java.awt.Color(255, 255, 255));
        locationTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(locationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 201, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Qualification");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, 22));

        jobtitleTextField.setBackground(new java.awt.Color(19, 34, 65));
        jobtitleTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jobtitleTextField.setForeground(new java.awt.Color(255, 255, 255));
        jobtitleTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(jobtitleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 201, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Job Title");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 22));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Company");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 22));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Location");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("About Job");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 22));

        qualificationTextArea.setBackground(new java.awt.Color(19, 34, 65));
        qualificationTextArea.setColumns(20);
        qualificationTextArea.setForeground(new java.awt.Color(255, 255, 255));
        qualificationTextArea.setRows(5);
        jScrollPane2.setViewportView(qualificationTextArea);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 201, 79));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Experience");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Salary");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, 30));

        salaryTextField.setBackground(new java.awt.Color(19, 34, 65));
        salaryTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salaryTextField.setForeground(new java.awt.Color(255, 255, 255));
        salaryTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(salaryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 201, 34));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("E-Mail");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, 30));

        companyTextField.setBackground(new java.awt.Color(19, 34, 65));
        companyTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyTextField.setForeground(new java.awt.Color(255, 255, 255));
        companyTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(companyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 201, 34));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Phone");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, 30));

        jobcategoryComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jobcategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accounts & Finance", "Bank / Insurance / Leasing", "Garment's / Textile", "Electrical / Construction", "Agriculture / Fisheries", "Driving / Motor technology", "Architecture's / Civil Engineer's", "Call Center / Customer Care", "It & Telecommunication", "Sales and Marketing", "Travel / Tourism / Hotel", "Other's" }));
        jPanel3.add(jobcategoryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 201, 34));

        emailTextField.setBackground(new java.awt.Color(19, 34, 65));
        emailTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 201, 34));

        aboutjobTextArea.setBackground(new java.awt.Color(19, 34, 65));
        aboutjobTextArea.setColumns(20);
        aboutjobTextArea.setForeground(new java.awt.Color(255, 255, 255));
        aboutjobTextArea.setRows(5);
        jScrollPane3.setViewportView(aboutjobTextArea);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 201, 79));

        jToggleButton1.setBackground(new java.awt.Color(19, 34, 65));
        jToggleButton1.setFont(new java.awt.Font("Dirty War", 0, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(153, 153, 255));
        jToggleButton1.setText("Search");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 100, 30));

        experienceTextField.setBackground(new java.awt.Color(19, 34, 65));
        experienceTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        experienceTextField.setForeground(new java.awt.Color(255, 255, 255));
        experienceTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(experienceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 201, 34));

        phoneTextField.setBackground(new java.awt.Color(19, 34, 65));
        phoneTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneTextField.setForeground(new java.awt.Color(255, 255, 255));
        phoneTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 201, 34));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("ID");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, 30));

        idTextField.setBackground(new java.awt.Color(19, 34, 65));
        idTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idTextField.setForeground(new java.awt.Color(255, 255, 255));
        idTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 201, 34));

        jToggleButton2.setBackground(new java.awt.Color(19, 34, 65));
        jToggleButton2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(153, 153, 255));
        jToggleButton2.setText("Reset");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 110, 30));

        jToggleButton3.setBackground(new java.awt.Color(19, 34, 65));
        jToggleButton3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(153, 153, 255));
        jToggleButton3.setText("Insert");
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseClicked(evt);
            }
        });
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 110, 30));

        jToggleButton4.setBackground(new java.awt.Color(19, 34, 65));
        jToggleButton4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(153, 153, 255));
        jToggleButton4.setText("Update");
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }
        });
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 110, 30));

        jToggleButton5.setBackground(new java.awt.Color(19, 34, 65));
        jToggleButton5.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jToggleButton5.setForeground(new java.awt.Color(153, 153, 255));
        jToggleButton5.setText("Delete");
        jToggleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton5MouseClicked(evt);
            }
        });
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 110, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Job_Category", "Job_Title", "Company", "Location", "About_Job", "Qualification", "Experience", "Salary", "E-Mail", "Phone"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 850, 230));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Admin");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 50));

        jScrollPane1.setViewportView(jPanel3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 890, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       int xx = evt.getXOnScreen();
       int yy = evt.getYOnScreen();
       this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
try{
con = DriverManager.getConnection("jdbc:mysql://localhost/jobsearch1","root","");
String sql = "SELECT * FROM post WHERE ID=?";
pst = con.prepareStatement(sql);
pst.setString(1, idTextField.getText());
rs=pst.executeQuery();
if(rs.next()){
String add1 = rs.getString("Job_Title");
jobtitleTextField.setText(add1);
String add2 = rs.getString("Company");
companyTextField.setText(add2);
String add3 = rs.getString("About_Job");
aboutjobTextArea.setText(add3);
String add4 = rs.getString("Location");
locationTextField.setText(add4);
String add5 = rs.getString("Qualification");
qualificationTextArea.setText(add5);
String add6 = rs.getString("Experience");
experienceTextField.setText(add6);
String add7 = rs.getString("Salary");
salaryTextField.setText(add7);
String add8 = rs.getString("E-Mail");
emailTextField.setText(add8);
String add9 = rs.getString("Phone");
phoneTextField.setText(add9);
}
}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);
 
}

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
     
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
idTextField.setText("");
        jobcategoryComboBox.setSelectedItem("");
        jobtitleTextField.setText("");
        companyTextField.setText("");
        locationTextField.setText("");
        aboutjobTextArea.setText("");
        qualificationTextArea.setText("");
        experienceTextField.setText("");
        salaryTextField.setText("");
        emailTextField.setText("");
        phoneTextField.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3MouseClicked

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
    int p = JOptionPane.showConfirmDialog(null,"Do you really want to Insert this data ?","Insert", JOptionPane.YES_NO_OPTION);
if(p == 0){
    try{
String sql = "INSERT INTO `post`(`Job_Category`, `Job_Title`, `Company`, `Location`, `About_job`, `Qualification`, `Experience`, `Salary`, `E-mail`, `Phone`) VALUES (?,?,?,?,?,?,?,?,?,?)";
con = DriverManager.getConnection("jdbc:mysql://localhost/jobsearch1","root","");
pst = con.prepareStatement(sql);
pst.setString(1, jobcategoryComboBox.getSelectedItem().toString());
pst.setString(2,jobtitleTextField.getText());
pst.setString(3,companyTextField.getText());
pst.setString(4,locationTextField.getText());
pst.setString(5,aboutjobTextArea.getText());
pst.setString(6,qualificationTextArea.getText());
pst.setString(7,experienceTextField.getText());
pst.setString(8,salaryTextField.getText());
pst.setString(9,emailTextField.getText());
pst.setString(10,phoneTextField.getText());
pst.executeUpdate();
JOptionPane.showMessageDialog(null, "Inserted successfully");
 
}
catch(SQLException | HeadlessException ex){
JOptionPane.showMessageDialog(null, ex);
}
       showTableData();
    }//GEN-LAST:event_jToggleButton3ActionPerformed
}
    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4MouseClicked

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
int p = JOptionPane.showConfirmDialog(null,"Do you really want to Update this data ?","Update", JOptionPane.YES_NO_OPTION);
if(p == 0){
        try{
 String sql = "UPDATE `post` SET `Job_Category`=?,`Job_Title`=?,`Company`=?,`Location`=?,`About_job`=?,`Qualification`=?,`Experience`=?,`Salary`=?,`E-mail`=?,`Phone`=? WHERE ID=?";
 con = DriverManager.getConnection("jdbc:mysql://localhost/jobsearch1","root","");
 pst = con.prepareStatement(sql);
 pst.setString(11,idTextField.getText());
 pst.setString(1, jobcategoryComboBox.getSelectedItem().toString());
pst.setString(2,jobtitleTextField.getText());
pst.setString(3,companyTextField.getText());
pst.setString(4,locationTextField.getText());
pst.setString(5,aboutjobTextArea.getText());
pst.setString(6,qualificationTextArea.getText());
pst.setString(7,experienceTextField.getText());
pst.setString(8,salaryTextField.getText());
pst.setString(9,emailTextField.getText());
pst.setString(10,phoneTextField.getText());
pst.executeUpdate();
JOptionPane.showMessageDialog(null, "Updated successfully");
 }
 catch(SQLException | HeadlessException ex){
 JOptionPane.showMessageDialog(null, ex);
 }
        showTableData();       
    }//GEN-LAST:event_jToggleButton4ActionPerformed
}
    private void jToggleButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton5MouseClicked

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        int p = JOptionPane.showConfirmDialog(null,"Do you really want to delete this data ?","Delete", JOptionPane.YES_NO_OPTION);
if(p == 0){
        try{
String sql = "DELETE FROM post WHERE ID =?";
con = DriverManager.getConnection("jdbc:mysql://localhost/jobsearch1","root","");
pst = con.prepareStatement(sql);
pst.setString(1,idTextField.getText());
pst.executeUpdate();
JOptionPane.showMessageDialog(null, "delete successfully");
 
}
catch(SQLException | HeadlessException ex){
JOptionPane.showMessageDialog(null, ex);
}
       showTableData();
}
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int p = JOptionPane.showConfirmDialog(null,"Do you really want to Log Out ?","Log Out", JOptionPane.YES_NO_OPTION);
if(p == 0){
     new Home().setVisible(true);
     dispose();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        this.setState(Home.ICONIFIED);
    }//GEN-LAST:event_jLabel10MousePressed
public void showTableData(){
try{
con = DriverManager.getConnection("jdbc:mysql://localhost/jobsearch1","root","");
String sql = "SELECT * FROM post";
pst = con.prepareStatement(sql);
rs=pst.executeQuery();
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
}
catch(Exception ex){
JOptionPane.showMessageDialog(null, ex);
 
}
 
}
    //public void showTableData(){
//try{
//con = DriverManager.getConnection("jdbc:mysql://localhost/jobsearch","root","");
//String sql = "SELECT * FROM post";
//pst = con.prepareStatement(sql);
//rs=pst.executeQuery();
//jTable1.setModel(DbUtils.resultSetToTableModel(rs));
//}
//catch(Exception ex){
//JOptionPane.showMessageDialog(null, ex);
 
//}
 
//}
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutjobTextArea;
    private javax.swing.JTextField companyTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField experienceTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JComboBox<String> jobcategoryComboBox;
    private javax.swing.JTextField jobtitleTextField;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextArea qualificationTextArea;
    private javax.swing.JTextField salaryTextField;
    // End of variables declaration//GEN-END:variables
}
