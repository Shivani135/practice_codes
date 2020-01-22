import java.io.*;
class ReverseWordString{
	public static void main (String[] args)throws IOException{
	  InputStreamReader read = new InputStreamReader (System.in);
    BufferedReader in = new BufferedReader(read);
    System.out.println("Enter String");
		String str = in.readLine();
		str = str+ " ";
		String str1;
		int x = 0;
		char a;
		int len = str.length();
		for (int i = 0; i< len; i++){
    	a = str.charAt(i);
    	if(a == ' '){
    		str1 = str.substring(x, i);
    		x = i+1;
				for (int j = str1.length()-1; j>=0; j-- ){
					System.out.print(str1.charAt(j));
				}
				System.out.print(" ");
				str1 = "";
  		}
		}	
	}
}

