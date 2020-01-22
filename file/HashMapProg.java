import java.io.*;
import java.util.HashMap;
import java.util.Map;
class HashMapProg{
    public static void main(String[] args) throws IOException{
        long startTime = System.nanoTime();
        File file = new File("/home/shivani/practice_codes/file/test.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        HashMap<String, Integer> map = new HashMap<>();
        String str;
        int c = 1;
        while((str = br.readLine()) != null){
            str = str+ " ";
            int len = str.length();
            int x = 0;
            char a;
            for(int i = 0; i<len; i++){
                a = str.charAt(i);
                if(a == ' '){
                    map.put(str.substring(x, i), c);
                    x = i+1;
                    c++;
                }
            }
        }
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter word to be searched");
        String find = in.readLine();
        if(map.containsKey(find)){
            System.out.println("Found the word");
        }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Compilation time = " + totalTime);
    }
}
