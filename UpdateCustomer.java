package TravelingSystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class UpdateCustomer extends JFrame implements ActionListener{
    JLabel labelusername,labelname;
    //jcobobox use for choice button, it works like as security choice questions and here we not need to put add, we can directly give choice by adding new string;
    //JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfphone,tfemail,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton back,add; 

    UpdateCustomer(String username){
        setBounds(500,200,800,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);
      
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lblusername);
        
        labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        labelusername.setFont( new Font("Tahoma",Font.BOLD,14));
        add(labelusername);
 
        
        JLabel lblid=new JLabel("Id");
        lblid.setBounds(30,90,150,25);
        lblid.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lblid);
        
        tfid=new JTextField();
        tfid.setBounds(220,90,200,25);
        add(tfid);

        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,130,150,25);
        lblnumber.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lblnumber);
        tfnumber=new JTextField();
        tfnumber.setBounds(220,130,200,25);
        add(tfnumber);

   
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        lblname.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lblname);
        
        labelname=new JLabel();
        labelname.setBounds(220,170,150,25);
        labelname.setFont( new Font("Tahoma",Font.BOLD,14));
        add(labelname);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,210,150,25);
        lblgender.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lblgender);
        
        tfgender=new JTextField();
        tfgender.setBounds(220,210,200,25);
        add(tfgender);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        lblcountry.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lblcountry);
        
        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,200,25);
        add(tfcountry);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(30,290,150,25);
        lbladdress.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,200,25);
        add(tfaddress);

        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(30,330,150,25);
        lblphone.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(220,330,200,25);
        add(tfphone);
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(30,370,150,25);
        lblemail.setFont( new Font("Tahoma",Font.BOLD,14));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(220,370,200,25);
        add(tfemail);

        add = new JButton("Update");
        add.setBounds(50,450,150,30);
        add.setBackground(Color.WHITE);
        add.setForeground(Color.BLACK);
        add.setFont(new Font("Tahoma",Font.BOLD,20));
        add.addActionListener(this);
        add(add);  
        
        
        back = new JButton("Back");
        back.setBounds(270,450,100,30);
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma",Font.BOLD,20));
        back.addActionListener(this);
        add(back);

        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image I2=I1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel image=new JLabel(I3);
        image.setBounds(400,120,450,290);
        add(image);

        try{
            Conn c= new Conn();
           ResultSet rs= c.s.executeQuery("select *from customers where username='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfphone.setText(rs.getString("phone"));
                tfaddress.setText(rs.getString("address"));
                tfemail.setText(rs.getString("email"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }
        

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username=labelusername.getText();
            String id=tfid.getText();
            String number=tfnumber.getText();
            String name=labelname.getText();
            String gender=tfgender.getText();
            String country=tfcountry.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            try{
                Conn c=new Conn();
                String query="update customers set username ='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
                //for dml command
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customers Details Updated Successfully");
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new UpdateCustomer("Anshu123");
    }
}

 {
    
}
