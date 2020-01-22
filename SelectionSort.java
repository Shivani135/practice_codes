import java.io.*;
class SelectionSort{
	public static void main(String[] args)throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		System.out.println("Enter length of array");
		int length = Integer.parseInt(in.readLine());
		int unsorted[] = new int [length];
		System.out.println("Enter nos.");
		for(int i = 0; i< length; i++){
			unsorted[i] = Integer.parseInt(in.readLine());
		}
		int x = unsorted[0];
		int index;			
		for(int i = 0; i<length; i++){
			x=unsorted[i];
			index = i;	
			for(int j = i; j<length; j++){
				if(x>unsorted[j]){
				x = unsorted[j];
				index = j;				
				}
			}
				int a = unsorted[i];
				unsorted[i] = x;
				unsorted[index] = a;
		}
		System.out.println("Sorted Array");
 		for(int i = 0; i < length; i++){
    	System.out.println(unsorted[i]);        
 		}

	}
}
