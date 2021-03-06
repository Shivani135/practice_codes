import java.io.*;
class InsertionSort{
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter the length");
        int length = Integer.parseInt(in.readLine());
        System.out.println("Enter nos to be sorted");
        int unsorted[] = new int [length];
        for (int i = 0; i < length; i++){
            unsorted[i] = Integer.parseInt(in.readLine());
        }
        for(int i = 1; i < length; i++){
            for(int j = 0; j < i; j++){
                if(unsorted[i] < unsorted[j]){
                    int x = unsorted[j];
                    unsorted[j] = unsorted[i];
                    unsorted[i] = x;
                    for(int k = j+1; k<=i; k++){
                        int y = unsorted[k];
                        unsorted[k] = x;
                        x = y;
                    }     
                }
            }
        }
        System.out.println("Sorted Array");
        for(int i = 0; i < length; i++){
            System.out.println(unsorted[i]);		
        }
    }
}
/*TEST CASE-
Enter the length
10
Enter nos to be sorted
4
5
2
3
1
6
9
7
8
0
Sorted Array
0
1
2
3
4
5
6
7
8
9
*/
//time Complexity- O(n^2)
 

