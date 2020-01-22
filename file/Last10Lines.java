import java.io.*;

class Last10Lines{
	public static void main(String[] args)throws IOException{
		File file = new File("/home/shivani/inter/file/test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str ;
		int lines = 0;
		while((str = br.readLine()) != null){
			lines++;
		}
		System.out.println(lines);
		str = "";
		BufferedReader br1 = new BufferedReader(new FileReader(file));
		/*str = br1.readLine();
		System.out.println(str);*/
		int leave = lines - 10;
		 System.out.println(leave);
		for(int i = 1; i<=lines; i++){
			str = br1.readLine();
			if(i > leave){
				System.out.println(str);
			}
		}
	}
}

