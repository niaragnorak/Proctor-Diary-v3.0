/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proctor_diary;

<<<<<<< HEAD
=======
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

>>>>>>> Proctor Version 3.0 deployed on cPanel
/**
 *
 * @author Nilansh Thakur
 */
<<<<<<< HEAD
public class Main {
=======
/*public class Main {
>>>>>>> Proctor Version 3.0 deployed on cPanel
    public static void main(String args[]){
         java.awt.EventQueue.invokeLater(() -> {
             new Login().setVisible(true);
         });
    }
<<<<<<< HEAD
    
}
=======

}*/
public class Main extends Thread{
    /*public static void play(String file){
        InputStream music;
        try{
            music=new FileInputStream(new File(file));
            AudioStream audio=new AudioStream(music);
            AudioPlayer.player.start(audio);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Could not load music.");
        }
    }*/
    public static void main(String args[]){
        //play("C:\\Users\\Nilansh Thakur\\Documents\\NetBeansProjects\\ProctorDiary_cPanel1\\src\\ps3-fat-startup (online-audio-converter.com).wav");
        testing t=new testing();
        java.awt.EventQueue.invokeLater(() -> {
             t.setVisible(true);
         });
        Login l=new Login();
        try{
            for(int i=0;i<100;i++)
            {
                Thread.sleep(48);
                t.bar.setValue(i);
                t.progress.setText(Integer.toString(i)+"%");
            }
        }catch(Exception e){     
    }
        new testing().setVisible(false);
        l.setVisible(true);
        t.dispose();
}
}
>>>>>>> Proctor Version 3.0 deployed on cPanel
