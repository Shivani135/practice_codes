import java.io.*;

class ReverseWord{
    public static void main(String[] args)throws IOException{
    InputStreamReader read = new InputStreamReader (System.in);
    BufferedReader in = new BufferedReader(read);
    System.out.println("Enter a String to reverse it");
    String str = in.readLine();
		str = " " + str+ " ";
    int len = str.length();
    int x = len;
		String b="";
		char a;
    for(int i = len-1; i >= 0; i--){
			a = (str.charAt(i));
			if(a == ' '){
				b = str.substring(i+1, x);
				System.out.print(b);
				b = "";
				x = i+1;
			}
		}
	}
}

