package TravelingSystem;

import java.sql.*;
public class Conn  {
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Traveling","root","Sumit@004");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
       
        
    }
    
} {
    
}
