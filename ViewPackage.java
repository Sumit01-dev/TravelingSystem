package TravelingSystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewPackage extends JFrame implements ActionListener{
    JButton back;
    ViewPackage(String username){
        setBounds(450,200,900,450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text=new JLabel("View Package Details");
        text.setFont(new Font("Tahoma",Font.BOLD,16));
        text.setBounds(60,0,300,30);
        add(text);
        
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblpackage=new JLabel("Package");
        lblpackage.setBounds(30,90,150,25);
        add(lblpackage);
        
        JLabel labelpackage=new JLabel();
        labelpackage.setBounds(220,90,150,25);
        add(labelpackage);
        
        JLabel lblpersons=new JLabel("Total Persons");
        lblpersons.setBounds(30,130,150,25);
        add(lblpersons);
        
        JLabel labelpersons=new JLabel();
        labelpersons.setBounds(220,130,150,25);
        add(labelpersons);
        
        JLabel lblid=new JLabel("Id");
        lblid.setBounds(30,170,150,25);
        add(lblid);
        
        JLabel labelid=new JLabel();
        labelid.setBounds(220,170,150,25);
        add(labelid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,210,150,25);
        add(lblnumber);
        
        JLabel labelnumber=new JLabel();
        labelnumber.setBounds(220,210,150,25);
        add(labelnumber);
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(30,250,150,25);
        add(lblphone);

        JLabel labelphone=new JLabel();
        labelphone.setBounds(220,250,150,25);
        add(labelphone);
        
        JLabel lblprice=new JLabel("Price");
        lblprice.setBounds(30,290,150,25);
        add(lblprice);
        
        JLabel labelprice=new JLabel();
        labelprice.setBounds(220,290,150,25);
        add(labelprice);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(130,360,100,50);
        back.addActionListener(this);
        add(back);
        
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image I2=I1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel image=new JLabel(I3);
        image.setBounds(450,20,500,400);
        add(image);
        
        
        try{
            Conn c=new Conn();
            String query="select *from bookpackage  where username = '"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelpackage.setText(rs.getString("package"));
                labelprice.setText(rs.getString("price"));
                labelphone.setText(rs.getString("phone"));
                labelpersons.setText(rs.getString("persons"));
               
            }
            
        }catch(Exception e){
            
        }
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        
        
        
    }
    
    
    
    public static void main(String [] args){
        new ViewPackage("Anshu123");
}
    
{
 {
    
}
