import java.io.*;
import java.sql.*;

class DbConnection{
    public static void main(String args[]){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
        
        
            con.close();
        }
        catch(Exception e){
            System.out.println("Error is = "+e);
        }
    }
}
