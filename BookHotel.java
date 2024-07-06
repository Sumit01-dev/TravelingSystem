package TravelingSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookHotel extends JFrame implements ActionListener{
    
    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    String username;
    JLabel labelusername,labelid,labelnumber,labelphone,labelprice;
    JButton checkprice,bookpackage,back;
    BookHotel(String username){
        this.username=username;
        setBounds(350,200,1100,600);
        setLayout(null);
        
        JLabel text=new JLabel("BOOK HOTELS");
        text.setBounds(100,10,200,30);
        text.setBackground(Color.WHITE);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername .setFont(new Font("Tahoma",Font.PLAIN,16));
        lblusername.setBounds(40,70,200,20);
        add(lblusername);
        
        labelusername=new JLabel();
        labelusername .setFont(new Font("Tahoma",Font.PLAIN,16));
        labelusername.setBounds(250,70,100,20);
        add(labelusername);
        
        JLabel lblpackage=new JLabel("Select Hotel");
        lblpackage .setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpackage.setBounds(40,110,200,20);
        add(lblpackage);
        
        chotel=new Choice();
        chotel.setBounds(250,110,200,20);
        add(chotel);
                
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select *from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        JLabel lblpersons=new JLabel("Total Persons");
        lblpersons .setFont(new Font("Tahoma",Font.PLAIN,16));
        lblpersons.setBounds(40,150,200,25);
        add(lblpersons);
        
        tfpersons=new JTextField();
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        
        JLabel lbldays=new JLabel("Number of Days");
        lbldays .setFont(new Font("Tahoma",Font.PLAIN,16));
        lbldays.setBounds(40,190,200,25);
        add(lbldays);
        
        tfdays=new JTextField();
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        
        JLabel lblac=new JLabel("AC/NON-AC");
        lblac .setFont(new Font("Tahoma",Font.PLAIN,16));
        lblac.setBounds(40,230,200,25);
        add(lblac);
        
        cac=new Choice();
        cac.add("AC");
        cac.add("NON-AC");
        cac.setBounds(250,230,200,20);
        add(cac);
        
        
         JLabel lblfood=new JLabel("Food Included");
        lblfood .setFont(new Font("Tahoma",Font.PLAIN,16));
        lblfood.setBounds(40,270,200,25);
        add(lblfood);
        
        cfood=new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add(cfood);
       
        
        JLabel lblid=new JLabel("ID");
        lblid .setFont(new Font("Tahoma",Font.PLAIN,16));
        lblid.setBounds(40,310,200,20);
        add(lblid);
        
        labelid=new JLabel();
        labelid.setBounds(250,310,200,25);
        add(labelid);
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(40,350,200,25);
        add(lblnumber);
        
        labelnumber=new JLabel();
        labelnumber.setBounds(250,350,200,25);
        add(labelnumber);
       
        JLabel lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(40,390,200,25);
        add(lblphone);
        
        labelphone=new JLabel();
        labelphone.setBounds(250,390,200,25);
        add(labelphone);
       
        JLabel lblprice=new JLabel("Total Price");
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblprice.setBounds(40,430,200,25);
        add(lblprice);
        
        labelprice=new JLabel();
        labelprice.setBounds(250,430,200,25);
        add(labelprice);
        
        
       
        try{
            Conn c=new Conn();
            String query="select *from customers  where username = '"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
                
            }
            
        }catch(Exception e){
           e.printStackTrace(); 
        }
        
       checkprice=new JButton("Check Price");
       checkprice.setBackground(Color.BLACK);
       checkprice.setForeground(Color.WHITE);
       checkprice.setBounds(60,470,120,25);
       checkprice.addActionListener(this);
       add(checkprice);
       
       
       bookpackage=new JButton("Book Hotel");
       bookpackage.setBackground(Color.BLACK);
       bookpackage.setForeground(Color.WHITE);
       bookpackage.setBounds(200,470,120,25);
       bookpackage.addActionListener(this);
       add(bookpackage);
       
       
       back=new JButton("Back ");
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setBounds(370,470,120,25);
       back.addActionListener(this);
       add(back);
       
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
       Image i2=i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l12=new JLabel(i3);
       l12.setBounds(550,50,600,400);
       add(l12);
       
      
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            try{
                
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select *from hotel where name='"+chotel.getSelectedItem()+"'");
          String pack= chotel.getSelectedItem();
          int cost=0;
          if(pack.equals("Gold Package")){
              cost+=20000;
          }else if(pack.equals("Silver Package")){
              cost+=16000;
          }else{
              cost+=12000;
          }
          int persons=Integer.parseInt(tfpersons.getText());
          cost *=persons;
          labelprice.setText("Rs."+cost);
            }catch(Exception e){
                e.printStackTrace();
            }
        
        }
            else if(ae.getSource()==bookpackage){
                try{
                    Conn c=new Conn();
                    c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                    JOptionPane.showMessageDialog(null,"Package Booked Successfully" );
                    setVisible(false);
                }catch(Exception e){
                    e.printStackTrace();
                }
                
            }
            else{
              setVisible(false); 
            }

        
    }
    
    
    
    public static void main(String [] args){
        new BookHotel("Anshu123");
    }
    
}
 {
    
}
