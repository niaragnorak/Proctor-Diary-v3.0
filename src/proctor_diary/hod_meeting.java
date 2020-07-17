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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;
import static proctor_diary.proctor_meeting.isValid;

/**
 *
 * @author Nilansh Thakur
 */
public class hod_meeting extends javax.swing.JFrame {

    /**
     * Creates new form hod_meeting
     */
    public hod_meeting() {
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
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allproctors = new javax.swing.JCheckBox();
        date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        timing = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        datevar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t01 = new javax.swing.JTable();
        timevar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        agenda = new javax.swing.JTextArea();
        pid1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        emails = new javax.swing.JTextArea();
        department11 = new javax.swing.JLabel();
<<<<<<< HEAD
=======
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
>>>>>>> Proctor Version 3.0 deployed on cPanel

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
        setSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

<<<<<<< HEAD
        allproctors.setForeground(new java.awt.Color(0, 102, 102));
=======
        allproctors.setBackground(new java.awt.Color(0, 0, 0));
        allproctors.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        allproctors.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        allproctors.setText("ALL");
        allproctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allproctorsActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(allproctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 828, -1, -1));
=======
        getContentPane().add(allproctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 830, -1, -1));
>>>>>>> Proctor Version 3.0 deployed on cPanel

        date.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        date.setForeground(new java.awt.Color(204, 0, 51));
        date.setText("SETUP DATE(YYYY-MM-DD)");
        date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
<<<<<<< HEAD
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 517, 322, 41));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
=======
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 322, 41));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel8.setText("SEND TO ALL PROCTORS:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 816, 250, 52));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Date:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1422, 73, 100, 40));

        timing.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        timing.setForeground(new java.awt.Color(102, 102, 255));
        timing.setText("SCHEDULE TIMING(HH:MM)");
        timing.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
<<<<<<< HEAD
        getContentPane().add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 595, 322, 47));
=======
        getContentPane().add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 322, 47));
>>>>>>> Proctor Version 3.0 deployed on cPanel

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("Time:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1422, 153, 80, 40));

<<<<<<< HEAD
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("HOD IDENTIFICATION:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 447, -1, 30));
=======
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HOD IDENTIFICATION:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 447, 270, 30));
>>>>>>> Proctor Version 3.0 deployed on cPanel

        datevar.setBackground(new java.awt.Color(0, 0, 0));
        datevar.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        datevar.setForeground(new java.awt.Color(0, 204, 204));
        datevar.setText("Date:");
        getContentPane().add(datevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1582, 73, 230, 40));

<<<<<<< HEAD
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("SCHEDULE MEETING ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 517, 216, -1));

        t01.setBackground(new java.awt.Color(0, 0, 0));
=======
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SCHEDULE MEETING ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 517, 250, -1));

        t01.setBackground(new java.awt.Color(0, 0, 0));
        t01.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
>>>>>>> Proctor Version 3.0 deployed on cPanel
        t01.setForeground(new java.awt.Color(0, 153, 204));
        t01.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "AGENDA", "DATE", "TIMING"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(t01);

<<<<<<< HEAD
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 219, 880, 210));
=======
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 880, 180));
>>>>>>> Proctor Version 3.0 deployed on cPanel

        timevar.setBackground(new java.awt.Color(0, 0, 0));
        timevar.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        timevar.setForeground(new java.awt.Color(0, 204, 204));
        timevar.setText("Time:");
        getContentPane().add(timevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1582, 143, 220, 50));

<<<<<<< HEAD
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("AGENDA OF THE MEETING:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 682, 250, 36));

        agenda.setColumns(20);
        agenda.setForeground(new java.awt.Color(153, 153, 0));
        agenda.setRows(5);
        jScrollPane1.setViewportView(agenda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 681, 328, 106));

        pid1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pid1.setForeground(new java.awt.Color(0, 153, 153));
        pid1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        getContentPane().add(pid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 447, 322, 40));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Meeting History:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 151, 247, 42));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("SCHEDULE TIMING");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 597, 202, 47));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("SETUP MEETING:");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 29, 243, 79));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("SUBMIT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 3, true));
=======
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGENDA OF THE MEETING:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 680, 310, 36));

        agenda.setColumns(20);
        agenda.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        agenda.setRows(5);
        jScrollPane1.setViewportView(agenda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, 320, 140));

        pid1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pid1.setForeground(new java.awt.Color(255, 255, 255));
        pid1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        getContentPane().add(pid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 322, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Meeting History:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 270, 42));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SCHEDULE TIMING");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 597, 220, 47));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SETUP MEETING:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 330, 79));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 925, 144, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("ENTER EMAIL ID's");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 898, 240, 39));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("BACK");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
=======
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1194, 770, 150, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER EMAIL ID's");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 820, 240, 39));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.setBorder(null);
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 927, 157, 50));

        emails.setColumns(20);
        emails.setForeground(new java.awt.Color(255, 102, 0));
        emails.setRows(5);
        jScrollPane2.setViewportView(emails);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 898, 328, -1));
        getContentPane().add(department11, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 149, 169, 38));
