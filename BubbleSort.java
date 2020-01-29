import java.io.*;
class BubbleSort 
{ 
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 

    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    public static void main(String[] args)throws IOException 
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        BubbleSort ob = new BubbleSort(); 
        System.out.println("Enter the length of array");
        int n = Integer.parseInt(in.readLine());
        int arr[] =new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(in.readLine());
        }
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
} 
/*TEST CASE-
Enter the length of array
10
Enter the elements
5
4
9
8
2
6
7
3
1
0
Sorted array
0 1 2 3 4 5 6 7 8 9 
*/
//Time Complexity - O(n^2)

