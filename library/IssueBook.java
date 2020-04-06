import java.io.*;
import java.sql.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class IssueBook{
    void issuingBook(Connection connIssueBook)throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        try{
            System.out.println("Enter Member ID");
            String mid = in.readLine();
            System.out.println("Enter Book ID");
            String bid = in.readLine();
            Statement stmt = connIssueBook.createStatement();
            int t_no = 0;
            ResultSet rs1= stmt.executeQuery("SELECT * FROM issued_status ORDER BY transaction_no DESC LIMIT 1;");
            t_no =rs1.getInt("transaction_no");
            t_no++;
            SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE,+14);
            java.sql.Date sqlDate=new java.sql.Date(java.time.LocalDate.now());
            java.sql.Date sqlDate1=new java.sql.Date(sdf.format(cal.getTime()));
            stmt.executeUpdate("insert into issued_status values('"+t_no+"','"+sqlDate+"','"+sqlDate1+"','"+mid+"','"+bid+"')");

        }
        catch(Exception e){
            System.out.println();
        }

    }

    void printDetails (Connection ConnAddBook ) {
        try{
            Statement stmt=ConnAddBook.createStatement();
            ResultSet rs1= stmt.executeQuery("select * from issued_status");
            while(rs1.next()){
                System.out.println(rs1.getObject("transaction_no")+"\t"+rs1.getObject("book_id")+"\t"+rs1.getObject("m_id"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    /* public static void main(String args[]){
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
       Calendar cal = Calendar.getInstance();
       cal.add(Calendar.DATE,+7);
       System.out.println(java.time.LocalDate.now()); 
       System.out.println(sdf.format(cal.getTime()));  
       }*/
}
