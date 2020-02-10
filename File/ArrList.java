import java.io.*;
import java.util.*;

class ArrList{
    //long startTime = System.nanoTime();
    public static void main(String[] args)throws IOException{
    double startTime = System.nanoTime();
    File file = new File("/home/shivani/practice_codes/file/test.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> arrayList = new ArrayList<String>();
            String str;
        while((str =br.readLine()) != null){
            str = str + " ";
            int len = str.length();
            int x = 0;
            char a;
            for(int i = 0; i<len; i++){
                a = str.charAt(i);
                if(a == ' '){
                    arrayList.add(str.substring(x,i));
                    x = i+1;
                }
              
            }
        }
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the word to find in file.");
        String find = in.readLine();
       // System.out.println(find);
        for(int i = 0; i<arrayList.size(); i++){
           // System.out.println(arrayList.get(i));
           String str1 = arrayList.get(i);
           //System.out.println(str1); 
           if(str1.equals(find) == true){
                //System.out.println(str1);
                System.out.println("Found the word " + find);
            }
        }
        double endTime = System.nanoTime();
        double totalTime = endTime - startTime;
        System.out.println("Compilation Time = " + totalTime);
    }
}
