import java.io.*;

class ReverseWordDemo{
    public static void main(String[] args)throws IOException{
    InputStreamReader read = new InputStreamReader (System.in);
    BufferedReader in = new BufferedReader(read);
    System.out.println("Enter a String to reverse it");
    String str = in.readLine();
	str = " "+str;
    int len = str.length();
    int x = len;
    for(int i = len-1; i >= 0; i--){
	    if(str.charAt(i) == ' '){
    	    System.out.print(str.substring(i, x));
			x = i+1;
			}

		}
	}
}