=======
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 860, 157, 50));

        emails.setColumns(20);
        emails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        emails.setRows(5);
        jScrollPane2.setViewportView(emails);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 820, 328, -1));

        department11.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        getContentPane().add(department11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 169, 38));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("OR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 830, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 830, 30, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 30, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 30, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 680, 30, 30));
>>>>>>> Proctor Version 3.0 deployed on cPanel

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        String pid11=pid1.getText();
        String date1=date.getText();
        String agenda1=agenda.getText();
        String timing1=timing.getText();
        String emails1=emails.getText();
        //String[] toemail1 = null;
        Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
      Connection con = DriverManager.getConnection("jdbc:mysql://bykqcbjckqhrun54vgmr-mysql.services.clever-cloud.com:3306/bykqcbjckqhrun54vgmr","uu799vkgk1pcx35b","Hqy3pqsIAdaAt6gMuPNe");
=======
      Connection con = DriverManager.getConnection("jdbc:mysql://107.180.95.144:3306/isedevbm_proctor_management","isedevbm_nia","Hatake@456");
>>>>>>> Proctor Version 3.0 deployed on cPanel
             int count2=0;
             int count1=0;
             if(allproctors.isSelected()){
                 count1=1;
             }
              String[] toemail=emails1.split("\n");
              for(String i: toemail){
                  boolean b=isValid(i);
                  if(b==false){
                      count2=1;
                      JOptionPane.showMessageDialog(null,"Invalid email: "+i+"");
                  }
              }
              if(count2==1){
                  JOptionPane.showMessageDialog(null,"Please correct all the invalid emails");
              }
              else if(count1==1){
                    Statement st22 =con.createStatement();
                    String p='"'+department11.getText()+'"';
                    ResultSet rs22 =st22.executeQuery("select email from proctor where proctor_dept="+p);
                    ArrayList<String> arr=new ArrayList<String>();
                    while(rs22.next()){
                        System.out.println(0+"");
                        String email12=rs22.getString("email");
                        arr.add(email12);
                    }
                    String[] a=arr.toArray(new String[arr.size()]);
                    //
                    //
                    String fromemail="proctordiarymanagement2019@gmail.com";
                    String fromemailpassword="Proctor@123";
                    String subject="Your HOD has set a new meeting on "+date1+" at "+timing1+".";
                    String emailmessage="Hello PROCTOR! Your HOD with id "+pid11+" has set a new meeting. Here are the details:"+"\n";
                    emailmessage+="Date of the meeting: "+date1+"\n";
                    emailmessage+="Timing of the meeting: "+timing1+"\n";
                    emailmessage+="Agenda of the meeting: "+agenda1+"\n";

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
                        for(String i: a){
                             message.addRecipient(Message.RecipientType.TO, new InternetAddress(i));
                        }
                        message.setSubject(subject);
                        message.setText(emailmessage);
                        Transport.send(message);
                    }catch(Exception e){
                        System.out.println(""+e);
                         JOptionPane.showMessageDialog(null,e);
                    }
              }
              else{
                    String fromemail="proctordiarymanagement2019@gmail.com";
                    String fromemailpassword="Proctor@123";
                    String subject="Your HOD has set a new meeting on "+date1+" at "+timing1+".";
                    String emailmessage="Hello PROCTOR! Your HOD with id "+pid11+" has set a new meeting. Here are the details:"+"\n";
                    emailmessage+="Date of the meeting: "+date1+"\n";
                    emailmessage+="Timing of the meeting: "+timing1+"\n";
                    emailmessage+="Agenda of the meeting: "+agenda1+"\n";

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
                        for(int i=0;i<toemail.length;i++){
                             message.addRecipient(Message.RecipientType.TO, new InternetAddress(toemail[i]));
                        }
                        message.setSubject(subject);
                        message.setText(emailmessage);
                        Transport.send(message);
                    }catch(Exception e){
                        System.out.println(""+e);
                         JOptionPane.showMessageDialog(null,e);
                    }
                    String query="insert into hod_meeting values(?,?,?,?)";
                    PreparedStatement st1 =con.prepareStatement(query);
                    st1.setString(1,pid11);
                    st1.setString(2,date1);
                    st1.setString(3,agenda1);
                    st1.setString(4,timing1);
                    int count = st1.executeUpdate();
                    if(count>0)
                    {JOptionPane.showMessageDialog(null,"HOD meeting set up! Please check the latest HOD meeting");}

                       pid1.setText("");
                       date.setText("");
                       agenda.setText("");
                       timing.setText("");
                       emails.setText("");
                       String query1="select agenda,date,timing from hod_meeting where hod_id=(?)"; 
              PreparedStatement st2=con.prepareStatement(query1);
              st2.setString(1,pid11);
              ResultSet rs2=st2.executeQuery();
              t01.setModel(DbUtils.resultSetToTableModel(rs2));
              con.close();
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void allproctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allproctorsActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"You have selected to setup meeting for all proctors.");
    }//GEN-LAST:event_allproctorsActionPerformed

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
            java.util.logging.Logger.getLogger(hod_meeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hod_meeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hod_meeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hod_meeting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hod_meeting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea agenda;
    private javax.swing.JCheckBox allproctors;
    private javax.swing.JTextField date;
    private javax.swing.JLabel datevar;
    public javax.swing.JLabel department11;
    private javax.swing.JTextArea emails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
=======
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
>>>>>>> Proctor Version 3.0 deployed on cPanel
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabel9;
>>>>>>> Proctor Version 3.0 deployed on cPanel
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel pid1;
    public javax.swing.JTable t01;
    private javax.swing.JLabel timevar;
    private javax.swing.JTextField timing;
    // End of variables declaration//GEN-END:variables
}