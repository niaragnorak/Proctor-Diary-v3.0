/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proctor_diary;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Nilansh Thakur
 */
public class proctorinteracts extends javax.swing.JFrame {

    /**
     * Creates new form proctorinteracts
     */
    public proctorinteracts() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        showdate();
        showtime();
    }
    public void showdate(){
        java.util.Date d=new java.util.Date();
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
        datevar.setText(s.format(d));
    }
    public void showtime(){
        new Timer(0,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                java.util.Date d=new java.util.Date();
                SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss a");
                timevar.setText(s.format(d));
            }
        }).start();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        currentsem = new javax.swing.JLabel();
        usn1 = new javax.swing.JLabel();
        department = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fullname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        entermessage1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        datevar = new javax.swing.JLabel();
        timevar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        subject1 = new javax.swing.JTextField();
<<<<<<< HEAD
=======
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
>>>>>>> Proctor Version 3.0 deployed on cPanel

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
        setSize(new java.awt.Dimension(900, 900));
<<<<<<< HEAD

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("CURRENT SEM:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Department:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("USN:");

        currentsem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        currentsem.setForeground(new java.awt.Color(153, 204, 0));
        currentsem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        usn1.setForeground(new java.awt.Color(0, 153, 153));
        usn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        department.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        department.setForeground(new java.awt.Color(204, 153, 0));
        department.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Name:");

        fullname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fullname.setForeground(new java.awt.Color(153, 204, 0));
        fullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("ENTER MESSAGE:");

        entermessage1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
=======
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CURRENT SEM:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USN:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        currentsem.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        currentsem.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(currentsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 275, 269, 22));

        usn1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        usn1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(usn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 402, 269, 22));

        department.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        department.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 354, 269, 22));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        fullname.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fullname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 314, 269, 22));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER MESSAGE:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 230, 43));

        entermessage1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
>>>>>>> Proctor Version 3.0 deployed on cPanel
        entermessage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entermessage1ActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
=======
        getContentPane().add(entermessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 509, 506, 86));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jButton1.setText("SEND ");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
=======
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 653, 114, 37));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jButton2.setText("BACK");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Date:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("Time:");

        datevar.setBackground(new java.awt.Color(0, 0, 0));
        datevar.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        datevar.setForeground(new java.awt.Color(0, 204, 204));
        datevar.setText("Date:");

        timevar.setBackground(new java.awt.Color(0, 0, 0));
        timevar.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        timevar.setForeground(new java.awt.Color(0, 204, 204));
        timevar.setText("Time:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SEND EMAIL TO STUDENT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 51, 255));
        jLabel6.setText("SUBJECT:");

        subject1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
=======
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 653, 133, 37));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Date:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 70, 100, 40));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("Time:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 150, 100, 40));

        datevar.setBackground(new java.awt.Color(0, 0, 0));
        datevar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        datevar.setForeground(new java.awt.Color(0, 204, 204));
        datevar.setText("Date:");
        getContentPane().add(datevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 70, 230, 40));

        timevar.setBackground(new java.awt.Color(0, 0, 0));
        timevar.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        timevar.setForeground(new java.awt.Color(0, 204, 204));
        timevar.setText("Time:");
        getContentPane().add(timevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 140, 220, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SEND EMAIL TO STUDENT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 544, 62));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SUBJECT:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 181, 43));

        subject1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
>>>>>>> Proctor Version 3.0 deployed on cPanel
        subject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject1ActionPerformed(evt);
            }
        });
<<<<<<< HEAD

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(65, 65, 65)
                                .addComponent(currentsem, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(145, 145, 145)
                                        .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(98, 98, 98)
                                        .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(154, 154, 154)
                                        .addComponent(usn1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(entermessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(subject1)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 817, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(datevar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(timevar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(798, 798, 798))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datevar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(timevar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(currentsem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(usn1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(subject1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entermessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap(773, Short.MAX_VALUE))
        );
=======
        getContentPane().add(subject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 455, 506, 43));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (845).png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 30, 480, 360));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 30, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 30, -1));
>>>>>>> Proctor Version 3.0 deployed on cPanel

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entermessage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entermessage1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entermessage1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((subject1.getText().equals("") && entermessage1.getText().equals("")) || subject1.getText().equals("") || entermessage1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Empty fields! Please enter subject and message");
            }else{
                try{
                        String a="";
                        Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
                       Connection con = DriverManager.getConnection("jdbc:mysql://bykqcbjckqhrun54vgmr-mysql.services.clever-cloud.com:3306/bykqcbjckqhrun54vgmr","uu799vkgk1pcx35b","Hqy3pqsIAdaAt6gMuPNe");
=======
                       Connection con = DriverManager.getConnection("jdbc:mysql://107.180.95.144:3306/isedevbm_proctor_management","isedevbm_nia","Hatake@456");
>>>>>>> Proctor Version 3.0 deployed on cPanel
                        Statement st =con.createStatement();
                        ResultSet rs =st.executeQuery("select * from student");
                        String usn11=usn1.getText();
                        while(rs.next()){
                            String usn111=rs.getString("USN");
                            if(usn11.equals(usn111)){
                                a=rs.getString("email");
                            }
                            }
                        
                        String fromemail="proctordiarymanagement2019@gmail.com";
                        String fromemailpassword="Proctor@123";
                        String subject="Your proctor has sent you a new message. SUBJECT: ";
                        subject=subject+subject1.getText();
                        String emailmessage=entermessage1.getText();
                        
                        Properties properties=new Properties();
                        properties.put("mail.smtp.auth","true");
                        properties.put("mail.smtp.starttls.enable","true");
                        properties.put("mail.smtp.host","smtp.gmail.com");
                        properties.put("mail.smtp.port","587");

                        Session session=Session.getDefaultInstance(properties,new javax.mail.Authenticator(){
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication(){
                            return new PasswordAuthentication(fromemail,fromemailpassword);
                        }
                        });

                        try{
                            MimeMessage message=new MimeMessage(session);
                            message.setFrom(new InternetAddress(fromemail));
                            message.addRecipient(Message.RecipientType.TO, new InternetAddress(a));
                            message.setSubject(subject);
                            message.setText(emailmessage);
                            Transport.send(message);
                            JOptionPane.showMessageDialog(null,"Email SENT!");
                        }catch(Exception e){
                            System.out.println(""+e);
                             JOptionPane.showMessageDialog(null,e);
                        }
                }catch(Exception e){
                    System.out.println(""+e);
                    JOptionPane.showMessageDialog(null,e);
                }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void subject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject1ActionPerformed

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
            java.util.logging.Logger.getLogger(proctorinteracts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proctorinteracts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proctorinteracts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proctorinteracts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proctorinteracts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel currentsem;
    private javax.swing.JLabel datevar;
    public javax.swing.JLabel department;
    public javax.swing.JTextField entermessage1;
    public javax.swing.JLabel fullname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabel17;
>>>>>>> Proctor Version 3.0 deployed on cPanel
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel8;
=======
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
>>>>>>> Proctor Version 3.0 deployed on cPanel
    public javax.swing.JTextField subject1;
    private javax.swing.JLabel timevar;
    public javax.swing.JLabel usn1;
    // End of variables declaration//GEN-END:variables
}
