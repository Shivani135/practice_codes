import java.io.*;
import java.util.Random;
import java.sql.*;
class javaconn
{

    enum place{
        Wagholi, Banner, Aundh, Shivajinagar, Kharadi;

        public static place placerandom(){
            place[] places = place.values();
            Random generator = new Random();
            return places[generator.nextInt(place.values().length)];
        }
    }
    public place placeGenrator;
    public void InsertStudent(Connection dbConnection1) {
        String name, address;
        Random randm= new Random();
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(8);

        for (int i = 0; i < 8; i++) {
            int index = (int)(AlphaNumericString.length()* Math.random());
            sb.append(AlphaNumericString.charAt(index));
            try{
                Statement stmt=dbConnection1.createStatement();
                for (int k = 0; k < 1000; k++) {
                    for(int j = 0; j<8; j++){
                        index = (int)(AlphaNumericString.length()* Math.random());
                        sb.append(AlphaNumericString.charAt(index));
                    }
                    String user_id="Anything"+k;
                    String user_first_name="Rishi"+k;
                    String user_last_name="Agrawal"+k;
                    long user_phn_no=randm.nextInt(99999999);
                    String user_email="example"+k+"@try.com";   
                    stmt.executeUpdate("insert into user values('"+user_id+"','"+user_first_name+"','"+user_last_name+"','"+user_phn_no+"','"+user_email+"')");
                }
            }
            catch(Exception e){
                System.out.println();
            }
        }
    }

    void InsertJobs(Connection dbConnection2, int numberOfJobs) {
        Random randm= new Random();
        int job_id;
        String job_description[]={"Black and white","Color printing"};
        Double job_amount;
        try{
            Statement stmt1=dbConnection2.createStatement();
            int j=0;
            for (int i=0;i<5;i++)
            {   
                job_id=randm.nextInt(999999);
                job_amount=randm.nextDouble();
                stmt1.executeUpdate("insert into jobs values('"+job_id+"','"+job_description[j]+"','"+job_amount+"')");
                if(j==1)
                    j=0;
                else
                    j=1;
            }
        }
        catch(Exception e){
            System.out.println();
        }
    }
    void PrintJobs(Connection dbConnection ) {
        try{
            Statement stmt=dbConnection.createStatement();
            ResultSet rs1= stmt.executeQuery("select * from jobs");
            while(rs1.next()){
                System.out.println(rs1.getObject("job_id")+"\t"+rs1.getObject("job_description")+"\t"+rs1.getObject("job_amount"));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }       
    }   





    public static void main(String args[])
    {
        javacon executing_query= new javacon();
        Random randm= new Random();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");

            //  Statement stmt=con.createStatement();
            //  ResultSet rs;  
            executing_query.InsertStudent(con);
            executing_query.InsertJobs(con,5); 
            executing_query.PrintJobs(con);

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

