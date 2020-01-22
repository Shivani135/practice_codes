import java.io.*;
class ReversingLinesInFile{
	public static void main(String[] args) throws IOException{
		File file = new File("/home/shivani/inter/file/test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		int x;
		char a;
		while((str = br.readLine()) != null){
			str = " "+ str;
			int len = str.length();
			x = len-1;
			for(int i = len-1; i>=0; i--){
				a = str.charAt(i);
				if(a == ' '){
					System.out.print(str.substring(i+1, x));
					x = i;
					System.out.print(" ");
				}
				
			}
			System.out.print(".");
			System.out.println();
		}
	}
}

