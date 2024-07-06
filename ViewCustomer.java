package TravelingSystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class ViewCustomer extends JFrame implements ActionListener{
    JButton back;
    
    ViewCustomer(String username){
        setBounds(250,100,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid=new JLabel("Id");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
        JLabel labelid=new JLabel();
        labelid.setBounds(220,110,150,25);
        add(labelid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);
        
        JLabel labelnumber=new JLabel();
        labelnumber.setBounds(220,170,150,25);
        add(labelnumber);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(220,230,150,25);
        add(labelname);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
        JLabel labelgender=new JLabel();
        labelgender.setBounds(220,290,150,25);
        add(labelgender);
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);

        JLabel labelcountry=new JLabel();
        labelcountry.setBounds(650,50,150,25);
        add(labelcountry);
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(500,110,150,25);
        add(lblphone);
        
        JLabel labelphone=new JLabel();
        labelphone.setBounds(650,110,150,25);
        add(labelphone);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(500,170,150,25);
        add(lbladdress);
        
        JLabel labeladdress=new JLabel();
        labeladdress.setBounds(650,170,150,25);
        add(labeladdress);
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
        
        JLabel labelemail=new JLabel();
        labelemail.setBounds(650,230,150,25);
        add(labelemail);

        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350,350,100,50);
        back.addActionListener(this);
        add(back);
        
        
        
        
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image I2=I1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel image=new JLabel(I3);
        image.setBounds(20,400,600,200);
        add(image);
        
        ImageIcon I4=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image I5=I4.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon I6=new ImageIcon(I5);
        JLabel image2=new JLabel(I6);
        image2.setBounds(600,400,600,200);
        add(image2);

        try{
            Conn c=new Conn();
            String query="select *from customers  where username = '"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
                labelcountry.setText(rs.getString("country"));

            }
            
        }catch(Exception e){
            
        }
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        
        
        
    }
    
    
    public static void main(String[] args){
        new ViewCustomer("Anshu123");
    }
}
 {
    
}
