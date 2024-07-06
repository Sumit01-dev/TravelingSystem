package TravelingSystem;
import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable {
   Thread t;
   JProgressBar bar;
   String username;
    
   public void run(){
       
       try{
           for(int i=1;i<=101;i++){
               int max=bar.getMaximum();
               int value=bar.getValue();
               
               if(value<max){
                   bar.setValue(bar.getValue() + 1);
               }else{
                   setVisible(false);
                   new Dashboard(username);
               }
               Thread.sleep(50);
           }
       }catch(Exception e){
           e.printStackTrace();
       }
   }
    
    Loading(){
        //this.username=username;
        t=new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text=new JLabel("Travel and Tourism Application");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tahoma", Font.BOLD,35));
        add(text);
        
        
        bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
       JLabel loading=new JLabel("Loading Please Wait......   ");
        loading.setBounds(150,140,400,30);
        loading.setForeground(Color.GREEN);
        loading.setFont(new Font("Tahoma", Font.BOLD,15));
        add(loading);
       
        
        JLabel username=new JLabel("Welcome Anshu   ");
        username.setBounds(20,300,400,40);
        username.setForeground(Color.GRAY);
        username.setFont(new Font("Tahoma", Font.BOLD,35));
        add(username);
       
        
        
        
        
        
        
        
        t.start();
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Loading();
    }
    
}
 {
    
}
