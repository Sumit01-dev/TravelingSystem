package TravelingSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ForgetPassword extends JFrame implements ActionListener{
    JTextField tfusername,tfname,tfquestion,tfanswer,tfpassword;
    JButton search,retrieve,back;
    ForgetPassword(){
        setBounds(300,200,900,400);
        //setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
       Image I2=I1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
       ImageIcon I3=new ImageIcon(I2);
       
       JLabel image=new JLabel(I3);
       image.setBounds(600,70,200,200);
       add(image);
        
        
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,20,500,300);
        p1.setBackground(new Color(133,193,233));
        add(p1);
        
        JLabel lblusername=new JLabel("Username:");
        lblusername.setBounds(40,20,100,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblusername);
        
        tfusername=new JTextField();
        tfusername.setBounds(150,20,180,25);
        tfusername.setFont(new Font("Tahoma", Font.BOLD,14));
        p1.add(tfusername);
        
        search= new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(330,20,100,25);
        search.addActionListener(this);
        p1.add(search);
        
        
        JLabel lblname=new JLabel("Name:");
        lblname.setBounds(40,60,100,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(150,60,180,25);
        tfname.setFont(new Font("Tahoma", Font.BOLD,14));
        p1.add(tfname);
        
        
        JLabel lblquestion=new JLabel("Security Question:");
        lblquestion.setBounds(40,100,100,25);
        lblquestion.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblquestion);
        
        tfquestion=new JTextField();
        tfquestion.setBounds(150,100,180,25);
        tfquestion.setFont(new Font("Tahoma", Font.BOLD,14));
        p1.add(tfquestion);


        JLabel lblanswer=new JLabel("Answer:");
        lblanswer.setBounds(40,140,100,25);
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblanswer);
        
        tfanswer=new JTextField();
        tfanswer.setBounds(150,140,180,25);
        tfanswer.setFont(new Font("Tahoma", Font.BOLD,14));
        p1.add(tfanswer);
        
        retrieve= new JButton("Retrieve");
        retrieve.setBackground(Color.GRAY);
        retrieve.setForeground(Color.WHITE);
        retrieve.setBounds(330,140,100,25);
        retrieve.addActionListener(this);
        p1.add(retrieve);
  
        JLabel lblpassword=new JLabel("Password:");
        lblpassword.setBounds(40,180,100,25);
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblpassword);
        
        tfpassword=new JTextField();
        tfpassword.setBounds(150,180,180,25);
        tfpassword.setFont(new Font("Tahoma", Font.BOLD,14));
        p1.add(tfpassword);
        
        back= new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setBounds(350,260,100,25);
        back.addActionListener(this);
        p1.add(back);

        
        
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String query = ("select *from Details where username  ='"+tfusername.getText()+"'");
                Conn c=new Conn();
              ResultSet rs=  c.s.executeQuery(query);
              while(rs.next()){
                  tfname.setText(rs.getString("name"));
                  tfquestion.setText(rs.getString("question"));
              }
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==retrieve){
             try{
                String query = ("select *from Details where username ='"+tfusername.getText()+"' AND ans= '"+tfanswer.getText()+"'");
                Conn c=new Conn();
              ResultSet rs=  c.s.executeQuery(query);
              while(rs.next()){
                  tfpassword.setText(rs.getString("passowrd"));
                 // tfques.setText(rs.getString("security"));
              }
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();
    }
    }

    
    public static void main(String[] args){
        new ForgetPassword();
    }
    
}
 {
    
}
