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
public class hod_interact extends javax.swing.JFrame {

    /**
     * Creates new form hod_interact
     */
    public hod_interact() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        datevar = new javax.swing.JLabel();
        timevar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        allproctors = new javax.swing.JCheckBox();
        date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        timing = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        agenda = new javax.swing.JTextArea();
        pid1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        emails = new javax.swing.JTextArea();
<<<<<<< HEAD
=======
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
>>>>>>> Proctor Version 3.0 deployed on cPanel

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));
        setSize(new java.awt.Dimension(1500, 1500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
<<<<<<< HEAD
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
=======
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INTERACTION WITH HOD's");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 75, 605, 82));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
<<<<<<< HEAD
        jLabel13.setForeground(new java.awt.Color(255, 102, 51));
=======
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel13.setText("Date:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 30, -1, 80));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
<<<<<<< HEAD
        jLabel14.setForeground(new java.awt.Color(255, 102, 51));
=======
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel14.setText("Time:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 130, -1, 80));

        datevar.setBackground(new java.awt.Color(0, 0, 0));
        datevar.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
<<<<<<< HEAD
        datevar.setForeground(new java.awt.Color(255, 102, 51));
=======
        datevar.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        datevar.setText("Date:");
        getContentPane().add(datevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 40, 260, 60));

        timevar.setBackground(new java.awt.Color(0, 0, 0));
        timevar.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
<<<<<<< HEAD
        timevar.setForeground(new java.awt.Color(255, 102, 51));
        timevar.setText("Time:");
        getContentPane().add(timevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 140, 270, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("SETUP HOD MEETING:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 237, 289, 53));
=======
        timevar.setForeground(new java.awt.Color(255, 255, 255));
        timevar.setText("Time:");
        getContentPane().add(timevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 140, 270, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SETUP HOD MEETING:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 420, 53));
>>>>>>> Proctor Version 3.0 deployed on cPanel

        allproctors.setForeground(new java.awt.Color(0, 102, 102));
        allproctors.setText("ALL");
        allproctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allproctorsActionPerformed(evt);
            }
        });
        getContentPane().add(allproctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 710, -1, -1));

        date.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        date.setForeground(new java.awt.Color(204, 0, 51));
        date.setText("SETUP DATE(YYYY-MM-DD)");
        date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 322, 41));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
<<<<<<< HEAD
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
=======
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel8.setText("SEND TO ALL HOD's:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 700, 250, 52));

        timing.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        timing.setForeground(new java.awt.Color(102, 102, 255));
        timing.setText("SCHEDULE TIMING(HH:MM)");
        timing.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(timing, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 322, 47));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
<<<<<<< HEAD
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
=======
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel5.setText("HOD IDENTIFICATION:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
<<<<<<< HEAD
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
=======
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel3.setText("SCHEDULE MEETING ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 216, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
<<<<<<< HEAD
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
=======
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel4.setText("AGENDA OF THE MEETING:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 250, 36));

        agenda.setColumns(20);
<<<<<<< HEAD
        agenda.setForeground(new java.awt.Color(153, 153, 0));
=======
        agenda.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
>>>>>>> Proctor Version 3.0 deployed on cPanel
        agenda.setRows(5);
        jScrollPane1.setViewportView(agenda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, 328, 106));

        pid1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
<<<<<<< HEAD
        pid1.setForeground(new java.awt.Color(0, 153, 153));
=======
        pid1.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        pid1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        getContentPane().add(pid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, 322, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
<<<<<<< HEAD
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
=======
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel7.setText("SCHEDULE TIMING");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 202, 47));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
<<<<<<< HEAD
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
=======
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jButton1.setText("SUBMIT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 820, 144, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
<<<<<<< HEAD
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
=======
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jLabel6.setText("ENTER EMAIL ID's");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 780, 240, 39));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
<<<<<<< HEAD
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
=======
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> Proctor Version 3.0 deployed on cPanel
        jButton2.setText("BACK");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 820, 157, 50));

        emails.setColumns(20);
<<<<<<< HEAD
        emails.setForeground(new java.awt.Color(255, 102, 0));
=======
        emails.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
>>>>>>> Proctor Version 3.0 deployed on cPanel
        emails.setRows(5);
        jScrollPane2.setViewportView(emails);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 780, 328, -1));

<<<<<<< HEAD
=======
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmslogo111.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 400, 400));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (845).png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("OR");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 750, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 30, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, 30, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 30, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 750, 30, 30));

>>>>>>> Proctor Version 3.0 deployed on cPanel
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int err=0;
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
                ResultSet rs22 =st22.executeQuery("select email from hod");
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
                String subject="HOD "+pid11+" has set a new meeting on "+date1+" at "+timing1+".";
                String emailmessage="Hello HOD! HOD with id "+pid11+" has set a new meeting. Here are the details:"+"\n";
                emailmessage+="Date of the meeting: "+date1+"\n";
                emailmessage+="Timing of the meeting: "+timing1+"\n";
                emailmessage+="Agenda of the meeting: "+agenda1+"\n";

                Properties properties=new Properties();
                properties.put("mail.smtp.driver","sendmail");
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
                    err=1;
                    System.out.println(""+e);
                    JOptionPane.showMessageDialog(null,e);
                }
            }
            else{
                String fromemail="proctordiarymanagement2019@gmail.com";
                String fromemailpassword="Proctor@123";
                String subject="HOD"+pid11+" has set a new meeting on "+date1+" at "+timing1+".";
                String emailmessage="Hello HOD! HOD with id "+pid11+" has set a new meeting. Here are the details:"+"\n";
                emailmessage+="Date of the meeting: "+date1+"\n";
                emailmessage+="Timing of the meeting: "+timing1+"\n";
                emailmessage+="Agenda of the meeting: "+agenda1+"\n";

                Properties properties=new Properties();
                
                properties.put("mail.smtp.driver","sendmail");
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
                    err=1;
                    System.out.println(""+e);
                    JOptionPane.showMessageDialog(null,e);
                }
                if(err==0){
                String query="insert into hod_meeting values(?,?,?,?)";
                PreparedStatement st1 =con.prepareStatement(query);
                st1.setString(1,pid11);
                st1.setString(2,date1);
                st1.setString(3,agenda1);
                st1.setString(4,timing1);
                int count = st1.executeUpdate();
                if(count>0)
                {JOptionPane.showMessageDialog(null,"HOD meeting set up!");
                }

                pid1.setText("");
                date.setText("");
                agenda.setText("");
                timing.setText("");
                emails.setText("");
                }
                
            }
            con.close();
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
        JOptionPane.showMessageDialog(null,"You have selected to setup meeting for all HOD's.");
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
            java.util.logging.Logger.getLogger(hod_interact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hod_interact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hod_interact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hod_interact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hod_interact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea agenda;
    private javax.swing.JCheckBox allproctors;
    private javax.swing.JTextField date;
    private javax.swing.JLabel datevar;
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    public javax.swing.JLabel pid1;
    private javax.swing.JLabel timevar;
    private javax.swing.JTextField timing;
    // End of variables declaration//GEN-END:variables
}