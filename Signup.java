package TravelingSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener {
    JButton create,back;
    JTextField tfusername,tfname,tfpassword,tfemail,tfans,tfno;
    Choice security;
    Signup(){
        setSize(900,400);
        setLocation(200,200);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(200,200,900,400);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblusername=new JLabel("Username:");
        lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        lblusername.setBounds(50,20,100,25);
        p1.add(lblusername);
        tfusername=new JTextField();
        tfusername.setBounds(150,20,170,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        //next
        JLabel lblname=new JLabel("Name:");
        lblname.setFont(new Font("Tahoma",Font.BOLD,16));
        lblname.setBounds(50,60,100,25);
        p1.add(lblname);
        tfname=new JTextField();
        tfname.setBounds(150,60,170,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        //next
        JLabel lblpassword=new JLabel("Password:");
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,16));
        lblpassword.setBounds(50,100,100,25);
        p1.add(lblpassword);
        tfpassword=new JTextField();
        tfpassword.setBounds(150,100,170,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        //name
        JLabel lblemail=new JLabel("Email:");
        lblemail.setFont(new Font("Tahoma",Font.BOLD,16));
        lblemail.setBounds(50,140,100,25);
        p1.add(lblemail);
        tfemail=new JTextField();
        tfemail.setBounds(150,140,170,25);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfemail);
        //next
        JLabel lblsecurity=new JLabel("Security:");
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD,16));
        lblsecurity.setBounds(50,180,100,25);
        p1.add(lblsecurity);
        security=new Choice();
        security.add("Favourite Character From Boys");
        security.add("Favourite Marvel Superhero");
        security.add("Your Childhood Memories");
        security.add("Four Lucky Number");
        security.add("Favourite Cricketer Name");
        security.add("Your Great Work");
        security.setBounds(150,180,170,25);
        p1.add(security);
        //next
        JLabel lblans=new JLabel("Answer:");
        lblans.setFont(new Font("Tahoma",Font.BOLD,16));
        lblans.setBounds(50,220,100,25);
        p1.add(lblans);
        tfans=new JTextField();
        tfans.setBounds(150,220,170,25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);
        //next
        JLabel lblno=new JLabel("Mobile NO.:");
        lblno.setFont(new Font("Tahoma",Font.BOLD,16));
        lblno.setBounds(50,260,100,25);
        p1.add(lblno);
        tfno=new JTextField();
        tfno.setBounds(150,260,170,25);
        tfno.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfno);
        //next
        create=new JButton("Create");
        create.setBackground(new Color(133,193,233));
        create.setForeground(Color.YELLOW);
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,300,100,30);
        create.addActionListener(this);
        p1.add(create);
        //next
        back=new JButton("Back");
        back.setBackground(new Color(133,193,233));
        back.setForeground(Color.BLUE);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(200,300,100,30);
        back.addActionListener(this);
        p1.add(back);
        //next
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image I2=I1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        //jlabel used to write a text,
        JLabel image=new JLabel(I3);
        image.setBounds(540,50,250,250);
        add(image);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==create){
            //getText ka use data nikalne ke liye hota hai
            String username = tfusername.getText();
            String name= tfname.getText();
            String passowrd= tfpassword.getText();
            String email=tfemail.getText();
            String ans=tfans.getText();
            String no=tfno.getText();
            String question=security.getSelectedItem();
            String query="insert into Details values('"+username+"', '"+name+"','"+passowrd+"','"+email+"','"+ans+"','"+no+"','"+question+"')";
             try{
               Conn c=new Conn();
               c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
             e.printStackTrace();   
            }
             }else
            if(ae.getSource()==back){
                setVisible(false);
                new Login();
            }
        
    }
    public static void main(String[] args){
        new Signup();
    }
    
}
 {
    
}
