import java.io.*;
import java.sql.*;

class AddBook{

    void insertBook(Connection connAddBook)throws IOException{
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        try{
            System.out.println("Enter Title of the Book");
            String title = in.readLine();
            System.out.println("Enter Author name of the book");
            String author = in.readLine();
            System.out.println("Enter ISN no");
            long isn = Long.parseLong(in.readLine());
            System.out.println("Enter Category pf the book");
            String category = in.readLine();
            System.out.println("Enter Book ID");
            String book_id = in.readLine();
            Statement stmt = connAddBook.createStatement();
            stmt.executeUpdate("insert into book_details values('"+title+"','"+author+"','"+isn+"','"+category+"','"+book_id+"')");
        }
        catch(Exception e){
            System.out.println();
        }
    }
    void printDetails (Connection ConnAddBook ) {
        try{
            Statement stmt=ConnAddBook.createStatement();
            ResultSet rs1= stmt.executeQuery("select * from book_details");
            while(rs1.next()){
                System.out.println(rs1.getObject("title")+"\t"+rs1.getObject("author")+"\t"+rs1.getObject("category"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
