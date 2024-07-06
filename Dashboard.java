package TravelingSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetail,viewPersonalDetail,updatePersonalDetail,checkpakages,bookpakages;
    JButton viewpakages,viewhotels,Destination;
    Dashboard(String username){
        //setBounds(0,0,1600,1000);
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,70);
        add(p1);
        
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image I2=I1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel icon=new JLabel(I3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,0,300,70);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,34));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,70,300,1000);
        add(p2);
        
        addPersonalDetail=new JButton("Add Personal Details");
        addPersonalDetail.setBounds(0,0,300,50);
        addPersonalDetail.setBackground(new Color(0,0,102));
        addPersonalDetail.setForeground(Color.WHITE);
        addPersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetail.setMargin(new Insets(0,0,0,70));
        addPersonalDetail.addActionListener(this);
        p2.add(addPersonalDetail);
        
        updatePersonalDetail=new JButton("Update Personal Details");
        updatePersonalDetail.setBounds(0,50,300,50);
        updatePersonalDetail.setBackground(new Color(0,0,102));
        updatePersonalDetail.setForeground(Color.WHITE);
        updatePersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetail.setMargin(new Insets(0,0,0,40));
        updatePersonalDetail.addActionListener(this);
        p2.add(updatePersonalDetail);
        
        viewPersonalDetail=new JButton("View Details");
        viewPersonalDetail.setBounds(0,100,300,50);
        viewPersonalDetail.setBackground(new Color(0,0,102));
        viewPersonalDetail.setForeground(Color.WHITE);
        viewPersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetail.setMargin(new Insets(0,0,0,130));
        viewPersonalDetail.addActionListener(this);
        p2.add(viewPersonalDetail);
        
        
        JButton deletePersonalDetail=new JButton("Delete Personal Details");
        deletePersonalDetail.setBounds(0,150,300,50);
        deletePersonalDetail.setBackground(new Color(0,0,102));
        deletePersonalDetail.setForeground(Color.WHITE);
        deletePersonalDetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetail.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetail);
     
        checkpakages=new JButton("Check Package");
        checkpakages.setBounds(0,200,300,50);
        checkpakages.setBackground(new Color(0,0,102));
        checkpakages.setForeground(Color.WHITE);
        checkpakages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpakages.setMargin(new Insets(0,0,0,110));
        checkpakages.addActionListener(this);
        p2.add(checkpakages);

        bookpakages=new JButton("Book Package");
        bookpakages.setBounds(0,250,300,50);
        bookpakages.setBackground(new Color(0,0,102));
        bookpakages.setForeground(Color.WHITE);
        bookpakages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpakages.setMargin(new Insets(0,0,0,120));
        bookpakages.addActionListener(this);
        p2.add(bookpakages);

        
        viewpakages=new JButton("View Package");
        viewpakages.setBounds(0,300,300,50);
        viewpakages.setBackground(new Color(0,0,102));
        viewpakages.setForeground(Color.WHITE);
        viewpakages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpakages.setMargin(new Insets(0,0,0,120));
        viewpakages.addActionListener(this);
        p2.add(viewpakages);

        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        JButton bookhotels=new JButton("Book Hotel");
        bookhotels.setBounds(0,400,300,50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setForeground(Color.WHITE);
        bookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotels.setMargin(new Insets(0,0,0,130));
        p2.add(bookhotels);
        
        JButton viewbookhotels=new JButton("View Book Hotel");
        viewbookhotels.setBounds(0,450,300,50);
        viewbookhotels.setBackground(new Color(0,0,102));
        viewbookhotels.setForeground(Color.WHITE);
        viewbookhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookhotels.setMargin(new Insets(0,0,0,90));
        p2.add(viewbookhotels);
        
        Destination=new JButton("Destinations");
        Destination.setBounds(0,500,300,50);
        Destination.setBackground(new Color(0,0,102));
        Destination.setForeground(Color.WHITE);
        Destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        Destination.setMargin(new Insets(0,0,0,125));
        Destination.addActionListener(this);
        p2.add(Destination);
        
        JButton payment=new JButton("Payment");
        payment.setBounds(0,550,300,50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,140));
        p2.add(payment);
        
        
       // JButton calculator=new JButton("Calculator");
        //calculator.setBounds(0,600,300,50);
        //calculator.setBackground(new Color(0,0,102));
        //calculator.setForeground(Color.WHITE);
        //calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        //calculator.setMargin(new Insets(0,0,0,145));
        //p2.add(calculator);
        
        
        JButton about=new JButton("About");
        about.setBounds(0,600,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,155));
        p2.add(about);

        
        ImageIcon I4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image I5=I4.getImage().getScaledInstance(1500,1000,Image.SCALE_DEFAULT);
        ImageIcon I6=new ImageIcon(I5);
        JLabel image=new JLabel(I6);
        image.setBounds(0,0,1500,1000);
        add(image);
        
        
        JLabel text=new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setFont(new Font("Tahoma",Font.PLAIN,50));
        image.add(text);
        
        
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetail){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetail){
            new ViewCustomer(username);
        }else if(ae.getSource()==updatePersonalDetail){
            new UpdateCustomer(username);
        }else if(ae.getSource()==checkpakages){
            new CheckPackage();
        }
        else if(ae.getSource()==bookpakages){
            new BookPackage(username);
        }else if(ae.getSource()==viewpakages){
              new ViewPackage(username);
        }else if(ae.getSource()==viewhotels){
            new CheckHotels();
        }else if(ae.getSource()==Destination){
            new Destinations();
        }
    }
    
    
    
    
    
    public static void main(String[] args){
        
    
    new Dashboard(" ");
    }
    
    
} {
    
}
