import java.io.*;

class CountLetters{

	public static void main(String[] args) throws IOException{
		File file = new File("/home/shivani/practice_codes/file/test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		while((str = br.readLine()) != null){
			int len = str.length();
			int j = 0;
			for(int i = 0; i<len; i++){
    		if (str.charAt(i) == ' '){
					String str1 = str.substring(j, i);
					j = i;
					System.out.print(str1.length());
				}
			}
		System.out.println();		
		}
	}
}

