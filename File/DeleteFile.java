import java.io.*; 

public class DeleteFile 
{ 
    public static void main(String[] args) 
    { 
        File file = new File("/home/shivani/practice_codes/file/Delete.txt"); 

        if(file.delete()) 
        { 
            System.out.println("File deleted successfully"); 
        } 
        else
        { 
            System.out.println("Failed to delete the file"); 
        } 
    } 
} 

