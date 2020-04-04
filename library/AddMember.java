import java.io.*;
import java.sql.*;


class AddMember{
    void addMember(Connection connAddMem)throws IOException{
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        try{
            System.out.println("Enter name");
            String name = in.readLine();
            System.out.println("Enter Phn no.");
            long phn = Long.parseLong(in.readLine());        
            System.out.println("Enter MID");
            String mid = in.readLine();
            System.out.println("Enter Address");
            String address = in.readLine();
            Statement stmt = connAddMem.createStatement();
            stmt.executeUpdate("insert into member_details values('"+name+"','"+phn+"','"+mid+"','"+address+"')");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    void printDetails (Connection ConnAddMem ) {
        try{
            Statement stmt=ConnAddMem.createStatement();
            ResultSet rs1= stmt.executeQuery("select * from member_details");
            while(rs1.next()){
                System.out.println(rs1.getObject("name")+"\t"+rs1.getObject("phn_no")+"\t"+rs1.getObject("m_id")+"\t"+rs1.getObject("address"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
