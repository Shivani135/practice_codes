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
/*
TEST CASE:
Enter length of array
10
Enter nos.
5
3
9
1
4
7
3
8
6
2
Sorted Array
1
2
3
3
4
5
6
7
8
9
*/
//Time Complexity - O(n^2)
