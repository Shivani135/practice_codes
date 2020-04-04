import java.io.*;
import java.sql.*;
class MainLib{
    public static void main(String args[])throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        AddBook addBook = new AddBook();
       /* IssueBook issueBook = new IssueBook();
        ReturnBook returnBook = new ReturnBook();*/
        AddMember addMember = new AddMember();
       /* AvailableBook availableBook = new AvailableBook();
        SearchingBook searchingBook = new SearchingBook();*/
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
            addBook.insertBook(con);
            addBook.printDetails(con);
            addMember.addMember(con);
            addMember.printDetails(con);
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
